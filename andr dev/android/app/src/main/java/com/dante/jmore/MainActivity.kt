package com.dante.jmore

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dante.jmore.ui.theme.JMORETheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            Home()
        }
    }
}
@Preview(showBackground = true)
@Composable
fun Home() {

Column(
    Modifier
        .background(Color.Cyan)
        // .fillMaxWidth()
        //  .fillMaxHeight()
        .fillMaxSize(),
    horizontalAlignment = Alignment.CenterHorizontally,
  //  verticalArrangement = Arrangement.Center
) {

    Row(){
        Text(text = "home")
        Spacer(modifier = Modifier
            .width(20.dp)
        )
        Text(text = "about")
        Spacer(modifier = Modifier
            .width(20.dp)
        )
        Text(text = "services")
    }
    Spacer(modifier = Modifier
        .height(20.dp)
    )
    Text("my first android project", fontFamily = FontFamily.Serif, modifier = Modifier
        .background(Color.Red)
    )
    Text("first app", fontFamily = FontFamily.Cursive)
    Text("welcome ", fontSize = 30.sp)
    Text("this is an app", color = Color.Magenta)

    val About= LocalContext.current
    Button(onClick = {
        About.startActivity(Intent(About,AboutActivity::class.java))
    },
        colors = ButtonDefaults.buttonColors(Color.Transparent),
        //shape = RectangleShape
        //shape = RoundedCornerShape(10.dp)
        shape = CutCornerShape(percent = 30),
        border = BorderStroke(2.dp, Color.Red)
    ) {
        Text(text = "About", color= Color.Red)

    }
      Spacer(modifier = Modifier.height(20.dp))

    val aa= LocalContext.current
    val bb= AnnotatedString("about page link")
    ClickableText(text = bb, onClick = {
        aa.startActivity(Intent(aa,AboutActivity::class.java))
    })

    
    Spacer(modifier = Modifier.height(10.dp))
    Text(text = "click to about screen", modifier = Modifier.clickable {
            aa.startActivity(Intent(aa,AboutActivity::class.java))
        })
    
    val image= LocalContext.current
    Button(onClick = {
        image.startActivity(Intent(image,ImageActivity::class.java))
    }) {
        Text(text = "Image")
    }

    val input= LocalContext.current
    Button(onClick = {
        input.startActivity(Intent(input,InputActivity::class.java))
    }) {
        Text(text = "Input")
    }


    val assigno= LocalContext.current
    Button(onClick = {
        assigno.startActivity(Intent(assigno,AssignmentActivity::class.java))
    }) {
        Text(text = "Ass")
    }


}

}






