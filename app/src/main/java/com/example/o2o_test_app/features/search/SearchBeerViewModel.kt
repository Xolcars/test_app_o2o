package com.example.o2o_test_app.features.search

import androidx.appcompat.widget.SearchView
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.o2o_test_app.models.view.SearchBeerBean
import com.example.o2o_test_app.setup.network.ApiRepository
import com.example.o2o_test_app.setup.network.ResponseResult
import kotlinx.coroutines.*

class SearchBeerViewModel(private val repository: ApiRepository) : ViewModel() {
    //region Vars
    private var _beerList = MutableLiveData<MutableList<SearchBeerBean>>()
    val beerList: LiveData<MutableList<SearchBeerBean>> = _beerList

    private val _isLoading = MutableLiveData<Boolean>()
    val isLoading: LiveData<Boolean> = _isLoading
    private val _onError = MutableLiveData<Boolean>()
    val onError: LiveData<Boolean> = _onError
    private val _onErrorMessage = MutableLiveData<String>()
    val onErrorMessage: LiveData<String> = _onErrorMessage
    private val _isEmpty = MutableLiveData<Boolean>()
    val isEmpty: LiveData<Boolean> = _isEmpty
    //endregion Vars

    fun performSearch(inputText: String) {
        _isLoading.value = true
        _onError.value = false
        _isEmpty.value = false
        GlobalScope.launch(Dispatchers.Main) {
            when (val response = repository.searchBeers(
                searchInput = inputText
            )) {
                is ResponseResult.Success -> {
                    if (response.value.isEmpty()) {
                        _isEmpty.value = true
                        _beerList.value = ArrayList()
                    } else {
                        _isEmpty.value = false
                        val result = response.value.map { it.toViewModel() }.toMutableList()
                        _beerList.value = result
                    }
                    _isLoading.value = false
                }
                is ResponseResult.Error -> {
                    _onError.value = true
                    _isLoading.value = false
                    _onErrorMessage.value = response.message
                }
                is ResponseResult.NotContent -> {
                    _isEmpty.value = true
                    _isLoading.value = false
                    _beerList.value = ArrayList()
                }
            }
        }
    }

    fun clearSearch() {
        _isLoading.value = false
        _onError.value = false
        _isEmpty.value = true
        _beerList.value = ArrayList()
    }
}