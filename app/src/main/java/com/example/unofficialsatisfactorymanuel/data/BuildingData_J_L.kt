package com.example.unofficialsatisfactorymanuel.data

// Assuming BuildingData and ItemCost are in this same package.
// If not, you'd need:
// import com.example.unofficialsatisfactorymanuel.data.BuildingData
// import com.example.unofficialsatisfactorymanuel.data.ItemCost

val buildingData_J_L: List<BuildingData> = listOf(
    // --- BUILDINGS STARTING WITH 'J' ---
    BuildingData(
        id = "jump_pad",
        name = "Jump Pad",
        category = "Logistics - Personnel Transport",
        description = "Propels pioneers and some creatures into the air. Direction and angle can be configured.",
        powerConsumption = "4 MW", // When active, can be less in standby
        buildCost = listOf(
            ItemCost("Modular Frame", 2),
            ItemCost("Rotor", 4),
            ItemCost("Plastic", 10),
            ItemCost("Cable", 20)
        ),
        dimensions = "4m x 4m x 1m (Pad itself)",
        overclockable = "No (Angle/Force is configured)",
        conveyorInputs = "N/A",
        conveyorOutputs = "N/A",
        productionRate = "N/A",
        unlockMethod = "Tier 3 - Coal Power (HUB Milestone)", // Or sometimes AWESOME Shop
        unlockCost = null, // Or AWESOME Shop coupon cost
        unlockDetails = "Often unlocked via a HUB milestone or purchased in the AWESOME Shop.",
        usageDetails = "Useful for vertical or horizontal traversal. Aim carefully! Can be chained for complex jumps."
    ),
    // (Pipeline Junction Cross could also go here if desired, or under 'P')

    // --- BUILDINGS STARTING WITH 'K' ---
    // (Vanilla Satisfactory has no buildings starting with 'K' as of my last update)

    // --- BUILDINGS STARTING WITH 'L' ---
    BuildingData(
        id = "ladder",
        name = "Ladder",
        category = "Logistics - Vertical Transport",
        description = "Allows for vertical traversal up and down structures.",
        powerConsumption = "N/A",
        buildCost = listOf(
            ItemCost("Iron Rod", 2)
        ),
        dimensions = "Segments are 4m high, very narrow",
        overclockable = "N/A",
        conveyorInputs = "N/A",
        conveyorOutputs = "N/A",
        productionRate = "N/A",
        unlockMethod = "Tier 0 - HUB Upgrade 1",
        unlockCost = null, // Part of early HUB upgrades
        unlockDetails = "One of the earliest unlocks in the HUB for basic traversal.",
        usageDetails = "Place on walls or structures to climb. Can be chained for greater height."
    ),

    // Placeholder for "Large Fan" - Please verify if this is a standard building or modded.
    // If it's a modded item, try to find its actual stats.
    /*
    BuildingData(
        id = "large_fan",
        name = "Large Fan",
        category = "Environment Control / Logistics", // Guessing category
        description = "A large fan, potentially for environmental effects or launching items/personnel. (NEEDS VERIFICATION)",
        powerConsumption = "50 MW", // Placeholder
        buildCost = listOf(
            ItemCost("Heavy Modular Frame", 5),
            ItemCost("Motor", 10),
            ItemCost("Steel Plate", 20) // Placeholder costs
        ),
        dimensions = "8m x 4m x 8m", // Placeholder
        overclockable = "Yes", // Placeholder
        conveyorInputs = "N/A", // Placeholder
        conveyorOutputs = "N/A", // Placeholder
        productionRate = "N/A",
        unlockMethod = "Tier X - Advanced Aerodynamics (Placeholder)",
        unlockCost = null,
        unlockDetails = "Details for Large Fan need to be confirmed.",
        usageDetails = "Usage of Large Fan needs to be confirmed."
    ),
    */

    BuildingData(
        id = "light_control_panel",
        name = "Light Control Panel",
        category = "Cosmetics & Organization", // Or "Lighting"
        description = "Controls the power state and settings for connected lights.",
        powerConsumption = "1 MW", // Minimal, or 0 if it just passes power
        buildCost = listOf(
            ItemCost("Quickwire", 20),
            ItemCost("Cable", 5),
            ItemCost("Plastic", 2)
        ),
        dimensions = "2m x 1m x 2m", // Approximate wall-mounted
        overclockable = "No",
        conveyorInputs = "N/A",
        conveyorOutputs = "N/A (Controls light power)",
        productionRate = "N/A",
        unlockMethod = "AWESOME Shop",
        unlockCost = listOf(ItemCost("AWESOME Coupon", 1)),
        unlockDetails = "Purchased from the AWESOME Shop to manage lighting systems.",
        usageDetails = "Connect lights to this panel to control them as a group (on/off, color, intensity if applicable to the lights)."
    ),
    BuildingData(
        id = "ceiling_light",
        name = "Light - Ceiling", // More specific name
        category = "Lighting",
        description = "A light fixture that can be attached to ceilings to illuminate areas.",
        powerConsumption = "1 MW",
        buildCost = listOf(
            ItemCost("Quickwire", 5),
            ItemCost("Cable", 2),
            ItemCost("Plastic", 1)
        ),
        dimensions = "1m x 1m x 0.5m",
        overclockable = "No",
        conveyorInputs = "N/A",
        conveyorOutputs = "N/A",
        productionRate = "N/A",
        unlockMethod = "AWESOME Shop",
        unlockCost = listOf(ItemCost("AWESOME Coupon", 1)), // Individual light costs may vary
        unlockDetails = "Purchased from the AWESOME Shop.",
        usageDetails = "Provides illumination. Color can be set using the build gun. Connect to power directly or via a Light Control Panel."
    ),
    // You could add similar entries for "Light - Flood Light Tower", "Light - Wall Light"
    // Each might have slightly different costs or dimensions.

    BuildingData(
        id = "lookout_tower",
        name = "Lookout Tower",
        category = "Logistics & Exploration",
        description = "A tall structure that provides a high vantage point for observing the surrounding area.",
        powerConsumption = "N/A",
        buildCost = listOf(
            ItemCost("Concrete", 20),
            ItemCost("Iron Rod", 15),
            ItemCost("Iron Plate", 5)
        ),
        dimensions = "Base ~4m x 4m, Height ~25m",
        overclockable = "N/A",
        conveyorInputs = "N/A",
        conveyorOutputs = "N/A",
        productionRate = "N/A",
        unlockMethod = "Tier 1 - Field Research (HUB Milestone)",
        unlockCost = null, // Part of HUB milestone
        unlockDetails = "Early game unlock for exploration and planning.",
        usageDetails = "Climb to the top using the built-in ladder for a panoramic view."
    )
)