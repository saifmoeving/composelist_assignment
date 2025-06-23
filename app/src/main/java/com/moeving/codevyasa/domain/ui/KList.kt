package com.moeving.codevyasa.domain.ui

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.material.*

class KList<T> private constructor() {
    private var padding: Dp = 0.dp
    private var headerTitle: String? = null
    private var items: List<T> = emptyList()
    private var itemContent: @Composable (T) -> Unit = {}

    fun padding(padding: Dp): KList<T> {
        this.padding = padding
        return this
    }

    fun header(title: String): KList<T> {
        this.headerTitle = title
        return this
    }

    fun items(items: List<T>, content: @Composable (T) -> Unit): KList<T> {
        this.items = items
        this.itemContent = content
        return this
    }

    @Composable
    fun render() {
        LazyColumn(modifier = Modifier.padding(padding)) {
            headerTitle?.let {
                item {
                    Text(
                        text = it,
                        style = MaterialTheme.typography.bodyLarge,
                        modifier = Modifier.padding(bottom = 8.dp)
                    )
                }
            }
            items(items) { item ->
                itemContent(item)
            }
        }
    }

    companion object {
        fun <T> create(): KList<T> = KList()
    }
}
