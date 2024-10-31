package com.example.droidshare.components

import androidx.compose.runtime.Composable
import androidx.compose.material3.Text

@Composable
fun PersonList(namesList: List<String>) {
    Text("Group Members:")
    namesList.forEach { name ->
        Text(text = name)
    }
}