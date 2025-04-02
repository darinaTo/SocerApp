package org.example.project.ui.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun NavContent(navController: NavHostController, innerPadding: PaddingValues) {
    NavHost(navController = navController, startDestination = Screen.Preloader.route) {
        composable(Screen.Preloader.route) {
            /*PreloaderScreen(onNavigateToWelcome = {
                navController.navigate(Screen.Welcome.route) {
                    popUpTo(Screen.Preloader.route) { inclusive = true }
                }
            })*/
        }
        composable(Screen.Welcome.route) {
            /*    WelcomeScreen(onNavigateToHome = {
                    navController.navigate(Screen.Home.route) {
                        launchSingleTop = true
                        restoreState = true
                        popUpTo(Screen.Welcome.route) { inclusive = true }
                    }
                })*/
        }
        composable(Screen.Home.route) {
            //  HomeScreen(modifier = Modifier.padding(innerPadding))
        }
        composable(Screen.Live.route) {
            // LiveScreen(modifier = Modifier.padding(innerPadding))
        }
        composable(Screen.Stat.route) {
            //  StatScreen(modifier = Modifier.padding(innerPadding))
        }
        composable(Screen.Setting.route) {
            // SettingScreen(modifier = Modifier.padding(innerPadding))
        }
    }
}
