package com.example.datefinder_app.ui

sealed class Screen(val route: String) {
    object DateSelection : Screen("date_selection")
    object MapSearch : Screen("map_search")
}