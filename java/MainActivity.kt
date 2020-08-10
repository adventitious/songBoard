package com.example.appaug2020

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

const val EXTRA_MESSAGE = "com.example.myappaug2020.MESSAGE"


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        Log.i("qqq", "created")
    }


    fun Song1(view: View){
        playMusic( "Song One" )
    }


    fun Song2(view: View){
        playMusic( "Song Two" )
    }


    fun playMusic( songName: String ) {

        val intent = Intent(this, musicPlayer::class.java).apply {
            putExtra(EXTRA_MESSAGE, songName)
        }
        startActivity(intent)
    }

    fun playMusic2(view: View){

        val intent = Intent(this, musicPlayer::class.java).apply {
            putExtra(EXTRA_MESSAGE, "hello")
        }
        startActivity(intent)
    }
}