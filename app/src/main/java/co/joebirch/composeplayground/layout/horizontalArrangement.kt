package co.joebirch.composeplayground.layout

import androidx.compose.Composable
import androidx.compose.state
import androidx.ui.core.Alignment
import androidx.ui.core.Modifier
import androidx.ui.foundation.Text
import androidx.ui.layout.*
import androidx.ui.material.Button
import androidx.ui.unit.dp
import co.joebirch.composeplayground.ComposableLayout

object HorizontalArrangementView : ComposableLayout {

    private val options = listOf(
        Arrangement.Center, Arrangement.Start, Arrangement.End,
        Arrangement.SpaceEvenly, Arrangement.SpaceAround, Arrangement.SpaceBetween
    )

    @Composable
    override fun build() {
        val state = state { 0 }

        Row(
            modifier = Modifier.fillMaxSize().padding(32.dp),
            horizontalArrangement = options[state.value],
            verticalGravity = Alignment.CenterVertically
        ) {
            Text(text = options[state.value].javaClass.simpleName)
            Button(
                onClick = {
                    if (state.value < options.size - 1) {
                        state.value = state.value + 1
                    } else {
                        state.value = 0
                    }
                },
                modifier = Modifier.padding(16.dp)
            ) {
                Text(text = "Change")
            }
        }
    }
}