package com.accecode.procimage.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp

@Composable
fun InfoColumn() {
    Column(verticalArrangement = Arrangement.spacedBy(16.dp)){
        TitleText( text = "2. introduce nueva informacion")
        //refactor
        ActionButton(
            "Iniciar grabacion",
            icon = Icons.Filled.Info ){
            //callback onClick

        }
    }

}