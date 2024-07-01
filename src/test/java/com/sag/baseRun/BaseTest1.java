package com.sag.baseRun;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;

public class BaseTest1 {
	
	@BeforeClass
	public void setup() {
		
		RestAssured.authentication=RestAssured.preemptive().basic("sag", "sag");
		RestAssured.baseURI="http://localhost:8487/";
	}
         	
}
