package com.blez.chatapp_jetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.blez.chatapp_jetpack.ui.theme.ChatAPP_jetpackTheme
import com.blez.chatapp_jetpack.ui.theme.Shapes
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ChatAPP_jetpackTheme {
                // A surface container using the 'background' color from the theme
                val count = remember{ mutableStateOf(0)}

                Greeting(count)
            }
        }
    }
}

@Composable
fun Greeting(count: MutableState<Int>) {
    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = count.value.toString())
        Button(onClick = {count.value++}, shape = Shapes.large) {
            Text(text = "Click me")


        }

        
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    ChatAPP_jetpackTheme {
        val count = remember{ mutableStateOf(0)}

        Greeting(count)
    }
}