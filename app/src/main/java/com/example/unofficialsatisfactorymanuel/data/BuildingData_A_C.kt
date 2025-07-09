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
                "--- Unlocking ---\n" + // This part of the description details the unlock
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
        dimensions = "Details needed", // ADDED - Specific dimensions are not in the description
        productionRate = "N/A (Power Generation)", // ADDED
        overclockable = "No",
        conveyorInputs = "1", // For Alien Power Matrix (if fueled)
        conveyorOutputs = "N/A", // ADDED - Does not output items via conveyor
        unlockMethod = "MAM Research", // EXTRACTED & STANDARDIZED
        unlockCost = listOf( // EXTRACTED from description
            ItemCost("Somersloop", 1),
            ItemCost("SAM Fluctuator", 100),
            ItemCost("Computer", 50)
        ),
        unlockDetails = "Unlocked via the Alien Technology Research chain in the MAM." // EXTRACTED & STANDARDIZED
    ),

    BuildingData(
        id = "angled_frame_window",
        name = "Angled Frame Window",
        category = "Walls",
        description = "An architectural wall piece with an angled window and frame, primarily used for aesthetic purposes. Provides a unique look while functioning as a standard wall for enclosure. Can be painted.",
        powerConsumption = "N/A",
        buildCost = listOf(
            ItemCost("Silica", 2),
            ItemCost("Steel Beam", 2)
        ),
        dimensions = "Width: 8m, Length: 1m, Height: 4m",
        productionRate = "N/A", // ADDED
        overclockable = "N/A",
        conveyorInputs = "N/A",
        conveyorOutputs = "N/A", // ADDED
        unlockMethod = "AWESOME Shop",
        unlockCost = listOf(ItemCost("AWESOME Coupon", 3)),
        unlockDetails = "'Steel-Framed Windows' category"
    ),

    BuildingData(
        id = "assembler",
        name = "Assembler",
        category = "Production",
        description = "The Assembler is a fundamental production building used to automate the crafting of parts that require two distinct ingredients. It is a key step up from the Constructor, enabling more complex production lines. Note: The Assembler is not capable of alloying ingots; that process is handled by the Foundry.",
        powerConsumption = "15 MW", // At 100% clock speed
        buildCost = listOf(
            ItemCost("Reinforced Iron Plate", 8),
            ItemCost("Rotor", 4),
            ItemCost("Cable", 10)
        ),
        dimensions = "Width: 10m, Length: 15m, Height: 11m",
        productionRate = "100% (Default)",
        overclockable = "Yes",
        conveyorInputs = "2",
        conveyorOutputs = "1",
        unlockMethod = "HUB Milestone",
        unlockCost = listOf(
            ItemCost("Cable", 200),
            ItemCost("Iron Rod", 200),
            ItemCost("Screw", 500),
            ItemCost("Iron Plate", 300)
        ),
        unlockDetails = "Unlocked via the Tier 2 HUB Milestone: 'Part Assembly'. Unlocks automated crafting for parts requiring two ingredients."
    ),

    BuildingData(
        id = "awesome_shop",
        name = "AWESOME Shop",
        category = "Utility & Progression",
        description = "The AWESOME Shop is a special building where FICSIT Coupons, generated from the AWESOME Sink, can be spent to unlock unique schematics (blueprints), alternate recipes, building parts, vehicle parts, organization items, and cosmetic patterns for your factory. It serves as an alternative progression path for many unlocks. AWESOME is an acronym that stands for 'Anti-Waste Effort for Stress-Testing of Materials on Exoplanets'.",
        powerConsumption = "N/A",
        buildCost = listOf(
            ItemCost("Screw", 200),
            ItemCost("Iron Plate", 10),
            ItemCost("Cable", 10)
        ),
        dimensions = "Width: 4m, Length: 6m, Height: 5m (Area: 24m²)",
        productionRate = "N/A", // Already present
        overclockable = "No",
        conveyorInputs = "N/A",
        conveyorOutputs = "N/A", // Already present
        unlockMethod = "HUB Milestone",
        unlockCost = listOf(
            ItemCost("Concrete", 400),
            ItemCost("Wire", 500),
            ItemCost("Iron Rod", 200),
            ItemCost("Iron Plate", 200)
        ),
        unlockDetails = "Unlocked via the Tier 2 HUB Milestone: 'Resource Sink Bonus Program'. This milestone also unlocks the AWESOME Sink."
    ),

    BuildingData(
        id = "awesome_sink",
        name = "AWESOME Sink",
        category = "Utility & Progression",
        description = "The AWESOME Sink is a special building that produces FICSIT Coupons for use in the AWESOME Shop by destroying items inserted into it and converting them into points based on their value or complexity. These points are used to print the aforementioned Coupons, with each successive Coupon requiring more points according to a mathematical formula. In addition to normal items, Alien DNA Capsules can also be sunk and their AWESOME Points are counted separately.\n\nThe Sink can consume as many parts as the connected conveyor can supply, therefore its maximum capacity is 1,200/min using a Conveyor Belt Mk.6 or Conveyor Lift Mk.6.\n\nMultiple Sinks can be constructed. Accumulated points will be shared between all Sinks, and Coupons can be printed from any of them. If all Sinks are deconstructed, the amount of points and accumulated Coupons is not lost.\n\nAWESOME is an acronym, which stands for 'Anti-Waste Effort for Stress-Testing of Materials on Exoplanets'.",
        powerConsumption = "30 MW",
        buildCost = listOf(
            ItemCost("Reinforced Iron Plate", 15),
            ItemCost("Cable", 30),
            ItemCost("Concrete", 45)
        ),
        dimensions = "Width: 16m, Length: 13m, Height: 24m (Area: 208m²)",
        productionRate = "Point generation varies by item input", // Already present
        overclockable = "No",
        conveyorInputs = "1",
        conveyorOutputs = "0 (Points/Coupons are system-wide)", // Already present
        unlockMethod = "HUB Milestone",
        unlockCost = listOf(
            ItemCost("Concrete", 400),
            ItemCost("Wire", 500),
            ItemCost("Iron Rod", 200),
            ItemCost("Iron Plate", 200)
        ),
        unlockDetails = "Unlocked via the Tier 2 HUB Milestone: 'Resource Sink Bonus Program'. This milestone also unlocks the AWESOME Shop."
    ),

    // --- B ---
    BuildingData(
        id = "basic_shelf_unit",
        name = "Basic Shelf Unit",
        category = "Storage", // Or "Organization" / "Foundations & Structures" - FINAL DECISION PENDING
        description = "The Basic Shelf Unit is a decorative structure designed to neatly organize and hold Personal Storage Boxes. Shelf Units can be stacked on top of each other to create larger shelving systems.",
        powerConsumption = "N/A",
        buildCost = listOf(
            ItemCost("Iron Plate", 1),
            ItemCost("Iron Rod", 1)
        ),
        dimensions = "N/A", // Dimensions not currently available
        productionRate = "N/A",
        overclockable = "No",
        conveyorInputs = "N/A",
        conveyorOutputs = "N/A",
        unlockMethod = "AWESOME Shop",
        unlockCost = emptyList(), // Coupon cost: Coming Soon (item is new, Patch 1.1.0.0)
        unlockDetails = "'Basic Shelf Unit' schematic"
    ),

    BuildingData(
        id = "beams_pack",
        name = "Beams & Structural Elements (AWESOME Shop)",
        category = "Foundations & Structures",
        description = """
        A collection of versatile structural elements unlocked via the AWESOME Shop, used for advanced support, framing, and aesthetics.
        This set allows for creating complex and customized structures.
        Includes items like:
        - Metal Beams: Strong architectural beams.
        - Beam Supports: For stable connections.
        - Beam Connectors: For beam-to-beam linking.
        - Double Beam Connectors: For more complex beam junctions.
        (Beams within this set can typically be painted using the Customizer).
    """.trimIndent(),
        powerConsumption = "N/A",
        buildCost = listOfNotNull(
            ItemCost("Steel Beam", 1),
            // Note: Costs for Beam Supports, Connectors still need to be added here.
        ),
        dimensions = """
        - Metal Beams: Width: 0.8m, Length: 1-40m, Height: 1m.
        - Painted Beams: Width: 1m, Length: 1-40m, Height: 1m.
        - Beam Supports: Width: 2m, Length: 2m, Height: 0.5m.
        - Beam Connectors: Width: 1.25m, Length: 1.25m, Height: 1.25m.
        - Double Beam Connectors: Width: 1.25m, Length: 2.25m, Height: 1.25m.
    """.trimIndent(),
        productionRate = "N/A",
        overclockable = "No",
        conveyorInputs = "N/A",
        conveyorOutputs = "N/A",
        unlockMethod = "AWESOME Shop Schematics",
        unlockCost = listOf(
            ItemCost("AWESOME Coupon", 4)
        ),
        unlockDetails = """
        Unlocked progressively via multiple schematics in the AWESOME Shop.
        A foundational 'Beams' schematic (typically 4 Coupons) unlocks initial functionality.
        The 'Structural Beam Pack' unlocks Metal Beams.
        Other schematics may unlock advanced connectors or variants.
        (Specific coupon costs for additional packs should be detailed).
    """.trimIndent(),
        usageDetails = """
        After unlocking the respective schematics, select the main 'Beams' or 'Structures' category in the build menu, then choose the specific type (Metal Beam, Support, Connector, etc.) from the sub-options.
        Metal Beams can be painted using the Customizer (the 'Painted Beam' entry reflects this customization applied to a base beam). Supports and Connectors facilitate clean and robust structural designs.
    """.trimIndent()
    ),

    BuildingData(
        id = "biomass_burner",
        name = "Biomass Burner",
        category = "Power Generation",
        description = """
        The Biomass Burner is a power generator building that generates power by burning various biomass items.
        Fuel can be inserted manually by the player or supplied via a Conveyor Belt.
        Usable fuels include: Leaves, Mycelia, Wood, Alien Carapace, Alien Organs, Biomass (refined from raw flora/fauna), Solid Biofuel (refined from Biomass), and Packaged Liquid Biofuel.
        Raw materials like Leaves and Wood can be gathered from trees and shrubs, while Mycelia is found in cave systems and specific biomes. Alien parts are obtained from creatures. These can then be processed into more efficient fuel types.

        A standalone Biomass Burner produces 30 MW at 100% clock speed. The HUB has up to two different, smaller Biomass Burners attached to it, added by completing HUB Upgrades 1 and 5 respectively. These Biomass Burners only produce 20 MW, but also burn fuel 1.5 times slower.

        The fuel consumption of Biomass Burners scales to power demand, unlike other generators. This also renders them unable to charge Power Storages.
    """.trimIndent(), // UPDATED: Mentioned conveyor input capability
        powerConsumption = "Generates 30 MW",
        buildCost = listOf(
            ItemCost("Iron Plate", 15),
            ItemCost("Iron Rod", 15),
            ItemCost("Wire", 25)
        ),
        dimensions = "Width: 8m, Length: 8m, Height: 10m (Area: 64m²)",
        productionRate = "N/A (Generates Power)",
        overclockable = "Yes", // As per your previous input
        conveyorInputs = "1 (Accepts Conveyor Belt or Manual Insertion)", // UPDATED
        conveyorOutputs = "0",
        unlockMethod = "HUB Milestone",
        unlockCost = listOf(
            ItemCost("Iron Rod", 100),
            ItemCost("Iron Plate", 100),
            ItemCost("Wire", 100),
            ItemCost("Concrete", 50)
        ),
        unlockDetails = "Unlocked via the Tier 0 HUB Milestone: 'HUB Upgrade 6'."
    ),

    BuildingData(
        id = "blender",
        name = "Blender",
        category = "Production",
        description = """
        The Blender is a late-game production building used for a wide variety of advanced recipes involving both fluid and solid resources. It typically mixes up to two solid ingredients and two fluid ingredients.
        It is essential for processes like advanced aluminum production (e.g., Alumina Solution, Electrode - Aluminum Scrap), creating complex components like Cooling Systems, and other late-game items.
        The Blender is overclockable and features 4 slots for Somersloops (the items used for overclocking).
        A notable visual detail is that the color of the fluid visible in the Blender's mixing chamber changes depending on the selected recipe (e.g., the fluid appears blue when producing Cooling Systems).
    """.trimIndent(),
        powerConsumption = "75 MW",
        buildCost = listOf( // UPDATED BUILD COST
            ItemCost("Computer", 10),
            ItemCost("Heavy Modular Frame", 10),
            ItemCost("Motor", 20),
            ItemCost("Aluminum Casing", 50)
        ),
        dimensions = "Width: 18m, Length: 16m, Height: 15m (Area: 288m²)",
        productionRate = "Varies by selected recipe",
        overclockable = "Yes",
        conveyorInputs = "2 solid (conveyor), 2 fluid (pipe)",
        conveyorOutputs = "1 solid (conveyor), 1 fluid (pipe, if recipe produces fluid byproduct)",
        unlockMethod = "Tier 7 Milestone",
        unlockCost = listOf( /* Costs for "Control System Development" milestone - STILL NEEDED */
            // Example placeholders, not actual costs:
            // ItemCost("AI Limiter", 100),
            // ItemCost("High-Speed Connector", 200),
            // ItemCost("Radio Control Unit", 50)
        ),
        unlockDetails = "Unlocked via the Tier 7 Milestone: 'Control System Development'."
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
        dimensions = null,
        productionRate = null,
        overclockable = "No",
        conveyorInputs = "N/A",
        conveyorOutputs = null,
        unlockMethod = null,
        unlockCost = null,
        unlockDetails = null
    ),
    BuildingData(
        id = "buffer_stop",
        name = "Buffer Stop",
        category = "Railway",
        description = """
        The Buffer Stop is a Railway attachment required to prevent manually-driven trains from driving off the track.
        It is a passive, purely functional safety component and does not consume power.
        Buffer Stops can be attached to existing Railways. Collision by a train may trigger a camera shake effect.
    """.trimIndent(),
        powerConsumption = "N/A",
        buildCost = listOf(
            ItemCost("Steel Pipe", 2),
            ItemCost("Encased Industrial Beam", 5),
            ItemCost("Concrete", 20)
        ),
        dimensions = "Width: 6m, Length: 6m, Height: 2.5m (Area: 36m²)", // <<< CORRECTED DIMENSIONS
        productionRate = "N/A",
        overclockable = "No",
        conveyorInputs = "N/A",
        conveyorOutputs = "N/A",
        unlockMethod = "Tier 6 Milestone",
        unlockCost = listOf( /* Costs for "Monorail Train Technology" milestone - NEEDS TO BE FILLED */
            // Example placeholders:
            // ItemCost("Steel Beam", 200),
            // ItemCost("Concrete", 500),
            // ItemCost("Cable", 1000)
        ),
        unlockDetails = "Unlocked via the Tier 6 Milestone: 'Monorail Train Technology'. Introduced in Patch 1.1.0.0."
    ),

    // --- C ---
    BuildingData(
        id = "coal_powered_generator",
        name = "Coal-Powered Generator",
        category = "Power Generation",
        description = "Generates power by burning Coal and requires Water. A crucial step up from Biomass Burners.",
        powerConsumption = "Generates 75 MW",
        buildCost = listOf(
            ItemCost("Reinforced Iron Plate", 20),
            ItemCost("Rotor", 10),
            ItemCost("Cable", 30)
        ),
        dimensions = null,
        productionRate = null, // Generates power, doesn't produce items in the typical sense
        overclockable = "Yes",
        conveyorInputs = "1 (Coal), 1 Pipe (Water)",
        conveyorOutputs = null, // No item outputs
        unlockMethod = null,    // Typically HUB milestone
        unlockCost = null,
        unlockDetails = null
    ),
    BuildingData(
        id = "constructor",
        name = "Constructor",
        category = "Production",
        description = "Crafts items from a single ingredient. Basic early-game automated production.",
        powerConsumption = "4 MW",
        buildCost = listOf(
            ItemCost("Reinforced Iron Plate", 6),
            ItemCost("Cable", 8)
        ),
        dimensions = null,
        productionRate = null, // Varies by recipe
        overclockable = "Yes",
        conveyorInputs = "1",
        conveyorOutputs = null, // Assuming 1 output
        unlockMethod = null,    // Typically HUB milestone
        unlockCost = null,
        unlockDetails = null
    ),
    BuildingData(
        id = "converter",
        name = "Converter",
        category = "Production",
        description = "Converts items or resources from one form to another. (Details needed - specify what kind of converter this is, e.g., Packager, specific Refinery function, etc.)",
        powerConsumption = "XX MW (Placeholder)",
        buildCost = emptyList(),
        dimensions = null,
        productionRate = null,
        overclockable = "Yes (Placeholder)",
        conveyorInputs = "1 or more (Placeholder)",
        conveyorOutputs = null,
        unlockMethod = null,
        unlockCost = null,
        unlockDetails = null
    ),
    BuildingData(
        id = "conveyor_belts",
        name = "Conveyor Belts",
        category = "Logistics",
        description = "Transport items between buildings. Available in different tiers (Mk.1 to Mk.5) with varying speeds.",
        powerConsumption = "N/A (Individual poles/lifts might, but belts themselves don't consume power)",
        buildCost = listOf(
            ItemCost("Iron Plate", 1)
        ),
        dimensions = null, // Per segment, not a fixed building size
        productionRate = null, // Transports, doesn't produce
        overclockable = "No",
        conveyorInputs = "N/A (Connects to other buildings)",
        conveyorOutputs = null,
        unlockMethod = null, // Typically HUB milestone for Mk1
        unlockCost = null,
        unlockDetails = null
    ),
    BuildingData(
        id = "conveyor_lifts",
        name = "Conveyor Lifts",
        category = "Logistics",
        description = "Transport items vertically between different heights. Available in different tiers (Mk.1 to Mk.5).",
        powerConsumption = "0.2 MW per lift (Placeholder, verify if this varies by Mk or is per pole)",
        buildCost = listOf(
            ItemCost("Iron Plate", 4),
            ItemCost("Iron Rod", 2)
        ),
        dimensions = null, // Height varies
        productionRate = null,
        overclockable = "No",
        conveyorInputs = "N/A (Connects to other buildings)",
        conveyorOutputs = null,
        unlockMethod = null, // Typically HUB milestone for Mk1
        unlockCost = null,
        unlockDetails = null
    ),
    BuildingData(
        id = "conveyor_merger",
        name = "Conveyor Merger",
        category = "Logistics",
        description = "Combines items from up to three input conveyor belts onto a single output conveyor belt.",
        powerConsumption = "N/A",
        buildCost = listOf(
            ItemCost("Iron Plate", 6)
        ),
        dimensions = null,
        productionRate = null,
        overclockable = "No",
        conveyorInputs = "3 (Inputs), 1 (Output)", // This is more about ports
        conveyorOutputs = null, // Described by inputs line
        unlockMethod = null, // Typically HUB milestone
        unlockCost = null,
        unlockDetails = null
    ),
    BuildingData(
        id = "conveyor_poles",
        name = "Conveyor Poles",
        category = "Logistics",
        description = "Supports conveyor belts. Stackable poles allow for vertical belt stacking.",
        powerConsumption = "N/A",
        buildCost = listOf(
            ItemCost("Iron Rod", 1)
        ),
        dimensions = null,
        productionRate = null,
        overclockable = "No",
        conveyorInputs = "N/A (Supports belts)",
        conveyorOutputs = null,
        unlockMethod = null, // Typically HUB milestone
        unlockCost = null,
        unlockDetails = null
    ),
    BuildingData(
        id = "conveyor_splitter",
        name = "Conveyor Splitter",
        category = "Logistics",
        description = "Splits items from a single input conveyor belt onto up to three output conveyor belts.",
        powerConsumption = "N/A",
        buildCost = listOf(
            ItemCost("Iron Plate", 6)
        ),
        dimensions = null,
        productionRate = null,
        overclockable = "No",
        conveyorInputs = "1 (Input), 3 (Outputs)", // This is more about ports
        conveyorOutputs = null, // Described by inputs line
        unlockMethod = null, // Typically HUB milestone
        unlockCost = null,
        unlockDetails = null
    ),
    BuildingData(
        id = "conveyor_throughput_monitor",
        name = "Conveyor Throughput Monitor",
        category = "Logistics & Utility",
        description = "Monitors and displays the item throughput rate on a conveyor belt. (Details needed - verify if vanilla or modded, and specific functionality)",
        powerConsumption = "XX MW (Placeholder)",
        buildCost = emptyList(),
        dimensions = null,
        productionRate = null,
        overclockable = "No (Placeholder)",
        conveyorInputs = "N/A (Attaches to belt)",
        conveyorOutputs = null,
        unlockMethod = null,
        unlockCost = null,
        unlockDetails = null
    ),
    BuildingData(
        id = "crafting_bench",
        name = "Crafting Bench",
        category = "Utility & Early Game",
        description = "Used for manual crafting of items. Essential in the early game before automation.",
        powerConsumption = "N/A",
        buildCost = listOf(
            ItemCost("Iron Plate", 3),
            ItemCost("Iron Rod", 3)
        ),
        dimensions = null,
        productionRate = null,
        overclockable = "No",
        conveyorInputs = "N/A (Manual operation)",
        conveyorOutputs = null,
        unlockMethod = "Available from start", // Typically
        unlockCost = null,
        unlockDetails = null
    )
)