package net.bouzuya.numberpickers

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Rule
import org.junit.Test

class NumberPickersViewModelTest {

    @get:Rule
    val instantTaskExecutorRule = InstantTaskExecutorRule()

    @Test
    fun init() {
        val viewModel = NumberPickersViewModel()
        assertThat(viewModel.name, `is`("number_pickers"))
        assertThat(viewModel.number1.value, `is`(1))
        assertThat(viewModel.number2.value, `is`(0))
        assertThat(viewModel.result.value, `is`(10))
    }

    @Test
    fun setNumber1() {
        val viewModel = NumberPickersViewModel()
        viewModel.number1.value = 2
        assertThat(viewModel.result.value, `is`(10))
        viewModel.ok()
        assertThat(viewModel.result.value, `is`(20))
    }

    @Test
    fun setNumber2() {
        val viewModel = NumberPickersViewModel()
        viewModel.number2.value = 1
        assertThat(viewModel.result.value, `is`(10))
        viewModel.ok()
        assertThat(viewModel.result.value, `is`(11))
    }
}