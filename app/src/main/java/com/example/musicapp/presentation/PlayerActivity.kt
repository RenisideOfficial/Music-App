package com.example.musicapp.presentation

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.musicapp.data.Song
import com.example.musicapp.ui.theme.PlayerScreen

class PlayerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val mySongList: List<Song> = intent.extras
            ?.getParcelableArrayList<Song>("songList") ?: emptyList()
        val initialIndex = intent.getIntExtra("position", 0)
        setContent {
            PlayerScreen(
                songList = mySongList,
                initialIndex = initialIndex,
                onBack = { finish() }
            )
        }
    }
}