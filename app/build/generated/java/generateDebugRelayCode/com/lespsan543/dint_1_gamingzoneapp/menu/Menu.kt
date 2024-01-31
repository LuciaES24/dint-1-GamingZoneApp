package com.lespsan543.dint_1_gamingzoneapp.menu

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
import com.google.relay.compose.EmptyPainter
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayImage
import com.google.relay.compose.tappable
import com.lespsan543.dint_1_gamingzoneapp.R

/**
 * Menu
 *
 * This composable was generated from the UI Package 'menu'.
 * Generated code; do not edit directly
 */
@Composable
fun Menu(
    modifier: Modifier = Modifier,
    imagenHome: Painter = EmptyPainter(),
    imagenJuego: Painter = EmptyPainter(),
    imagenPerfil: Painter = EmptyPainter(),
    clickHome: () -> Unit = {},
    clickJuego: () -> Unit = {},
    clickPerfil: () -> Unit = {}
) {
    TopLevel(modifier = modifier) {
        Rectangle24(
            clickHome = clickHome,
            imagenHome = imagenHome,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -136.0.dp,
                    y = 0.0.dp
                )
            )
        )
        Rectangle25(
            clickJuego = clickJuego,
            imagenJuego = imagenJuego,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = -0.5.dp
                )
            )
        )
        Rectangle26(
            clickPerfil = clickPerfil,
            imagenPerfil = imagenPerfil,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 135.0.dp,
                    y = -1.5.dp
                )
            )
        )
    }
}

@Preview(widthDp = 360, heightDp = 56)
@Composable
private fun MenuPreview() {
    MaterialTheme {
        RelayContainer {
            Menu(
                imagenHome = painterResource(R.drawable.menu_rectangle_24),
                clickHome = {},
                imagenJuego = painterResource(R.drawable.menu_rectangle_25),
                clickJuego = {},
                imagenPerfil = painterResource(R.drawable.menu_rectangle_26),
                clickPerfil = {},
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun Rectangle24(
    clickHome: () -> Unit,
    imagenHome: Painter,
    modifier: Modifier = Modifier
) {
    RelayImage(
        image = imagenHome,
        contentScale = ContentScale.Crop,
        modifier = modifier.tappable(onTap = clickHome).requiredWidth(34.0.dp).requiredHeight(32.0.dp)
    )
}

@Composable
fun Rectangle25(
    clickJuego: () -> Unit,
    imagenJuego: Painter,
    modifier: Modifier = Modifier
) {
    RelayImage(
        image = imagenJuego,
        contentScale = ContentScale.Crop,
        modifier = modifier.tappable(onTap = clickJuego).requiredWidth(40.0.dp).requiredHeight(29.0.dp)
    )
}

@Composable
fun Rectangle26(
    clickPerfil: () -> Unit,
    imagenPerfil: Painter,
    modifier: Modifier = Modifier
) {
    RelayImage(
        image = imagenPerfil,
        contentScale = ContentScale.Crop,
        modifier = modifier.tappable(onTap = clickPerfil).requiredWidth(32.0.dp).requiredHeight(31.0.dp)
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
