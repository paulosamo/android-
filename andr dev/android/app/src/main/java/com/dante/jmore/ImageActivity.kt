package com.dante.jmore

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dante.jmore.ui.theme.JMORETheme

class ImageActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            image()
        }
    }
}
@Preview(showBackground = true)
@Composable
fun image() {
    Column (
        modifier = Modifier
            .fillMaxSize()
    ){
        val main= LocalContext.current
        Button(onClick = {
            main.startActivity(Intent(main,MainActivity::class.java))
        }) {
            Text(text = "Home")
        }
        Image(painter = painterResource(id =R.drawable.image), contentDescription ="",
            modifier = Modifier
                .size(300.dp),
         //   colorFilter = ColorFilter.tint(Color.Cyan)
            )
        
    }
}

