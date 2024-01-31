package com.lespsan543.dint_1_gamingzoneapp.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.google.relay.compose.BoxScopeInstanceImpl.align
import com.lespsan543.dint_1_gamingzoneapp.R
import com.lespsan543.dint_1_gamingzoneapp.botonkena.inika
import com.lespsan543.dint_1_gamingzoneapp.cabecera.Cabecera
import com.lespsan543.dint_1_gamingzoneapp.disponible.Disponible
import com.lespsan543.dint_1_gamingzoneapp.model.Routes

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
@OptIn(ExperimentalMaterial3Api::class)
fun PantallaHorizon(navController: NavHostController) {
    val localUri = LocalUriHandler.current
    Scaffold (
        topBar = {
            Cabecera(modifier = Modifier.height(110.dp),
                imagenJuego = painterResource(id = R.drawable.botonhorizon),
                juego = "Horizon: Zero Down",
                botonAtras = { navController.navigate(Routes.PantallaJuegos.route) })
        }
    ){
        Column(modifier = Modifier.background(Color(79,161,174)) .fillMaxSize()) {
            Text(text = "Horizon: Zero Down se ambienta en un mundo postapocalíptico plagado de máquinas peligrosas, donde Aloy, nuestra protagonista, es desterrada al nacer y es cuidada por Rost. A medida que va creciendo, su interés por conocer a su madre y por saber más sobre el mundo antiguo, la\nllevarán a\n" +
                    "numerosas \n" +
                    "aventuras.",
                fontFamily = inika,
                fontSize = 25.sp,
                lineHeight = 35.sp,
                textAlign = TextAlign.Justify,
                modifier = Modifier.padding(top = 125.dp, start = 30.dp, end = 30.dp ))
            Disponible(modifier = Modifier
                .height(120.dp)
                .width(230.dp)
                .padding(top = 20.dp, start = 30.dp, end = 30.dp)
                .background(Color(59,129,133)),
                descargaSteam = { localUri.openUri("https://store.steampowered.com/app/1151640/Horizon_Zero_Dawn_Complete_Edition/") },
                descargaPs4 = { localUri.openUri("https://www.playstation.com/es-es/games/horizon-zero-dawn/") })
        }
        Image(painter = painterResource(id = R.drawable.horizon), contentDescription = "Imagen Aloy",
            alignment = Alignment.BottomEnd,
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .padding(top = 460.dp, start = 180.dp)
                .size(400.dp)
        )
    }
}