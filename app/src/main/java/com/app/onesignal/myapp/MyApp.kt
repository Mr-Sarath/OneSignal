package com.app.onesignal.myapp

import android.app.Application
import com.app.onesignal.R
import com.onesignal.OneSignal

class MyApp:Application() {
    override fun onCreate() {
        super.onCreate()
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE)
        // OneSignal Initialization
        OneSignal.initWithContext(this)
        OneSignal.setAppId(getString(R.string.ONESIGNAL_APP_ID))
    }
}