package com.accecode.procimage.ui.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun TitleText(text: String) {
    //custom text
    Text( text = text.uppercase(), fontSize = 16.sp, fontWeight = FontWeight.Bold)
}