package com.lespsan543.dint_1_gamingzoneapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.lespsan543.dint_1_gamingzoneapp.model.Routes
import com.lespsan543.dint_1_gamingzoneapp.screens.PantallaHorizon
import com.lespsan543.dint_1_gamingzoneapp.screens.PantallaKena
import com.lespsan543.dint_1_gamingzoneapp.screens.PantallaMenu
import com.lespsan543.dint_1_gamingzoneapp.screens.PantallaMenuJuegos
import com.lespsan543.dint_1_gamingzoneapp.screens.PantallaPerfil
import com.lespsan543.dint_1_gamingzoneapp.screens.PantallaStray
import com.lespsan543.dint_1_gamingzoneapp.screens.PantallaTLG
import com.lespsan543.dint_1_gamingzoneapp.ui.theme.Dint1GamingZoneAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Dint1GamingZoneAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navController = rememberNavController()
                    NavHost(navController = navController, startDestination = Routes.PantallaMenu.route) {
                        composable(Routes.PantallaKena.route) {
                            PantallaKena(navController)
                        }
                        composable(Routes.PantallaJuegos.route) {
                            PantallaMenuJuegos(navController)
                        }
                        composable(Routes.PantallaHorizon.route) {
                            PantallaHorizon(navController)
                        }
                        composable(Routes.PantallaStray.route) {
                            PantallaStray(navController)
                        }
                        composable(Routes.PantallaTLG.route) {
                            PantallaTLG(navController)
                        }
                        composable(Routes.PantallaMenu.route) {
                            PantallaMenu(navController)
                        }
                        composable(Routes.PantallaPerfil.route) {
                            PantallaPerfil(navController)
                        }
                    }
                }
            }
        }
    }
}
