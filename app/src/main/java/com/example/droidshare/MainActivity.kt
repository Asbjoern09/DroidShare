package com.example.droidshare

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.droidshare.ui.theme.DroidShareTheme
import com.example.droidshare.components.AddPeopleToGroup

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DroidShareTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    AddPeopleToGroup(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}
