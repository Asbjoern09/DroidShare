package com.example.droidshare.components

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.TextField
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp

@Composable
fun AddPeopleToGroup(modifier: Modifier = Modifier) {
    var nameInput by remember { mutableStateOf(TextFieldValue("")) }
    var namesList by rememberSaveable { mutableStateOf(mutableListOf<String>()) }

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        NameInput(nameInput) { nameInput = it }
        Spacer(modifier = Modifier.height(8.dp))
        AddNameButton {
            if (nameInput.text.isNotBlank()) {
                namesList.add(nameInput.text)
                nameInput = TextFieldValue("") // Clear the input field
            }
        }
        Spacer(modifier = Modifier.height(16.dp))
        PersonList(namesList)
    }
}

