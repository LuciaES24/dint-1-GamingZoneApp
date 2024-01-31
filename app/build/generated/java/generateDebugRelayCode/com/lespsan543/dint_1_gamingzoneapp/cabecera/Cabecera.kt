package com.lespsan543.dint_1_gamingzoneapp.cabecera

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.google.relay.compose.EmptyPainter
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerArrangement
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayImage
import com.google.relay.compose.RelayText
import com.google.relay.compose.RelayVector
import com.google.relay.compose.tappable
import com.lespsan543.dint_1_gamingzoneapp.R

/**
 * Cabecera juegos
 *
 * This composable was generated from the UI Package 'cabecera'.
 * Generated code; do not edit directly
 */
@Composable
fun Cabecera(
    modifier: Modifier = Modifier,
    imagenJuego: Painter = EmptyPainter(),
    juego: String = "",
    botonAtras: () -> Unit = {}
) {
    TopLevel(modifier = modifier) {
        Principal(
            imagenJuego = imagenJuego,
            modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
        )
        Line1(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 110.5.dp
                )
            )
        )
        Container {
            StateLayer(botonAtras = botonAtras) {
                IconsArrowBack24px {
                    Icon(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                }
            }
        }
        KenaBridgeOfSpirits(
            juego = juego,
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 12.0.dp,
                    y = 56.0.dp
                )
            )
        )
    }
}

@Preview(widthDp = 360, heightDp = 112)
@Composable
private fun CabeceraPreview() {
    MaterialTheme {
        RelayContainer {
            Cabecera(
                imagenJuego = painterResource(R.drawable.cabecera_principal),
                juego = "Kena: Bridge of  Spirits",
                botonAtras = {},
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun Principal(
    imagenJuego: Painter,
    modifier: Modifier = Modifier
) {
    RelayImage(
        image = imagenJuego,
        contentScale = ContentScale.Crop,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Line1(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.cabecera_line_1),
        modifier = modifier.requiredWidth(360.00555419921875.dp).requiredHeight(0.0.dp)
    )
}

@Composable
fun Icon(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.cabecera_icon),
        modifier = modifier.padding(paddingValues = PaddingValues(all = 4.0.dp)).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun IconsArrowBack24px(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(24.0.dp).requiredHeight(24.0.dp)
    )
}

@Composable
fun StateLayer(
    botonAtras: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(all = 8.0.dp),
        itemSpacing = 10.0,
        clipToParent = false,
        content = content,
        modifier = modifier.tappable(onTap = botonAtras)
    )
}

@Composable
fun Container(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        arrangement = RelayContainerArrangement.Row,
        itemSpacing = 10.0,
        radius = 100.0,
        content = content,
        modifier = modifier
    )
}

@Composable
fun KenaBridgeOfSpirits(
    juego: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = juego,
        fontSize = 24.0.sp,
        fontFamily = inika,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.3333332824707032.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.requiredWidth(276.0.dp).requiredHeight(32.0.dp)
    )
}

@Composable
fun TopLevel(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}
