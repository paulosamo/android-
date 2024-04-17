package com.dante.jmore

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Place
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.LeadingIconTab
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dante.jmore.ui.theme.JMORETheme

class AssignmentActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            assignment()
        }
    }
}
@Preview(showBackground = true)
@Composable
fun assignment(){
    LazyColumn(modifier = Modifier.fillMaxSize()){
        item {
            Column (modifier = Modifier.fillMaxSize()){
                Row (modifier = Modifier.fillMaxWidth()){
                    Column (
                        horizontalAlignment =Alignment.End
                    ){
                        Icon(imageVector = Icons.Default.Menu, contentDescription = "")
                    }
                    Column(horizontalAlignment =Alignment.CenterHorizontally) {
                        Text(text = "Current location")
                        Icon(imageVector = Icons.Default.LocationOn, contentDescription ="Nairobi")
                    }
                    Column {
                        Image(painter = painterResource(id =R.drawable.img_1), contentDescription ="")
                    }
                }
                Spacer(modifier = Modifier.height(10.dp))

                Row (modifier = Modifier.fillMaxWidth()){
                    val hotels= LocalContext.current
                    Button(onClick = {hotels.startActivity(Intent(hotels,HotelsActivity::class.java))},
                        ) {
                      Icon(imageVector = Icons.Default.Home, contentDescription ="")
                        Text(text = "Hotels",)
                    }
                    val holiday= LocalContext.current
                    Button(onClick = {holiday.startActivity(Intent(holiday,HotelsActivity::class.java))},
                    ) {
                        Icon(imageVector = Icons.Default.ShoppingCart, contentDescription ="")
                        Text(text = "Holidays",)
                    }

                }
                Row (modifier = Modifier.fillMaxWidth()){
                    val taxi= LocalContext.current
                    Button(onClick = {taxi.startActivity(Intent(taxi,HotelsActivity::class.java))},
                    ) {
                        Icon(imageVector = Icons.Default.Place, contentDescription ="")
                        Text(text = "Taxi",)
                    }
                    val ticket= LocalContext.current
                    Button(onClick = {ticket.startActivity(Intent(ticket,HotelsActivity::class.java))},
                    ) {
                        Icon(imageVector = Icons.Default.ThumbUp, contentDescription ="")
                        Text(text = "Ticket",)
                    }

                }
                Row(modifier = Modifier.fillMaxWidth()) {
                    val party= LocalContext.current
                    Button(onClick = {party.startActivity(Intent(party,HotelsActivity::class.java))},
                    ) {
                        Icon(imageVector = Icons.Default.DateRange, contentDescription ="")
                        Text(text = "Parties",)
                    }
                    val services= LocalContext.current
                    Button(onClick = {services.startActivity(Intent(services,HotelsActivity::class.java))},
                    ) {
                        Icon(imageVector = Icons.Default.Call, contentDescription ="")
                        Text(text = "Services",)
                    }

                }
                Spacer(modifier = Modifier.height(15.dp))

                Row (modifier = Modifier.fillMaxWidth()){
                    Column(horizontalAlignment = Alignment.Start) {
                        Text(text = "Popular in town")}
                    Column (horizontalAlignment = Alignment.End){
                        val aa= LocalContext.current
                        Text(text = "view all", modifier = Modifier.clickable{
                            aa.startActivity(Intent(aa,AboutActivity::class.java))
                        }, color = Color.Blue)
                    }

                }
                Row(modifier = Modifier.fillMaxWidth()) {
                    Column(horizontalAlignment = Alignment.Start) {
                        Image(painter = painterResource(id = R.drawable.img), contentDescription = "")
                    }
                    Column(horizontalAlignment = Alignment.End) {
                        Image(painter = painterResource(id = R.drawable.image), contentDescription = "")
                    }
                }
            }
            }
        }
    }
