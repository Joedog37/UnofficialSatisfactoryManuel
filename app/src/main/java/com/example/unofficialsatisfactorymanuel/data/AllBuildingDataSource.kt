package com.example.unofficialsatisfactorymanuel.data

// Assume you have these individual data list vals defined in separate files
// or above in this file if you choose to combine them here.
// For example, in BuildingData_A_C.kt:
// val buildingData_A_C: List<BuildingData> = listOf(...)
//
// And similarly for D_F, G_I, J_L, M_O, P_R, S_U, V_Z

val AllBuildingDataSample: List<BuildingData> = listOf<BuildingData>() + // Start with an empty list
        buildingData_A_C +  // Add the A-C list
        buildingData_D_F +  // Add the D-F list
        buildingData_G_I +  // Add the G-I list
        buildingData_J_L +  // Add the J-L list
        buildingData_M_O +  // Add the M-O list
        buildingData_P_R +  // Add the P-R list
        buildingData_S_U +  // Add the S-U list
        buildingData_V_Z    // Add the V-Z list (no '+' needed at the end of the last item)

fun getBuildingById(id: String, dataSource: List<BuildingData> = AllBuildingDataSample): BuildingData? {
    return dataSource.find { it.id.equals(id, ignoreCase = true) }
}

