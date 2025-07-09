package com.example.unofficialsatisfactorymanuel.data

val buildingData_P_R: List<BuildingData> = listOf(
    BuildingData(
        id = "packager",
        name = "Packager",
        category = "Logistics & Packaging",
        description = "The Packager is used to package fluids into Canisters or unpackage fluids from Canisters. It can also package solid items into boxes (though this is less common).",
        powerConsumption = "10 MW",
        dimensions = "7m x 6m x 7m",
        overclockable = "Yes",
        conveyorInputs = "1 (for items/canisters)", // Also 1 Pipe input for fluids
        conveyorOutputs = "1 (for packaged/unpackaged items/canisters)", // Also 1 Pipe output for fluids
        productionRate = "Varies by recipe (e.g., 60 Packaged Water/min)",
        buildCost = listOf(
            ItemCost("Steel Beam", 10),
            ItemCost("Plastic", 10),
            ItemCost("Motor", 2)
        ),
        unlockMethod = "Tier 5 - Oil Processing (Packaging MAM Research)",
        unlockCost = null, // Typically unlocked via MAM research
        unlockDetails = "Unlocked via MAM Research (Packaging) after unlocking Oil Processing.",
        usageDetails = "Requires both conveyor and pipeline connections depending on the recipe. Used for transporting fluids via conveyors or packaging items."
    ),
    BuildingData(
        id = "particle_accelerator",
        name = "Particle Accelerator",
        category = "Late Game Production",
        description = "The Particle Accelerator is a very large, power-hungry late-game building used to create exotic particles like Nuclear Pasta, required for the final Project Assembly parts.",
        powerConsumption = "250-750 MW (varies by recipe, can be up to 1500MW when overclocked)",
        dimensions = "Massive (approx. 46m diameter, 25m height)",
        overclockable = "Yes",
        conveyorInputs = "2", // Also requires significant Water input
        conveyorOutputs = "1",
        productionRate = "Varies by recipe (e.g., 1 Nuclear Pasta/min)",
        buildCost = listOf(
            ItemCost("Supercomputer", 3),
            ItemCost("Radio Control Unit", 20),
            ItemCost("Cooling System", 10),
            ItemCost("Fused Modular Frame", 10),
            ItemCost("Turbo Motor", 2)
        ),
        unlockMethod = "Tier 8 - Particle Enrichment",
        unlockCost = null, // Part of the Tier milestone
        unlockDetails = "Unlocked via the Tier 8 milestone 'Particle Enrichment'.",
        usageDetails = "Consumes a vast amount of power and resources. Requires significant water input (up to 600m³/min)."
    ),
    BuildingData(
        id = "personal_storage_box",
        name = "Personal Storage Box",
        category = "Storage & Logistics",
        description = "A small, personal storage container with 16 inventory slots. Useful for temporary storage or organizing personal items.",
        powerConsumption = "0 MW",
        dimensions = "1m x 1m x 1m",
        overclockable = "No",
        conveyorInputs = "0",
        conveyorOutputs = "0",
        productionRate = "N/A",
        buildCost = listOf(
            ItemCost("Iron Plate", 6)
        ),
        unlockMethod = "Tier 0 - Onboarding",
        unlockCost = null,
        unlockDetails = "Available from the start or very early via HUB upgrades.",
        usageDetails = "Manual input and output only. Does not connect to conveyors."
    ),
    BuildingData(
        id = "personnel_elevator", // This is not a standard building; assuming this might refer to Hypertubes or Ziplines. I'll make it generic.
        name = "Personnel Elevator (Conceptual)", // Or "Hypertube Entrance/Support" if that's closer
        category = "Logistics & Transport",
        description = "Conceptual: A structure for vertical personnel transport. (In-game, this is achieved via Ladders, Jetpack, Zipline, or Hypertube systems).",
        powerConsumption = "N/A", // Hypertubes require power for entrances
        dimensions = "Varies",
        overclockable = "N/A",
        conveyorInputs = "N/A",
        conveyorOutputs = "N/A",
        productionRate = "N/A",
        buildCost = listOf(
            // Example costs for a Hypertube Support
            ItemCost("Steel Pipe", 2),
            ItemCost("Steel Beam", 1)
        ),
        unlockMethod = "Varies (e.g., Tier 4 for Hypertubes)",
        unlockCost = null,
        unlockDetails = "No direct 'Personnel Elevator'. Use Ladders, Jetpack, Zipline, or Hypertubes.",
        usageDetails = "For player vertical movement. Hypertubes are the fastest automated method."
    ),
    BuildingData(
        id = "pillars", // This is a buildable, not a functional "building"
        name = "Pillars (Set)",
        category = "Foundations & Organization",
        description = "Various pillar types (Small, Middle, Top, Base) used for structural support or aesthetic design with Foundations.",
        powerConsumption = "0 MW",
        dimensions = "Varies by type (e.g., Small Pillar is 1m x 1m x 1m)",
        overclockable = "No",
        conveyorInputs = "0",
        conveyorOutputs = "0",
        productionRate = "N/A",
        buildCost = listOf(
            ItemCost("Concrete", 2) // Example for a Small Pillar
        ),
        unlockMethod = "AWESOME Shop - Architecture",
        unlockCost = listOf(ItemCost("AWESOME Coupon", 1)), // Cost in Coupons
        unlockDetails = "Unlocked via the AWESOME Shop.",
        usageDetails = "Primarily for supporting foundations or for visual construction detail."
    ),
    BuildingData(
        id = "pipeline_junction",
        name = "Pipeline Junction Cross",
        category = "Logistics & Fluids",
        description = "Allows up to four Pipelines to connect, enabling fluid distribution and merging.",
        powerConsumption = "0 MW",
        dimensions = "Snaps to pipelines (small footprint)",
        overclockable = "No",
        conveyorInputs = "0", // 4 Pipe connections
        conveyorOutputs = "0", // 4 Pipe connections
        productionRate = "N/A (Max flow rate of connected pipes)",
        buildCost = listOf(
            ItemCost("Copper Sheet", 2)
        ),
        unlockMethod = "Tier 5 - Oil Processing",
        unlockCost = null,
        unlockDetails = "Unlocked via the Tier 5 milestone 'Oil Processing'.",
        usageDetails = "Connects pipelines. Fluids will flow based on pressure and destination availability."
    ),
    BuildingData(
        id = "pipeline_pump_mk1",
        name = "Pipeline Pump Mk.1",
        category = "Logistics & Fluids",
        description = "The Pipeline Pump Mk.1 is used to increase head lift for fluids in Pipelines, allowing them to flow upwards or over longer distances against gravity.",
        powerConsumption = "4 MW",
        dimensions = "Snaps to pipelines",
        overclockable = "No",
        conveyorInputs = "0", // Pipe passthrough
        conveyorOutputs = "0", // Pipe passthrough
        productionRate = "Provides +20m of head lift.",
        buildCost = listOf(
            ItemCost("Motor", 2),
            ItemCost("Copper Sheet", 4)
        ),
        unlockMethod = "Tier 5 - Oil Processing",
        unlockCost = null,
        unlockDetails = "Unlocked via the Tier 5 milestone 'Oil Processing'.",
        usageDetails = "Must be powered. Arrow indicates flow direction. Place before fluid needs to go higher."
    ),
    BuildingData(
        id = "pipeline_pump_mk2",
        name = "Pipeline Pump Mk.2",
        category = "Logistics & Fluids",
        description = "The Pipeline Pump Mk.2 provides significantly more head lift than the Mk.1, essential for tall fluid systems.",
        powerConsumption = "8 MW",
        dimensions = "Snaps to pipelines",
        overclockable = "No",
        conveyorInputs = "0", // Pipe passthrough
        conveyorOutputs = "0", // Pipe passthrough
        productionRate = "Provides +50m of head lift.",
        buildCost = listOf(
            ItemCost("Heavy Modular Frame", 2),
            ItemCost("Motor", 4),
            ItemCost("Rubber", 8)
        ),
        unlockMethod = "AWESOME Shop - Fluid Logistics", // Or a later Tier milestone if changed
        unlockCost = listOf(ItemCost("AWESOME Coupon", 8)), // Example coupon cost
        unlockDetails = "Typically unlocked via the AWESOME Shop.",
        usageDetails = "Functions like Mk.1 but with greater head lift and power consumption."
    ),
    BuildingData(
        id = "pipeline_supports", // Buildable, not a functional "building"
        name = "Pipeline Supports (Stackable & Wall)",
        category = "Logistics & Fluids",
        description = "Stackable Pipeline Supports and Wall Pipeline Supports are used to route and organize Pipelines.",
        powerConsumption = "0 MW",
        dimensions = "Varies",
        overclockable = "No",
        conveyorInputs = "0",
        conveyorOutputs = "0",
        productionRate = "N/A",
        buildCost = listOf(
            ItemCost("Concrete", 1) // For Stackable Support
            // ItemCost("Steel Beam", 1) // For Wall Support example
        ),
        unlockMethod = "Tier 5 - Oil Processing",
        unlockCost = null,
        unlockDetails = "Unlocked with Pipelines.",
        usageDetails = "Used to neatly arrange pipelines."
    ),
    BuildingData(
        id = "pipelines_mk1", // Buildable, not a functional "building"
        name = "Pipeline Mk.1",
        category = "Logistics & Fluids",
        description = "Pipeline Mk.1 is used to transport fluids. It has a maximum flow rate of 300 m³/min.",
        powerConsumption = "0 MW",
        dimensions = "Segment based",
        overclockable = "No",
        conveyorInputs = "N/A",
        conveyorOutputs = "N/A",
        productionRate = "Max flow 300 m³/min",
        buildCost = listOf(
            ItemCost("Copper Sheet", 1) // Per segment
        ),
        unlockMethod = "Tier 5 - Oil Processing",
        unlockCost = null,
        unlockDetails = "Unlocked via the Tier 5 milestone 'Oil Processing'.",
        usageDetails = "Connects fluid inputs and outputs of buildings. Requires pumps for vertical transport over distance."
    ),
    BuildingData(
        id = "pipelines_mk2", // Buildable, not a functional "building"
        name = "Pipeline Mk.2",
        category = "Logistics & Fluids",
        description = "Pipeline Mk.2 allows for a higher fluid flow rate of 600 m³/min, essential for high-volume fluid systems.",
        powerConsumption = "0 MW",
        dimensions = "Segment based",
        overclockable = "No",
        conveyorInputs = "N/A",
        conveyorOutputs = "N/A",
        productionRate = "Max flow 600 m³/min",
        buildCost = listOf(
            ItemCost("Plastic", 1), // Per segment (or Aluminum Ingot if different recipe)
            ItemCost("Rubber", 1)  // Per segment
        ),
        unlockMethod = "AWESOME Shop - Fluid Logistics", // Or Tier 7 Aluminum
        unlockCost = listOf(ItemCost("AWESOME Coupon", 6)), // Example coupon cost
        unlockDetails = "Typically unlocked via AWESOME Shop or Aluminum research.",
        usageDetails = "Higher throughput than Mk.1. Useful for Nuclear Power, etc."
    ),
    BuildingData(
        id = "portal", // This is the Space Elevator
        name = "Space Elevator",
        category = "Progression",
        description = "The Space Elevator is used to send Project Assembly parts into space to unlock new Tiers and advance game progression.",
        powerConsumption = "0 MW (passive), 25-300MW when actively sending a phase",
        dimensions = "Very large (approx. 20m x 20m base, very tall)",
        overclockable = "No",
        conveyorInputs = "Multiple, for Project Parts",
        conveyorOutputs = "0",
        productionRate = "N/A (unlocks Tiers upon delivery)",
        buildCost = listOf(
            // Initial phase costs are effectively the first delivery
            ItemCost("Concrete", 500),
            ItemCost("Steel Beam", 150),
            ItemCost("Wire", 1000),
            ItemCost("Cable", 500)
            // Subsequent phases have their own complex part requirements
        ),
        unlockMethod = "Tier 0 - Onboarding (HUB Upgrade)",
        unlockCost = null,
        unlockDetails = "Constructed after a specific HUB upgrade early in the game.",
        usageDetails = "Load with specified Project Assembly parts for the current phase. Once requirements are met, activate to send and unlock the next Tier(s)."
    ),
    BuildingData(
        id = "power_line", // Buildable, not a functional "building"
        name = "Power Line",
        category = "Power",
        description = "Connects Power Poles and buildings to transmit power across the power grid.",
        powerConsumption = "0 MW",
        dimensions = "Segment based",
        overclockable = "No",
        conveyorInputs = "N/A",
        conveyorOutputs = "N/A",
        productionRate = "N/A",
        buildCost = listOf(
            ItemCost("Cable", 1) // Per connection (typically)
        ),
        unlockMethod = "Tier 0 - Onboarding",
        unlockCost = null,
        unlockDetails = "Available from the start.",
        usageDetails = "Connect power producers to consumers via Power Poles."
    ),
    BuildingData(
        id = "power_pole_mk1",
        name = "Power Pole Mk.1",
        category = "Power",
        description = "The basic Power Pole, allowing up to 4 Power Line connections. Used to distribute power.",
        powerConsumption = "0 MW",
        dimensions = "Small",
        overclockable = "No",
        conveyorInputs = "N/A", // 4 power connections
        conveyorOutputs = "N/A",
        productionRate = "N/A",
        buildCost = listOf(
            ItemCost("Wire", 3),
            ItemCost("Iron Rod", 1)
        ),
        unlockMethod = "Tier 0 - Onboarding",
        unlockCost = null,
        unlockDetails = "Available from the start or very early HUB upgrade.",
        usageDetails = "Extends the reach of the power grid."
    ),
    BuildingData(
        id = "power_pole_mk2",
        name = "Power Pole Mk.2",
        category = "Power",
        description = "An upgraded Power Pole with 7 connections and a slightly larger connection radius.",
        powerConsumption = "0 MW",
        dimensions = "Small",
        overclockable = "No",
        conveyorInputs = "N/A", // 7 power connections
        conveyorOutputs = "N/A",
        productionRate = "N/A",
        buildCost = listOf(
            ItemCost("Copper Sheet", 2),
            ItemCost("Concrete", 2),
            ItemCost("Steel Pipe", 1) // Or Quickwire depending on game version/balance
        ),
        unlockMethod = "AWESOME Shop - Power Infrastructure", // Or a Tier milestone
        unlockCost = listOf(ItemCost("AWESOME Coupon", 3)),
        unlockDetails = "Typically unlocked via AWESOME Shop.",
        usageDetails = "More connections than Mk.1."
    ),
    BuildingData(
        id = "power_pole_mk3",
        name = "Power Pole Mk.3",
        category = "Power",
        description = "The most advanced Power Pole, offering 10 connections and the largest connection radius.",
        powerConsumption = "0 MW",
        dimensions = "Small",
        overclockable = "No",
        conveyorInputs = "N/A", // 10 power connections
        conveyorOutputs = "N/A",
        productionRate = "N/A",
        buildCost = listOf(
            ItemCost("High-Speed Connector", 1),
            ItemCost("Plastic", 2),
            ItemCost("Steel Beam", 1)
        ),
        unlockMethod = "AWESOME Shop - Power Infrastructure", // Or a later Tier milestone
        unlockCost = listOf(ItemCost("AWESOME Coupon", 6)),
        unlockDetails = "Typically unlocked via AWESOME Shop.",
        usageDetails = "Highest connection count and radius for standard poles."
    ),
    BuildingData(
        id = "power_storage",
        name = "Power Storage",
        category = "Power",
        description = "Stores surplus power generated on the grid and releases it when demand exceeds supply. Helps stabilize power grids and manage fluctuating power sources.",
        powerConsumption = "0 MW (stores/releases power)",
        dimensions = "3m x 3m x 4m",
        overclockable = "No",
        conveyorInputs = "N/A", // Power connection
        conveyorOutputs = "N/A", // Power connection
        productionRate = "Stores up to 100 MWh. Max charge/discharge rate 100 MW.",
        buildCost = listOf(
            ItemCost("Stator", 10),
            ItemCost("AI Limiter", 5),
            ItemCost("Cable", 50)
        ),
        unlockMethod = "Tier 4 - Expanded Power Infrastructure",
        unlockCost = null, // Or MAM research for AI Limiters
        unlockDetails = "Unlocked via MAM research for Caterium (AI Limiters).",
        usageDetails = "Connect to the power grid. Will charge when production > consumption, discharge when consumption > production."
    ),
    BuildingData(
        id = "power_switch",
        name = "Power Switch",
        category = "Power",
        description = "Allows manual or automated control of power flow to a segment of the grid. Can be used to isolate sections or manage power distribution.",
        powerConsumption = "1 MW (when ON)",
        dimensions = "Small, wall-mountable or free-standing",
        overclockable = "No",
        conveyorInputs = "N/A", // Power connection in
        conveyorOutputs = "N/A", // Power connection out
        productionRate = "N/A",
        buildCost = listOf(
            ItemCost("Reinforced Iron Plate", 2),
            ItemCost("Rotor", 1),
            ItemCost("Cable", 10)
        ),
        unlockMethod = "Tier 2 - Part Assembly",
        unlockCost = null,
        unlockDetails = "Unlocked via HUB Upgrade or early Tier milestone.",
        usageDetails = "Toggle to connect or disconnect a power circuit. Useful for managing factory sections or troubleshooting."
    ),
    BuildingData(
        id = "power_tower",
        name = "Power Tower",
        category = "Power",
        description = "A large structure with multiple connection points high off the ground, ideal for long-distance power transmission and crossing terrain.",
        powerConsumption = "0 MW",
        dimensions = "Large base, very tall (approx. 5m x 5m base, 30m+ height)",
        overclockable = "No",
        conveyorInputs = "N/A", // Multiple power connections
        conveyorOutputs = "N/A",
        productionRate = "N/A",
        buildCost = listOf(
            ItemCost("Steel Beam", 15),
            ItemCost("Concrete", 10),
            ItemCost("Copper Sheet", 5)
        ),
        unlockMethod = "AWESOME Shop - Power Infrastructure",
        unlockCost = listOf(ItemCost("AWESOME Coupon", 5)),
        unlockDetails = "Unlocked via the AWESOME Shop.",
        usageDetails = "Facilitates clean long-range power lines over obstacles."
    ),
    BuildingData(
        id = "priority_merger", // This isn't a standard building; Smart/Programmable Splitters handle priority.
        name = "Priority Merger (Conceptual - use Smart Splitter)",
        category = "Logistics & Organization",
        description = "Conceptual: A merger that prioritizes one input over others. (In-game, this functionality is achieved with Smart or Programmable Splitters before a standard Merger).",
        powerConsumption = "N/A", // Smart Splitters consume 1MW
        dimensions = "Varies",
        overclockable = "N/A",
        conveyorInputs = "3 (conceptual)",
        conveyorOutputs = "1 (conceptual)",
        productionRate = "N/A",
        buildCost = listOf(
            // Example for Smart Splitter
            // ItemCost("Reinforced Iron Plate", 2),
            // ItemCost("Rotor", 2),
            // ItemCost("AI Limiter", 1)
        ),
        unlockMethod = "N/A (Use Smart/Programmable Splitter logic)",
        unlockCost = null,
        unlockDetails = "No direct 'Priority Merger'. Configure Smart Splitters for priority logic.",
        usageDetails = "To prioritize inputs, use a Smart Splitter with overflow handling feeding into mergers."
    ),
    BuildingData(
        id = "priority_power_switch", // Not a standard building. Power Switch is manual or game-logic driven.
        name = "Priority Power Switch (Conceptual)",
        category = "Power",
        description = "Conceptual: A Power Switch that automatically manages power based on priority or grid status. (In-game, Power Storages and careful grid setup manage this).",
        powerConsumption = "N/A",
        dimensions = "N/A",
        overclockable = "N/A",
        conveyorInputs = "N/A",
        conveyorOutputs = "N/A",
        productionRate = "N/A",
        buildCost = listOf(),
        unlockMethod = "N/A",
        unlockCost = null,
        unlockDetails = "No direct 'Priority Power Switch'. Use standard Power Switches and grid design.",
        usageDetails = "Manage power priorities by segregating grids with standard Power Switches and using Power Storages as buffers."
    ),
    BuildingData(
        id = "programmable_splitter",
        name = "Programmable Splitter",
        category = "Logistics & Organization",
        description = "An advanced splitter that can be programmed to sort items based on type, sending specific items to designated outputs. Can also handle overflow.",
        powerConsumption = "1 MW",
        dimensions = "2m x 3m x 2m", // Same as Smart Splitter
        overclockable = "No",
        conveyorInputs = "1",
        conveyorOutputs = "3",
        productionRate = "Matches input belt speed.",
        buildCost = listOf(
            ItemCost("Heavy Modular Frame", 2), // Or Encased Industrial Beam
            ItemCost("Supercomputer", 1), // Or AI Limiter + High-Speed Connector
            ItemCost("Motor", 4)
        ),
        unlockMethod = "MAM Research - Caterium Electronics (Advanced AI)",
        unlockCost = null,
        unlockDetails = "Unlocked via advanced Caterium research in the MAM.",
        usageDetails = "Highly configurable item sorting. Set rules for each output, including 'Any', 'Overflow', or specific item types."
    ),
    BuildingData(
        id = "quantum_encoder", // This sounds like a Project Assembly Part, not a building
        name = "Quantum Encoder (Project Part)",
        category = "Project Assembly Part",
        description = "The Quantum Encoder is a late-game component produced in Particle Accelerators, required for the final phase of Project Assembly.",
        powerConsumption = "N/A (it's an item)",
        dimensions = "N/A (item)",
        overclockable = "N/A",
        conveyorInputs = "N/A",
        conveyorOutputs = "N/A",
        productionRate = "N/A (produced by Particle Accelerator)",
        buildCost = listOf( // This would be its recipe if it were a building
            // ItemCost("Superposition Oscillator", 1),
            // ItemCost("Quantum Computer", 2)
        ),
        unlockMethod = "Tier 8 - Particle Enrichment (as a recipe)",
        unlockCost = null,
        unlockDetails = "Recipe unlocked with Particle Accelerators and relevant research.",
        usageDetails = "Used in the Space Elevator for the final Project Assembly phase."
    ),
    BuildingData(
        id = "radar_tower",
        name = "Radar Tower",
        category = "Exploration & Utility",
        description = "The Radar Tower scans the surrounding area and reveals it on the map, including resource nodes and points of interest. Consumes power.",
        powerConsumption = "30 MW",
        dimensions = "3m x 3m base, approx. 40m tall",
        overclockable = "No",
        conveyorInputs = "0",
        conveyorOutputs = "0",
        productionRate = "Reveals map area over time (approx. 500m radius per 60s of scanning)",
        buildCost = listOf(
            ItemCost("Steel Beam", 20),
            ItemCost("Crystal Oscillator", 3),
            ItemCost("AI Limiter", 5),
            ItemCost("Cable", 100)
        ),
        unlockMethod = "MAM Research - Quartz (Map Scanning)",
        unlockCost = null,
        unlockDetails = "Unlocked via Quartz research in the MAM.",
        usageDetails = "Requires power. Reveals a circular area of the map over time. Multiple towers needed for full map coverage."
    ),
    BuildingData(
        id = "railway", // Buildable track, not a single "building"
        name = "Railway (Track)",
        category = "Logistics & Transport",
        description = "Train tracks used for Electric Locomotives and Freight Cars to transport large quantities of resources over long distances.",
        powerConsumption = "0 MW (Trains consume power)",
        dimensions = "Segment based",
        overclockable = "No",
        conveyorInputs = "N/A",
        conveyorOutputs = "N/A",
        productionRate = "N/A",
        buildCost = listOf(
            ItemCost("Steel Beam", 3), // Per segment
            ItemCost("Steel Pipe", 3)  // Per segment
        ),
        unlockMethod = "Tier 6 - Monorail Train Technology",
        unlockCost = null,
        unlockDetails = "Unlocked via the Tier 6 milestone 'Monorail Train Technology'.",
        usageDetails = "Lay tracks to create a train network. Requires Train Stations for loading/unloading."
    ),
    BuildingData(
        id = "refinery",
        name = "Refinery",
        category = "Production & Fluids",
        description = "The Refinery processes fluids and solids to produce other fluids and/or solids. Essential for oil processing, alumina solution, etc.",
        powerConsumption = "30 MW",
        dimensions = "10m x 12m x 20m",
        overclockable = "Yes",
        conveyorInputs = "2", // Can be 0, 1, or 2 depending on recipe
        conveyorOutputs = "2",// Can be 0, 1, or 2 depending on recipe
        // Also 2 Pipe inputs & 2 Pipe outputs (max usage depends on recipe)
        productionRate = "Varies by recipe",
        buildCost = listOf(
            ItemCost("Steel Pipe", 15),
            ItemCost("Motor", 10),
            ItemCost("Circuit Board", 20),
            ItemCost("Rubber", 20)
        ),
        unlockMethod = "Tier 5 - Oil Processing",
        unlockCost = null,
        unlockDetails = "Unlocked via the Tier 5 milestone 'Oil Processing'.",
        usageDetails = "Highly versatile for fluid and solid recipes. Check specific recipe for input/output configuration."
    ),
    BuildingData(
        id = "resource_well_pressurizer",
        name = "Resource Well Pressurizer",
        category = "Resource Extraction",
        description = "Placed on Resource Well Satellite Nodes after extracting the core with a Resource Well Extractor. It increases the extraction rate of Nitrogen Gas or other well resources.",
        powerConsumption = "150 MW",
        dimensions = "Large, fits over resource well node",
        overclockable = "No (extraction rate based on Extractor)",
        conveyorInputs = "0", // Power input
        conveyorOutputs = "0", // Output is via attached Extractor
        productionRate = "Boosts Extractor output (e.g., from 60 to 120, or 120 to 240, or 300 to 600 m³/min of Nitrogen Gas, depending on Extractor Mk)",
        buildCost = listOf(
            ItemCost("Encased Industrial Beam", 20),
            ItemCost("Motor", 10),
            ItemCost("Copper Sheet", 50),
            ItemCost("Steel Pipe", 40)
        ),
        unlockMethod = "Tier 7 - Aeronautical Engineering (Nitrogen Gas research)",
        unlockCost = null,
        unlockDetails = "Unlocked via MAM Research related to Nitrogen Gas, after Aeronautical Engineering.",
        usageDetails = "Requires a Resource Well Extractor to be placed first. Significantly increases power consumption of the setup but doubles the output of the attached extractor."
    )
    // NOTE: 'Resource Well Extractor' would be another building, not covered by 'Pressurizer' alone.
    // If you need it, it would be another entry.
)