package com.example.paulosamo

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class AboutActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            About()
        }
    }
}


@Preview(showBackground = true)
@Composable
fun About() {

    Column (
        modifier = Modifier
            .background(Color.Blue)
            .fillMaxSize()
            .padding(10.dp)

    ){
        Text( "this is about page", fontFamily = FontFamily.Cursive, fontSize = 34.sp, color = Color.Red)
        val Home = LocalContext.current

        Button(onClick = {
            Home.startActivity(Intent(Home,MainActivity::class.java))
        },

            colors = ButtonDefaults.buttonColors(Color.DarkGray),
//            shape = CircleShape
            shape = RoundedCornerShape(8.dp),
            border = BorderStroke(2.dp, Color.Red)

            ) {
            Text(text = "Home Page", color = Color.Yellow)

        }
//        Spacer(modifier = Modifier.height(20.dp))
//        val aa = LocalContext.current
//        val bb= AnnotatedString("Click here to go Home")

        }

        }








