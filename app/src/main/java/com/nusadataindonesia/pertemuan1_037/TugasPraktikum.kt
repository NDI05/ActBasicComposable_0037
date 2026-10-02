package com.nusadataindonesia.pertemuan1_037

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun loginPage(modifier: Modifier){
    Box(modifier = modifier.fillMaxSize()){
        Image(
            painter = painterResource(id = R.drawable.bg),
            contentDescription = null,
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.matchParentSize()
        )
        Column(modifier = modifier.fillMaxSize().padding(top = 20.dp, bottom = 20.dp),
            verticalArrangement = Arrangement.SpaceEvenly) {
            Column() {
                Text(text = "LOGIN",
                    fontSize = 60.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Blue
                )
                Text(text = "Ini Adalah Halaman Login",
                    fontSize = 60.sp)
            }
            Column() {
                Text(text = "LOGIN",
                    fontSize = 60.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Blue
                )
                Text(text = "Ini Adalah Halaman Login",
                    fontSize = 60.sp)
            }
            Column() {
                Text(
                    text = "LOGIN",
                    fontSize = 60.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Blue
                )
                Text(
                    text = "Ini Adalah Halaman Login",
                    fontSize = 60.sp
                )
            }
        }
    }
}