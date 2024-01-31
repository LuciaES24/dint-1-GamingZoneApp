package com.lespsan543.dint_1_gamingzoneapp.disponible

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.wrapContentHeight
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
import com.google.relay.compose.tappable
import com.lespsan543.dint_1_gamingzoneapp.R

/**
 * Cartel de disponible
 *
 * This composable was generated from the UI Package 'disponible'.
 * Generated code; do not edit directly
 */
@Composable
fun Disponible(
    modifier: Modifier = Modifier,
    descargaSteam: () -> Unit = {},
    descargaPs4: () -> Unit = {}
) {
    TopLevel(modifier = modifier) {
        DisponiblePara(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 8.0.dp,
                    y = 10.0.dp
                )
            )
        )
        DescargaSteam(
            descargaSteam = descargaSteam,
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 13.0.dp,
                    y = 50.0.dp
                )
            )
        )
        Ps4TheLastGuardian(
            descargaPs4 = descargaPs4,
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 47.0.dp,
                    y = 52.0.dp
                )
            )
        )
    }
}

@Preview(widthDp = 152, heightDp = 96)
@Composable
private fun DisponiblePreview() {
    MaterialTheme {
        RelayContainer {
            Disponible(
                descargaSteam = {},
                descargaPs4 = {},
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun DisponiblePara(modifier: Modifier = Modifier) {
    RelayText(
        content = "Disponible para:",
        fontSize = 18.0.sp,
        fontFamily = inika,
        color = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.7777777099609375.em,
        textAlign = TextAlign.Left,
        underline = true,
        maxLines = -1,
        modifier = modifier.requiredWidth(136.0.dp).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun DescargaSteam(
    descargaSteam: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayImage(
        image = painterResource(R.drawable.disponible_descarga_steam),
        contentScale = ContentScale.Crop,
        modifier = modifier.tappable(onTap = descargaSteam).requiredWidth(28.0.dp).requiredHeight(28.0.dp)
    )
}

@Composable
fun Ps4TheLastGuardian(
    descargaPs4: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayImage(
        image = painterResource(R.drawable.disponible_ps4the_last_guardian),
        contentScale = ContentScale.Crop,
        modifier = modifier.tappable(onTap = descargaPs4).requiredWidth(97.0.dp).requiredHeight(23.0.dp)
    )
}

@Composable
fun TopLevel(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        strokeWidth = 1.0,
        strokeColor = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}
