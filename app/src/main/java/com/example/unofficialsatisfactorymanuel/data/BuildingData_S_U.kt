package com.example.unofficialsatisfactorymanuel.data

val buildingData_S_U: List<BuildingData> = listOf(
    BuildingData(
        id = "signs_set", // Generic ID for various signs
        name = "Signs (Various)",
        category = "Organization & Aesthetics",
        description = "Various types of signs (Small Billboard, Portrait Billboard, Landscape Billboard, Display Sign, etc.) used for labeling, providing information, or decoration. Some signs can display item icons, text, or pre-set images.",
        powerConsumption = "0.1 MW (for illuminated/display signs, others 0 MW)",
        dimensions = "Varies by sign type",
        overclockable = "No",
        conveyorInputs = "0",
        conveyorOutputs = "0",
        productionRate = "N/A",
        buildCost = listOf(
            // Example for a Small Billboard
            ItemCost("Iron Plate", 2),
            ItemCost("Iron Rod", 2)
            // Display signs cost more, e.g., Quickwire, Copper Sheet
        ),
        unlockMethod = "AWESOME Shop - Aesthetics & Organization",
        unlockCost = listOf(ItemCost("AWESOME Coupon", 1)), // Varies by sign pack
        unlockDetails = "Unlocked via various packs in the AWESOME Shop.",
        usageDetails = "Place on walls, floors, or poles. Configure content through the interaction menu. Display Signs offer advanced customization."
    ),
    BuildingData(
        id = "smart_splitter",
        name = "Smart Splitter",
        category = "Logistics & Organization",
        description = "An upgraded splitter that can be configured to send specific items to different outputs. It can also handle overflow, sending any non-specified items to a designated output.",
        powerConsumption = "1 MW",
        dimensions = "2m x 3m x 2m",
        overclockable = "No",
        conveyorInputs = "1",
        conveyorOutputs = "3",
        productionRate = "Matches input belt speed.",
        buildCost = listOf(
            ItemCost("Reinforced Iron Plate", 2), // Or Modular Frame depending on version
            ItemCost("Rotor", 2),               // Or AI Limiter directly in some views
            ItemCost("AI Limiter", 1)           // If not Rotor, then this is more direct
        ),
        unlockMethod = "MAM Research - Caterium Electronics",
        unlockCost = null,
        unlockDetails = "Unlocked via Caterium research in the MAM.",
        usageDetails = "Configure by setting rules for each output (Left, Center, Right). Rules include specific items, 'Any', 'Any Undefined', or 'Overflow'."
    ),
    BuildingData(
        id = "smelter",
        name = "Smelter",
        category = "Production - Smelting",
        description = "The Smelter is a basic production building used to smelt raw ore (like Iron Ore, Copper Ore, Caterium Ore) into ingots.",
        powerConsumption = "4 MW",
        dimensions = "4m x 5m x 5m",
        overclockable = "Yes",
        conveyorInputs = "1",
        conveyorOutputs = "1",
        productionRate = "Varies by recipe (e.g., 30 Iron Ingots/min from Iron Ore at 100%)",
        buildCost = listOf(
            ItemCost("Iron Rod", 5),
            ItemCost("Wire", 8) // Or Iron Plate in some early game versions
        ),
        unlockMethod = "Tier 0 - Onboarding",
        unlockCost = null,
        unlockDetails = "Unlocked very early via HUB Upgrades.",
        usageDetails = "Input raw ore, outputs corresponding ingots. Essential for early game automation."
    ),
    BuildingData(
        id = "space_elevator", // Duplicate of "Portal" from P-R, choose one.
        name = "Space Elevator",
        category = "Progression",
        description = "The Space Elevator is a critical structure used to send Project Assembly parts into orbit, thereby unlocking new Tiers and advancing game progression.",
        powerConsumption = "0 MW (passive), 25-300MW when actively sending a phase (varies by phase)",
        dimensions = "Very large (approx. 20m x 20m base, very tall)",
        overclockable = "No",
        conveyorInputs = "Multiple, for dedicated Project Parts per phase",
        conveyorOutputs = "0",
        productionRate = "N/A (unlocks Tiers upon successful delivery of all required parts for a phase)",
        buildCost = listOf(
            // Initial construction costs (example from early game)
            ItemCost("Concrete", 500),
            ItemCost("Steel Beam", 150),
            ItemCost("Wire", 1000),
            ItemCost("Cable", 500)
            // Each subsequent phase has its own specific list of complex parts that must be delivered.
        ),
        unlockMethod = "Tier 0 - Onboarding (HUB Upgrade)",
        unlockCost = null, // The "cost" is fulfilling the parts for each phase.
        unlockDetails = "Constructed after a specific HUB upgrade early in the game. It is then upgraded by sending packages of Project Parts.",
        usageDetails = "Load with the specified Project Assembly parts for the current phase. Once all requirements are met, activate the delivery sequence from its control panel. Power is drawn only during the delivery animation."
    ),

    BuildingData(
        id = "storage_container_small", // Corrected ID
        name = "Storage Container",    // Corrected Name
        category = "Storage & Logistics",
        description = "A standard storage unit with 24 inventory slots. Can be connected to conveyors for automated input and output.",
        powerConsumption = "0 MW",
        dimensions = "3m x 4m x 3m",
        overclockable = "No",
        conveyorInputs = "1 (front or back)",
        conveyorOutputs = "1 (front or back, opposite of input if both used)",
        productionRate = "N/A",
        buildCost = listOf(
            ItemCost("Iron Plate", 10)
        ),
        unlockMethod = "Tier 0 - Onboarding",
        unlockCost = null,
        unlockDetails = "Unlocked very early via HUB Upgrades.",
        usageDetails = "Used for buffering items or as manual access storage. Can be stacked."
    ),
    BuildingData(
        id = "storage_container_large", // Corrected ID
        name = "Industrial Storage Container", // Corrected Name
        category = "Storage & Logistics",
        description = "A large storage unit with 48 inventory slots, double the capacity of the standard Storage Container. Connects to conveyors and is stackable.",
        powerConsumption = "0 MW",
        dimensions = "3m x 4m x 6m (double height of standard)", // Adjusted description for clarity
        overclockable = "No",
        conveyorInputs = "2 (front and back, can be set independently)", // Clarified inputs/outputs
        conveyorOutputs = "2 (front and back, can be set independently)",// Clarified inputs/outputs
        productionRate = "N/A",
        buildCost = listOf(
            ItemCost("Steel Beam", 10), // This cost is typical for the larger one
            ItemCost("Iron Plate", 20)  // Or Steel Plate depending on game version/balance
        ),
        unlockMethod = "AWESOME Shop - Logistics", // Or an early Tier milestone
        unlockCost = listOf(ItemCost("AWESOME Coupon", 4)), // Example coupon cost
        unlockDetails = "Typically unlocked via AWESOME Shop or early Tier milestones (e.g., Tier 2 or 3).",
        usageDetails = "Larger capacity buffer or manual storage. Can be stacked. Each pair of input/output ports (front and back) can be configured independently for dual belt access."
    ),
    BuildingData(
        id = "the_hub",
        name = "The HUB",
        category = "Progression & Utility",
        description = "The central starting structure. Used for early game progression by completing HUB Upgrades, manual crafting, respawning, and contains the FICSIT Coupon printer (AWESOME Sink) and the MAM after certain upgrades.",
        powerConsumption = "Variable (e.g., AWESOME Sink uses 30MW when active, MAM uses power)",
        dimensions = "Approx. 8m x 8m x 10m (initial), expands with upgrades",
        overclockable = "No",
        conveyorInputs = "1 (for AWESOME Sink)",
        conveyorOutputs = "0",
        productionRate = "N/A (facilitates progression and crafting)",
        buildCost = listOf(
            // Initial crash pod parts, not player-built from scratch in survival.
            // For game data, it's more about its function.
        ),
        unlockMethod = "Start of Game",
        unlockCost = null,
        unlockDetails = "The player starts with The HUB after the crash landing.",
        usageDetails = "Core progression building. Complete milestones, use Craft Bench, AWESOME Sink, MAM. Biomass Burners are initially part of it to power operations."
    ),
    BuildingData(
        id = "train_block_signal",
        name = "Block Signal (Train)",
        category = "Logistics & Transport (Trains)",
        description = "Used on Railways to divide tracks into blocks, preventing train collisions. A train will not enter a block occupied by another train if a Block Signal guards it.",
        powerConsumption = "0 MW (signals are passive, trains are powered)",
        dimensions = "Small, snaps to Railway tracks",
        overclockable = "No",
        conveyorInputs = "N/A",
        conveyorOutputs = "N/A",
        productionRate = "N/A (controls train movement)",
        buildCost = listOf(
            ItemCost("Steel Beam", 2),
            ItemCost("Wire", 5) // Or Cable
        ),
        unlockMethod = "Tier 6 - Monorail Train Technology",
        unlockCost = null,
        unlockDetails = "Unlocked with Railways and Train Stations.",
        usageDetails = "Place on the right side of the track in the direction of travel. Essential for two-way tracks or complex intersections to prevent deadlocks."
    ),
    BuildingData(
        id = "train_path_signal",
        name = "Path Signal (Train)",
        category = "Logistics & Transport (Trains)",
        description = "An advanced train signal used for complex intersections. A train will check if its entire path through the upcoming blocks is clear before proceeding. Helps prevent gridlock in multi-train intersections.",
        powerConsumption = "0 MW",
        dimensions = "Small, snaps to Railway tracks",
        overclockable = "No",
        conveyorInputs = "N/A",
        conveyorOutputs = "N/A",
        productionRate = "N/A (controls train movement)",
        buildCost = listOf(
            ItemCost("Steel Beam", 2),
            ItemCost("Circuit Board", 1) // Or High-Speed Connector
        ),
        unlockMethod = "Tier 6 - Monorail Train Technology (often via AWESOME Shop or later research)",
        unlockCost = listOf(ItemCost("AWESOME Coupon", 6)), // Example
        unlockDetails = "Often unlocked after basic train tech, sometimes via AWESOME Shop or specific research.",
        usageDetails = "Place on the right side of the track. Use before entering a complex series of blocks (e.g., a multi-track crossing) that a train needs to reserve entirely."
    ),
    BuildingData(
        id = "train_station_freight",
        name = "Freight Platform (Train Station)",
        category = "Logistics & Transport (Trains)",
        description = "A component of a Train Station used for loading or unloading solid items from Freight Cars. Multiple platforms can be attached to a Train Station.",
        powerConsumption = "0 MW (Train Station itself uses power)", // Platform is passive
        dimensions = "Modular with Train Station (approx. 8m wide per platform)",
        overclockable = "No",
        conveyorInputs = "2 (for loading into Freight Car)",
        conveyorOutputs = "2 (for unloading from Freight Car)",
        productionRate = "Matches belt speed and train docking frequency.",
        buildCost = listOf(
            ItemCost("Heavy Modular Frame", 4),
            ItemCost("Steel Beam", 12),
            ItemCost("Concrete", 20)
        ),
        unlockMethod = "Tier 6 - Monorail Train Technology",
        unlockCost = null,
        unlockDetails = "Unlocked with Electric Locomotives and Railways.",
        usageDetails = "Connect to a Train Station building. Configure as Load or Unload. Align with Freight Cars. Requires conveyor connections."
    ),
    BuildingData(
        id = "train_station_fluid",
        name = "Fluid Freight Platform (Train Station)",
        category = "Logistics & Transport (Trains)",
        description = "A component of a Train Station used for loading or unloading fluids from Fluid Freight Cars. Multiple platforms can be attached to a Train Station.",
        powerConsumption = "0 MW (Train Station itself uses power)", // Platform is passive
        dimensions = "Modular with Train Station (approx. 8m wide per platform)",
        overclockable = "No",
        conveyorInputs = "0", // 2 Pipe inputs for loading
        conveyorOutputs = "0", // 2 Pipe outputs for unloading
        productionRate = "Matches pipe flow rate and train docking frequency.",
        buildCost = listOf(
            ItemCost("Heavy Modular Frame", 4),
            ItemCost("Encased Industrial Beam", 8),
            ItemCost("Rubber", 20),
            ItemCost("Plastic", 20)
        ),
        unlockMethod = "Tier 6 - Monorail Train Technology (after basic trains, often with fluid research)",
        unlockCost = null, // Or AWESOME Shop
        unlockDetails = "Unlocked with or shortly after basic train technology, often requiring fluid handling research.",
        usageDetails = "Connect to a Train Station building. Configure as Load or Unload. Align with Fluid Freight Cars. Requires pipeline connections."
    ),
    BuildingData(
        id = "train_station_locomotive", // This is the main station building
        name = "Train Station (Locomotive Terminal)",
        category = "Logistics & Transport (Trains)",
        description = "The main structure for a train stop. Electric Locomotives dock here. Freight Platforms are attached to it for item/fluid transfer. Can be named and included in train schedules.",
        powerConsumption = "50 MW (when a train is docked or scheduling operations)",
        dimensions = "Approx. 12m wide, 20m long (main terminal)",
        overclockable = "No",
        conveyorInputs = "N/A (handled by attached platforms)",
        conveyorOutputs = "N/A (handled by attached platforms)",
        productionRate = "N/A (facilitates train operations)",
        buildCost = listOf(
            ItemCost("Computer", 2),
            ItemCost("Heavy Modular Frame", 6),
            ItemCost("Steel Beam", 20),
            ItemCost("Concrete", 30)
        ),
        unlockMethod = "Tier 6 - Monorail Train Technology",
        unlockCost = null,
        unlockDetails = "Unlocked with Electric Locomotives and Railways.",
        usageDetails = "Place along a Railway. Attach Freight Platforms. Name the station and set up train schedules in the Locomotive UI. Requires power to operate."
    ),
    BuildingData(
        id = "truck_station",
        name = "Truck Station",
        category = "Logistics & Transport (Vehicles)",
        description = "Allows automated loading and unloading of resources to and from Trucks and other wheeled vehicles. Requires power and vehicle path programming.",
        powerConsumption = "20 MW",
        dimensions = "12m x 12m x 7m",
        overclockable = "No",
        conveyorInputs = "2 (for loading into vehicle storage)",
        conveyorOutputs = "2 (for unloading from vehicle storage)",
        productionRate = "Matches belt speed and vehicle docking frequency. Fuel is also consumed if set to refuel vehicles.",
        buildCost = listOf(
            ItemCost("Heavy Modular Frame", 3),
            ItemCost("Motor", 4),
            ItemCost("Circuit Board", 10),
            ItemCost("Concrete", 30)
        ),
        unlockMethod = "Tier 4 - Automated Vehicles",
        unlockCost = null, // Or MAM research
        unlockDetails = "Unlocked via the Tier 4 milestone for vehicle automation or related MAM research.",
        usageDetails = "Set to Load or Unload. Vehicles assigned a path will dock. Can also refuel vehicles if fuel is supplied to its fuel inventory slot."
    ),
    BuildingData(
        id = "u_jelly_landing_pad", // FICSIT Character U-Jelly Landing Pad from AWESOME Shop
        name = "U-Jelly Landing Pad",
        category = "Aesthetics & Fun",
        description = "A decorative landing pad featuring the U-Jelly creature. Purely aesthetic, often used for fun or base decoration.",
        powerConsumption = "1 MW (if it has lights, otherwise 0 MW)", // Assuming some minor power for effect
        dimensions = "Approx. 4m x 4m x 1m",
        overclockable = "No",
        conveyorInputs = "0",
        conveyorOutputs = "0",
        productionRate = "N/A",
        buildCost = listOf(
            ItemCost("Plastic", 10),
            ItemCost("Rubber", 10),
            ItemCost("Iron Plate", 5)
        ),
        unlockMethod = "AWESOME Shop - FICSIT Specials",
        unlockCost = listOf(ItemCost("AWESOME Coupon", 5)), // Example coupon cost
        unlockDetails = "Unlocked via the AWESOME Shop.",
        usageDetails = "Place for decoration. May provide a soft landing if jumped on from height, but not its primary purpose."
    )
)