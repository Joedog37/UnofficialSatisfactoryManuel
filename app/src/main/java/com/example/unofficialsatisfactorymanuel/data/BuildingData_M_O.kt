package com.example.unofficialsatisfactorymanuel.data

val buildingData_M_O: List<BuildingData> = listOf(
    BuildingData(
        id = "mam",
        name = "MAM",
        category = "Production", // Or "Research" / "Progression"
        description = "The Molecular Analysis Machine (MAM) is used to analyze Alien Organisms/Remains, Hard Drives, Power Slugs, and other specific items to unlock new technologies, alternate recipes, and other gameplay enhancements.",
        powerConsumption = "10 MW", // Idle power
        dimensions = "5m x 5m x 4m",
        overclockable = "No",
        conveyorInputs = "1 (for items to be researched)",
        conveyorOutputs = "0",
        productionRate = "N/A (research time varies)",
        buildCost = listOf(
            ItemCost("Iron Plate", 50),
            ItemCost("Iron Rod", 50),
            ItemCost("Wire", 100),
            ItemCost("Cable", 20)
        ),
        unlockMethod = "Tier 1 - Field Research",
        unlockCost = null, // Or specify if there's a specific Hub part needed for its initial unlock
        unlockDetails = "Unlocked via HUB Upgrade 4.",
        usageDetails = "Used for research. Different research trees become available as you progress or find specific items."
    ),
    BuildingData(
        id = "manufacturer",
        name = "Manufacturer",
        category = "Production",
        description = "The Manufacturer is an advanced production building used to craft complex parts that require up to four different ingredients. It is essential for automating the production of late-game items.",
        powerConsumption = "55 MW",
        dimensions = "10m x 11m x 9m",
        overclockable = "Yes",
        conveyorInputs = "4",
        conveyorOutputs = "1",
        productionRate = "Varies by recipe",
        buildCost = listOf(
            ItemCost("Heavy Modular Frame", 5),
            ItemCost("Motor", 10),
            ItemCost("Cable", 50),
            ItemCost("Reinforced Iron Plate", 20)
        ),
        unlockMethod = "Tier 5 - Industrial Manufacturing",
        unlockCost = null, // Part of the Tier milestone
        unlockDetails = "Unlocked via the Tier 5 milestone 'Industrial Manufacturing'.",
        usageDetails = "Select a recipe. Input ingredients must be supplied to the corresponding input ports. The manufactured item will be output from the single output port."
    ),
    BuildingData(
        id = "miner_mk1",
        name = "Miner Mk.1",
        category = "Resource Extraction",
        description = "The Miner Mk.1 is placed on top of Resource Nodes to automatically extract raw resources. It is the basic automated mining solution.",
        powerConsumption = "5 MW",
        dimensions = "6m x 7m x 5m",
        overclockable = "Yes",
        conveyorInputs = "0",
        conveyorOutputs = "1",
        productionRate = "30, 60, or 120/min (Impure, Normal, Pure node at 100% clock speed)",
        buildCost = listOf(
            ItemCost("Portable Miner", 2), // Or the direct components if preferred
            ItemCost("Iron Rod", 10),
            ItemCost("Iron Plate", 10)
        ),
        unlockMethod = "Tier 1 - Base Building",
        unlockCost = null, // Part of the Tier milestone
        unlockDetails = "Unlocked via HUB Upgrade 3.",
        usageDetails = "Must be placed on a resource node. Output rate depends on node purity and clock speed. Requires power."
    ),
    BuildingData(
        id = "miner_mk2",
        name = "Miner Mk.2",
        category = "Resource Extraction",
        description = "The Miner Mk.2 is an upgraded version of the Miner, extracting resources at a faster rate. It is placed on Resource Nodes.",
        powerConsumption = "12 MW",
        dimensions = "6m x 7m x 5m",
        overclockable = "Yes",
        conveyorInputs = "0",
        conveyorOutputs = "1",
        productionRate = "60, 120, or 240/min (Impure, Normal, Pure node at 100% clock speed)",
        buildCost = listOf(
            ItemCost("Steel Beam", 10),
            ItemCost("Encased Industrial Beam", 5),
            ItemCost("Rotor", 5),
            ItemCost("Modular Frame", 10)
        ),
        unlockMethod = "Tier 3 - Coal Power",
        unlockCost = null, // Part of the Tier milestone
        unlockDetails = "Unlocked via the Tier 3 milestone 'Coal Power'.",
        usageDetails = "Functions like Miner Mk.1 but with higher output and power consumption. Must be placed on a resource node."
    ),
    BuildingData(
        id = "miner_mk3",
        name = "Miner Mk.3",
        category = "Resource Extraction",
        description = "The Miner Mk.3 is the most advanced automated mining solution, offering the highest extraction rate from Resource Nodes.",
        powerConsumption = "30 MW",
        dimensions = "6m x 7m x 5m",
        overclockable = "Yes",
        conveyorInputs = "0",
        conveyorOutputs = "1",
        productionRate = "120, 240, or 480/min (Impure, Normal, Pure node at 100% clock speed). With Mk.5 belts, max practical output for a pure node at 250% is 780/min.",
        buildCost = listOf(
            ItemCost("Supercomputer", 1),
            ItemCost("Steel Pipe", 20),
            ItemCost("Rubber", 20),
            ItemCost("High-Speed Connector", 5)
        ),
        unlockMethod = "Tier 7 - Bauxite Refinement (Requires MAM Research)",
        unlockCost = null, // Typically unlocked via MAM research
        unlockDetails = "Unlocked through MAM research for Caterium or Quartz after reaching Tier 7.", // This can vary slightly based on research path.
        usageDetails = "Highest yield miner. Power consumption is significant. Ensure adequate belt capacity for output."
    ),
    BuildingData(
        id = "nuclear_power_plant",
        name = "Nuclear Power Plant",
        category = "Power Generation",
        description = "The Nuclear Power Plant generates a massive amount of power by consuming Uranium Fuel Rods. It also produces Nuclear Waste, which must be managed.",
        powerConsumption = "Consumes Uranium Fuel Rods. (Outputs 2,500 MW)",
        dimensions = "28m x 30m x 42m",
        overclockable = "Yes (affects fuel consumption rate and waste production)",
        conveyorInputs = "1 (for Uranium Fuel Rods)",
        conveyorOutputs = "1 (for Nuclear Waste)", // Also requires Water input via pipeline
        productionRate = "2,500 MW per plant (at 100% clock speed)",
        buildCost = listOf(
            ItemCost("Supercomputer", 5),
            ItemCost("Heavy ModularFrame", 20),
            ItemCost("High-Speed Connector", 25),
            ItemCost("Concrete", 500),
            ItemCost("AI Limiter", 10)
        ),
        unlockMethod = "Tier 8 - Nuclear Power",
        unlockCost = null, // Part of the Tier milestone
        unlockDetails = "Unlocked via the Tier 8 milestone 'Nuclear Power'. Requires significant prior research and infrastructure.",
        usageDetails = "Requires Uranium Fuel Rods and Water (240 m³/min). Produces Nuclear Waste (5/min per rod at 100%). Waste is radioactive and must be stored or processed."
    ),
    BuildingData(
        id = "oil_extractor",
        name = "Oil Extractor",
        category = "Resource Extraction",
        description = "The Oil Extractor is placed on Crude Oil Resource Nodes to extract Crude Oil, a vital resource for advanced production and power generation.",
        powerConsumption = "40 MW",
        dimensions = "11m x 11m x 19m",
        overclockable = "Yes",
        conveyorInputs = "0", // Pipe input for power, no conveyor
        conveyorOutputs = "0", // Pipe output for Crude Oil
        productionRate = "60, 120, or 240 m³/min (Impure, Normal, Pure node at 100% clock speed)",
        buildCost = listOf(
            ItemCost("Motor", 15),
            ItemCost("Encased Industrial Beam", 15),
            ItemCost("Circuit Board", 50),
            ItemCost("Steel Pipe", 30)
        ),
        unlockMethod = "Tier 5 - Oil Processing",
        unlockCost = null, // Part of the Tier milestone
        unlockDetails = "Unlocked via the Tier 5 milestone 'Oil Processing'.",
        usageDetails = "Must be placed on a Crude Oil node. Outputs Crude Oil via pipelines. Requires power."
    )
)