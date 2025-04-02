package org.example.project.ui.navigation

import androidx.compose.foundation.Image
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.navigation.NavController
import org.jetbrains.compose.resources.painterResource
import sockerapp.composeapp.generated.resources.Res
import sockerapp.composeapp.generated.resources.home_icon
import sockerapp.composeapp.generated.resources.icon_home
import sockerapp.composeapp.generated.resources.live_icon
import sockerapp.composeapp.generated.resources.live_not_choosen
import sockerapp.composeapp.generated.resources.settings_icon
import sockerapp.composeapp.generated.resources.stats_icon
import sockerapp.composeapp.generated.resources.stats_not_choosen

@Composable
fun BottomNavigationBar(navController: NavController) {
    var selectedItem by remember { mutableIntStateOf(0) }
    val items =
        listOf(Screen.Home.route, Screen.Live.route, Screen.Stat.route, Screen.Setting.route)
    val selectedIcons = listOf(
        Res.drawable.icon_home,
        Res.drawable.live_icon,
        Res.drawable.stats_icon,
        Res.drawable.settings_icon
    )
    val unselectedIcons = listOf(
        Res.drawable.home_icon,
        Res.drawable.live_not_choosen,
        Res.drawable.stats_not_choosen,
        Res.drawable.settings_icon
    )
    NavigationBar(
        containerColor = MaterialTheme.colorScheme.surface,
        contentColor = Color.Unspecified
    ) {
        items.forEachIndexed { index, item ->
            val isSelected = selectedItem == index
            NavigationBarItem(
                icon = {
                    Image(
                        painter = if (isSelected) {
                            painterResource(selectedIcons[index])
                        } else {
                            painterResource(unselectedIcons[index])
                        },
                        contentDescription = item,
                        colorFilter = if (isSelected) null else ColorFilter.tint(Color.Gray)
                    )
                }
                ,
                label = {},
                selected = isSelected,
                onClick = {
                    selectedItem = index
                    navController.navigate(item) {
                        launchSingleTop = true
                        restoreState = true
                        popUpTo(Screen.Home.route) { inclusive = true }
                    }
                },
                colors = NavigationBarItemDefaults.colors(
                    unselectedIconColor = Color.Gray,
                    selectedIconColor = Color.Unspecified,
                    indicatorColor = Color.Transparent
                )
            )
        }
    }
}
