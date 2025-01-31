package com.eliabdiel.myfirstcomposeapp.components.layout

<<<<<<< HEAD
=======
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun MyBox() {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Box(
            modifier = Modifier
                .size(200.dp)
                //.width(20.dp)
                //.height(30.dp)
                .background(Color.Red)
                .verticalScroll(rememberScrollState()),
            contentAlignment = Alignment.Center
        ) {
            Text("Soy un Texto")
        }
    }
}
>>>>>>> 856e483 (add Box layout)
