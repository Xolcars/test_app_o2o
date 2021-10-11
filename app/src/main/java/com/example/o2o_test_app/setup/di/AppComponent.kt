package com.example.o2o_test_app.setup.di

import com.example.o2o_test_app.setup.di.modules.networkModule
import com.example.o2o_test_app.setup.di.modules.preferencesModule
import com.example.o2o_test_app.setup.di.modules.repositoryModule
import com.example.o2o_test_app.setup.di.modules.viewModelModule


val appComponent = listOf(networkModule, repositoryModule, preferencesModule, viewModelModule)