package com.example.datefinder_app.ui

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.datefinder_app.ui.screens.DateSelectionScreen
import com.example.datefinder_app.ui.screens.MapSearchScreen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun App() {
    val navController = rememberNavController()
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("My App") }
//                backgroundColor = Color.Blue,
//                contentColor = Color.White
            )
        }
    ) { innerPadding ->
        NavHost(navController, startDestination = Screen.DateSelection.route, Modifier.padding(innerPadding)) {
            composable(Screen.DateSelection.route) { DateSelectionScreen(navController) }
            composable(Screen.MapSearch.route) { MapSearchScreen(navController) }
        }
    }
}