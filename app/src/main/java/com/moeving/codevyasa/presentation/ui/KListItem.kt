package com.moeving.codevyasa.presentation.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.moeving.codevyasa.domain.model.Coin


@Composable
fun KListItem(
    coin: Coin,
    onClick: (Coin) -> Unit // 💡 Now accepts a Coin
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onClick(coin) } // 👉 Pass the coin
            .padding(8.dp)
    ) {
        Text(text = coin.name, modifier = Modifier.weight(1f))
        Text(text = "$${coin.price}")
    }
}


