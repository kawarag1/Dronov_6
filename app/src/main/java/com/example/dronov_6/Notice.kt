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
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxColors
import androidx.compose.material3.CheckboxDefaults
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

class Notice : ComponentActivity() {
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
        var isChecked1 = remember { mutableStateOf(false) }
        var isChecked2 = remember { mutableStateOf(false) }
        var isChecked3 = remember { mutableStateOf(false) }
        val CheckboxColors = CheckboxDefaults.colors(
            checkedColor = colorResource(R.color.btncolor)
        )
        Box(
            modifier = Modifier.fillMaxSize()
        ) {
            Image(
                contentDescription = "",
                painter = painterResource(R.drawable.backarrow),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(20.dp, 15.dp)
                    .size(30.dp)
                    .clickable(onClick = {
                        val intent = Intent(applicationContext, PersonalArea::class.java)
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
                painter = painterResource(R.drawable.section1),
                modifier = Modifier
                    .offset(0.dp, 100.dp)
                    .size(400.dp)
            )
            Text(
                text = "Показывать прогресс обучения",
                style = TextStyle(fontSize = 16.sp),
                modifier = Modifier
                    .align(Alignment.BottomStart)
                    .offset(20.dp, -150.dp)
            )
            Checkbox(
                checked = isChecked1.value,
                onCheckedChange = {isChecked1.value = it},
                modifier = Modifier.align(Alignment.BottomEnd)
                    .offset(-20.dp, -135.dp),
                colors = CheckboxColors
            )
            Text(
                text = "Показывать прогресс обучения",
                style = TextStyle(fontSize = 16.sp),
                modifier = Modifier
                    .align(Alignment.BottomStart)
                    .offset(20.dp, -100.dp)
            )
            Checkbox(
                checked = isChecked2.value,
                onCheckedChange = {isChecked1.value = it},
                modifier = Modifier.align(Alignment.BottomEnd)
                    .offset(-20.dp, -85.dp),
                colors = CheckboxColors
            )
            Text(
                text = "Уведомлять об условиях и акциях",
                style = TextStyle(fontSize = 16.sp),
                modifier = Modifier
                    .align(Alignment.BottomStart)
                    .offset(20.dp, -50.dp)
            )
            Checkbox(
                checked = isChecked3.value,
                onCheckedChange = {isChecked1.value = it},
                modifier = Modifier.align(Alignment.BottomEnd)
                    .offset(-20.dp, -35.dp),
                colors = CheckboxColors
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

