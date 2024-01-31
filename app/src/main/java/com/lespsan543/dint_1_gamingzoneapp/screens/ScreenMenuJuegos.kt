package com.lespsan543.dint_1_gamingzoneapp.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.lespsan543.dint_1_gamingzoneapp.R
import com.lespsan543.dint_1_gamingzoneapp.botonjuego.BotonJuego
import com.lespsan543.dint_1_gamingzoneapp.cabecerainicio.CabeceraInicio
import com.lespsan543.dint_1_gamingzoneapp.menu.Menu
import com.lespsan543.dint_1_gamingzoneapp.model.Routes

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
@OptIn(ExperimentalMaterial3Api::class)
fun PantallaMenuJuegos(navController : NavController){
    Scaffold(topBar = {
        CabeceraInicio(modifier = Modifier.height(90.dp), texto = "Juegos")
    },
        bottomBar = {
            Menu(imagenJuego = painterResource(id = R.drawable.menu_rectangle_25),
                clickJuego = { navController.navigate(Routes.PantallaJuegos.route) },
                imagenHome = painterResource(id = R.drawable.home2),
                clickHome = { navController.navigate(Routes.PantallaMenu.route) },
                imagenPerfil = painterResource(id = R.drawable.perfil2),
                clickPerfil = { navController.navigate(Routes.PantallaPerfil.route) },
                modifier = Modifier.height(70.dp))
        }) {
        Column(modifier = Modifier
            .fillMaxSize()
            .padding(top = 93.dp)) {
            BotonJuego(imagenJuego = painterResource(id = R.drawable.boton_juego_rectangle_1),
                botonJuego = { navController.navigate(Routes.PantallaKena.route) },
                juego = "Kena: Bridge of Spirits",
                modifier = Modifier.height(164.dp))
            BotonJuego(imagenJuego = painterResource(id = R.drawable.botontlg),
                botonJuego = { navController.navigate(Routes.PantallaTLG.route) },
                juego = "The Last Guardian",
                modifier = Modifier.height(164.dp))
            BotonJuego(imagenJuego = painterResource(id = R.drawable.botonstray),
                botonJuego = { navController.navigate(Routes.PantallaStray.route) },
                juego = "Stray",
                modifier = Modifier.height(164.dp))
            BotonJuego(imagenJuego = painterResource(id = R.drawable.botonhorizon),
                botonJuego = { navController.navigate(Routes.PantallaHorizon.route) },
                juego = "Horizon: Zero Down",
                modifier = Modifier.height(164.dp))
        }
    }
}