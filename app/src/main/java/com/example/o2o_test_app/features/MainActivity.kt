package com.example.o2o_test_app.features

import android.content.Context
import android.content.Intent
import android.os.Bundle
import com.example.o2o_test_app.databinding.ActivityMainBinding
import com.example.o2o_test_app.setup.BaseActivity

class MainActivity: BaseActivity() {
    //region Vars
    private lateinit var binding: ActivityMainBinding
    //endregion Vars

    //region Override Methods
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    companion object {
        private val LOGTAG: String = MainActivity::class.java.simpleName
        fun intent(context: Context) = Intent(context, MainActivity::class.java)
    }
    //endregion Override Methods
}