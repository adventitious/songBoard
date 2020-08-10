package com.example.appaug2020

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class musicPlayer : AppCompatActivity() {


    var mediaPlayer: MediaPlayer? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_music_player)

        val songName = intent.getStringExtra(EXTRA_MESSAGE)

        val textView = findViewById<TextView>(R.id.textView2).apply {
            text = songName
        }

        if(songName == "Song One")
        {
            mediaPlayer = MediaPlayer.create(this, R.raw.sound1)
            mediaPlayer?.start()
        }

        if(songName == "Song Two")
        {
            mediaPlayer = MediaPlayer.create(this, R.raw.sound2)
            mediaPlayer?.start()
        }



    }


    override fun onPause() {
        super.onPause()
        mediaPlayer?.stop()
    }

}