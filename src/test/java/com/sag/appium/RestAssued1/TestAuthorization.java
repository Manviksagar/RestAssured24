package com.sag.appium.RestAssued1;

import org.testng.annotations.Test;

import com.sag.baseRun.BaseTest;

import io.restassured.RestAssured;

public class TestAuthorization extends BaseTest{
	
	@Test
	public void getAuthorization() {
		
		int code=RestAssured.given().when().get().getStatusCode();
		System.out.println(code);
		
	}

}
