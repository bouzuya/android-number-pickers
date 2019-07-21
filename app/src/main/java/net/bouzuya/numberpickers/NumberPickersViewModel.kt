package net.bouzuya.numberpickers

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NumberPickersViewModel : ViewModel() {
    private val _result = MutableLiveData<Int>().also { it.value = 10 }
    val name = "number_pickers"
    val number1 = MutableLiveData<Int>().also { it.value = 1 }
    val number2 = MutableLiveData<Int>().also { it.value = 0 }
    val result: LiveData<Int> = _result

    fun ok() {
        val n1 = number1.value?.let { it * 10 } ?: 0
        val n2 = number2.value ?: 0
        _result.value = n1 + n2
    }
}
