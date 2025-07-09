package com.example.unofficialsatisfactorymanuel.data

val buildingData_V_Z: List<BuildingData> = listOf(
    BuildingData(
        id = "valve",
        name = "Valve",
        category = "Logistics & Fluids",
        description = "The Valve is placed on Pipelines to control the maximum flow rate of fluids. It can be adjusted to limit throughput, useful for balancing fluid systems or prioritizing flow.",
        powerConsumption = "0 MW",
        dimensions = "Snaps to pipelines (small footprint)",
        overclockable = "No",
        conveyorInputs = "0", // Pipe passthrough
        conveyorOutputs = "0", // Pipe passthrough
        productionRate = "N/A (limits flow from 0 to 600 m³/min, depending on connected pipe type)",
        buildCost = listOf(
            ItemCost("Steel Pipe", 2), // Or Copper Sheet depending on game version/balance
            ItemCost("Rubber", 2)
        ),
        unlockMethod = "AWESOME Shop - Fluid Control", // Or a Tier milestone related to fluids
        unlockCost = listOf(ItemCost("AWESOME Coupon", 3)), // Example coupon cost
        unlockDetails = "Typically unlocked via the AWESOME Shop or after basic fluid handling is established.",
        usageDetails = "Place on a pipeline. Interact with it to set the desired maximum flow rate limit. Arrow indicates flow direction it controls."
    ),
    BuildingData(
        id = "wall_conveyor_perpendicular",
        name = "Wall Conveyor (Perpendicular)", // Naming can vary, this is descriptive
        category = "Logistics & Organization (Walls)",
        description = "A wall segment (typically 8m x 4m) with a single conveyor belt hole designed for belts to pass through perpendicularly. Allows conveyor belts to pass neatly through walls.",
        powerConsumption = "0 MW",
        dimensions = "Standard Wall size (e.g., 8m wide x 4m high)",
        overclockable = "No",
        conveyorInputs = "N/A (provides passthrough)",
        conveyorOutputs = "N/A (provides passthrough)",
        productionRate = "N/A",
        buildCost = listOf(
            ItemCost("Concrete", 4) // Standard wall cost
            // Plus potentially a small amount of Iron Plate or Steel Beam for the hole reinforcement
        ),
        unlockMethod = "AWESOME Shop - Wall Attachments",
        unlockCost = listOf(ItemCost("AWESOME Coupon", 1)), // Example
        unlockDetails = "Unlocked via the AWESOME Shop, often in a pack with other wall conveyor mounts.",
        usageDetails = "Use as a standard wall piece where you need a conveyor belt to pass straight through the wall face."
    ),
    BuildingData(
        id = "wall_conveyor_x1",
        name = "Wall Conveyor  x1", // Or "Wall Conveyor Mount x1"
        category = "Logistics & Organization (Walls)",
        description = "A wall segment (typically 8m x 4m) with a single, centered conveyor belt hole. Allows conveyor belts to pass neatly through walls.",
        powerConsumption = "0 MW",
        dimensions = "Standard Wall size (e.g., 8m wide x 4m high)",
        overclockable = "No",
        conveyorInputs = "N/A (provides passthrough)",
        conveyorOutputs = "N/A (provides passthrough)",
        productionRate = "N/A",
        buildCost = listOf(
            ItemCost("Concrete", 4) // Standard wall cost
            // Plus potentially a small amount of Iron Plate for the hole
        ),
        unlockMethod = "AWESOME Shop - Wall Attachments",
        unlockCost = listOf(ItemCost("AWESOME Coupon", 1)), // Example
        unlockDetails = "Unlocked via the AWESOME Shop.",
        usageDetails = "Use as a standard wall piece where you need one conveyor belt to pass through."
    ),
    BuildingData(
        id = "wall_conveyor_x2",
        name = "Wall Conveyor x2", // Or "Wall Conveyor Mount x2"
        category = "Logistics & Organization (Walls)",
        description = "A wall segment (typically 8m x 4m) with two horizontally aligned conveyor belt holes.",
        powerConsumption = "0 MW",
        dimensions = "Standard Wall size (e.g., 8m wide x 4m high)",
        overclockable = "No",
        conveyorInputs = "N/A (provides passthrough)",
        conveyorOutputs = "N/A (provides passthrough)",
        productionRate = "N/A",
        buildCost = listOf(
            ItemCost("Concrete", 4) // Standard wall cost
            // Plus potentially Iron Plates for the holes
        ),
        unlockMethod = "AWESOME Shop - Wall Attachments",
        unlockCost = listOf(ItemCost("AWESOME Coupon", 2)), // Example
        unlockDetails = "Unlocked via the AWESOME Shop.",
        usageDetails = "Allows two parallel conveyor belts to pass through a wall segment."
    ),
    BuildingData(
        id = "wall_conveyor_x3",
        name = "Wall Conveyor x3", // Or "Wall Conveyor Mount x3"
        category = "Logistics & Organization (Walls)",
        description = "A wall segment (typically 8m x 4m) with three horizontally aligned conveyor belt holes.",
        powerConsumption = "0 MW",
        dimensions = "Standard Wall size (e.g., 8m wide x 4m high)",
        overclockable = "No",
        conveyorInputs = "N/A (provides passthrough)",
        conveyorOutputs = "N/A (provides passthrough)",
        productionRate = "N/A",
        buildCost = listOf(
            ItemCost("Concrete", 4) // Standard wall cost
            // Plus potentially Iron Plates for the holes
        ),
        unlockMethod = "AWESOME Shop - Wall Attachments",
        unlockCost = listOf(ItemCost("AWESOME Coupon", 3)), // Example
        unlockDetails = "Unlocked via the AWESOME Shop.",
        usageDetails = "Allows three parallel conveyor belts to pass through a wall segment."
    ),
    BuildingData(
        id = "wall_door_center",
        name = "Wall Door (Center)",
        category = "Organization & Aesthetics (Walls)",
        description = "A standard wall segment (e.g., 8m x 4m) with an automatic door integrated into the center.",
        powerConsumption = "0 MW (typically, or very minimal if animated)",
        dimensions = "Standard Wall size (e.g., 8m wide x 4m high)",
        overclockable = "No",
        conveyorInputs = "N/A",
        conveyorOutputs = "N/A",
        productionRate = "N/A",
        buildCost = listOf(
            ItemCost("Concrete", 3), // Slightly less concrete due to door
            ItemCost("Iron Plate", 4) // For door mechanism
        ),
        unlockMethod = "AWESOME Shop - Architecture / Walls",
        unlockCost = listOf(ItemCost("AWESOME Coupon", 2)), // Example
        unlockDetails = "Unlocked via the AWESOME Shop.",
        usageDetails = "Provides player access through walls. Opens automatically when approached."
    ),
    BuildingData(
        id = "wall_door_left",
        name = "Wall Door (Left)",
        category = "Organization & Aesthetics (Walls)",
        description = "A standard wall segment (e.g., 8m x 4m) with an automatic door integrated on the left side.",
        powerConsumption = "0 MW",
        dimensions = "Standard Wall size (e.g., 8m wide x 4m high)",
        overclockable = "No",
        conveyorInputs = "N/A",
        conveyorOutputs = "N/A",
        productionRate = "N/A",
        buildCost = listOf(
            ItemCost("Concrete", 3),
            ItemCost("Iron Plate", 4)
        ),
        unlockMethod = "AWESOME Shop - Architecture / Walls",
        unlockCost = listOf(ItemCost("AWESOME Coupon", 2)), // Example
        unlockDetails = "Unlocked via the AWESOME Shop.",
        usageDetails = "Provides player access. Door is offset to the left."
    ),
    BuildingData(
        id = "wall_door_right",
        name = "Wall Door (Right)",
        category = "Organization & Aesthetics (Walls)",
        description = "A standard wall segment (e.g., 8m x 4m) with an automatic door integrated on the right side.",
        powerConsumption = "0 MW",
        dimensions = "Standard Wall size (e.g., 8m wide x 4m high)",
        overclockable = "No",
        conveyorInputs = "N/A",
        conveyorOutputs = "N/A",
        productionRate = "N/A",
        buildCost = listOf(
            ItemCost("Concrete", 3),
            ItemCost("Iron Plate", 4)
        ),
        unlockMethod = "AWESOME Shop - Architecture / Walls",
        unlockCost = listOf(ItemCost("AWESOME Coupon", 2)), // Example
        unlockDetails = "Unlocked via the AWESOME Shop.",
        usageDetails = "Provides player access. Door is offset to the right."
    ),
    BuildingData(
        id = "water_extractor",
        name = "Water Extractor",
        category = "Resource Extraction (Fluids)",
        description = "Extracts Water from bodies of water (lakes, rivers, oceans). Essential for many production processes, including power generation (Coal, Nuclear) and various refinery recipes.",
        powerConsumption = "20 MW",
        dimensions = "6m x 10m x 11m (plus requires water depth)",
        overclockable = "Yes (affects extraction rate and power consumption)",
        conveyorInputs = "0",
        conveyorOutputs = "0", // 1 Pipe Output
        productionRate = "120 m³/min (at 100% clock speed). Max overclock to 300 m³/min.",
        buildCost = listOf(
            ItemCost("Copper Sheet", 20),
            ItemCost("Reinforced Iron Plate", 10),
            ItemCost("Rotor", 10)
        ),
        unlockMethod = "Tier 3 - Coal Power",
        unlockCost = null, // Part of the Tier milestone
        unlockDetails = "Unlocked via the Tier 3 milestone 'Coal Power'.",
        usageDetails = "Must be placed in water. Output pipe connects to fluid networks. Does not require specific resource nodes, just a body of water."
    )
    // You might also consider "Wall Power Outlet" variants if you want to be exhaustive with wall items.
)