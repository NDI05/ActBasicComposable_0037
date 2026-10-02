package com.nusadataindonesia.pertemuan1_037

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun loginPage(modifier: Modifier){
    Box(modifier = modifier.fillMaxSize()){
        Image(
            painter = painterResource(id = R.drawable.img_1),
            contentDescription = null,
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.matchParentSize(),
            colorFilter = ColorFilter.tint(
                color = Color.Black.copy(alpha = 0.5f),
                blendMode = BlendMode.SrcOver
            )
        )
        Column(modifier = modifier
            .fillMaxSize(),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Column(
                modifier = modifier
                    .fillMaxWidth()
                    .background(color = Color.White)
                    .padding(bottom = 20.dp, top = 75.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = "LOGIN",
                    fontSize = 75.sp,
                    fontWeight = FontWeight.Black,
                    color = Color.Black,
                    textAlign = TextAlign.Center
                )
                Text(text = "Silahkan Login Terlebih dahulu",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Light,
                    fontStyle = FontStyle.Italic,
                    color = Color.Black,
                    textAlign = TextAlign.Center
                )
            }
            Column(modifier = modifier
                .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally){
                Image(painter = painterResource(id = R.drawable.umy),
                    contentDescription = null,
                    contentScale = ContentScale.Fit,
                    modifier = modifier.size(150.dp)
                )
            }
            Column(modifier = modifier
                .fillMaxWidth()
                .padding(bottom = 10.dp),
                horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = "nama",
                    fontSize = 35.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
                Text(text = "Andhika Pratama",
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                    fontStyle = FontStyle.Italic
                )
                Text(text = "20240140037",
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Black,
                    color = Color.White,
                    fontStyle = FontStyle.Italic,
                    modifier = modifier.padding(bottom = 20.dp)
                )
                Box(
                    modifier = Modifier
                        .size(350.dp)
                        .clip(CircleShape)
                        .background(Color.White)
                        .border(
                            width = 5.dp,
                            color = Color.Gray,
                            shape = CircleShape
                        ),
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.img),
                        contentDescription = null,
                        contentScale = ContentScale.FillHeight,
                        modifier = Modifier
                            .fillMaxHeight()
                            .width(180.dp)
                    )
                }
            }
        }
    }
}