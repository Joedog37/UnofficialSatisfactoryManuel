package com.example.unofficialsatisfactorymanuel

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun AboutScreen(modifier: Modifier = Modifier) {
    Column(modifier = modifier.padding(16.dp)) {
        Text(
            text = "About",
            fontWeight = FontWeight.Bold,
            fontSize = 24.sp
        )
        Text(
            text = "Disclaimer: This app is an unofficial fan-made companion for the game Satisfactory. It is not created, endorsed, or affiliated with Coffee Stain Studios or Satisfactory. Any in-game content or trademarks are property of their respective owners. This app is intended as a tool for fans of Satisfactory and is for informational and entertainment purposes only. Note that this app may not be up-to-date with the latest changes to the game.",
            fontSize = 16.sp,
            fontStyle = FontStyle.Italic,
            modifier = Modifier.padding(top = 8.dp)
        )
    }
}