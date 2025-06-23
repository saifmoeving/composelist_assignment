package com.moeving.codevyasa.data.repository

import com.moeving.codevyasa.domain.model.Coin


object FakeCoinRepository {
    fun getCoins(): List<Coin> {
        return listOf(
            Coin("Silver", 30000.0),
            Coin("Gold", 1800.0),
            Coin("Platinum", 150.0)
        )
    }
}
