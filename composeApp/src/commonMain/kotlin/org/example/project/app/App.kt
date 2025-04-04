package org.example.project.app

import androidx.compose.runtime.Composable
import org.example.project.ui.navigation.AppNavigation
import org.example.project.ui.theme.MatchesTheme
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    MatchesTheme {
        AppNavigation()
    }
}
