package com.example.datefinder_app.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun DateParamSelector() {
    var setting by remember { mutableStateOf("Any") }
    var durationRange by remember { mutableStateOf(1f..5f) }
    var activityLevelLow by remember { mutableStateOf(false) }
    var activityLevelMedium by remember { mutableStateOf(false) }
    var activityLevelHigh by remember { mutableStateOf(false) }
    var price1 by remember { mutableStateOf(false) }
    var price2 by remember { mutableStateOf(false) }
    var price3 by remember { mutableStateOf(false) }
    var price4 by remember { mutableStateOf(false) }
    var rating by remember { mutableStateOf(2f) }

    Column(modifier = Modifier.padding(16.dp)) {
        Text("Setting")
        Row {
            RadioButton(selected = setting == "Indoor", onClick = { setting = "Indoor" })
            Text("Indoor")
            Spacer(modifier = Modifier.width(8.dp))
            RadioButton(selected = setting == "Outdoor", onClick = { setting = "Outdoor" })
            Text("Outdoor")
            Spacer(modifier = Modifier.width(8.dp))
            RadioButton(selected = setting == "Any", onClick = { setting = "Any" })
            Text("Any")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Text("Duration")
        RangeSlider(
            value = durationRange,
            onValueChange = { durationRange = it },
            valueRange = 1f..5f,
            steps = 3
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text("Activity Level")
        Row {
            Checkbox(checked = activityLevelLow, onCheckedChange = { activityLevelLow = it })
            Text("Low")
            Spacer(modifier = Modifier.width(8.dp))
            Checkbox(checked = activityLevelMedium, onCheckedChange = { activityLevelMedium = it })
            Text("Medium")
            Spacer(modifier = Modifier.width(8.dp))
            Checkbox(checked = activityLevelHigh, onCheckedChange = { activityLevelHigh = it })
            Text("High")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Text("Price")
        Row {
            Checkbox(checked = price1, onCheckedChange = { price1 = it })
            Text("$")
            Spacer(modifier = Modifier.width(8.dp))
            Checkbox(checked = price2, onCheckedChange = { price2 = it })
            Text("$$")
            Spacer(modifier = Modifier.width(8.dp))
            Checkbox(checked = price3, onCheckedChange = { price3 = it })
            Text("$$$")
            Spacer(modifier = Modifier.width(8.dp))
            Checkbox(checked = price4, onCheckedChange = { price4 = it })
            Text("$$$$")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Text("Rating")
        Slider(
            value = rating,
            onValueChange = { rating = it },
            valueRange = 2f..4.5f,
            steps = 5
        )
        Text("${rating}+", modifier = Modifier.align(Alignment.CenterHorizontally))
    }
}


//preview of DateParamSelector
@Preview
@Composable
fun DateParamSelectorPreview() {
    DateParamSelector()
}