package com.dante.jmore

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dante.jmore.ui.theme.JMORETheme

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
Box(modifier = Modifier.fillMaxSize())
{
    Image(
        painter = painterResource(id = R.drawable.img_1),
        contentDescription ="",
        modifier = Modifier.fillMaxSize(),
        contentScale = ContentScale.Crop
    )


    Column(modifier = Modifier
        .fillMaxSize()
        .padding(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        var name by remember {
            mutableStateOf(TextFieldValue(""))
        }
        TextField(
            value = name,
            onValueChange = {name = it},
            leadingIcon ={ Icon(imageVector = Icons.Default.Face, contentDescription = "")},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
            label ={ Text(text = "Name")}
        )

        Spacer(modifier = Modifier.height(15.dp))

        var email by remember {
            mutableStateOf(TextFieldValue(""))
        }
        TextField(
            value = email,
            onValueChange = {email = it},
            leadingIcon ={ Icon(imageVector = Icons.Default.Email, contentDescription = "")},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
            label ={ Text(text = "Email")}

        )
        Spacer(modifier = Modifier.height(10.dp))

            var id by remember {
            mutableStateOf(TextFieldValue(""))
        }
        TextField(
            value = id,
            onValueChange = {id = it},
            leadingIcon ={ Icon(imageVector = Icons.Default.Person, contentDescription = "")},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            label ={ Text(text = "ID")}

        )
        Spacer(modifier = Modifier.height(10.dp))

        var phone by remember {
            mutableStateOf(TextFieldValue(""))
        }
        TextField(
            value = phone,
            onValueChange = {phone = it},
            leadingIcon ={ Icon(imageVector = Icons.Default.Phone, contentDescription = "")},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone),
            //modifier = Modifier.border(color = ),
            label ={ Text(text = "Phone number")}
        )
        Spacer(modifier = Modifier.height(10.dp))

        var password by remember {
            mutableStateOf(TextFieldValue(""))
        }
        OutlinedTextField(
            value = password,
            onValueChange = {password = it},
            label ={ Text(text = "Password")},
            textStyle = TextStyle(Color.Cyan),
            leadingIcon ={ Icon(imageVector = Icons.Default.Lock, contentDescription = "")},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                unfocusedBorderColor = Color.Blue,
                focusedBorderColor = Color.Cyan,
                unfocusedLabelColor = Color.Blue,
                focusedLabelColor = Color.Cyan,
                cursorColor = Color.Cyan,
                focusedLeadingIconColor = Color.LightGray,
                unfocusedLeadingIconColor = Color.Blue
            )

        )
        Spacer(modifier = Modifier.height(10.dp))

        val submit= LocalContext.current
        Button(onClick = {
            submit.startActivity(Intent(submit,InputActivity::class.java))
        }) {
            Text(text = "submit")
        }


    }

}

}

