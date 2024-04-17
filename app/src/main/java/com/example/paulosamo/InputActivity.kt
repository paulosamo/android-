package com.example.paulosamo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.paulosamo.ui.theme.PaulosamoTheme

class InputActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Input()

        }
    }
}





@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable

fun Input() {
    Column (
        modifier = Modifier
            .background(Color.Red)
            .fillMaxSize()
            .padding(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        var name by remember {
            mutableStateOf(TextFieldValue(""))
        }
        TextField(
            value = name,
            onValueChange = {name=it},
            label = { Text(text = "input name")}


        )
        Spacer(modifier = Modifier.height(25.dp))

        var email by remember {
            mutableStateOf(TextFieldValue(""))
        }
        TextField(
            value = email,
            onValueChange = {email=it},
            label = { Text(text = "input email")},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),


            )
        Spacer(modifier = Modifier.height(25.dp))

        var password by remember {
            mutableStateOf(TextFieldValue(""))
        }
        OutlinedTextField(value = password, onValueChange = { password = it },
            textStyle = TextStyle(Color.Red),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            label = { Text(text = "password")},
            colors =TextFieldDefaults.outlinedTextFieldColors(
                unfocusedBorderColor = Color.Blue,
                focusedBorderColor = Color.Blue,
                unfocusedLabelColor = Color.Blue,
                focusedLabelColor = Color.Blue,
                cursorColor = Color.Blue,


            )




        )
//        LazyColumn (){
//            item {
//                Column {
//
//
//
//
//                }
//
//            }
//        }































    }
}