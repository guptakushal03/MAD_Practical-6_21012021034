package com.example.mad_practical_6_21012021034

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var playAudio:FloatingActionButton=findViewById<FloatingActionButton>(R.id.startButton);
        playAudio.setOnClickListener { play() }
        var stopAudio:FloatingActionButton=findViewById<FloatingActionButton>(R.id.stopButton);
        stopAudio.setOnClickListener { stop() };
    }

    fun play(){
        Intent(applicationContext, MyService::class.java).putExtra(MyService.PLAYERKEY, MyService.PLAYERVALUE).apply{startService(this)}
    }

    fun stop(){
        Intent(applicationContext, MyService::class.java).putExtra(MyService.PLAYERKEY, MyService.PLAYERVALUE).apply{stopService(this)}
    }

}