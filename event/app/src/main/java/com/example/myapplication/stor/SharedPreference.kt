package com.example.myapplication.stor

import android.content.Context

class SharedPreference(context: Context) {

    private val PREFERENCE_FILE = "PrefFile"

    private val APP_PREF_NAME = "Name"

    private  val APP_PREF_AGE = "Age"

    private val preference = context.getSharedPreferences(PREFERENCE_FILE, Context.MODE_PRIVATE)

    var name: String?
        get() = preference.getString(APP_PREF_NAME,"")
        set(value) = preference.edit().putString(APP_PREF_NAME, value).apply()

    var age: Int
        get() = preference.getInt(APP_PREF_AGE, -1)
        set(value) = preference.edit().putInt(APP_PREF_AGE,value).apply()



}