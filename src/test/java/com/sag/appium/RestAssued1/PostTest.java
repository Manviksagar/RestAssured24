package com.sag.appium.RestAssued1;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PostTest {
	
	@Test
	public void postTest() {
	Posts post=new Posts("6","SagAllusag","SDET_Test");
	
	Response res=RestAssured.given().contentType(ContentType.JSON). 
			with().body(post).
			when(). 
			post("http://localhost:3000/posts");
		System.out.println(res.asString());
	//System.out.println(res.jsonPath().prettify());

}}
