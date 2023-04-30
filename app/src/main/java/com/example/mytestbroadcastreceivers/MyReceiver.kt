package com.example.mytestbroadcastreceivers

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class MyReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {
        //каждая система содержит какой то экшен, для того что бы было понятно что произошло
        when(intent?.action){
            Intent.ACTION_AIRPLANE_MODE_CHANGED ->{
                Toast.makeText(context,"Airplane mode changed",Toast.LENGTH_SHORT).show()
            }
        }
    }
}
