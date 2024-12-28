package com.example.dronov_6

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.InspectableProperty
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.dronov_6.ui.theme.Dronov_6Theme

class Login : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Dronov_6Theme {
                Greeting()
            }
        }
    }
    @Composable
    fun Greeting() {
        val context = LocalContext.current
        var login = remember { mutableStateOf("") }
        var password = remember { mutableStateOf("") }
        Box(
            modifier = Modifier.fillMaxSize()
        ){
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Image(
                    contentDescription = "",
                    painter = painterResource(R.drawable.picture1),
                    modifier = Modifier
                        .offset(0.dp, -80.dp)
                        .size(300.dp)
                )
                OutlinedTextField(
                    value = login.value,
                    onValueChange = {login.value = it},
                    label = { Text("Логин:") },
                    modifier = Modifier.offset(0.dp, -80.dp)
                )
                OutlinedTextField(
                    value = password.value,
                    onValueChange = {password.value = it},
                    label = { Text("Пароль:") },
                    modifier = Modifier.offset(0.dp, -80.dp)
                )
                Button(
                    modifier = Modifier
                        .height(60.dp)
                        .width(280.dp),
                    content = { Text("Войти в Моё обучение") },
                    colors = ButtonDefaults.buttonColors(colorResource(R.color.btncolor)),
                    onClick = {
                        if(login.value.isEmpty() || password.value.isEmpty()){
                            Toast.makeText(applicationContext, "Все поля должны быть заполненны!", Toast.LENGTH_LONG)
                                .show()
                        }
                        else{
                            val intent = Intent(context, PersonalArea::class.java)
                            intent.putExtra("login", login.value)
                            startActivity(intent)
                        }



                    }
                )
            }

        }
    }

    @Preview(showBackground = true)
    @Composable
    fun GreetingPreview() {
        Dronov_6Theme {
            Greeting()
        }
    }
}

