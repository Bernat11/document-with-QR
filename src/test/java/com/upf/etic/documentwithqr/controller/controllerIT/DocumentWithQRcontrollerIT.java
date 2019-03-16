package com.upf.etic.documentwithqr.controller.controllerIT;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

import static com.upf.etic.documentwithqr.constants.ApplicationConstants.APPLICATION_HOST;
import static com.upf.etic.documentwithqr.constants.ApplicationConstants.APPLICATION_PORT;
import static io.restassured.RestAssured.given;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class DocumentWithQRcontrollerIT extends AbstractTestNGSpringContextTests {

    @Test
    public void encodeUrlSuccess() throws MalformedURLException {
        given().
                header("url", "http://www.google.es").
                header("height", 300).
                header("width", 300).
                header("id", "1000").
        when().
                get(APPLICATION_HOST + APPLICATION_PORT + "/api/encodeurl").
        then().
                statusCode(200);

    }

}