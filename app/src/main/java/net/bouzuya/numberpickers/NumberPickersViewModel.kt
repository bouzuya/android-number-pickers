package net.bouzuya.numberpickers

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel;

class NumberPickersViewModel : ViewModel() {
    val name = "number_pickers"
    val number1 = MutableLiveData<Int>()
}
