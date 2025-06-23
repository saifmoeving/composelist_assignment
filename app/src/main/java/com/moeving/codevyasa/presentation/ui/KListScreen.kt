package com.moeving.codevyasa.presentation.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.moeving.codevyasa.domain.model.Coin
import com.moeving.codevyasa.domain.ui.KList


@Composable
fun KListScreen(coins: List<Coin>, s: String, dp: Dp) {
    var selectedCoinName by remember { mutableStateOf<String?>(null) }

    Column {
        selectedCoinName?.let {
            Text(
                text = "Selected: $it",
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.padding(16.dp)
            )
        }

        KList.create<Coin>()
            .padding(16.dp)
            .header("Top Gainers")
            .items(coins) { coin ->
                KListItem(
                    coin = coin,
                    onClick = { selectedCoinName = it.name }
                )
            }
            .render()
    }
}

