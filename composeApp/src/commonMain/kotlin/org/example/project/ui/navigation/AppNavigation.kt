package org.example.project.ui.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.navigation.NavBackStackEntry
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    val currentBackStackEntry = navController.currentBackStackEntryAsState()
    if (shouldShowBottomNav(currentBackStackEntry.value)) {
        Scaffold(bottomBar = {
            BottomNavigationBar(navController)
        }) { innerPadding ->
            NavContent(navController = navController, innerPadding = innerPadding)
        }
    } else {
        NavContent(navController = navController, innerPadding = PaddingValues(0.dp))

    }
}
fun shouldShowBottomNav(backStackEntry: NavBackStackEntry?): Boolean {
    return backStackEntry?.destination?.route in listOf(Screen.Home.route, Screen.Live.route, Screen.Stat.route, Screen.Setting.route)
}
