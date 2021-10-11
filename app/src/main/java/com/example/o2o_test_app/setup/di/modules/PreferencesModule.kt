package com.example.o2o_test_app.setup.di.modules

import com.example.o2o_test_app.setup.Prefs
import org.koin.android.ext.koin.androidApplication
import org.koin.dsl.module

val preferencesModule = module {
    factory { Prefs(androidApplication()) }
}