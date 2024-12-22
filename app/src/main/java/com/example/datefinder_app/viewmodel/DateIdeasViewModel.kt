package com.example.datefinder_app.viewmodel

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.datefinder_app.data.model.DateIdeasResponse
import androidx.compose.runtime.State
import androidx.lifecycle.viewModelScope
import com.example.datefinder_app.domain.repository.IDateFinderRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class DateIdeasViewModel @Inject constructor(
    private val repository: IDateFinderRepository
) : ViewModel() {

    private val _dateIdeas: MutableState<List<DateIdeasResponse>> = mutableStateOf(listOf())
    val dateIdeas : State<List<DateIdeasResponse>> = _dateIdeas

    fun fetchDateIdeas(indoorOutdoor: String, durationMin: Int, durationMax: Int, activityLevels: List<String>) {
        viewModelScope.launch {
            val result = repository.fetchDateIdeas(indoorOutdoor, durationMin, durationMax, activityLevels)
            _dateIdeas.value = result
        }
    }
}