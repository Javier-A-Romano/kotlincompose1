package com.example.myspotifyred

import android.icu.lang.UCharacter
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myspotifyred.ui.theme.MyspotifyredTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme  {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background ) {

                    Column() {
                        FirstScaffold()
                        Greeting("Android")
                        Shorlak123("Android")
                        Shorlakbutton()
                        FloatButton123()

                    }


                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}
@Composable
fun Shorlak123(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showSystemUi  = true)
@Composable
fun DefaultPreview() {
    MaterialTheme {
        Column() {
            Greeting("Android")
            Shorlak123("Android")
            Shorlakbutton()
            FloatButton123()
            FirstScaffold()
        }

    }
}
@Composable
fun Shorlakbutton() {
    Button(
        onClick = { /* ... */ },
        // Uses ButtonDefaults.ContentPadding by default
        contentPadding = PaddingValues(
            start = 10.dp,
            top = 12.dp,
            end = 20.dp,
            bottom = 12.dp,


        )

    ) {
        // Inner content including an icon and a text label
        Icon(
            Icons.Filled.Favorite,
            contentDescription = "Favorite",
            modifier = Modifier.size(ButtonDefaults.IconSize)
        )
        Spacer(Modifier.size(ButtonDefaults.IconSpacing))
        Text("Botton del medio gigante")
    }
}
@Composable
fun FloatButton123(){
    ExtendedFloatingActionButton(
        onClick = { /* ... */ },
        icon = {
            Icon(
                Icons.Filled.Favorite,
                contentDescription = "Favorite"
            )
        },
        text = { Text("Like") }
    )
}
@Composable
fun FirstScaffold(){
    Scaffold(
        drawerContent = {
            Text("Drawer title", modifier = Modifier.padding(16.dp))
            Divider()
            // Drawer items
        },topBar = {
            TopAppBar { /* Top app bar content */ }
        }
    ) {
        // Screen content

    }
}