package org.example.project.ui.navigation

sealed class Screen(val route: String) {
    data object Home : Screen("home")
    data object Preloader : Screen("preloader")
    data object Welcome : Screen("welcome")
    data object Live : Screen("live")
    data object Stat : Screen("stat")
    data object Setting : Screen("setting")
}
