package com.example.frauddetection;

import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;

public class BaseClass {

    @Before
    public void setUp() {
        RestAssuredMockMvc.standaloneSetup(new FraudController());
    }

}
