package com.dlight.algoguide.algorithms.sorting.insertion_sort.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun VisualizerSection(
    modifier: Modifier = Modifier,
    arr: IntArray
) {
    BoxWithConstraints(modifier = modifier) {
        val maxHeight = maxHeight - 75.dp
        val itemWidth = remember {
            maxWidth / arr.size - 5.dp
        }

        Row(
            modifier = modifier,
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.Bottom
        ) {
            arr.forEach {
                Box(
                    modifier = modifier
                        .height(if (it.dp > maxHeight) maxHeight else it.dp)
                        .width(itemWidth)
                        .background(MaterialTheme.colors.primary)
                )
            }
        }
    }
}