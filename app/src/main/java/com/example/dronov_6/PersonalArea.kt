package com.example.dronov_6

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.InspectableProperty
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
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
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.dronov_6.ui.theme.Dronov_6Theme
import com.example.dronov_6.Login

class PersonalArea : ComponentActivity() {
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
        Box(
            modifier = Modifier.fillMaxSize()
        ){
            Image(
                contentDescription = "",
                painter = painterResource(R.drawable.exitbtn),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(20.dp, 15.dp)
                    .size(30.dp)
                    .clickable(onClick = {
                        val intent = Intent(applicationContext, Login::class.java)
                        startActivity(intent)
                    })
            )
            Text(
                text = "Моё обучение",
                style = TextStyle(fontSize = 24.sp),
                modifier = Modifier
                    .align(Alignment.TopCenter)
                    .offset(0.dp, 15.dp)
            )
            Image(
                contentDescription = "",
                painter = painterResource(R.drawable.notifications),
                modifier = Modifier
                    .align(alignment = Alignment.TopEnd)
                    .offset(-20.dp, 15.dp)
                    .size(30.dp)
                    .clickable(onClick = {
                        val intent = Intent(applicationContext, Notice::class.java)
                        startActivity(intent)
                    })
            )
            Text(
                text = "Привет, User",
                style = TextStyle(fontSize = 24.sp),
                modifier = Modifier.offset(20.dp, 140.dp)
            )
            Image(
                contentDescription = "",
                painter = painterResource(R.drawable.card),
                modifier = Modifier
                    .offset(25.dp, 100.dp)
                    .size(350.dp)
            )
            Image(
                contentDescription = "",
                painter = painterResource(R.drawable.frame7),
                modifier = Modifier
                    .size(350.dp)
                    .offset(25.dp, 300.dp)
            )
            Button(
                content = { Text("+    Добавить новый курс") },
                modifier = Modifier.offset(40.dp, 600.dp)
                    .height(60.dp).width(320.dp),
                colors = ButtonDefaults.buttonColors(colorResource(R.color.btncolor)),
                onClick = {
                    val intent = Intent(applicationContext, SystemBrowser::class.java)
                    startActivity(intent)
                }
            )
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

