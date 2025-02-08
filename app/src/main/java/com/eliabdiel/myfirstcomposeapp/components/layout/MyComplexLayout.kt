package com.eliabdiel.myfirstcomposeapp.components.layout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun MyComplexLayout(modifier: Modifier) {
    Column(modifier = modifier) {
        Box(modifier = Modifier.weight(1f).fillMaxSize().background(Color.Red)) {}
        Box(modifier = Modifier.weight(1f).fillMaxSize().background(Color.White)) {
            Row{
                Box(modifier = Modifier.weight(1f).height(125.dp).background(Color.Gray)){}
                Box(modifier = Modifier.weight(1f).height(185.dp).background(Color.Blue), contentAlignment = Alignment.Center){
                    Text("HOLA", color = Color.White)
                }
            }
        }
        Box(modifier = Modifier.weight(1f).fillMaxSize().background(Color.Green)) {}
    }
}