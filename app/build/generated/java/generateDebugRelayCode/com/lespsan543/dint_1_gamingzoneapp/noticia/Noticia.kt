package com.lespsan543.dint_1_gamingzoneapp.noticia

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
import com.google.relay.compose.tappable
import com.lespsan543.dint_1_gamingzoneapp.R

/**
 * Noticia
 *
 * This composable was generated from the UI Package 'noticia'.
 * Generated code; do not edit directly
 */
@Composable
fun Noticia(
    modifier: Modifier = Modifier,
    imagenNoticia: Painter = EmptyPainter(),
    tituloNoticia: String = "",
    clickNoticia: () -> Unit = {}
) {
    TopLevel(
        clickNoticia = clickNoticia,
        modifier = modifier
    ) {
        Noticia1(
            imagenNoticia = imagenNoticia,
            modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
        )
        Noticia1Titulo(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -2.0.dp,
                    y = 34.0.dp
                )
            )
        ) {
            Juegos2023(
                tituloNoticia = tituloNoticia,
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = -4.0.dp
                    )
                )
            )
        }
    }
}

@Preview(widthDp = 180, heightDp = 122)
@Composable
private fun NoticiaPreview() {
    MaterialTheme {
        RelayContainer {
            Noticia(
                clickNoticia = {},
                imagenNoticia = painterResource(R.drawable.noticia_noticia1),
                tituloNoticia = "Juegos 2023",
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun Noticia1(
    imagenNoticia: Painter,
    modifier: Modifier = Modifier
) {
    RelayImage(
        image = imagenNoticia,
        contentScale = ContentScale.Crop,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Juegos2023(
    tituloNoticia: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = tituloNoticia,
        fontSize = 18.0.sp,
        fontFamily = inika,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.7777777099609375.em,
        maxLines = -1,
        modifier = modifier.requiredWidth(104.0.dp).requiredHeight(28.0.dp)
    )
}

@Composable
fun Noticia1Titulo(
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
        modifier = modifier.requiredWidth(112.0.dp).requiredHeight(28.0.dp)
    )
}

@Composable
fun TopLevel(
    clickNoticia: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.tappable(onTap = clickNoticia).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}
