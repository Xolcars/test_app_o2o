package com.example.o2o_test_app.setup.di.modules

import androidx.lifecycle.ProcessLifecycleOwner.get
import com.example.o2o_test_app.features.detail.BeerDetailViewModel
import com.example.o2o_test_app.features.search.SearchBeerViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module { //TODO: Add viewModels
    viewModel { SearchBeerViewModel(get()) }
    single { BeerDetailViewModel(get()) }
}