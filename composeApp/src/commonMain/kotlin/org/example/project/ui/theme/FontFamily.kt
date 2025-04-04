package org.example.project.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import org.jetbrains.compose.resources.Font
import sockerapp.composeapp.generated.resources.Res
import sockerapp.composeapp.generated.resources.chakrapetch_bold

@Composable
fun CustomFontFamily(): FontFamily = FontFamily(Font(Res.font.chakrapetch_bold))
