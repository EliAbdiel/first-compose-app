package com.eliabdiel.myfirstcomposeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.eliabdiel.myfirstcomposeapp.components.layout.ExerciseTwo
// import com.eliabdiel.myfirstcomposeapp.components.layout.ExerciseOne
import com.eliabdiel.myfirstcomposeapp.components.layout.MyBasicConstrainLayout
// import com.eliabdiel.myfirstcomposeapp.components.layout.MyBox
// import com.eliabdiel.myfirstcomposeapp.components.layout.MyColumn
import com.eliabdiel.myfirstcomposeapp.login.Greeting
import com.eliabdiel.myfirstcomposeapp.ui.theme.MyFirstComposeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyFirstComposeAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

//                    Greeting(
//                        name = "Android",
//                        modifier = Modifier.padding(innerPadding)
//                    )
                    // MyBox()
                    // MyColumn(modifier = Modifier.padding(innerPadding))
                    // MyRow(modifier = Modifier.padding(innerPadding))
                    // MyComplexLayout(modifier = Modifier.padding(innerPadding))
                    // ExerciseOne(modifier = Modifier.padding(innerPadding))
                    // MyBasicConstrainLayout(modifier = Modifier.padding(innerPadding))
                    ExerciseTwo(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyFirstComposeAppTheme {
        Greeting("Android")
    }
}