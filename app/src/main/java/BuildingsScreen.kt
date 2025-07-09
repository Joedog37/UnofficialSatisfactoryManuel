package com.example.unofficialsatisfactorymanuel

// Imports for Composable functions and UI elements
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
// Removed Row import as it's replaced by LazyRow for the buttons
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow // Added LazyRow import
import androidx.compose.foundation.lazy.items // items is used by both LazyColumn and LazyRow
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
enum class BuildingGroup(val displayName: String, val letters: CharRange) {
    A_TO_C("A-C", 'A'..'C'),
    D_TO_F("D-F", 'D'..'F'),
    G_TO_I("G-I", 'G'..'I'),
    J_TO_L("J-L", 'J'..'L'),
    M_TO_O("M-O", 'M'..'O'),
    P_TO_R("P-R", 'P'..'R'),
    S_TO_U("S-U", 'S'..'U'),
    V_TO_Z("V-Z", 'V'..'Z'); // Semicolon here if you add functions to the enum later, otherwise optional for the last entry
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BuildingsScreen(
    modifier: Modifier = Modifier,
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
        }
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
            // Group Selection Buttons - Replaced Row with LazyRow
            LazyRow(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp), // Vertical padding for the LazyRow itself
                contentPadding = PaddingValues(horizontal = 8.dp), // Padding for the content within LazyRow
                horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterHorizontally)
            ) {
                items(items = BuildingGroup.entries, key = { it.name }) { group ->
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
            .padding(vertical = 12.dp)
    )
}

@Preview(showBackground = true, widthDp = 370, heightDp = 720)
@Composable
fun BuildingsScreenWithGroupSelectionPreview() {
    var selectedBuildingIdForPreview by remember { mutableStateOf<String?>(null) }
    val scrollState = rememberScrollState()

    // Create a more diverse sample for previewing group filtering
    // This is temporary preview data. The actual screen uses AllBuildingDataSample.
    val previewAllBuildingDataSample = remember {
        listOf(
            BuildingData("assembler_prev", "Assembler", "Production", "Desc A", "15MW", emptyList(), "Yes", "2"),
            BuildingData("biomass_burner_prev", "Biomass Burner", "Power", "Desc B", "30MW", emptyList(), "No", "0"),
            BuildingData("constructor_prev", "Constructor", "Production", "Desc C", "4MW", emptyList(), "Yes", "1"),
            BuildingData("drone_port_prev", "Drone Port", "Logistics", "Desc D", "100MW", emptyList(), "No", "2"),
            BuildingData("extractor_prev", "Extractor", "Production", "Desc E", "10MW", emptyList(), "Yes", "0P"),
            BuildingData("foundry_prev", "Foundry", "Production", "Desc F", "16MW", emptyList(), "Yes", "2"),
            BuildingData("generator_g_prev", "Generator GGG", "Power", "Desc G", "N/A", emptyList(), null, null),
            BuildingData("hub_h_prev", "HUB HHH", "Logistics", "Desc H", "N/A", emptyList(), null, null),
            BuildingData("industrial_i_prev", "Industrial I-Beam", "Production", "Desc I", "N/A", emptyList(), null, null),
            BuildingData("jump_pad_j_prev", "Jump Pad JJJ", "Logistics", "Desc J", "N/A", emptyList(), null, null),
            // Add more sample data for other groups if desired for more thorough preview testing
        )
    }

    MyCleanComposeAppTheme {
        if (selectedBuildingIdForPreview == null) {
            // For this preview to accurately reflect filtering, the actual AllBuildingDataSample
            // (from your data package) should contain items for the selected default group (A-C).
            // Alternatively, you can modify BuildingsScreen to accept a list for preview purposes,
            // or ensure this preview's 'previewAllBuildingDataSample' is somehow used by
            // the BuildingsScreen instance below if AllBuildingDataSample were mutable and scoped here.
            // Since AllBuildingDataSample is a global val, the BuildingsScreen below will use the
            // actual data from your data files. Ensure that data is populated for a good preview.

            // The best way to make this Preview truly isolated and representative
            // would be to modify BuildingsScreen to accept an optional list parameter for previewing:
            // fun BuildingsScreen(..., buildingsToDisplay: List<BuildingData> = AllBuildingDataSample, ...)
            // And then pass `previewAllBuildingDataSample` to it here.
            // However, sticking to your current structure where BuildingsScreen directly uses
            // the global AllBuildingDataSample:
            BuildingsScreen(
                onBuildingSelected = { id ->
                    selectedBuildingIdForPreview = id
                    // For the preview, let's try to get data from the preview sample first if it was the source,
                    // otherwise fall back to the global getBuildingById for consistency.
                    // This preview's detail view logic might need adjustment if using global AllBuildingDataSample.
                    val selectedBuilding = previewAllBuildingDataSample.find { it.id == id } ?: getBuildingById(id)
                    println("Preview: Building selected with ID: $id. Full data: $selectedBuilding")
                },
                onNavigateBack = { println("Preview: Navigate back pressed (from list screen)") }
            )
        } else {
            // Detail view part of the preview
            // For the detail view in preview, it's better to fetch from the list that was used to display.
            // If BuildingsScreen used `previewAllBuildingDataSample`, then fetch from it.
            // If it used global `AllBuildingDataSample` (as it currently does), use `getBuildingById`.
            val building = previewAllBuildingDataSample.find { it.id == selectedBuildingIdForPreview!! } ?: getBuildingById(selectedBuildingIdForPreview!!)

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
                    Spacer(modifier = Modifier.height(50.dp)) // Added more space before button
                    Text("--- End of Details ---") // Optional visual separator
                } else {
                    Text("Building with ID '$selectedBuildingIdForPreview' not found.")
                }
                Spacer(modifier = Modifier.height(16.dp))
                Button(onClick = { selectedBuildingIdForPreview = null }) {
                    Text("Back to list")
                }
            }
        }
    }
}

