package com.example.unofficialsatisfactorymanuel

// Imports for Composable functions and UI elements
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.unofficialsatisfactorymanuel.data.AllBuildingDataSample // Main source of truth
import com.example.unofficialsatisfactorymanuel.data.BuildingData
import com.example.unofficialsatisfactorymanuel.data.getBuildingById
import com.example.unofficialsatisfactorymanuel.ui.theme.MyCleanComposeAppTheme // Assuming your theme is named this

// Define your building groups.
// As you add more data files (e.g., for G-I, J-L), add new entries here.
enum class BuildingGroup(val displayName: String, val letters: CharRange) {
    A_TO_C("A-C", 'A'..'C'),
    D_TO_F("D-F", 'D'..'F'); // Example: Add G_TO_I("G-I", 'G'..'I') when ready
    // Add more groups as your data expands
    // For example:
    // G_TO_I("G-I", 'G'..'I'),
    // J_TO_L("J-L", 'J'..'L'),
    // ... and so on
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BuildingsScreen(
    modifier: Modifier = Modifier,
    // buildingsDataList parameter is removed as we will always filter from AllBuildingDataSample
    onBuildingSelected: (buildingId: String) -> Unit,
    onNavigateBack: (() -> Unit)? = null,
) {
    // Default to the first group in the enum, or handle empty enum case if necessary
    var selectedGroup by remember { mutableStateOf(BuildingGroup.entries.firstOrNull() ?: BuildingGroup.A_TO_C) }

    // Filtered list based on the selected group from AllBuildingDataSample
    val displayedBuildings = remember(selectedGroup, AllBuildingDataSample) {
        AllBuildingDataSample.filter { building ->
            // Ensure building.name is not empty and handle case-insensitivity
            building.name.firstOrNull()?.uppercaseChar() in selectedGroup.letters
        } // Removed the trailing dot here
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Buildings: ${selectedGroup.displayName}") }, // Show current group
                navigationIcon = {
                    if (onNavigateBack != null) {
                        IconButton(onClick = onNavigateBack) {
                            Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Back")
                        }
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.onPrimaryContainer
                )
            )
        }
    ) { paddingValues ->
        Column(
            modifier = modifier
                .padding(paddingValues)
                .fillMaxSize()
        ) {
            // Group Selection Buttons
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 8.dp, vertical = 8.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterHorizontally) // Or use LazyRow
            ) {
                BuildingGroup.entries.forEach { group ->
                    Button(
                        onClick = { selectedGroup = group },
                        colors = ButtonDefaults.buttonColors(
                            containerColor = if (selectedGroup == group) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.secondaryContainer,
                            contentColor = if (selectedGroup == group) MaterialTheme.colorScheme.onPrimary else MaterialTheme.colorScheme.onSecondaryContainer
                        )
                    ) {
                        Text(group.displayName)
                    }
                }
            }

            Spacer(modifier = Modifier.height(8.dp))

