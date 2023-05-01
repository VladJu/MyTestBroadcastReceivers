package com.example.mytestbroadcastreceivers

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class MyReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        when (intent?.action) {
//            ACTION_LOADED ->{
//                val percent = intent.getIntExtra(EXTRA_PERCENT,0)
//                Toast.makeText(context, "Loaded:$percent", Toast.LENGTH_SHORT).show()
//            }
            ACTION_CLICKED ->{
                val count=intent.getIntExtra(EXTRA_COUNT,0)
                Toast.makeText(context, "Clicked:$count", Toast.LENGTH_SHORT).show()
            }
        }
    }

    companion object {
        const val ACTION_CLICKED = "clicked"
        const val ACTION_LOADED = "loaded"
        const val EXTRA_COUNT = "count"
        const val EXTRA_PERCENT = "percent"
    }
}
