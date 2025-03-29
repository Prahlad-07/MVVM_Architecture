package com.example.mvvm_architecture

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import com.example.mvvm_architecture.ui.theme.MVVM_ArchitectureTheme
import com.example.mvvm_architecture.view.HomePage
import com.example.mvvm_architecture.viewmodel.HomeViewModel

class MainActivity : ComponentActivity() {
    private val homeViewModel: HomeViewModel by viewModels() // ✅ Fixed ViewModel Initialization

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MVVM_ArchitectureTheme {
                HomePage(modifier = Modifier, homeViewModel) // ✅ Removed innerPadding (not defined)
            }
        }
    }
}