            if (AllBuildingDataSample.isEmpty()) { // Check if the master list is empty
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text("No buildings data available. Please ensure your data source is populated.")
                }
            } else if (displayedBuildings.isEmpty()) { // Check if the filtered list for the current group is empty
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text("No buildings found in the group: ${selectedGroup.displayName}")
                }
            } else {
                LazyColumn(
                    contentPadding = PaddingValues(start = 16.dp, end = 16.dp, bottom = 16.dp),
                    verticalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    items(items = displayedBuildings, key = { it.id }) { buildingData ->
                        BuildingListItem(
                            buildingData = buildingData,
                            onBuildingSelected = onBuildingSelected
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun BuildingListItem(
    buildingData: BuildingData,
    onBuildingSelected: (buildingId: String) -> Unit,
    modifier: Modifier = Modifier,
) {
    Text(
        text = buildingData.name,
        style = MaterialTheme.typography.bodyLarge,
        modifier = modifier
            .fillMaxWidth()
            .clickable { onBuildingSelected(buildingData.id) }
            .padding(vertical = 12.dp) // Removed horizontal padding from here, handled by LazyColumn's contentPadding
    )
}

@Preview(showBackground = true, widthDp = 370, heightDp = 720)
@Composable
fun BuildingsScreenWithGroupSelectionPreview() {
    var selectedBuildingIdForPreview by remember { mutableStateOf<String?>(null) }
    val scrollState = rememberScrollState()

    // Create a more diverse sample for previewing group filtering
    // In a real scenario, AllBuildingDataSample would be populated from your data files.
    // For this preview, we create a temporary AllBuildingDataSample for demonstration.
    val previewAllBuildingDataSample = remember {
        listOf(
            BuildingData("assembler_prev", "Assembler", "Production", "Desc A", "15MW", emptyList(), "Yes", "2"),
            BuildingData("biomass_burner_prev", "Biomass Burner", "Power", "Desc B", "30MW", emptyList(), "No", "0"),
            BuildingData("constructor_prev", "Constructor", "Production", "Desc C", "4MW", emptyList(), "Yes", "1"),
            BuildingData("drone_port_prev", "Drone Port", "Logistics", "Desc D", "100MW", emptyList(), "No", "2"),
            BuildingData("extractor_prev", "Extractor", "Production", "Desc E", "10MW", emptyList(), "Yes", "0P"),
            BuildingData("foundry_prev", "Foundry", "Production", "Desc F", "16MW", emptyList(), "Yes", "2"),
            BuildingData("placeholder_g", "Generator GGG", "Power", "Desc G", "N/A", emptyList(), null, null) // Example for a G building
        )
    }

    // IMPORTANT: For the preview to work with the updated BuildingsScreen,
    // we need to simulate the AllBuildingDataSample it expects.
    // The actual AllBuildingDataSample is defined in your data package.
    // This is a common pattern for previews: provide specific preview data.

    MyCleanComposeAppTheme { // Use your app's theme
        if (selectedBuildingIdForPreview == null) {
            // Temporarily use previewAllBuildingDataSample for the preview context
            // In the real app, BuildingsScreen uses the global AllBuildingDataSample
            // To make this preview truly isolated, you'd pass previewAllBuildingDataSample
            // to a modified BuildingsScreen that accepts the full list as a parameter,
            // or ensure this preview scope correctly shadows the global AllBuildingDataSample.
            // For simplicity here, we rely on the remember block for previewAllBuildingDataSample.

            // Simulate the global AllBuildingDataSample for the scope of this preview
            val tempAllBuildingDataSample = AllBuildingDataSample.toMutableList()
            tempAllBuildingDataSample.clear()
            tempAllBuildingDataSample.addAll(previewAllBuildingDataSample)


            // This is a bit of a hack for preview. Ideally, AllBuildingDataSample would be
            // injectable or the preview would use a version of BuildingsScreen that takes the list.
            // For now, let's assume the preview can "see" this local `previewAllBuildingDataSample`
            // through a temporary override if `AllBuildingDataSample` was a var.
            // Since it's a val, we can't directly override it.
            // The BuildingsScreen will use the global AllBuildingDataSample.
            // So, for this preview to be accurate with filtering, ensure your
            // global AllBuildingDataSample in the data package has some sample data,
            // or modify the preview to pass data directly.

            // Let's adjust the preview to work with how BuildingsScreen is now structured:
            // It gets data from the global AllBuildingDataSample.
            // So, to test filtering, your global AllBuildingDataSample needs A-F items.

            BuildingsScreen( // This will use the actual AllBuildingDataSample from your data package
                onBuildingSelected = { id ->
                    selectedBuildingIdForPreview = id
                    // Use the getBuildingById that also uses the global AllBuildingDataSample
                    println("Preview: Building selected with ID: $id. Full data: ${getBuildingById(id)}")
                },
                onNavigateBack = { println("Preview: Navigate back pressed (from list screen)") }
            )
        } else {
            // Detail view part of the preview
            val building = getBuildingById(selectedBuildingIdForPreview!!) // Uses global AllBuildingDataSample
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp)
                    .verticalScroll(scrollState),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                if (building != null) {
                    Text("Preview: Details for:", style = MaterialTheme.typography.headlineSmall)
                    Text(building.name, style = MaterialTheme.typography.titleLarge)
                    // ... (rest of your detail view Text elements) ...
                    Text("ID: ${building.id}", style = MaterialTheme.typography.bodyMedium)
                    Text("Category: ${building.category}", style = MaterialTheme.typography.bodyMedium)
                    Spacer(modifier = Modifier.height(4.dp))
                    Text("Power: ${building.powerConsumption}", style = MaterialTheme.typography.bodyMedium)
                    Spacer(modifier = Modifier.height(4.dp))
                    Text("Overclockable: ${building.overclockable ?: "N/A"}", style = MaterialTheme.typography.bodyMedium)
                    Spacer(modifier = Modifier.height(4.dp))
                    Text("Inputs: ${building.conveyorInputs ?: "N/A"}", style = MaterialTheme.typography.bodyMedium)
                    Spacer(modifier = Modifier.height(8.dp))
                    Text("Description:", style = MaterialTheme.typography.titleMedium)
                    Text(building.description, style = MaterialTheme.typography.bodyMedium)
                    Spacer(modifier = Modifier.height(8.dp))
                    Text("Build Cost:", style = MaterialTheme.typography.titleMedium)
                    building.buildCost.forEach { cost ->
                        Text("- ${cost.quantity}x ${cost.itemName}", style = MaterialTheme.typography.bodyMedium)
                    }
                    Spacer(modifier = Modifier.height(50.dp))
                    Text("--- End of Details ---")
                } else {
                    Text("Building with ID '$selectedBuildingIdForPreview' not found in global AllBuildingDataSample.")
                }
                Spacer(modifier = Modifier.height(16.dp))
                Button(onClick = { selectedBuildingIdForPreview = null }) {
                    Text("Back to list")
                }
            }
        }
    }
}