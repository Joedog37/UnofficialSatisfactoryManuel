package com.example.unofficialsatisfactorymanuel

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Button
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.core.view.WindowCompat
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.unofficialsatisfactorymanuel.data.AllBuildingDataSample
import com.example.unofficialsatisfactorymanuel.data.getBuildingById
import com.example.unofficialsatisfactorymanuel.ui.theme.MyCleanComposeAppTheme
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        WindowCompat.setDecorFitsSystemWindows(window, false)
        super.onCreate(savedInstanceState)

        setContent {
            MyCleanComposeAppTheme { // Ensure Theme.kt has correct light/dark color schemes
                // Apply a default background that respects the theme.
                // This is good practice if your Scaffold doesn't cover the whole screen
                // or for transitions. Individual screens should also set their own backgrounds.
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    AppNavigation()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    val scope = rememberCoroutineScope()

    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route

    val topLevelDestinations = remember {
        setOf(
            AppDestinations.HOME_ROUTE,
            AppDestinations.BUILDINGS_LIST_ROUTE,
            AppDestinations.ITEMS_ROUTE,
            AppDestinations.ABOUT_ROUTE
        )
    }

    val drawerItems = remember {
        listOf(
            AppDestinations.HOME_ROUTE,
            AppDestinations.BUILDINGS_LIST_ROUTE,
            AppDestinations.ITEMS_ROUTE,
            AppDestinations.ABOUT_ROUTE
        )
    }

    val currentScreenTitle = remember(currentRoute, navBackStackEntry?.arguments) {
        when (currentRoute) {
            AppDestinations.HOME_ROUTE -> "Home"
            AppDestinations.BUILDINGS_LIST_ROUTE -> "Buildings"
            AppDestinations.ITEMS_ROUTE -> "Items"
            AppDestinations.ABOUT_ROUTE -> "About"
            AppDestinations.BUILDING_DETAIL_ROUTE -> {
                val buildingId = navBackStackEntry?.arguments?.getString(AppDestinations.BUILDING_ID_ARG)
                if (buildingId != null) {
                    getBuildingById(buildingId, AllBuildingDataSample)?.name ?: "Details"
                } else {
                    "Details"
                }
            }
            else -> "Unofficial Satisfactory Manuel"
        }
    }

    ModalNavigationDrawer(
        drawerState = drawerState,
        gesturesEnabled = currentRoute in topLevelDestinations,
        drawerContent = {
            // The ModalDrawerSheet should also respect theme colors for its background and content.
            // Material 3 components usually do this well by default.
            // Adding systemBarsPadding helps avoid content overlapping with status/navigation bars
            // when the drawer is open in edge-to-edge mode.
            ModalDrawerSheet(
                modifier = Modifier.systemBarsPadding(), // Handles status and navigation bar insets
                // drawerContainerColor = MaterialTheme.colorScheme.surface, // Explicitly set if needed
                // drawerContentColor = MaterialTheme.colorScheme.onSurface  // Explicitly set if needed
            ) {
                drawerItems.forEach { screenRoute ->
                    val label = when (screenRoute) {
                        AppDestinations.HOME_ROUTE -> "Home"
                        AppDestinations.BUILDINGS_LIST_ROUTE -> "Buildings"
                        AppDestinations.ITEMS_ROUTE -> "Items"
                        AppDestinations.ABOUT_ROUTE -> "About"
                        else -> screenRoute
                    }
                    NavigationDrawerItem(
                        label = { Text(text = label) }, // Text color here will use theme defaults for NavDrawerItem
                        selected = currentRoute == screenRoute,
                        onClick = {
                            scope.launch {
                                drawerState.close()
                            }
                            if (currentRoute != screenRoute) {
                                navController.navigate(screenRoute) {
                                    popUpTo(navController.graph.startDestinationId) {
                                        saveState = true
                                    }
                                    launchSingleTop = true
                                    restoreState = true
                                }
                            }
                        }
                        // colors = NavigationDrawerItemDefaults.colors( // Customize if defaults aren't right
                        // selectedContainerColor = MaterialTheme.colorScheme.primaryContainer,
                        // unselectedContainerColor = Color.Transparent,
                        // selectedTextColor = MaterialTheme.colorScheme.onPrimaryContainer,
                        // unselectedTextColor = MaterialTheme.colorScheme.onSurfaceVariant
                        // )
                    )
                }
            }
        },
    ) {
        Scaffold(
            // Scaffold background will be transparent by default, showing the Surface from MainActivity's setContent
            // or the window background if not wrapped.
            // Content color for Scaffold is usually handled by the theme's onBackground/onSurface.
            topBar = {
                if (currentRoute in topLevelDestinations || currentRoute == AppDestinations.BUILDING_DETAIL_ROUTE) {
                    TopAppBar(
                        title = { Text(text = currentScreenTitle) }, // Text color from TopAppBarDefaults
                        navigationIcon = {
                            if (currentRoute in topLevelDestinations) {
                                IconButton(onClick = {
                                    scope.launch {
                                        if (drawerState.isClosed) drawerState.open() else drawerState.close()
                                    }
                                }) {
                                    Icon(
                                        imageVector = Icons.Filled.Menu,
                                        contentDescription = "Menu",
                                        // tint = MaterialTheme.colorScheme.onPrimaryContainer // Default tint is usually fine
                                    )
                                }
                            }
                        },
                        colors = TopAppBarDefaults.topAppBarColors(
                            containerColor = MaterialTheme.colorScheme.primaryContainer,
                            titleContentColor = MaterialTheme.colorScheme.onPrimaryContainer,
                            navigationIconContentColor = MaterialTheme.colorScheme.onPrimaryContainer
                        )
                    )
                }
            }
        ) { innerPadding ->
            AppNavHost(
                navController = navController,
                modifier = Modifier.padding(innerPadding)
            )
        }
    }
}

@Composable
fun AppNavHost(
    navController: NavHostController,
    modifier: Modifier = Modifier,
) {
    NavHost(
        navController = navController,
        startDestination = AppDestinations.HOME_ROUTE,
        modifier = modifier.fillMaxSize()
        // The background of the NavHost area will effectively be the background
        // of the individual screen Composables or the root Surface from MainActivity.
    ) {
        composable(AppDestinations.HOME_ROUTE) {
            // --- IMPORTANT ---
            // MainScreen() MUST use MaterialTheme.colorScheme for its background and text
            // e.g., Surface(color = MaterialTheme.colorScheme.background) { Text("...", color = MaterialTheme.colorScheme.onBackground) }
            MainScreen()
        }
        composable(AppDestinations.BUILDINGS_LIST_ROUTE) {
            // --- IMPORTANT ---
            // BuildingsScreen() MUST use MaterialTheme.colorScheme for its background and text
            BuildingsScreen(
                onBuildingSelected = { buildingId ->
                    navController.navigate("${AppDestinations.BUILDING_DETAIL_ROUTE_BASE}/$buildingId")
                }
            )
        }
        composable(
            route = AppDestinations.BUILDING_DETAIL_ROUTE,
            arguments = listOf(navArgument(AppDestinations.BUILDING_ID_ARG) {
                type = NavType.StringType
            })
        ) { backStackEntry ->
            val buildingId = backStackEntry.arguments?.getString(AppDestinations.BUILDING_ID_ARG)
            if (buildingId != null) {
                // --- IMPORTANT ---
                // BuildingDetailScreen() MUST use MaterialTheme.colorScheme for its background and text
                BuildingDetailScreen(
                    buildingId = buildingId,
                    onNavigateBack = { navController.popBackStack() }
                )
            } else {
                // This error Column should also respect theming
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        "Error: Building ID not found.",
                        color = MaterialTheme.colorScheme.onErrorContainer // Or onBackground
                    )
                    Button(onClick = { navController.popBackStack() }) { // Button will use theme colors
                        Text("Go Back") // Text in Button will use theme colors
                    }
                }
            }
        }
        composable(AppDestinations.ITEMS_ROUTE) {
            // --- IMPORTANT ---
            // ItemsScreen() MUST use MaterialTheme.colorScheme for its background and text
            ItemsScreen()
        }
        composable(AppDestinations.ABOUT_ROUTE) {
            // --- IMPORTANT ---
            // AboutScreen() MUST use MaterialTheme.colorScheme for its background and text
            AboutScreen()
        }
    }
}