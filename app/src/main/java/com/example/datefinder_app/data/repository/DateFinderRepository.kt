package com.example.datefinder_app.data.repository

import com.example.datefinder_app.data.model.DateIdeasResponse
import com.example.datefinder_app.data.remote.ApiService
import com.example.datefinder_app.domain.repository.IDateFinderRepository
import javax.inject.Inject

class DateFinderRepository @Inject constructor(
    private val apiService: ApiService
) : IDateFinderRepository {

    override suspend fun fetchDateIdeas(
        indoorOutdoor: String,
        durationMin: Int,
        durationMax: Int,
        activityLevels: List<String>
    ): List<DateIdeasResponse> {
        return apiService.fetchDateIdeas(indoorOutdoor, durationMin, durationMax, activityLevels)
    }

    override suspend fun fetchMapDates(dateIds: List<Int>, location: String): List<DateIdeasResponse> {
        return apiService.fetchMapDates(dateIds, location)
    }
}