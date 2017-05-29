package com.acme.csci3130;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.view.View;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.replaceText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class SimpleEspressoTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(
            MainActivity.class);



    @Test
    public void findText()
    {
        onView(withId(R.id.editText)).perform(replaceText("Qwerty4%"));
        onView(withId(R.id.button));
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.helloText)).check(matches(withText("Valid Password!")));
        onView(withId(R.id.editText)).perform(replaceText("rgstgetgrthgrxst"));
        onView(withId(R.id.button));
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.helloText)).check(matches(withText("Invalid Password!")));
    }
}
