package com.app.onesignal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.app.onesignal.databinding.ActivityMainBinding
import com.onesignal.OneSignal

class MainActivity : AppCompatActivity() {
    private var binding:ActivityMainBinding?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)
    }
}