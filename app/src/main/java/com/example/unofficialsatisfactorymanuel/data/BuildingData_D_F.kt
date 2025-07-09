package com.example.unofficialsatisfactorymanuel.data

// --- Import data classes from the 'model' package ---

val buildingData_D_F: List<BuildingData> = listOf(
    BuildingData(
        id = "dimensional_depot_uploader",
        name = "Dimensional Depot Uploader",
        category = "TODO",
        description = "TODO: Add description.",
        powerConsumption = "TODO MW",
        // Assuming ItemCost is used for buildCost. If buildCost is empty, ItemCost import is not strictly
        // needed for *this specific list item* but good to have if other items might use it or for consistency.
        buildCost = emptyList(), // If you add items, they'd be ItemCost(...)
        overclockable = "Yes/No/N/A", // Consistent with your model
        conveyorInputs = "TODO",
        // conveyorOutputs = null, // from your model definition
        // productionRate = null,  // from your model definition
        // unlockMethod = null,    // from your model definition
        // unlockCost = null,      // from your model definition
        // unlockDetails = null    // from your model definition
    ),
    BuildingData(
        id = "drone_port",
        name = "Drone Port",
        category = "Logistics",
        description = "Facilitates automated transport of items using Drones. Requires Batteries.",
        powerConsumption = "100 MW",
        buildCost = listOf(
            // ItemCost("Modular Frame", 10), // Example: This is where ItemCost would be used
            // ItemCost("Computer", 2)
        ), // Keep as emptyList() if no cost defined yet.
        overclockable = "No",
        conveyorInputs = "1 Item Input, 1 Item Output, 1 Battery Input"
    ),
    BuildingData(
        id = "empty_platform",
        name = "Empty Platform",
        category = "Foundations",
        description = "A basic platform for building structures.",
        powerConsumption = "N/A",
        buildCost = emptyList(),
        overclockable = "N/A",
        conveyorInputs = "N/A"
    ),
    BuildingData(
        id = "equipment_workshop",
        name = "Equipment Workshop",
        category = "Production",
        description = "Used to craft personal equipment and tools.",
        powerConsumption = "20 MW",
        buildCost = emptyList(),
        overclockable = "No",
        conveyorInputs = "N/A"
    ),
    BuildingData(
        id = "fluid_buffer",
        name = "Fluid Buffer",
        category = "Logistics",
        description = "Stores a moderate amount of fluid.",
        powerConsumption = "N/A",
        buildCost = emptyList(),
        overclockable = "N/A",
        conveyorInputs = "1 Input, 1 Output (Pipes)"
    ),
    BuildingData(
        id = "foundry",
        name = "Foundry",
        category = "Production",
        description = "Smelts two solid ingredients into one, typically producing alloys.",
        powerConsumption = "16 MW",
        buildCost = emptyList(),
        overclockable = "Yes",
        conveyorInputs = "2 Inputs, 1 Output"
    ),
    BuildingData(
        id = "freight_platform",
        name = "Freight Platform",
        category = "Logistics",
        description = "Part of the Train system for loading/unloading items from Freight Cars.",
        powerConsumption = "50 MW",
        buildCost = emptyList(),
        overclockable = "No",
        conveyorInputs = "1 Input or 1 Output (depending on mode)"
    ),
    BuildingData(
        id = "fuel_generator",
        name = "Fuel Generator",
        category = "Power",
        description = "Generates power by burning various types of fuel.",
        powerConsumption = "-150 MW", // Negative indicates generation
        buildCost = emptyList(),
        overclockable = "Yes",
        conveyorInputs = "1 Fuel Input (Pipe)"
    )
)