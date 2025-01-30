package com.eliabdiel.myfirstcomposeapp.login

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview()
@Composable
fun ExamplePreview() {
    Example("Lopez")
}

@Composable
fun Example(a:String) {
    Text("Abdiel $a", modifier = Modifier
        //.height(33.dp).width(40.dp)
        //.size(50.dp)
        //.fillMaxWidth().fillMaxHeight()
        //.fillMaxSize()
        .background(Color.Red)
        .padding(all = 30.dp)
        //.background(Color.Red)
        .clickable {  }
    )
}
