package com.example.proyecto.integrador.android

import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import viewmodel.MainViewModel
import androidx.lifecycle.viewmodel.compose.viewModel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface {
                    val viewModel = viewModel(MainViewModel::class.java)
                    var text1 by remember { mutableStateOf("") }
                    var text2 by remember { mutableStateOf("") }
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        TextField(value = text1, onValueChange = { text1 = it }, label = { Text("Text 1") })
                        Spacer(modifier = Modifier.height(8.dp))
                        TextField(value = text2, onValueChange = { text2 = it }, label = { Text("Text 2") })
                        Spacer(modifier = Modifier.height(16.dp))
                        Button(onClick = { viewModel.compare(text1, text2) }) {
                            Text("Compare")
                        }
                        Spacer(modifier = Modifier.height(16.dp))
                        Text(viewModel.result)
                    }
                }
            }
        }
    }
}
