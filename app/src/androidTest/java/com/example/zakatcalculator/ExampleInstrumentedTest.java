/*
 * Copyright © [2023] by [Nurul Qistina Binti Osman Talib]. All rights reserved.
 *
 * This work is for course ICT602 , Sir Hafiz .
 * This work, including all text, images, and other content, is a proprietary of me .
 * Any unauthorized use, reproduction, or distribution is strictly prohibited.
 *
 *
 *
 */

package com.example.zakatcalculator;

import android.content.Context;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        assertEquals("com.example.zakatcalculator", appContext.getPackageName());
    }
}