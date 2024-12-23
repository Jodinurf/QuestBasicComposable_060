package com.example.playkotlinlayout

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.playkotlinlayout.ui.theme.PlayKotlinLayoutTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PlayKotlinLayoutTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    BasicCompose(
                        name = "Nama",
                        nama = "Jodi Nur Farkhani",
                        NIM = "20220140060",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun BasicCompose(
    name: String,
    nama : String,
    NIM : String,
    modifier: Modifier = Modifier
){
    Column(horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        Text(text = "Indonesia",
            fontSize = 50.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Red,
            fontFamily = FontFamily.SansSerif
        )

        Text(text = "0",
            fontWeight = FontWeight.Bold,
            fontSize = 25.sp
        )

        Image(
            painter = painterResource(id = R.drawable.logofifa),
            contentDescription = null
        )

        Text(text = name)

        Text(text = nama,
            fontSize = 12.sp,
            color = Color.Red,
            fontWeight = FontWeight.Bold
        )

        Text(text = NIM,
            fontSize = 30.sp)

        Image(
            painter = painterResource(id = R.drawable.gambarphotodiri),
            contentDescription = null
        )

    }
}

@Preview(showBackground = true)
@Composable
fun BasicComposePreview(){
    PlayKotlinLayoutTheme {
        BasicCompose("Nama","Jodi Nur Farkhani", "20220140060")
    }
}