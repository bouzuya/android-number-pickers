package net.bouzuya.numberpickers

import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.runner.AndroidJUnit4
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mockito.mock
import org.mockito.Mockito.verify

@RunWith(AndroidJUnit4::class)
class HomeFragmentTest {
    @Test
    fun clickButton_navigateToNumberPickersFragment() {
        val navController = mock(NavController::class.java)
        launchFragmentInContainer<HomeFragment>().onFragment { fragment ->
            Navigation.setViewNavController(fragment.view!!, navController)
        }
        onView(withId(R.id.button)).perform(click())
        val action = HomeFragmentDirections.actionHomeFragmentToNumberPickersFragment()
        verify(navController).navigate(action)
    }
}