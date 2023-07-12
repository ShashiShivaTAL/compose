package com.example.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.*

class EffectHandlersThemeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            ListComposable()

        }
    }
}

@Composable
fun ListComposable() {
    val categoryState = remember { mutableStateOf(emptyList<String>()) }
    categoryState.value = fetchCategories()

    LazyColumn {
        items(categoryState.value){item ->
            Text(text = item)
        }
    }
}

fun fetchCategories(): List<String> {
    return listOf("One", "Two", "Three")
}

var counter = 1

@Composable
fun HasSideEffect() {
    counter++
    Text(text = "Shashi Shiva")
}