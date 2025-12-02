package com.example.musicapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import com.example.musicapp.presentation.PlayerActivity
import com.example.musicapp.ui.theme.SongListScreen

class SongListActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SongListScreen { songs, position ->
                val intent = Intent(this, PlayerActivity::class.java)
                intent.putParcelableArrayListExtra("songList", ArrayList(songs))
                intent.putExtra("position", position)
                startActivity(intent)
            }
        }
    }
}
