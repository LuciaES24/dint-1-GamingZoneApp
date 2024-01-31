package com.lespsan543.dint_1_gamingzoneapp.screens

import android.annotation.SuppressLint
import android.widget.Toast
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
import androidx.compose.ui.platform.LocalContext
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
fun PantallaTLG(navController: NavHostController) {
    val context = LocalContext.current
    val localUri = LocalUriHandler.current
    Scaffold (
        topBar = {
            Cabecera(modifier = Modifier.height(110.dp),
                imagenJuego = painterResource(id = R.drawable.botontlg),
                juego = "The Last Guardian",
                botonAtras = { navController.navigate(Routes.PantallaJuegos.route) })
        }
    ){
        Column(modifier = Modifier.background(Color(171,170,155)) .fillMaxSize()) {
            Text(text = "The Last Guardian es una historia de amistad y aventura entre el chico, el cual controlaremos, y Trico, una criatura con mezclas de ave y felino, muy temido por los humanos. Estos desarrollarán una gran amistad gracias al trabajo en equipo que deberán hacer para salir de todos los \n" +
                    "escenarios que se nos \n" +
                    "presentan a lo largo de\n" +
                    "la historia.",
                fontFamily = inika,
                fontSize = 25.sp,
                lineHeight = 35.sp,
                textAlign = TextAlign.Justify,
                modifier = Modifier.padding(top = 125.dp, start = 30.dp, end = 30.dp ))
            Disponible(modifier = Modifier
                .height(120.dp)
                .width(230.dp)
                .padding(top = 20.dp, start = 30.dp, end = 30.dp)
                .background(Color(145, 144, 126)),
                descargaSteam = { Toast.makeText( context,"No está disponible en Steam", Toast.LENGTH_SHORT).show()},
                descargaPs4 = { localUri.openUri("https://store.playstation.com/es-es/product/EP9000-CUSA03745_00-LASTGUARDIANEU00") })
        }
        Image(painter = painterResource(id = R.drawable.trico), contentDescription = "Imagen Trico",
            alignment = Alignment.BottomEnd,
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .padding(top = 600.dp, start = 240.dp)
        )
    }
}