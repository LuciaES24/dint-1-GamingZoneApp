package com.lespsan543.dint_1_gamingzoneapp.cabecerainicio

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayText

/**
 * Cabecera de las pantallas
 *
 * This composable was generated from the UI Package 'cabecera_inicio'.
 * Generated code; do not edit directly
 */
@Composable
fun CabeceraInicio(
    modifier: Modifier = Modifier,
    texto: String = ""
) {
    TopLevel(modifier = modifier) {
        Inicio(
            texto = texto,
            modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
        )
    }
}

@Preview(widthDp = 360, heightDp = 72)
@Composable
private fun CabeceraInicioPreview() {
    MaterialTheme {
        RelayContainer {
            CabeceraInicio(
                texto = "Inicio",
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun Inicio(
    texto: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = texto,
        fontSize = 32.0.sp,
        fontFamily = inika,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        maxLines = -1,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun TopLevel(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 77,
            green = 53,
            blue = 83
        ),
        isStructured = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}
