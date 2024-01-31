package com.lespsan543.dint_1_gamingzoneapp.textfield

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayText

/**
 * This composable was generated from the UI Package 'text_field'.
 * Generated code; do not edit directly
 */
@Composable
fun TextField(
    modifier: Modifier = Modifier,
    texto: String = ""
) {
    TopLevel(modifier = modifier) {
        EscribeTuEmail(
            texto = texto,
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 7.0.dp,
                    y = -4.0.dp
                )
            )
        )
    }
}

@Preview(widthDp = 205, heightDp = 25)
@Composable
private fun TextFieldPreview() {
    MaterialTheme {
        RelayContainer {
            TextField(
                texto = "Escribe tu email ...",
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun EscribeTuEmail(
    texto: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = texto,
        fontSize = 10.0.sp,
        fontFamily = inika,
        color = Color(
            alpha = 153,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 3.2.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.requiredWidth(155.0.dp).requiredHeight(24.0.dp)
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
            red = 178,
            green = 178,
            blue = 178
        ),
        isStructured = false,
        radius = 11.0,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}
