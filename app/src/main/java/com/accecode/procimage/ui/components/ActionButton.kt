package com.accecode.procimage.ui.components

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp

@Composable
fun ActionButton (text : String, icon: ImageVector, onClick:() -> Unit) {
    Button(
        modifier = Modifier.fillMaxWidth(),
        onClick =  onClick ){
        Text(text)
        //add modifier to set an space
        Spacer(Modifier.size(ButtonDefaults.IconSize))

        Icon( icon, contentDescription = "almost", modifier= Modifier.size(ButtonDefaults.IconSize))
    }
}