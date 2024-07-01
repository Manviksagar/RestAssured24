package com.sag.appium.RestAssued1;

import com.sag.baseRun.BaseTest;
import com.sag.baseRun.BaseTest1;
import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class TestAuthorization1 extends BaseTest1 {
	
	@Test
	public void getAuthorization() {
		
		int code=RestAssured.given().when().get().getStatusCode();
		System.out.println(code);
		
	}

}
