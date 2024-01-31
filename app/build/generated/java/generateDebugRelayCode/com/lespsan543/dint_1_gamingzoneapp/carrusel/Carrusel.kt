package com.lespsan543.dint_1_gamingzoneapp.carrusel

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerArrangement
import com.google.relay.compose.RelayContainerScope

/**
 * Carrusel de imagenes
 *
 * This composable was generated from the UI Package 'carrusel'.
 * Generated code; do not edit directly
 */
@Composable
fun Carrusel(modifier: Modifier = Modifier) {
    TopLevel(modifier = modifier) {
        Imagen1 {}
        Imagen2 {}
        Imagen3 {}
        Imagen4 {}
        Imagen5 {}
        Imagen6 {}
        Imagen7 {}
        Imagen8 {}
        Imagen9 {}
        Imagen10 {}
        Imagen11 {}
    }
}

@Preview(widthDp = 360, heightDp = 112)
@Composable
private fun CarruselPreview() {
    MaterialTheme {
        RelayContainer {
            Carrusel(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
    }
}

@Composable
fun Imagen1(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(
            start = 16.0.dp,
            top = 4.0.dp,
            end = 16.0.dp,
            bottom = 4.0.dp
        ),
        itemSpacing = 10.0,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(150.0.dp).requiredHeight(112.0.dp)
    )
}

@Composable
fun Imagen2(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(
            start = 9.0.dp,
            top = 4.0.dp,
            end = 9.0.dp,
            bottom = 4.0.dp
        ),
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(150.0.dp).requiredHeight(112.0.dp)
    )
}

@Composable
fun Imagen3(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(
            start = 16.0.dp,
            top = 4.0.dp,
            end = 16.0.dp,
            bottom = 4.0.dp
        ),
        itemSpacing = 10.0,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(150.0.dp).requiredHeight(112.0.dp)
    )
}

@Composable
fun Imagen4(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(
            start = 16.0.dp,
            top = 4.0.dp,
            end = 16.0.dp,
            bottom = 4.0.dp
        ),
        itemSpacing = 10.0,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(150.0.dp).requiredHeight(112.0.dp)
    )
}

@Composable
fun Imagen5(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(
            start = 16.0.dp,
            top = 4.0.dp,
            end = 16.0.dp,
            bottom = 4.0.dp
        ),
        itemSpacing = 10.0,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(150.0.dp).requiredHeight(112.0.dp)
    )
}

@Composable
fun Imagen6(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(
            start = 16.0.dp,
            top = 4.0.dp,
            end = 16.0.dp,
            bottom = 4.0.dp
        ),
        itemSpacing = 10.0,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(150.0.dp).requiredHeight(112.0.dp)
    )
}

@Composable
fun Imagen7(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(
            start = 16.0.dp,
            top = 4.0.dp,
            end = 16.0.dp,
            bottom = 4.0.dp
        ),
        itemSpacing = 10.0,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(150.0.dp).requiredHeight(112.0.dp)
    )
}

@Composable
fun Imagen8(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(
            start = 16.0.dp,
            top = 4.0.dp,
            end = 16.0.dp,
            bottom = 4.0.dp
        ),
        itemSpacing = 10.0,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(150.0.dp).requiredHeight(112.0.dp)
    )
}

@Composable
fun Imagen9(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(
            start = 16.0.dp,
            top = 4.0.dp,
            end = 16.0.dp,
            bottom = 4.0.dp
        ),
        itemSpacing = 10.0,
        clipToParent = false,
        content = content,
        modifier = modifier.background(Color.Transparent).drawWithContent(
            onDraw = {
                drawContent()
            }
        ).requiredWidth(150.0.dp).requiredHeight(112.0.dp)
    )
}

@Composable
fun Imagen10(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(
            start = 16.0.dp,
            top = 4.0.dp,
            end = 16.0.dp,
            bottom = 4.0.dp
        ),
        itemSpacing = 10.0,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(150.0.dp).requiredHeight(112.0.dp)
    )
}

@Composable
fun Imagen11(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(
            start = 16.0.dp,
            top = 4.0.dp,
            end = 16.0.dp,
            bottom = 4.0.dp
        ),
        itemSpacing = 10.0,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(150.0.dp).requiredHeight(112.0.dp)
    )
}

@Composable
fun TopLevel(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(
            start = 0.0.dp,
            top = 0.0.dp,
            end = 32.0.dp,
            bottom = 0.0.dp
        ),
        clipToParent = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}
