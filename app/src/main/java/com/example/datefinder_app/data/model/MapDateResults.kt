package com.example.datefinder_app.data.model

data class MapDateResults(
    val placeId: String,
    val name: String,
    val address: String,
    val coordinates: Coordinates
)

data class Coordinates(
    val latitude: Double,
    val longitude: Double
)
