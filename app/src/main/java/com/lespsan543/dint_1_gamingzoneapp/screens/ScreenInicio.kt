package com.lespsan543.dint_1_gamingzoneapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.lespsan543.dint_1_gamingzoneapp.R
import com.lespsan543.dint_1_gamingzoneapp.botonkena.inika
import com.lespsan543.dint_1_gamingzoneapp.datos.Datos
import com.lespsan543.dint_1_gamingzoneapp.google.Google
import com.lespsan543.dint_1_gamingzoneapp.model.Routes

@Composable
fun PantallaIncio(navController: NavHostController){
    Column(modifier = Modifier
        .fillMaxSize()
        .background((Color(135, 113, 157))),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
        Image(painter = painterResource(id = R.drawable.logo), contentDescription = "Logo",
            modifier = Modifier
                .height(150.dp)
                .width(150.dp))
        Spacer(modifier = Modifier.height(10.dp))
        Box(modifier = Modifier
            .background(Color(78, 54, 84))
            .height(400.dp)
            .width(250.dp)) {
            Column {
                Text(text = "Crea una cuenta",
                    fontFamily = inika,
                    fontSize = 20.sp,
                    textAlign = TextAlign.Center,
                    color = Color.White,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 30.dp, bottom = 10.dp))
                Spacer(modifier = Modifier.height(10.dp))
                Datos(texto = "Escribe tu email ...", modifier = Modifier
                    .height(25.dp)
                    .padding(start = 20.dp, end = 20.dp))
                Spacer(modifier = Modifier.height(20.dp))
                Datos(texto = "Escribe un nombre ...", modifier = Modifier
                    .height(25.dp)
                    .padding(start = 20.dp, end = 20.dp))
                Spacer(modifier = Modifier.height(20.dp))
                Datos(texto = "Escribe una contraseña ...", modifier = Modifier
                    .height(25.dp)
                    .padding(start = 20.dp, end = 20.dp))
                Spacer(modifier = Modifier.height(20.dp))
                Button(onClick = { navController.navigate(Routes.PantallaMenu.route) },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.White,
                        contentColor = Color.Black),
                    modifier = Modifier
                        .height(35.dp)
                        .padding(start = 60.dp)) {
                    Text(text = "Crear cuenta",
                        fontFamily = inika
                    )
                }
                Text(text = "o",
                    fontFamily = inika,
                    fontSize = 20.sp,
                    textAlign = TextAlign.Center,
                    color = Color.White,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 20.dp, bottom = 10.dp))
                Spacer(modifier = Modifier.height(10.dp))
                Google(modifier = Modifier.height(25.dp) .padding(start = 20.dp, end = 20.dp),
                    click = { navController.navigate(Routes.PantallaMenu.route) })
            }
        }
    }
}