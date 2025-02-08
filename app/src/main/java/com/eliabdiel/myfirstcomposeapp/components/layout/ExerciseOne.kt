package com.eliabdiel.myfirstcomposeapp.components.layout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun ExerciseOne(modifier: Modifier=Modifier) {
    Column(modifier = modifier) {
        Box(modifier = Modifier.weight(1f).fillMaxSize().background(Color.Cyan), contentAlignment = Alignment.Center) {
            Text("Ejemplo 1")
        }
        Box(modifier = Modifier.weight(1f).fillMaxSize().background(Color.White)) {
            Row{
                Box(modifier = Modifier.weight(1f).fillMaxSize().background(Color.Red), contentAlignment = Alignment.Center) {
                    Text("Ejemplo 2")
                }
                Box(modifier = Modifier.weight(1f).fillMaxSize().background(Color.Green), contentAlignment = Alignment.Center) {
                    Text("Ejemplo 3")
                }
            }
        }
        Box(modifier = Modifier.weight(1f).fillMaxSize().background(Color.Magenta), contentAlignment = Alignment.BottomCenter) {
            Text("Ejemplo 4")
        }
    }
}