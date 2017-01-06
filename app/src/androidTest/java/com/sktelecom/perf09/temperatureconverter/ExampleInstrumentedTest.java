package com.sktelecom.perf09.temperatureconverter;

import android.app.Instrumentation;
import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {

    MainActivity mainActivity;
    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.sktelecom.perf09.temperatureconverter", appContext.getPackageName());
    }


    @Before
    public void setUp() {
        mainActivity = (MainActivity) InstrumentationRegistry.getTargetContext();

        assertNotNull(mainActivity);
    }

    public void testHasInputFields() {

    }
}
