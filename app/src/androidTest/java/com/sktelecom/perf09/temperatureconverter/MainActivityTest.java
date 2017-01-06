package com.sktelecom.perf09.temperatureconverter;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.EditText;

import junit.framework.TestCase;

/**
 * Created by nckwon on 2017. 1. 6..
 */
public class MainActivityTest extends ActivityInstrumentationTestCase2 {
    private MainActivity mainActivity;

    EditText mCelsius;
    EditText mFahrenheit;

    public MainActivityTest() {
        this("MainActivityTest");
    }
    public MainActivityTest(String name) {
        super(MainActivity.class);
        super.setName(name);
    }

    protected void setUp() throws Exception {
        super.setUp();
        mainActivity = (MainActivity)getActivity();
        assertNotNull(mainActivity);

        mCelsius = (EditText)mainActivity.findViewById(R.id.celsius);
        mFahrenheit = (EditText)mainActivity.findViewById(R.id.fahrenheit);
    }

    public void testOnCreate() throws Exception {

    }

    public final void testHasInputFields() {
        assertNotNull(mCelsius);
        assertNotNull(mFahrenheit);
    }

}