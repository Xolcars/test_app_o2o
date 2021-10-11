package com.example.o2o_test_app.setup

import android.content.Context
import android.content.SharedPreferences
import com.example.o2o_test_app.BuildConfig.APPLICATION_ID

class Prefs(context: Context) {
    //region Vars
    private val FILENAME = "${APPLICATION_ID}.prefs"

    private val TOKEN = "TOKEN"

    private val LAST_DAY_CONNECTED = "LAST_DAY_CONNECTED"
    //endregion

    private val prefs: SharedPreferences =
        context.getSharedPreferences(FILENAME, Context.MODE_PRIVATE)

    //region UserPrefs
    var token: String?
        get() = prefs.getString(TOKEN, "")
        set(value) = prefs.edit().putString(TOKEN, value).apply()
    //endregion

    //region OtherPrefs
    var lastDayConnected: String?
        get() = prefs.getString(LAST_DAY_CONNECTED, "")
        set(value) = prefs.edit().putString(LAST_DAY_CONNECTED, value).apply()
    //endregion

    //region Methods
    //endregion Methods

    //region Clear and remove Prefs
    fun clear(): Boolean {
        return prefs.edit().clear().commit()
    }

    private fun remove(key: String) {
        prefs.edit().remove(key).apply()
    }
    //endregion
}