package com.example.o2o_test_app.features.detail

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.o2o_test_app.models.view.BeerBean
import com.example.o2o_test_app.setup.network.ApiRepository
import com.example.o2o_test_app.setup.network.ResponseResult
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class BeerDetailViewModel(private val repository: ApiRepository) : ViewModel()  {
    //region Vars
    private var _beerItem = MutableLiveData<BeerBean>()
    val beerItem: LiveData<BeerBean> = _beerItem
    //endregion Vars

    //region Methods
    fun getBeer(id: Int) {
        GlobalScope.launch(Dispatchers.Main) {
            when (val response = repository.beerById(
                id = id
            )) {
                is ResponseResult.Success -> {
                    val result = response.value.first().toViewModel()
                    _beerItem.value = result
                }
            }
        }
    }
    //endregion Methods

    companion object {
        private val LOGTAG: String = BeerDetailViewModel::class.java.simpleName
    }
}