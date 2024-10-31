package com.example.droidshare.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue

@Composable
fun NameInput(nameInput: TextFieldValue, onValueChange: (TextFieldValue) -> Unit) {
    TextField(
        value = nameInput,
        onValueChange = onValueChange,
        placeholder = { Text("Enter name") },
        modifier = Modifier.fillMaxWidth()
    )
}