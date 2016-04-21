package me.emmano.daggertestexample;

import android.widget.TextView;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.annotation.Config;
import org.robolectric.util.ActivityController;

import static org.junit.Assert.assertEquals;

@RunWith(RobolectricGradleTestRunner.class)
@Config(application = DaggerTestApplication.class, sdk = 21, constants = BuildConfig.class)
public class MainActivityTest {

  private ActivityController<MainActivity> mainActivityActivityController;

  @Before public void setUp() throws Exception {

    mainActivityActivityController = Robolectric.buildActivity(MainActivity.class).create();
    TestApplicationComponent testApplicationComponent =
        ((DaggerTestApplication) RuntimeEnvironment.application).getTestApplicationComponent();
    testApplicationComponent.inject(mainActivityActivityController.get());
  }

  @Test public void textViewShouldDisplayCorrectTextBasedOnModule() throws Exception {
    mainActivityActivityController.resume();

    MainActivity testObject = mainActivityActivityController.get();

    assertEquals("test",
        ((TextView) testObject.findViewById(R.id.hello_text_view)).getText().toString());
  }
}