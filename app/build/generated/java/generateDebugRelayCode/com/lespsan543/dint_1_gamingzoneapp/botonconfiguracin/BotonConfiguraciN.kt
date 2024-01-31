package com.lespsan543.dint_1_gamingzoneapp.botonconfiguracin

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayText
import com.google.relay.compose.RelayVector
import com.lespsan543.dint_1_gamingzoneapp.R

/**
 * BotonConfig
 *
 * This composable was generated from the UI Package 'boton_configuraci_n'.
 * Generated code; do not edit directly
 */
@Composable
fun BotonConfiguraciN(modifier: Modifier = Modifier) {
    TopLevel(modifier = modifier) {
        Rectangle3(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        TusJuegosFavoritos(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
    }
}

@Preview(widthDp = 265, heightDp = 32)
@Composable
private fun BotonConfiguraciNPreview() {
    MaterialTheme {
        RelayContainer {
            BotonConfiguraciN(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
    }
}

@Composable
fun Rectangle3(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.boton_configuraci_n_rectangle_3),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 0.0.dp,
                top = 4.5714263916015625.dp,
                end = 0.0.dp,
                bottom = 0.0000019073486328125.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun TusJuegosFavoritos(modifier: Modifier = Modifier) {
    RelayText(
        content = "Tus juegos favoritos",
        fontFamily = inika,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 2.5714285278320315.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 13.0.dp,
                top = 0.0.dp,
                end = 48.93486022949219.dp,
                bottom = 13.714284896850586.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun TopLevel(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}
