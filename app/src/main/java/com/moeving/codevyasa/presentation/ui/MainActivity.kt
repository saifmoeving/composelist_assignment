package com.moeving.codevyasa.presentation.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.moeving.codevyasa.data.repository.FakeCoinRepository

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PreviewKListScreen()
        }
    }
}

@Preview
@Composable
fun PreviewKListScreen() {
    val coins = FakeCoinRepository.getCoins()
    KListScreen(coins,"Top Gainer",20.dp)
}
