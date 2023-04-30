package com.example.mytestbroadcastreceivers

import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    private val receiver= MyReceiver()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //чтобы реагировал на сообщение которые нам нужны
        val intentFilter = IntentFilter(Intent.ACTION_BATTERY_LOW)
        registerReceiver(receiver,intentFilter)
    }

    override fun onDestroy() {
        super.onDestroy()
        //чтобы не было утечек памяти
        //отписку делать в противоположном методе onStart - onStop/ onCreate - onDestroy и тд
        unregisterReceiver(receiver)
    }
}
