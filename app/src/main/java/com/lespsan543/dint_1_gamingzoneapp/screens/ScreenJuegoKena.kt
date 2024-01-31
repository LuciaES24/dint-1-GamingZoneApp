package com.lespsan543.dint_1_gamingzoneapp.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
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
fun PantallaKena(navController: NavHostController) {
    val localUri = LocalUriHandler.current
    Scaffold (
        topBar = {
            Cabecera(modifier = Modifier.height(110.dp),
                imagenJuego = painterResource(id = R.drawable.cabecera_principal),
                juego = "Kena: Bridge of Spirits",
                botonAtras = { navController.navigate(Routes.PantallaJuegos.route) })
        }
    ){
        Column(modifier = Modifier.background(Color(131,172,112)) .fillMaxSize()) {
            Text(text = "Kena es una guía espiritual cuya misión es ayudar a las almas de los difuntos a llegar al más allá, en un viaje repleto de saltos, puzles, combates y multitud de secretos esperando a ser encontrados por los jugadores más dedicados y curiosos. " +
                    "Durante la aventura encontrará ayuda\n" +
                    "en pequeñas\n" +
                    "criaturas\n" +
                    "llamadas Rots.",
                fontFamily = inika,
                fontSize = 25.sp,
                lineHeight = 35.sp,
                textAlign = TextAlign.Justify,
                modifier = Modifier.padding(top = 125.dp, start = 30.dp, end = 30.dp ))
            Disponible(modifier = Modifier
                .height(120.dp)
                .width(230.dp)
                .padding(top = 20.dp, start = 30.dp, end = 30.dp)
                .background(Color(105,141,89)),
                descargaSteam = {localUri.openUri("https://store.steampowered.com/app/1954200/Kena_Bridge_of_Spirits/")},
                descargaPs4 = { localUri.openUri("https://www.playstation.com/es-es/games/kena-bridge-of-spirits/") })
        }
        Image(painter = painterResource(id = R.drawable.kenapng), contentDescription = "Imagen Kena",
            alignment = Alignment.BottomEnd,
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .padding(top = 600.dp, start = 240.dp)
        )
    }
}