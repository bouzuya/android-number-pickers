package net.bouzuya.numberpickers

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

object ServiceLocator {
    // public for testing
    var numberPickersViewModelFactory: ViewModelProvider.Factory? = null

    fun providesNumberPickersViewModelFactory(): ViewModelProvider.Factory {
        if (numberPickersViewModelFactory == null) {
            numberPickersViewModelFactory = object : ViewModelProvider.Factory {
                @Suppress("UNCHECKED_CAST")
                override fun <T : ViewModel?> create(modelClass: Class<T>): T {
                    return NumberPickersViewModel() as T
                }
            }
        }
        return numberPickersViewModelFactory ?: throw IllegalStateException()
    }
}
