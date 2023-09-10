package com.accecode.procimage

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.accecode.procimage.ui.components.DataColumn
import com.accecode.procimage.ui.components.InfoColumn
import com.accecode.procimage.ui.theme.ProcImageTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProcImageTheme {
                // A surface container using the 'background' color from the theme
                //Podemos usar windows size para dar Responsive Screens
                Surface(
                    modifier=Modifier.fillMaxSize(),
                    ){
                    Content()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun Content() {

    var games by remember {
        mutableStateOf("")
    }

    var elements by remember {
        mutableStateOf("")
    }

    Scaffold(
        topBar = {
            TopAppBar (title= { Text(text = "hola mundo") } )
        }
    ) { padding ->
        Column(
            Modifier.padding(padding).padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(32.dp)
        ) {
            DataColumn(games,
                elements,
                onGamesChange= { games = it },
                onElementsChange = { elements = it })

            InfoColumn()

            DataColumn(games,
                elements,
                onGamesChange= { games = it },
                onElementsChange = { elements = it })
        }
    }
}


@Preview(showSystemUi= true)
@Composable
fun ProcImagePreview(){
    ProcImageTheme{
        Content()
    }
}
