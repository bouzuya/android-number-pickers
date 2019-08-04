package net.bouzuya.numberpickers

import android.widget.NumberPicker
import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.hamcrest.Matchers.`is`
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class NumberPickersFragmentTest {

    @Test
    fun initialView() {
        launchFragmentInContainer<NumberPickersFragment>()

        onView(withId(R.id.numberPicker1))
            .check(matches(isDisplayed()))
            .check { view, noViewFoundException ->
                if (noViewFoundException != null) throw noViewFoundException
                if (view !is NumberPicker) throw IllegalStateException()
                assertThat(view.value, `is`(1))
            }
        onView(withId(R.id.numberPicker2))
            .check(matches(isDisplayed()))
            .check { view, noViewFoundException ->
                if (noViewFoundException != null) throw noViewFoundException
                if (view !is NumberPicker) throw IllegalStateException()
                assertThat(view.value, `is`(0))
            }
        onView(withId(R.id.okButton)).check(matches(isDisplayed()))
        onView(withId(R.id.resultTextView))
            .check(matches(isDisplayed()))
            .check(matches(withText("10")))
    }
}