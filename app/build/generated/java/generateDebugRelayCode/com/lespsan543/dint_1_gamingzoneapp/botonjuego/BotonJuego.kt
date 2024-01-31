package com.lespsan543.dint_1_gamingzoneapp.botonjuego

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.google.relay.compose.EmptyPainter
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayImage
import com.google.relay.compose.RelayText
import com.google.relay.compose.relayDropShadow
import com.google.relay.compose.tappable
import com.lespsan543.dint_1_gamingzoneapp.R

/**
 * BotonJuego
 *
 * This composable was generated from the UI Package 'boton_juego'.
 * Generated code; do not edit directly
 */
@Composable
fun BotonJuego(
    modifier: Modifier = Modifier,
    imagenJuego: Painter = EmptyPainter(),
    juego: String = "",
    botonJuego: () -> Unit = {}
) {
    TopLevel(
        botonJuego = botonJuego,
        modifier = modifier
    ) {
        Rectangle1(
            imagenJuego = imagenJuego,
            modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
        )
        KenaBridgeOfSpirits(
            juego = juego,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 3.5.dp
                )
            )
        )
    }
}

@Preview(widthDp = 360, heightDp = 129)
@Composable
private fun BotonJuegoPreview() {
    MaterialTheme {
        RelayContainer {
            BotonJuego(
                botonJuego = {},
                imagenJuego = painterResource(R.drawable.boton_juego_rectangle_1),
                juego = "Kena: Bridge of  Spirits",
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun Rectangle1(
    imagenJuego: Painter,
    modifier: Modifier = Modifier
) {
    RelayImage(
        image = imagenJuego,
        contentScale = ContentScale.Crop,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f).relayDropShadow(
            color = Color(
                alpha = 63,
                red = 0,
                green = 0,
                blue = 0
            ),
            borderRadius = 0.0.dp,
            blur = 4.0.dp,
            offsetX = 4.0.dp,
            offsetY = 4.0.dp,
            spread = 0.0.dp
        )
    )
}

@Composable
fun KenaBridgeOfSpirits(
    juego: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = juego,
        fontSize = 28.0.sp,
        fontFamily = inika,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.1428571319580079.em,
        maxLines = -1,
        modifier = modifier.requiredWidth(318.0.dp).requiredHeight(26.0.dp)
    )
}

@Composable
fun TopLevel(
    botonJuego: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.tappable(onTap = botonJuego).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}
