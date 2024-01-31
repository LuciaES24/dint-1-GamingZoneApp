package com.lespsan543.dint_1_gamingzoneapp.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.lespsan543.dint_1_gamingzoneapp.R
import com.lespsan543.dint_1_gamingzoneapp.botonkena.inika
import com.lespsan543.dint_1_gamingzoneapp.cabecerainicio.CabeceraInicio
import com.lespsan543.dint_1_gamingzoneapp.menu.Menu
import com.lespsan543.dint_1_gamingzoneapp.model.Routes

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
@OptIn(ExperimentalMaterial3Api::class)
fun PantallaPerfil(navController : NavController){
    Scaffold(topBar = {
        CabeceraInicio(modifier = Modifier.height(90.dp), texto = "Perfil")
    },
        bottomBar = {
            Menu(imagenJuego = painterResource(id = R.drawable.games2),
                clickJuego = { navController.navigate(Routes.PantallaJuegos.route) },
                imagenHome = painterResource(id = R.drawable.home2),
                clickHome = { navController.navigate(Routes.PantallaMenu.route) },
                imagenPerfil = painterResource(id = R.drawable.menu_rectangle_26),
                clickPerfil = { navController.navigate(Routes.PantallaPerfil.route) },
                modifier = Modifier.height(70.dp))
        }) {
        Column(modifier = Modifier
            .fillMaxSize()
            .padding(top = 93.dp)
            .background((Color(135, 113, 157))),
            horizontalAlignment = Alignment.CenterHorizontally) {
            Image(painter = painterResource(id = R.drawable.rot),
                contentDescription = "Imagen Rot",
                modifier = Modifier.height(170.dp) .width(150.dp) .padding(top = 20.dp))
            Text(text = "Rot",
                fontFamily = inika,
                fontSize = 25.sp,
                textAlign = TextAlign.Center,
                color = Color.White,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 20.dp, bottom = 5.dp))
            Text(text = "Mejor criatura del\n" +
                    "mundo de los videojuegos",
                fontFamily = inika,
                fontSize = 20.sp,
                textAlign = TextAlign.Center,
                color = Color.White,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 5.dp, bottom = 10.dp))
            Spacer(modifier = Modifier.height(10.dp))
            Button(onClick = { navController.navigate(Routes.PantallaPerfil.route) },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.White,
                    contentColor = Color.Black),
                modifier = Modifier.height(35.dp)) {
                Text(text = "Editar perfil",
                    fontFamily = inika
                )
            }
            Spacer(modifier = Modifier.height(50.dp))
            Button(onClick = { navController.navigate(Routes.PantallaPerfil.route) },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(78,54,84),
                    contentColor = Color.White),
                modifier = Modifier.width(300.dp) .height(35.dp)) {
                Text(text = "Tus juegos favoritos",
                    fontFamily = inika,
                    modifier = Modifier.padding(end = 120.dp)
                )
            }
            Spacer(modifier = Modifier.height(50.dp))
            Button(onClick = { navController.navigate(Routes.PantallaInicio.route) },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(78,54,84),
                    contentColor = Color.White),
                modifier = Modifier.width(300.dp) .height(35.dp)) {
                Text(text = "Cerrar sesión",
                    fontFamily = inika,
                    modifier = Modifier.padding(end = 150.dp)
                )
            }
            Spacer(modifier = Modifier.height(50.dp))
            Button(onClick = { navController.navigate(Routes.PantallaInicio.route) },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(78,54,84),
                    contentColor = Color.Red),
                modifier = Modifier.width(300.dp) .height(35.dp)) {
                Text(text = "Eliminar cuenta",
                    fontFamily = inika,
                    modifier = Modifier.padding(end = 135.dp)
                )
            }
        }
    }
}