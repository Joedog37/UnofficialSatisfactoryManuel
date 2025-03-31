package com.example.unofficalsatisfactorymanuel

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MainScreen(modifier: Modifier = Modifier) {
    val welcomeMessage = "Welcome to the Unofficial Satisfactory Manuel!"
    val appDescription = "Explore the world of Satisfactory with this unofficial companion app! Discover detailed information about buildings, crafting, resources, and more, to help you optimize your factory."
    Column(modifier = modifier.padding(16.dp)) {
        Text(
            text = welcomeMessage,
            fontSize = 16.sp,
            modifier = Modifier.padding(top = 8.dp)
        )
        Text(
            text = appDescription,
            fontSize = 12.sp,
            modifier = Modifier.padding(top = 8.dp)
        )
    }
}