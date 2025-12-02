package com.example.musicapp.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.example.musicapp.R

@Composable
fun SplashScreen(
    onTimeout: () -> Unit
) {
    Box(modifier = Modifier.fillMaxSize()) {
        // Full-screen image
        Image(
            painter = painterResource(R.drawable.intro_pic),
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )

        // Wait 2 seconds, then call onTimeout
        LaunchedEffect(Unit) {
            kotlinx.coroutines.delay(1500) // 1.5 seconds
            onTimeout()
        }
    }
}
