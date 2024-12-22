package com.example.datefinder_app.domain.usecase

import com.example.datefinder_app.data.model.DateIdeasResponse
import com.example.datefinder_app.domain.repository.IDateFinderRepository

// I'm no longer using this... I'm using the repository directly in the viewmodel
// this would kinda be another "layer" of abstraction, but seems really unnecessary


//class FetchDateIdeasUseCase(private val repository: IDateFinderRepository) {
//    suspend operator fun invoke(
//        indoorOutdoor: String,
//        durationMin: Int,
//        durationMax: Int,
//        activityLevels: List<String>
//    ): List<DateIdeasResponse> {
//        return repository.fetchDateIdeas(indoorOutdoor, durationMin, durationMax, activityLevels)
//    }
//}
//
//class FetchMapDatesUseCase(private val repository: IDateFinderRepository) {
//    suspend operator fun invoke(
//        dateIds: List<Int>,
//        location: String
//    ): List<DateIdeasResponse> {
//        return repository.fetchMapDates(dateIds, location)
//    }
//}