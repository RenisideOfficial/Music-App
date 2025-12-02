package com.example.musicapp.data

import android.content.Context
import android.provider.MediaStore

fun getSongs(context: Context): List<Song> {
    val songs = mutableListOf<Song>()
    val uri = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI

    // Find all audio formats
    val selection = "${MediaStore.Audio.Media.MIME_TYPE} LIKE ?"
    val selectionArgs = arrayOf("audio/%")

    val sortOrder = "${MediaStore.Audio.Media.TITLE} ASC"

    val projection = arrayOf(
        MediaStore.Audio.Media._ID,
        MediaStore.Audio.Media.TITLE,
        MediaStore.Audio.Media.ARTIST,
        MediaStore.Audio.Media.DATA,
        MediaStore.Audio.Media.ALBUM_ID,
    )

    val cursor = context.contentResolver.query(
        uri,
        projection,
        selection,
        selectionArgs,   // <-- your missing argument
        sortOrder
    )

    cursor?.use {
        val idCol = it.getColumnIndexOrThrow(MediaStore.Audio.Media._ID)
        val titleCol = it.getColumnIndexOrThrow(MediaStore.Audio.Media.TITLE)
        val artistCol = it.getColumnIndexOrThrow(MediaStore.Audio.Media.ARTIST)
        val dataCol = it.getColumnIndexOrThrow(MediaStore.Audio.Media.DATA)
        val albumIdCol = it.getColumnIndexOrThrow(MediaStore.Audio.Media.ALBUM_ID)

        while (it.moveToNext()) {
            val id = it.getLong(idCol)
            val title = it.getString(titleCol)
            val artist = it.getString(artistCol)
            val data = it.getString(dataCol)
            val albumId = it.getLong(albumIdCol)

            songs.add(Song(id, title, artist, data, albumId))
        }
    }

    return songs
}
