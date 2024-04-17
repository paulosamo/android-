package com.example.paulosamo

import android.content.Intent
import android.os.Bundle
import android.provider.MediaStore.Images
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.paulosamo.AboutActivity2
import com.example.paulosamo.InputActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Greeting()

        }
    }
}
@Preview(showBackground = true)
@Composable
fun Greeting() {


    Column(
        modifier = Modifier
            .background(Color.Cyan)
    ) {


        Text( "First android project", color = Color.Yellow )

        Text( "Welcome to home page", color = Color.DarkGray)

        Text( "My name is paul osamo", color = Color.DarkGray)

//
//        val about = LocalContext.current
//        Button(onClick = {
//            about.startActivity(Intent(about,AboutActivity2::class.java))
//        },
//            colors = ButtonDefaults.buttonColors(Color.Cyan),
////        shape = RectangleShape
////        shape = RoundedCornerShape(40),
//            shape = CutCornerShape(20),
//            border = BorderStroke(1.dp, color = Color.DarkGray),
//
//
//
//        ) {
//            Text(text = "About Screen", color = Color.DarkGray)
//
//
//
//        }


        val about = LocalContext.current
        Button(onClick = {

            about.startActivity(Intent(about,::AboutActivity2::class.java))
        }) {
            Text(text = "About")


        }



        val images = LocalContext.current
        Button(onClick = {
            images.startActivity(Intent(images,::Images::class.java))

        }) {
            Text(text = "Images")
        }




        val input = LocalContext.current
        Button(onClick = {
            input.startActivity(Intent(input, InputActivity::class.java))

        }) {
            Text(text = "Images")
        }












    }



}
