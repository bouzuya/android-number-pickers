package net.bouzuya.numberpickers

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.Test

class HomeViewModelTest {
    @Test
    fun init() {
        val viewModel = HomeViewModel()
        MatcherAssert.assertThat(viewModel.name, CoreMatchers.`is`("home"))
    }
}