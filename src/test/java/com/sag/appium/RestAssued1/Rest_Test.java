package com.sag.appium.RestAssued1;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class Rest_Test {
	
	@Test
	public void getData() {
		
		RestAssured.given().accept(ContentType.JSON)
		.when().get("http://localhost:3000/posts/1")
		.then().statusCode(200);
	}

	@Test(enabled = false)
	public void printData() {

		Response r =RestAssured.given().accept(ContentType.JSON)
				.when().get("http://localhost:3000/posts/1");

		System.out.println(r.jsonPath().prettify());

	}

	@Test
	public void pegaTest(){
		Response r=RestAssured.given().auth().preemptive().basic("sag","sag").get("http://localhost:8080/prweb/api/RestPKG/V1/getEmployess");
		System.out.println(r.statusCode());
		System.out.println(r.jsonPath().prettify());


	}

}
