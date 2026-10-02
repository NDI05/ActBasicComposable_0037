package com.nusadataindonesia.pertemuan1_037

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
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
        Column(modifier = modifier
            .fillMaxSize()
            .padding(vertical = 20.dp, horizontal = 10.dp),
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            Column(modifier = modifier
                .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = "LOGIN",
                    fontSize = 60.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Blue
                )
                Text(text = "Silahkan Login Terlebih dahulu",
                    fontSize = 25.sp,
                    color = Color.White)
                Image(painter = painterResource(id = R.drawable.ic_launcher_foreground),
                    contentDescription = null,
                    contentScale = ContentScale.FillBounds)
            }
            Column(modifier = modifier
                .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = "nama",
                    fontSize = 40.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Blue
                )
                Text(text = "Andhika Pratama",
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White)
                Text(text = "20240140037",
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White)
            }
            Column(modifier = modifier
                .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally) {

            }
        }
    }
}