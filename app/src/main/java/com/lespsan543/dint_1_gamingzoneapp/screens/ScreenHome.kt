package com.lespsan543.dint_1_gamingzoneapp.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalUriHandler
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
import com.lespsan543.dint_1_gamingzoneapp.noticia.Noticia

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
@OptIn(ExperimentalMaterial3Api::class)
fun PantallaMenu(navController : NavController){
    val localUri = LocalUriHandler.current
    Scaffold(topBar = {
        CabeceraInicio(modifier = Modifier.height(90.dp), texto = "Inicio")
    },
        bottomBar = {
            Menu(imagenJuego = painterResource(id = R.drawable.games2),
                clickJuego = { navController.navigate(Routes.PantallaJuegos.route) },
                imagenHome = painterResource(id = R.drawable.menu_rectangle_24),
                clickHome = { navController.navigate(Routes.PantallaMenu.route) },
                imagenPerfil = painterResource(id = R.drawable.perfil2),
                clickPerfil = { navController.navigate(Routes.PantallaPerfil.route) },
                modifier = Modifier.height(70.dp))
        }) {
        Column(modifier = Modifier
            .fillMaxSize()
            .padding(top = 93.dp)
            .background(Color(135, 113, 157))) {
            Text(text = "Últimas noticias de videojuegos",
                fontFamily = inika,
                fontSize = 25.sp,
                textAlign = TextAlign.Center,
                color = Color.White,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 40.dp, bottom = 20.dp))
            Row {
                Noticia(imagenNoticia = painterResource(id = R.drawable.noticia_noticia1),
                    tituloNoticia = "Juegos 2023",
                    modifier = Modifier.height(155.dp).width(200.dp),
                    clickNoticia = {localUri.openUri("https://vandal.elespanol.com/reportaje/los-videojuegos-que-vienen-en-2023") })
                Noticia(imagenNoticia = painterResource(id = R.drawable.noticia2),
                    tituloNoticia = "Juegos 2024",
                    modifier = Modifier.height(155.dp),
                    clickNoticia = {localUri.openUri("https://earlygame.com/es/gaming/videojuegos-2024") })
            }
            Row {
                Noticia(imagenNoticia = painterResource(id = R.drawable.noticia3),
                    tituloNoticia = "Ark XBox",
                    modifier = Modifier.height(155.dp) .width(200.dp),
                    clickNoticia = {localUri.openUri("https://vandal.elespanol.com/noticia/1350766878/ark-survival-ascended-retrasa-su-lanzamiento-en-xbox-aunque-ya-esta-disponible-en-steam/") })
                Noticia(imagenNoticia = painterResource(id = R.drawable.noticia4),
                    tituloNoticia = "Palworld",
                    modifier = Modifier.height(155.dp),
                    clickNoticia = {localUri.openUri("https://www.hobbyconsolas.com/noticias/palworld-podria-cumplir-promesas-trailers-futuras-actualizaciones-1360908") })
            }
            Text(text = "Galería de imágenes",
                fontFamily = inika,
                fontSize = 25.sp,
                textAlign = TextAlign.Center,
                color = Color.White,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 35.dp, bottom = 7.dp))
            LazyRow(modifier = Modifier.fillMaxWidth()){
                items(listaImagenes()){ imagen->
                    Image(painter = painterResource(id = imagen), contentDescription = "Imagen Carrusel",
                        modifier = Modifier.height(150.dp) .width(170.dp))
                }
            }
        }
    }
}

fun listaImagenes() : MutableList<Int>{
    val listaImagenes = mutableListOf<Int>()
    val imagen1 = R.drawable.imagen1
    val imagen2 = R.drawable.imagen2
    val imagen3 = R.drawable.imagen3
    val imagen4 = R.drawable.imagen4
    val imagen5 = R.drawable.imagen5
    val imagen6 = R.drawable.imagen6
    val imagen7 = R.drawable.imagen7
    val imagen8 = R.drawable.imagen8
    val imagen9 = R.drawable.imagen9
    val imagen10 = R.drawable.imagen10
    val imagen11 = R.drawable.imagen11
    listaImagenes.add(imagen1)
    listaImagenes.add(imagen2)
    listaImagenes.add(imagen3)
    listaImagenes.add(imagen4)
    listaImagenes.add(imagen5)
    listaImagenes.add(imagen6)
    listaImagenes.add(imagen7)
    listaImagenes.add(imagen8)
    listaImagenes.add(imagen9)
    listaImagenes.add(imagen10)
    listaImagenes.add(imagen11)
    return listaImagenes
}