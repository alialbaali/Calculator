package com.apps.calculator.viewmodel

import android.util.Log
import android.view.View
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.apps.calculator.R
import com.apps.calculator.database.CalculatorDao
import com.apps.calculator.domain.Calculation
import kotlinx.coroutines.*

class MainViewModel(private val dao: CalculatorDao) : ViewModel() {
    val operation = MutableLiveData<String>()
    val result = MutableLiveData<String>()
    private val job = Job()
    private val scope = CoroutineScope(job + Dispatchers.Main)


    fun onClick(v: View) {
        operation.value = (operation.value ?: "") + when (v.id) {
            R.id.button0 -> "0"
            R.id.button1 -> "1"
            R.id.button2 -> "2"
            R.id.button3 -> "3"
            R.id.button4 -> "4"
            R.id.button5 -> "5"
            R.id.button6 -> "6"
            R.id.button7 -> "7"
            R.id.button8 -> "8"
            R.id.button9 -> "9"
            R.id.plusButton -> Signs.PLUS.sign
            R.id.multiplyButton -> Signs.MULTIPLY.sign
            R.id.divisionButton -> Signs.DIVISION.sign
            R.id.minusButton -> Signs.MINUS.sign
            else -> ("")
        }
        Log.i("MainViewModel", "${operation.value}")

    }

    fun onEqual() {
        calculate()
        scope.launch {
            if (!operation.value.isNullOrEmpty() && result.value.isNullOrEmpty()) {
                val calculation = Calculation(operation = operation.value, result = result.value)
                withContext(Dispatchers.IO) {
                    dao.insert(calculation)
                }
            }
        }
    }

    private fun calculate() {
        val value = operation.value!!
        var index: Int?
        var firstStr: Double?
        var lastStr: Double?
        for (i in 1 until value.length) {
            if (value[i].toString() == (Signs.PLUS.sign)) {
                index = value.indexOf(Signs.PLUS.sign)
                firstStr = value.substring(0, index).toDouble()
                lastStr = value.substring(index + 1).toDouble()
                result.value = (firstStr.plus(lastStr)).toString()
            } else if (value[i].toString() == (Signs.MINUS.sign)) {
                index = value.indexOf(Signs.MINUS.sign)
                firstStr = value.substring(0, index).toDouble()
                lastStr = value.substring(index + 1).toDouble()
                result.value = (firstStr.minus(lastStr)).toString()
            } else if (value[i].toString() == (Signs.MULTIPLY.sign)) {
                index = value.indexOf(Signs.MULTIPLY.sign)
                firstStr = value.substring(0, index).toDouble()
                lastStr = value.substring(index + 1).toDouble()
                result.value = (firstStr.times(lastStr)).toString()
            } else if (value[i].toString() == (Signs.DIVISION.sign)) {
                index = value.indexOf(Signs.DIVISION.sign)
                firstStr = value.substring(0, index).toDouble()
                lastStr = value.substring(index + 1).toDouble()
                result.value = (firstStr.div(lastStr)).toString()
            }
        }
    }


    fun onClear() {
        operation.value = null
        result.value = null
    }

}


class MainViewModelFactory(
    private val dao: CalculatorDao
) : ViewModelProvider.Factory {
    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
            return MainViewModel(dao) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}

enum class Signs(val sign: String) {
    PLUS("\u002B"),
    MINUS("\u002D"),
    MULTIPLY("\u00D7"),
    DIVISION("\u00F7")
}