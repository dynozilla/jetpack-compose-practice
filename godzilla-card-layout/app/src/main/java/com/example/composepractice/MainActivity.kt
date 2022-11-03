package com.example.composepractice

import android.os.Bundle
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.ModifierInfo
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composepractice.ui.theme.ComposePracticeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Row (horizontalArrangement = Arrangement.SpaceEvenly) {
                Column {
                    val painter1 = painterResource(id = R.drawable.godzilla)
                    val description1 = "Godzilla eating ramen"
                    val title1 = "Godzilla eating ramen"

                    Box(modifier = Modifier
                        .fillMaxWidth(0.5f)
                        .padding(16.dp)) {
                        ImageCard(
                            painter = painter1,
                            contentDescription = description1,
                            title = title1)
                    }

                    val painter2 = painterResource(id = R.drawable.godzilla_eating_burger)
                    val description2 = "Godzilla eating burger"
                    val title2 = "Godzilla eating burger"

                    Box(modifier = Modifier
                        .fillMaxWidth(0.5f)
                        .padding(16.dp),
                        contentAlignment = Alignment.TopEnd) {
                        ImageCard(
                            painter = painter2,
                            contentDescription = description2,
                            title = title2)
                    }
                }

                Column {
                    val painter3 = painterResource(id = R.drawable.godzilla_eating_dumpling)
                    val description3 = "Godzilla eating dumpling"
                    val title3 = "Godzilla eating dumpling"

                    Box(
                        modifier = Modifier
                            .fillMaxWidth(1.0f)
                            .padding(16.dp)
                    ) {
                        ImageCard(
                            painter = painter3,
                            contentDescription = description3,
                            title = title3
                        )
                    }

                    val painter4 = painterResource(id = R.drawable.godzilla_eating_steak)
                    val description4 = "Godzilla eating steak"
                    val title4 = "Godzilla eating steak"

                    Box(
                        modifier = Modifier
                            .fillMaxWidth(1.0f)
                            .padding(16.dp),
                        contentAlignment = Alignment.TopEnd
                    ) {
                        ImageCard(
                            painter = painter4,
                            contentDescription = description4,
                            title = title4
                        )
                    }
                }
            }
        }   
    }
}

@Composable
fun ImageCard(
    painter: Painter,
    contentDescription: String,
    title: String,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(15.dp),
        elevation = 5.dp
    ) {
        Box(
            modifier = Modifier.height(200.dp)
        ) {
            Image(
                painter = painter,
                contentDescription = contentDescription,
                contentScale = ContentScale.Crop
            )
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(
                        Brush.verticalGradient(
                            colors = listOf(
                                Color.Transparent,
                                Color.Black
                            ),
                            startY = 300f
                        )
                    )
            )
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(12.dp),
                contentAlignment = Alignment.BottomStart
            ) {
                Text(title, style = TextStyle(color = Color.White, fontSize = 14.sp))
            }
        }
    }
}