package org.example.project.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val LightColorScheme =
    lightColorScheme(
        primary = Color(0xFF055EAF), // accent_One
        secondary = Color(0xFFB0D525), // accent_Two
        background = Color(0xFFF5F5F5), // background_One
        surface = Color(0xFFFFFFFF), // background_Two
        onPrimary = Color.White,
        onSecondary = Color.Black,
        onBackground = Color(0xFF31313A), // layer_One
        onSurface = Color(0xFF646470), // layer_Two
        error = Color(0xFFFF3B30), // red
        tertiary = Color(0xFF007AFF), // blue
    )

private val DarkColorScheme =
    darkColorScheme(
        primary = Color(0xFF055EAF), // accent_One
        secondary = Color(0xFFB0D525), // accent_Two
        background = Color(0xFF31313A), // layer_One
        surface = Color(0xFF646470), // layer_Two
        onPrimary = Color.White,
        onSecondary = Color.Black,
        onBackground = Color(0xFFC5C5C8), // layer_Three
        onSurface = Color(0xFFFFFFFF), // layer_Four
        error = Color(0xFFFF3B30), // red
        tertiary = Color(0xFF007AFF), // blue
    )
val LayerFour = Color(0xFFFFFFFF)
val TransparentBlack = Color(0x33000000) // background_Three
val LayerFive = Color(0x70FFFFFF) // layer_Five
val LayerSix = Color(0x1FFFFFFF) // layer_Six
val LayerThree = Color(0xFFC5C5C8)
val LightRed = Color(0xFFFDF5F5)
val LightBlue = Color(0xFFFDFBF3)

@Composable
fun MatchesTheme(
    darkTheme: Boolean = false,
    content: @Composable () -> Unit,
) {
    val colors = if (darkTheme) DarkColorScheme else LightColorScheme

    MaterialTheme(
        colorScheme = colors,
        typography = CustomTypography(),
        content = content,
    )
}
