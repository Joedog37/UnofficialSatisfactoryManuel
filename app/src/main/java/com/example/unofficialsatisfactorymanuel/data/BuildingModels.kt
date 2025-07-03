package com.example.unofficialsatisfactorymanuel.data

data class ItemCost(
    val itemName: String,
    val quantity: Int
)

data class BuildingData(
    val id: String,                         // Unique identifier (e.g., "assembler_mk1")
    val name: String,                       // Display name (e.g., "Assembler Mk.1")
    val category: String,                   // e.g., "Production", "Power Generation", "Logistics"
    val description: String,
    val powerConsumption: String,           // Can be "N/A", "X MW", "Generates X MW", or more complex string
    val buildCost: List<ItemCost>,          // This is the per-instance resource cost
    val dimensions: String? = null,         // e.g., "8m x 10m x 6m"
    val overclockable: String? = null,      // e.g., "Yes", "No", "Partial (affects X)"
    val conveyorInputs: String? = null,     // e.g., "2", "1 (Solid)", "N/A", "0 (Manual Refuel)"

    // --- ADDED NEW OPTIONAL FIELDS FOR UNLOCK INFORMATION ---
    val unlockMethod: String? = null,      // e.g., "AWESOME Shop", "MAM Research", "Milestone"
    val unlockCost: List<ItemCost>? = null, // e.g., listOf(ItemCost("AWESOME Coupon", 3)) or resources for MAM
    val unlockDetails: String? = null,     // e.g., "'Steel-Framed Windows' category", "Sulfur Research Chain"

    // Add other relevant fields as needed in the future (existing comments below are good):
    // val conveyorOutputs: String? = null,
    // val pipeInputs: String? = null,
    // val pipeOutputs: String? = null,
    // val productionRate: String? = null, // e.g., "30/min at 100%"
    // val unlockPrerequisites: String? = null, // This could be an alternative or supplement to unlockMethod/Cost/Details
    // val imageResourceName: String? = null // For an optional image
)