package com.lespsan543.dint_1_gamingzoneapp.google

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayImage
import com.google.relay.compose.RelayText
import com.lespsan543.dint_1_gamingzoneapp.R

/**
 * BotonGoogle
 *
 * This composable was generated from the UI Package 'google'.
 * Generated code; do not edit directly
 */
@Composable
fun Google(modifier: Modifier = Modifier) {
    TopLevel(modifier = modifier) {
        Rectangle6(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 4.0.dp,
                    y = 2.0.dp
                )
            )
        )
        ContinuarConGoogle(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 32.0.dp,
                    y = -3.0.dp
                )
            )
        )
    }
}

@Preview(widthDp = 205, heightDp = 25)
@Composable
private fun GooglePreview() {
    MaterialTheme {
        RelayContainer {
            Google(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
    }
}

@Composable
fun Rectangle6(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.google_rectangle_6),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(21.0.dp).requiredHeight(21.0.dp)
    )
}

@Composable
fun ContinuarConGoogle(modifier: Modifier = Modifier) {
    RelayText(
        content = "Continuar con Google",
        fontSize = 12.0.sp,
        fontFamily = inika,
        color = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 2.6666665649414063.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.requiredWidth(166.0.dp).requiredHeight(16.0.dp)
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
            red = 255,
            green = 255,
            blue = 255
        ),
        isStructured = false,
        radius = 11.0,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}
