package com.example.computing38

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.computing38.ui.theme.Computing38Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Computing38Theme {
                MainBody()
            }
        }
    }
}

@Composable
fun MainBody() {


    Column(
modifier = Modifier
    .fillMaxSize()
    .background(Color.White)
    .padding(15.dp)


    )
    {
TopBar()
        Spacer(modifier = Modifier.height(20.dp))
        ProfileSection()
        Spacer(modifier = Modifier.height(10.dp))
       IntroSection()
    }
}

@Composable
fun TopBar(){
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Icon(
            painter = painterResource(id = R.drawable.baseline_arrow_back_ios_24),
            contentDescription = "Back Arrow"
        )

        Text(
            text = "Krish",
            style = TextStyle(
                fontSize = 24.sp,
                color = Color.Black,
                fontWeight = FontWeight.W900,
                fontStyle = FontStyle.Italic,
                textAlign = TextAlign.Center
            )
        )

        Icon(
            painter = painterResource(id = R.drawable.baseline_more_horiz_24),
            contentDescription = "Menu"
        )
    }
}

@Composable
fun ProfileSection()
{
    Row(
modifier = Modifier
    .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,

    )
    {
        Box(
modifier = Modifier.size(90.dp).border(2.dp,Color.Red,CircleShape),
            contentAlignment = Alignment.Center
        ){
            Image(
                painter = painterResource(id = R.drawable.pramesh),
                contentDescription = "High",
                modifier = Modifier.size(80.dp).clip(CircleShape
                    ), contentScale = ContentScale.Crop
            )
        }
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text("0,000", fontWeight = FontWeight.ExtraBold,fontSize =16.sp)
            Text("Posts",
                fontWeight = FontWeight.Bold,
                fontSize = 13.sp,
                )
        }

        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text("0,000", fontWeight = FontWeight.ExtraBold,fontSize =16.sp)
            Text("Followers",
                fontWeight = FontWeight.Bold,
                fontSize = 13.sp,
                )
        }

        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text("0,000", fontWeight = FontWeight.ExtraBold, fontSize =16.sp)
            Text("Following",
                fontWeight = FontWeight.Bold,
                fontSize = 13.sp,


                )
        }
    }

    }

@Composable
fun IntroSection(){
    Row(
        modifier = Modifier.fillMaxWidth(),

    ) {

        Text("Username",
            fontWeight = FontWeight.Bold,
            fontSize = 14.sp
            )

    }
    Row(
        modifier = Modifier.fillMaxWidth()
    ) {
        Text(
            buildAnnotatedString {

                append("Followed By ")

                withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) {
                    append("Everyone ")
                }

                append(" ")

                withStyle(
                    style = SpanStyle(
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF1DA1F2) // blue like links in Instagram-style UI
                    )
                ) {
                    append("#Krischal Dada")
                }
            }
        )
    }
    Row(
        modifier = Modifier.fillMaxWidth()
    ) {
        Text(
            text = "#www.example.com",
            color = Color(0xFF1DA1F2),
            fontSize = 13.sp
        )
    }
    Row(
        modifier = Modifier.fillMaxWidth()
    ) {
        Text(
            buildAnnotatedString {
                withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) {
                    append("Followed ")
                }

                append("By")

                withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) {
                    append("Everyone")
                }
            }
        )
    }

}






@Preview(showBackground = true)
@Composable
fun MainPreview() {
    Computing38Theme {
        MainBody()
    }
}