package org.example.project.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun CustomTypography() : Typography{
val customFontFamily = CustomFontFamily()

return Typography(
    displayLarge = TextStyle(
        fontFamily = customFontFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 70.sp
    ),
    displayMedium = TextStyle(
        fontFamily = customFontFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 24.sp
    ),
    displaySmall = TextStyle(
        fontFamily = customFontFamily,
        fontWeight = FontWeight.SemiBold,
        fontSize = 12.sp
    ),
    headlineLarge = TextStyle(
        fontFamily = customFontFamily,
        fontWeight = FontWeight.SemiBold,
        fontSize = 30.sp
    ),
    headlineMedium = TextStyle(
        fontFamily = customFontFamily,
        fontWeight = FontWeight.SemiBold,
        fontSize = 20.sp
    ),
    titleMedium = TextStyle(
        fontFamily = customFontFamily,
        fontWeight = FontWeight.SemiBold,
        fontSize = 18.sp
    ),
    titleSmall = TextStyle(
        fontFamily = customFontFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 18.sp
    ),
    bodyLarge = TextStyle(
        fontFamily = customFontFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 14.sp
    ),
    bodySmall = TextStyle(
        fontFamily = customFontFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 12.sp
    )
)
}
