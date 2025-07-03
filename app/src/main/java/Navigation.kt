package com.example.unofficialsatisfactorymanuel

object AppDestinations {
    const val HOME_ROUTE = "Home"
    const val BUILDINGS_LIST_ROUTE = "Buildings"
    const val BUILDING_DETAIL_ROUTE_BASE = "BuildingDetail"
    const val BUILDING_ID_ARG = "buildingId"
    const val BUILDING_DETAIL_ROUTE = "$BUILDING_DETAIL_ROUTE_BASE/{$BUILDING_ID_ARG}"
    const val ITEMS_ROUTE = "Items"
    const val ABOUT_ROUTE = "About"
}