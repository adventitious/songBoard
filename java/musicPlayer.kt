package com.example.appaug2020

import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity


class musicPlayer : AppCompatActivity() {

    var mediaPlayer: MediaPlayer? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



        setContentView(R.layout.activity_music_player)

        window.decorView.apply {
            systemUiVisibility =  View.SYSTEM_UI_FLAG_IMMERSIVE  or View.SYSTEM_UI_FLAG_FULLSCREEN  or View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
        }

        val message = intent.getStringExtra(EXTRA_MESSAGE)
        var songId: Int = 1

        try {
            songId = Integer.parseInt(message)
        }
        catch ( eq: NumberFormatException )
        {
            Log.i("qqq", " exc ")
        }

        val imageView = findViewById<ImageView>(R.id.imageView7)

        if(songId == 1)
        {
            imageView.setImageResource(R.drawable.batman);

            mediaPlayer = MediaPlayer.create(this, R.raw.batman)
            mediaPlayer?.start()
        }

        if(songId == 2)
        {
            imageView.setImageResource(R.drawable.grease);

            mediaPlayer = MediaPlayer.create(this, R.raw.grease)
            mediaPlayer?.start()
        }


        if(songId == 3)
        {
            imageView.setImageResource(R.drawable.underwater_waltz);

            mediaPlayer = MediaPlayer.create(this, R.raw.underwater_waltz)
            mediaPlayer?.start()
        }

        if(songId == 4)
        {
            imageView.setImageResource(R.drawable.the_sting);

            mediaPlayer = MediaPlayer.create(this, R.raw.the_sting)
            mediaPlayer?.start()
        }

        if(songId == 5)
        {
            imageView.setImageResource(R.drawable.axel_f);

            mediaPlayer = MediaPlayer.create(this, R.raw.axel_f)
            mediaPlayer?.start()
        }

        if(songId == 6)
        {
            imageView.setImageResource(R.drawable.phantom);

            mediaPlayer = MediaPlayer.create(this, R.raw.phantom)
            mediaPlayer?.start()
        }

        if(songId == 7)
        {
            imageView.setImageResource(R.drawable.tetris_a);

            mediaPlayer = MediaPlayer.create(this, R.raw.tetris_a)
            mediaPlayer?.start()
        }

        if(songId == 8)
        {
            imageView.setImageResource(R.drawable.tetris_b);

            mediaPlayer = MediaPlayer.create(this, R.raw.tetris_b)
            mediaPlayer?.start()
        }
    }

    fun backOut(view: View){
        // val intent = Intent(this , MainActivity::class.java)
        // startActivity(intent)
        finish()
    }


    override fun onPause() {
        super.onPause()
        mediaPlayer?.stop()
    }

}