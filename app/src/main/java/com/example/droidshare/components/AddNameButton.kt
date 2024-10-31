package com.example.droidshare.components

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun AddNameButton(onClick: () -> Unit) {
    Button(onClick = onClick) {
        Text("Add Name")
    }
}