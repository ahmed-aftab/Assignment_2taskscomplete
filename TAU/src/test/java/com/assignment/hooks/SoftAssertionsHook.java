package com.assignment.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.assertj.core.api.SoftAssertions;

public class SoftAssertionsHook{
    public static SoftAssertions SoftAssert;
    @Before(order = 2)
    public void beforeSoftAssertion(){
        SoftAssert=new SoftAssertions();


    }
    @After
    public void afterSoftAssertion(){
        SoftAssert.assertAll();

    }
}
