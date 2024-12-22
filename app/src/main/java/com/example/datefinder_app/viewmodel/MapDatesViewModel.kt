package com.example.datefinder_app.viewmodel

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import com.example.datefinder_app.data.model.MapDateResults

class MapDatesViewModel {

    private val _mapDates: MutableState<List<MapDateResults>> = mutableStateOf(listOf())

    val mapDates: MutableState<List<MapDateResults>>
        get() = _mapDates

    fun setMapDates(mapDates: List<MapDateResults>) {
        _mapDates.value = mapDates
    }

}