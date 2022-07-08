package com.example.list

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            var boxSizeState by remember {
                mutableStateOf(200.dp)
            }
            val animatedSize by animateDpAsState(
                targetValue = boxSizeState,
                tween(
                    durationMillis = 1000
                )
            )
                Box(
                    modifier = Modifier
                        .size(animatedSize)
                        .background(Color.Red),
                    contentAlignment = Alignment.Center
                ){
                    Button(onClick = {
                        boxSizeState+=50.dp
                    }) {
                        Text("Click here")
                    }
                }
//                itemsIndexed(listOf(1,2,3,4,5,6,7,8,9,11,12,13,11)) { index, item ->
//                    Text(
//                        text = "Item at $index is $item",
//                        textAlign = TextAlign.Center,
//                        fontSize = 30.sp,
//                        fontWeight = FontWeight.Bold,
//                        modifier = Modifier
//                            .padding(vertical = 16.dp)
//                            .fillMaxWidth()
//                    )
//                }
//                items(5000) {
//                    Text(
//                        text = "Item $it",
//                        textAlign = TextAlign.Center,
//                        fontSize = 30.sp,
//                        fontWeight = FontWeight.Bold,
//                        modifier = Modifier
//                            .padding(vertical = 16.dp)
//                            .fillMaxWidth()
//                    )
//                }

        }
    }
}
