package com.example.mytestbroadcastreceivers

import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

//    private val receiver= MyReceiver()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //чтобы реагировал на сообщение которые нам нужны
//        val intentFilter = IntentFilter().apply {
//            addAction(Intent.ACTION_BATTERY_LOW)
//            addAction(Intent.ACTION_AIRPLANE_MODE_CHANGED)
//        }
        //dynamic registration
//        registerReceiver(receiver,intentFilter)
    }

    override fun onDestroy() {
        super.onDestroy()
//        unregisterReceiver(receiver)
    }
}
