package com.lespsan543.dint_1_gamingzoneapp.model

sealed class Routes(val route:String) {
    object PantallaInicio : Routes("PantallaInicio")

    object PantallaMenu : Routes("PantallaMenu")

    object PantallaPerfil : Routes("PantallaPerfil")

    object PantallaJuegos : Routes("PantallaJuegos")

    object PantallaKena : Routes("PantallaKena")

    object PantallaTLG : Routes("PantallaTLG")

    object PantallaHorizon : Routes("PantallaHorizon")

    object PantallaStray : Routes("PantallaStray")


}