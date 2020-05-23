package co.joebirch.composeplayground.resource

import androidx.compose.Composable
import androidx.ui.core.Alignment
import androidx.ui.core.Modifier
import androidx.ui.foundation.Image
import androidx.ui.foundation.Text
import androidx.ui.layout.*
import androidx.ui.res.*
import androidx.ui.unit.dp
import co.joebirch.composeplayground.ComposableLayout
import co.joebirch.composeplayground.R

object StringResourceView : ComposableLayout {

    @Composable
    override fun build() {
        Column(
            modifier = Modifier.fillMaxSize().padding(32.dp),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalGravity = Alignment.CenterHorizontally
        ) {
            Text(text = stringResource(id = R.string.app_name),
                modifier = Modifier.padding(16.dp))
            Text(text = stringResource(id = R.string.app_name_formatting,
                formatArgs = *arrayOf(stringResource(id = R.string.app_name))),
                modifier = Modifier.padding(16.dp))
            stringArrayResource(id = R.array.sample_array).forEach {
                Text(text = it,
                    modifier = Modifier.padding(16.dp))
            }
        }
    }

}