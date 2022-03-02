package com.example.firstappdemo

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import org.junit.Assert
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityInstrumentedTest {
    @get:Rule val activityScenarioRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        Assert.assertEquals("com.example.firstappdemo", appContext.packageName)
    }

    @Test
    fun shouldTakeDetailsInOneActivityAndDisplayInSecondActivity(){
        onView(withId(R.id.editTextPersonName)).perform(typeText("Saicharan"))
        onView(withId(R.id.editTextAge)).perform(typeText(21.toString()))
        onView(withId(R.id.editTextEmail)).perform(typeText("sai@gmail.com"))
        onView(withId(R.id.editTextPhone)).perform(typeText(9898989898.toString()))
        onView(withId(R.id.button)).perform(click())

        onView(withId(R.id.textViewName)).check(matches(withText("Saicharan")))
        onView(withId(R.id.textViewAge)).check(matches(withText("21")))
        onView(withId(R.id.textViewEmail)).check(matches(withText("sai@gmail.com")))
        onView(withId(R.id.textViewPhone)).check(matches(withText("9898989898")))

    }
}