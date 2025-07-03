package com.example.unofficialsatisfactorymanuel.data // Correct package declaration

// Assuming your BuildingData class is defined elsewhere and imported, or defined in this package.

val buildingData_D_F: List<BuildingData> = listOf(
    BuildingData(
        id = "dimensional_depot_uploader",
        name = "Dimensional Depot Uploader",
        category = "TODO",
        description = "TODO: Add description.",
        powerConsumption = "TODO MW",
        buildCost = emptyList(),
        overclockable = "Yes/No/N/A",
        conveyorInputs = "TODO"
    ),
    BuildingData(
        id = "drone_port",
        name = "Drone Port",
        category = "Logistics",
        description = "Facilitates automated transport of items using Drones. Requires Batteries.",
        powerConsumption = "100 MW", // Example, verify
        buildCost = listOf(
            // Example: ResourceCost("Modular Frame", 10), ResourceCost("Computer", 2)
        ),
        overclockable = "No",
        conveyorInputs = "1 Item Input, 1 Item Output, 1 Battery Input" // Example, verify
    ),
    BuildingData(
        id = "empty_platform", // ID remains the same
        name = "Empty Platform", // Name now correctly has "/zh" removed
        category = "Foundations",
        description = "A basic platform for building structures.", // You might need a different description if the "/zh" version was distinct
        powerConsumption = "N/A",
        buildCost = emptyList(),
        overclockable = "N/A",
        conveyorInputs = "N/A"
    ),
    // The "Empty Platform/zh" entry is now effectively a duplicate of "Empty Platform" if we just remove "/zh".
    // You need to decide if these were truly distinct items or just language variants.
    // If they were meant to be distinct and you still want two entries, they'll need different IDs and potentially names.
    // For now, I'll assume you want only one "Empty Platform" entry after removing "/zh".
    // IF "Empty Platform/zh" was meant to be a *different item* whose name just happened to contain "/zh",
    // you'll need to provide a new unique name and ID for it.

    BuildingData(
        id = "equipment_workshop", // ID remains the same
        name = "Equipment Workshop", // Name now correctly has "/zh" removed
        category = "Production",
        description = "Used to craft personal equipment and tools.", // Adjust if "/zh" version was distinct
        powerConsumption = "20 MW", // Example, verify
        buildCost = emptyList(),
        overclockable = "No",
        conveyorInputs = "N/A"
    ),
    // Similar to "Empty Platform", "Equipment Workshop/zh" becomes "Equipment Workshop".
    // If it was a distinct item, it needs a unique ID and possibly name. I'll assume one entry for now.

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
        powerConsumption = "16 MW", // Example, verify
        buildCost = emptyList(),
        overclockable = "Yes",
        conveyorInputs = "2 Inputs, 1 Output"
    ),
    BuildingData(
        id = "freight_platform",
        name = "Freight Platform",
        category = "Logistics",
        description = "Part of the Train system for loading/unloading items from Freight Cars.",
        powerConsumption = "50 MW", // Example, verify
        buildCost = emptyList(),
        overclockable = "No",
        conveyorInputs = "1 Input or 1 Output (depending on mode)"
    ),
    BuildingData(
        id = "fuel_generator", // Changed ID to match common name "Fuel Generator"
        name = "Fuel Generator", // Changed name from "Fuel-Powered Generator"
        category = "Power",
        description = "Generates power by burning various types of fuel.",
        powerConsumption = "-150 MW",
        buildCost = emptyList(),
        overclockable = "Yes",
        conveyorInputs = "1 Fuel Input (Pipe)"
    )
)