package com.example.landscapeandportraitlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    private lateinit var seekbar: SeekBar
    private lateinit var seekbarLabel: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        seekbar = findViewById(R.id.seekbar)
        seekbarLabel= findViewById(R.id.seekbarLabel)

        val initialprogress = seekbar.progress
        updatelabel(initialprogress)

        seekbar.setOnSeekBarChangeListener( object: SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seekbarComponet : SeekBar?, progress: Int, fromUser: Boolean) {
               updatelabel(progress)
            }
            override fun onStartTrackingTouch(p0: SeekBar?) {}
            override fun onStopTrackingTouch(p0: SeekBar?) {}
        })

    }
    private fun updatelabel(progress: Int ){
        seekbarLabel.text = getString(R.string.seekbar_value_message, progress)

    }
}