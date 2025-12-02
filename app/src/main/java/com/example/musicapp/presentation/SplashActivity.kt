package com.example.musicapp.presentation

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.musicapp.ui.theme.SplashScreen
import com.example.musicapp.SongListActivity

class SplashActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            SplashScreen(
                onTimeout = {
                    // Navigate to MainActivity after 2 seconds
                    val intent = Intent(this, SongListActivity::class.java)
                    startActivity(intent)
                    finish()
                }
            )
        }

    }
}
