package com.apps.calculator.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.apps.calculator.database.CalculatorDao

class MainViewModel(private val dao: CalculatorDao) : ViewModel() {


}

// View Model Factory
@Suppress("UNCHECKED_CAST")
class MainViewModelFactory(private val dao: CalculatorDao) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
            return MainViewModel(dao) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}