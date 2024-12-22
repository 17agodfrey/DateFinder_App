package com.example.datefinder_app.domain.repository

import com.example.datefinder_app.data.model.DateIdeasResponse

interface IDateFinderRepository {
    suspend fun fetchDateIdeas(
        indoorOutdoor: String,
        durationMin: Int,
        durationMax: Int,
        activityLevels: List<String>
    ): List<DateIdeasResponse>

    suspend fun fetchMapDates(dateIds: List<Int>, location: String): List<DateIdeasResponse>
}