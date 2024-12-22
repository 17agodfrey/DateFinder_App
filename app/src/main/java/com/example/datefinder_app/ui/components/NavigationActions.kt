package com.example.datefinder_app.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.example.datefinder_app.ui.Screen

@Composable
fun NavigationActions(navController: NavHostController) {
    Column {
        Button(onClick = { navController.navigate(Screen.DateSelection.route) }) {
            Text("Go to Date Selection")
        }
        Button(onClick = { navController.navigate(Screen.MapSearch.route) }) {
            Text("Go to Map Search")
        }
    }
}