package com.example.unofficialsatisfactorymanuel.data // Ensure this line is correct

// Data for buildings starting with A, B, C
val buildingData_A_C: List<BuildingData> = listOf(
    // --- A ---
    BuildingData(
        id = "alien_power_augmenter",
        name = "Alien Power Augmenter",
        category = "Power Generation",
        description = "The Alien Power Augmenter (APA) is a special power generator building that boosts the total power grid capacity and generates power. " +
                "It provides a base generation of 500 MW.\n\n" +
                "Only a limited amount of Alien Power Augmenters can be built, as each requires non-renewable Somersloops. They are one of two ways of utilizing Somersloops, the other being production amplification.\n\n" +
                "--- Usage Details ---\n" +
                "Alien Power Augmenters (APA) automatically generate 500 MW of power independently. Their contribution to existing base power production is as follows:\n" +
                "Base production = Existing generator production + (APAs × 500)\n\n" +
                "Additionally, a multiplier is calculated against the base power production for the number of APAs connected to the grid. Unfueled APAs grant a 10% increase whereas fueled APAs grant a 30% increase. (The term fueled means supplied by 5 Alien Power Matrices/min):\n" +
                "Power multiplier = 0.1 × Unfueled APAs + 0.3 × Fueled APAs\n\n" +
                "The resulting augmented power production is thus:\n" +
                "Augmented production = Base production × (1 + Power multiplier)\n\n" +
                "For example, existing generated power produced is 5,000 MW. Building an APA generates an additional 500 MW, bringing the base production to 5,500 MW. Next, the base production (5,500 MW) is boosted by 10% multiplier, resulting in a total power capacity of 6,050 MW (5,500 MW + 550 MW = 6,050 MW). If for example two augmenters are built, the base capacity becomes 6,000 MW (5,000 MW + 1,000 MW ), and is then boosted by 20% becoming 7,200 MW (6,000 MW + 1,200 MW = 7,200 MW).\n\n" +
                "Alien Power Matrixes are typically a late-game item. Creating a sufficient rate to saturate one APA requires a lot of power for the production line. Typically, around 12,000 MW of energy is necessary for five Alien Power Matrixes per minute (assuming you produce 2.5/minute using vanilla recipes and put Somersloops in the final Quantum Encoder). Given that providing an APA with Alien Power Matrixes only boosts the additional power of your base production to 30%, the additional 20% of energy generated should be greater than the 12,000 MW required to feed this power boost.\n\n" +
                "This calculation results in a minimum of 60,000 MW generator production to just break even. For example, if using a balanced renewable reactor power generator system (4 Uranium : 2 Plutonium : 1 Ficsonium), a total of four of these systems (four Ficsonium Fuel Rods per minute) should be operating before attempting to produce Alien Power Matrixes for the Alien Power Augmenter.\n\n" +
                "--- Unlocking ---\n" +
                "The Alien Power Augmenter is unlocked via the Alien Technology Research chain in the MAM using: 1 Somersloop, 100 SAM Fluctuators, and 50 Computers.",
        powerConsumption = "Generates 500 MW (Base) + Grid Boost (10% Unfueled, 30% Fueled)",
        buildCost = listOf(
            ItemCost("Somersloop", 10),
            ItemCost("SAM Fluctuator", 50),
            ItemCost("Cable", 100),
            ItemCost("Encased Industrial Beam", 50),
            ItemCost("Motor", 25),
            ItemCost("Computer", 10)
        ),
        overclockable = "No",
        conveyorInputs = "1"
    ),

    BuildingData(
        id = "angled_frame_window",
        name = "Angled Frame Window",
        category = "Walls",
        description = "An architectural wall piece with an angled window and frame, primarily used for aesthetic purposes. Provides a unique look while functioning as a standard wall for enclosure. Can be painted.", // Description can be more focused now
        powerConsumption = "N/A",
        buildCost = listOf(
            ItemCost("Silica", 2),
            ItemCost("Steel Beam", 2)
        ),
        dimensions = "Width: 8m, Length: 1m, Height: 4m", // You might want to add dimensions if known
        overclockable = "N/A",
        conveyorInputs = "N/A",
        // Populate the new fields:
        unlockMethod = "AWESOME Shop",
        unlockCost = listOf(ItemCost("AWESOME Coupon", 3)),
        unlockDetails = "'Steel-Framed Windows' category"
    ),

    BuildingData(
        id = "assembler",
        name = "Assembler",
        category = "Production",
        description = "Crafts items from two ingredients.",
        powerConsumption = "15 MW",
        buildCost = listOf(ItemCost("Reinforced Iron Plate", 8), ItemCost("Rotor", 4)),
        overclockable = "Yes",
        conveyorInputs = "2"
    ),
    BuildingData(
        id = "awesome_shop",
        name = "AWESOME Shop",
        category = "Utility & Progression",
        description = "Allows purchase of items and schematics using AWESOME Coupons. (Details needed)",
        powerConsumption = "N/A",
        buildCost = emptyList(),
        overclockable = "No",
        conveyorInputs = "N/A"
    ),
    BuildingData(
        id = "awesome_sink",
        name = "AWESOME Sink",
        category = "Utility & Progression",
        description = "Converts surplus items into AWESOME Coupons. Points vary by item complexity.",
        powerConsumption = "30 MW",
        buildCost = listOf(
            ItemCost("Reinforced Iron Plate", 15),
            ItemCost("Cable", 50),
            ItemCost("Computer", 1)
        ),
        overclockable = "Yes",
        conveyorInputs = "1"
    ),

    // --- B ---
    BuildingData(
        id = "basic_shelf_unit",
        name = "Basic Shelf Unit",
        category = "Storage",
        description = "A basic shelf unit for storing small items. (Details needed)",
        powerConsumption = "N/A",
        buildCost = emptyList(),
        overclockable = "No",
        conveyorInputs = "N/A"
    ),
    BuildingData(
        id = "beams",
        name = "Beams",
        category = "Foundations & Structures",
        description = "Structural support beams. Can be painted. (Details needed)",
        powerConsumption = "N/A",
        buildCost = emptyList(),
        overclockable = "No",
        conveyorInputs = "N/A"
    ),
    BuildingData(
        id = "biomass_burner",
        name = "Biomass Burner",
        category = "Power Generation",
        description = "Generates power by burning biomass fuel like Leaves, Wood, Mycelia, etc. Early game power solution.",
        powerConsumption = "Generates 30 MW",
        buildCost = listOf(
            ItemCost("Iron Plate", 15),
            ItemCost("Iron Rod", 15),
            ItemCost("Wire", 25)
        ),
        overclockable = "No",
        conveyorInputs = "0 (Manual input)"
    ),
    BuildingData(
        id = "blender",
        name = "Blender",
        category = "Production",
        description = "A late-game production building that mixes up to two solid ingredients and two fluid ingredients to produce new items, often complex recipes.",
        powerConsumption = "75 MW",
        buildCost = listOf(
            ItemCost("Heavy Modular Frame", 10),
            ItemCost("Motor", 10),
            ItemCost("Aluminum Casing", 50),
            ItemCost("Circuit Board", 20)
        ),
        overclockable = "Yes",
        conveyorInputs = "2 solid, 2 fluid"
    ),
    BuildingData(
        id = "blueprint_designer",
        name = "Blueprint Designer",
        category = "Utility & Organization",
        description = "Used to create and save building layouts as blueprints, which can then be easily replicated. ",
        powerConsumption = "20 MW",
        buildCost = listOf(
            ItemCost("Automated Wiring", 25),
            ItemCost("Modular Frame", 50),
            ItemCost("Smart Plating", 50)
        ),
        overclockable = "No",
        conveyorInputs = "N/A"
    ),
    BuildingData(
        id = "buffer_stop",
        name = "Buffer Stop",
        category = "Railway",
        description = "Placed at the end of a railway track to prevent trains from derailing. Purely functional, no power.",
        powerConsumption = "N/A",
        buildCost = listOf(
            ItemCost("Steel Beam", 5),
            ItemCost("Concrete", 10)
        ),
        overclockable = "No",
        conveyorInputs = "N/A"
    ),

    // --- C ---
    BuildingData(
        id = "coal_powered_generator",
        name = "Coal-Powered Generator",
        category = "Power Generation",
        description = "Generates power by burning Coal and requires Water. A crucial step up from Biomass Burners.",
        powerConsumption = "Generates 75 MW", // Please verify actual value
        buildCost = listOf(
            ItemCost("Reinforced Iron Plate", 20), // Example, fill with actual costs
            ItemCost("Rotor", 10),
            ItemCost("Cable", 30)
        ),
        overclockable = "Yes",
        conveyorInputs = "1 (Coal), 1 Pipe (Water)"
    ),
    BuildingData(
        id = "constructor",
        name = "Constructor",
        category = "Production",
        description = "Crafts items from a single ingredient. Basic early-game automated production.",
        powerConsumption = "4 MW", // Please verify actual value
        buildCost = listOf(
            ItemCost("Reinforced Iron Plate", 6), // Example, fill with actual costs
            ItemCost("Cable", 8)
        ),
        overclockable = "Yes",
        conveyorInputs = "1"
    ),
    BuildingData(
        id = "converter", // This is a bit generic. In Satisfactory, this might refer to specific buildings like a Packager (for fluids to solids and vice-versa) or Refineries with alternate recipes.
        name = "Converter", // For now, a placeholder. You'll need to clarify what specific Satisfactory building this refers to.
        category = "Production", // Placeholder category
        description = "Converts items or resources from one form to another. (Details needed - specify what kind of converter this is, e.g., Packager, specific Refinery function, etc.)",
        powerConsumption = "XX MW (Placeholder)",
        buildCost = emptyList(), // Placeholder
        overclockable = "Yes (Placeholder)",
        conveyorInputs = "1 or more (Placeholder)"
    ),
    BuildingData(
        id = "conveyor_belts", // This usually refers to the system/concept. Individual belt tiers (Mk.1, Mk.2 etc.) are built.
        name = "Conveyor Belts", // If this is meant to be a general entry, it's fine. If it's a specific buildable item "Conveyor Belt Mk.1", the ID and details should reflect that.
        category = "Logistics",
        description = "Transport items between buildings. Available in different tiers (Mk.1 to Mk.5) with varying speeds.",
        powerConsumption = "N/A (Individual poles/lifts might, but belts themselves don't consume power)",
        buildCost = listOf( // Example for Mk.1 Conveyor Belt segment
            ItemCost("Iron Plate", 1) // This cost is per segment, adjust if this entry means something else
        ),
        overclockable = "No", // Belts aren't overclocked; their source/destination machines are.
        conveyorInputs = "N/A (Connects to other buildings)"
    ),
    BuildingData(
        id = "conveyor_lifts",
        name = "Conveyor Lifts", // Similar to belts, these come in Mk.1, Mk.2 etc.
        category = "Logistics",
        description = "Transport items vertically between different heights. Available in different tiers (Mk.1 to Mk.5).",
        powerConsumption = "0.2 MW per lift (Placeholder, verify if this varies by Mk or is per pole)", // Power consumption for lifts can be tricky; often it's the poles.
        buildCost = listOf( // Example for Mk.1 Conveyor Lift
            ItemCost("Iron Plate", 4), // Per lift, might vary
            ItemCost("Iron Rod", 2)
        ),
        overclockable = "No",
        conveyorInputs = "N/A (Connects to other buildings)"
    ),
    BuildingData(
        id = "conveyor_merger",
        name = "Conveyor Merger",
        category = "Logistics",
        description = "Combines items from up to three input conveyor belts onto a single output conveyor belt.",
        powerConsumption = "N/A", // Mergers typically don't consume power themselves
        buildCost = listOf(
            ItemCost("Iron Plate", 6) // Example, fill with actual costs
        ),
        overclockable = "No",
        conveyorInputs = "3 (Inputs), 1 (Output)" // More accurately, it has 3 input ports and 1 output port.
    ),
    BuildingData(
        id = "conveyor_poles",
        name = "Conveyor Poles", // Stackable and standard variants exist
        category = "Logistics",
        description = "Supports conveyor belts. Stackable poles allow for vertical belt stacking.",
        powerConsumption = "N/A (Standard poles usually don't. Some powered variants for lifts/etc. might exist in mods or very specific contexts, but generally no)",
        buildCost = listOf(
            ItemCost("Iron Rod", 1) // For a basic pole
        ),
        overclockable = "No",
        conveyorInputs = "N/A (Supports belts)"
    ),
    BuildingData(
        id = "conveyor_splitter", // Programmable and Smart Splitters also exist as separate buildings
        name = "Conveyor Splitter", // This is the basic one.
        category = "Logistics",
        description = "Splits items from a single input conveyor belt onto up to three output conveyor belts.",
        powerConsumption = "N/A", // Basic splitters typically don't consume power
        buildCost = listOf(
            ItemCost("Iron Plate", 6) // Example, fill with actual costs
        ),
        overclockable = "No",
        conveyorInputs = "1 (Input), 3 (Outputs)" // More accurately, 1 input port, 3 output ports.
    ),
    BuildingData(
        id = "conveyor_throughput_monitor", // This might be a modded item or a late-game vanilla item I'm less familiar with. Assuming placeholder.
        name = "Conveyor Throughput Monitor",
        category = "Logistics & Utility", // Placeholder category
        description = "Monitors and displays the item throughput rate on a conveyor belt. (Details needed - verify if vanilla or modded, and specific functionality)",
        powerConsumption = "XX MW (Placeholder)",
        buildCost = emptyList(), // Placeholder
        overclockable = "No (Placeholder)",
        conveyorInputs = "N/A (Attaches to belt)"
    ),
    BuildingData(
        id = "crafting_bench",
        name = "Crafting Bench",
        category = "Utility & Early Game",
        description = "Used for manual crafting of items. Essential in the early game before automation.",
        powerConsumption = "N/A",
        buildCost = listOf(
            ItemCost("Iron Plate", 3), // Example, fill with actual costs
            ItemCost("Iron Rod", 3)
        ),
        overclockable = "No",
        conveyorInputs = "N/A (Manual operation)"
    )
)