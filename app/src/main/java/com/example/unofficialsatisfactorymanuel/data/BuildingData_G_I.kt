package com.example.unofficialsatisfactorymanuel.data

// Assuming BuildingData and ItemCost are in this same package.
// If not, you'd need:
// import com.example.unofficialsatisfactorymanuel.data.BuildingData
// import com.example.unofficialsatisfactorymanuel.data.ItemCost

val buildingData_G_I: List<BuildingData> = listOf(
    // --- BUILDINGS STARTING WITH 'G' ---
    BuildingData(
        id = "geothermal_generator",
        name = "Geothermal Generator",
        category = "Power Generation",
        description = "Extracts power directly from Geysers, providing a consistent and free source of power once constructed.",
        powerConsumption = "Generates 100-600 MW (varies by Geyser purity)", // Example: Pure ~200MW, Normal ~100MW, Impure ~50MW. Can be up to 3 on one geyser.
        buildCost = listOf(
            ItemCost("Supercomputer", 5),
            ItemCost("Heavy Modular Frame", 15),
            ItemCost("Rubber", 50),
            ItemCost("High-Speed Connector", 5)
        ),
        dimensions = "12m x 12m x 22m", // Approximate
        overclockable = "No",
        conveyorInputs = "N/A (Placed on Geyser node)",
        conveyorOutputs = "N/A (Power Output Only)",
        productionRate = "N/A",
        unlockMethod = "Tier 7 - Aeronautical Engineering (MAM Research for Geothermal Power)",
        unlockCost = listOf( // Example cost for MAM research
            ItemCost("Radio Control Unit", 25),
            ItemCost("Supercomputer", 10),
            ItemCost("Crystal Oscillator", 100)
        ),
        unlockDetails = "Unlocked via research in the Caterium tree in the MAM.",
        usageDetails = "Must be placed directly on a Geyser node. Power output depends on Geyser purity (Impure, Normal, Pure). Up to three generators can sometimes be placed on a single geyser if spaced correctly."
    ),

    // --- BUILDINGS STARTING WITH 'H' ---
    // Note: "Hypertube" itself isn't a placeable building like an entrance or support.
    // It's the tube created *between* supports and entrances.
    // So, we'll focus on the placeable components.

    BuildingData(
        id = "hyper_tube_entrance",
        name = "Hypertube Entrance",
        category = "Logistics - Personnel Transport",
        description = "An entry and exit point for the Hypertube network, allowing for rapid personal transportation.",
        powerConsumption = "10 MW",
        buildCost = listOf(
            ItemCost("Copper Sheet", 10),
            ItemCost("Encased Industrial Beam", 3),
            ItemCost("Rubber", 5)
        ),
        dimensions = "4m x 2m x 4m", // Approximate
        overclockable = "No",
        conveyorInputs = "N/A",
        conveyorOutputs = "N/A",
        productionRate = "N/A",
        unlockMethod = "Tier 4 - Basic Steel Production (HUB Milestone for Hypertubes)",
        unlockCost = listOf( // Part of the overall Hypertubes milestone cost
            ItemCost("Steel Beam", 100),
            ItemCost("Encased Industrial Beam", 50),
            ItemCost("Cable", 300)
        ),
        unlockDetails = "Unlocked as part of the Hypertube Transportation milestone in the HUB.",
        usageDetails = "Connect to Hypertube Supports to create a transport network. Players enter/exit here. Can be connected to power to increase travel speed."
    ),
    // Hypertube Junction - This is not a standard buildable in vanilla Satisfactory.
    // Tube connections are made by aiming supports. If this is a modded item or
    // you're thinking of something else (like Pipeline Junction Cross), let me know.
    // For now, I'll omit it as it's not a typical vanilla buildable.
    // If you mean connecting multiple tubes to one entrance, that's just how entrances work.

    BuildingData(
        id = "hyper_tube_support",
        name = "Hypertube Support",
        category = "Logistics - Personnel Transport",
        description = "Used to build and support Hypertubes, forming the pathway for personnel transport.",
        powerConsumption = "N/A", // Supports themselves don't consume power
        buildCost = listOf(
            ItemCost("Steel Pipe", 3),
            ItemCost("Concrete", 2)
        ),
        dimensions = "Variable (Pole height, ~2m base width)",
        overclockable = "N/A",
        conveyorInputs = "N/A",
        conveyorOutputs = "N/A",
        productionRate = "N/A",
        unlockMethod = "Tier 4 - Basic Steel Production (HUB Milestone for Hypertubes)",
        unlockCost = listOf( // Part of the overall Hypertubes milestone cost (same as entrance)
            ItemCost("Steel Beam", 100),
            ItemCost("Encased Industrial Beam", 50),
            ItemCost("Cable", 300)
        ),
        unlockDetails = "Unlocked alongside Hypertube Entrances.",
        usageDetails = "Place supports and then click between them or an entrance to build a Hypertube segment. Stackable to adjust height."
    ),

    // --- BUILDINGS STARTING WITH 'I' ---
    BuildingData(
        id = "indicator_light", // Assuming this refers to the "Light Control Panel" or individual "Lights"
        name = "Indicator Light", // Generic name, might be "Ceiling Light", "Flood Light Tower", etc.
        category = "Cosmetics & Organization", // Or "Lighting"
        description = "Provides illumination and can be used for visual signaling. Color and intensity can often be customized.",
        powerConsumption = "1 MW", // Example for a basic light
        buildCost = listOf(
            ItemCost("Quickwire", 5),
            ItemCost("Cable", 2),
            ItemCost("Plastic", 1) // Or Iron Plate for more basic lights
        ),
        dimensions = "Small (e.g., 1m x 1m x 0.5m)",
        overclockable = "No",
        conveyorInputs = "N/A",
        conveyorOutputs = "N/A",
        productionRate = "N/A",
        unlockMethod = "AWESOME Shop", // Lights are typically purchased here
        unlockCost = listOf(
            ItemCost("AWESOME Coupon", 2) // Example coupon cost
        ),
        unlockDetails = "Various types of lights (Ceiling, Flood, Wall) are available in the AWESOME Shop.",
        usageDetails = "Used to illuminate factory areas or for decorative purposes. Requires connection to a Light Control Panel or directly to power for some types. Color can be set via the build gun."
    )
    // You might want separate entries if there are distinct "Indicator Light" types with different stats/costs.
    // e.g., "Flood Light Tower", "Ceiling Light", "Wall Light".
    // For simplicity, I've made a somewhat generic "Indicator Light".
)