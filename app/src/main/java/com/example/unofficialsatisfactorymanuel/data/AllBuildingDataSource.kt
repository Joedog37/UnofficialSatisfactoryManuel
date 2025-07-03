package com.example.unofficialsatisfactorymanuel.data

val AllBuildingDataSample: List<BuildingData> = listOf<BuildingData>() + // Start with an empty list
        buildingData_A_C +  // Add the first list
        buildingData_D_F    // Add the second list (notice the '+' at the end of the PREVIOUS line)
// + buildingData_G_I // Example for a future list (add '+' to the end of buildingData_D_F line)
// + buildingData_J_L // And so on...

// + other data lists as you create them

fun getBuildingById(id: String, dataSource: List<BuildingData> = AllBuildingDataSample): BuildingData? {
    return dataSource.find { it.id.equals(id, ignoreCase = true) }
}