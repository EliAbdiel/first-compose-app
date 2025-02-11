package com.eliabdiel.myfirstcomposeapp.components.layout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout

@Preview(showBackground = true)
@Composable
fun MyBasicConstrainLayout(modifier: Modifier = Modifier) {
    ConstraintLayout(modifier = modifier.fillMaxSize()) {
        val (boxRed, boxGray, boxGreen, boxMagenta, boxYellow) = createRefs()

        Box(Modifier.size(75.dp).background(Color.Red).constrainAs(boxRed){
            top.linkTo(boxYellow.bottom)
            start.linkTo(boxYellow.end)
        })

        Box(Modifier.size(75.dp).background(Color.Gray).constrainAs(boxGray){
            top.linkTo(boxYellow.bottom)
            end.linkTo(boxYellow.start)
        })

        Box(Modifier.size(75.dp).background(Color.Green).constrainAs(boxGreen){
            bottom.linkTo(boxYellow.top)
            start.linkTo(boxYellow.end)
        })

        Box(Modifier.size(75.dp).background(Color.Magenta).constrainAs(boxMagenta){
            bottom.linkTo(boxYellow.top)
            end.linkTo(boxYellow.start)
        })

        Box(Modifier.size(75.dp).background(Color.Yellow).constrainAs(boxYellow){
            bottom.linkTo(parent.bottom)
            end.linkTo(parent.end)
            top.linkTo(parent.top)
            start.linkTo(parent.start)
        })
    }
}