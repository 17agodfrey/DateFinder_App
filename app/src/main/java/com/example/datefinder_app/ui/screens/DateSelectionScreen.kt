package com.example.datefinder_app.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.navigation.NavHostController
import com.example.datefinder_app.ui.components.NavigationActions
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.example.datefinder_app.ui.components.DateParamSelector

@Composable
fun DateSelectionScreen(navController: NavHostController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Date Selection Screen")
        Spacer(modifier = Modifier.height(16.dp))
        DateParamSelector();
        NavigationActions(navController)
    }
}

// make a preview of this
@Preview
@Composable
fun DateSelectionScreenPreview() {
    DateSelectionScreen(navController = rememberNavController())
}