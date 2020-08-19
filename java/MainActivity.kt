package com.example.appaug2020

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.View.*

const val EXTRA_MESSAGE = "com.example.myappaug2020.MESSAGE"


class MainActivity : AppCompatActivity() {

//    var backOutOk: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        window.decorView.setOnSystemUiVisibilityChangeListener { visibility ->
            // Note that system bars will only be "visible" if none of the
            // LOW_PROFILE, HIDE_NAVIGATION, or FULLSCREEN flags are set.
            if (visibility and View.SYSTEM_UI_FLAG_FULLSCREEN == 0) {
                // TODO: The system bars are visible. Make any desired
                // adjustments to your UI, such as showing the action bar or
                // other navigational controls.
/*
                if( backOutOk == false)
                {
                    playMusic( 3 )
                }
*/

                Log.i("qqq", "bars visible")


            } else {
                // TODO: The system bars are NOT visible. Make any desired
                // adjustments to your UI, such as hiding the action bar or
                // other navigational controls.

                Log.i("qqq", "bars Not visible")
            }
        }



        window.decorView.apply {
            systemUiVisibility =  View.SYSTEM_UI_FLAG_IMMERSIVE  or View.SYSTEM_UI_FLAG_FULLSCREEN  or View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
        }


        Log.i("qqq", "created")
    }


    fun song1(view: View){
        playMusic( 1 )
    }

    fun song2(view: View){

        //backOutOk = true
        //finish()
        playMusic( 2 )
    }

    fun song3(view: View){
        playMusic( 3 )
    }

    fun song4(view: View){
        playMusic( 4 )
    }

    fun song5(view: View){
        playMusic( 5 )
    }

    fun song6(view: View){
        playMusic( 6 )
    }

    fun song7(view: View){
        playMusic( 7 )
    }

    fun song8(view: View){
        playMusic( 8 )
    }



    fun playMusic( songId: Int ) {

        val intent = Intent(this, musicPlayer::class.java).apply {
            putExtra(EXTRA_MESSAGE, "" + songId + "")
        }
        startActivity(intent)
    }
}