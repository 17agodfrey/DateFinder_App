package com.example.datefinder_app.data.remote

import com.example.datefinder_app.data.model.DateIdeasResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("date/date-ideas")
    suspend fun fetchDateIdeas(
        @Query("IndoorOutdoor") indoorOutdoor: String,
        @Query("DurationRange.Min") durationMin: Int,
        @Query("DurationRange.Max") durationMax: Int,
        @Query("ActivityLevels") activityLevels: List<String>
    ): List<DateIdeasResponse>

    @GET("date/map-dates")
    suspend fun fetchMapDates(
        @Query("DateIds") dateIds: List<Int>,
        @Query("Location") location: String
    ): List<DateIdeasResponse>
}
