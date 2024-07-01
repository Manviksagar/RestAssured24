package com.sag.appium.RestAssued1;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PutTest {
	
	@Test
	public void TestPut() {
		
		HashMap<String, String>hashMap=new HashMap<String, String>();
		hashMap.put("id", "2");
		hashMap.put("title", "RestAssured");
		hashMap.put("author", "Vidyasagar");
		
		Response res=RestAssured.given().contentType(ContentType.JSON).
		with()
		.body(hashMap)
		.pathParams("id", 2).
		when().put("http://localhost:3000/posts/{id}");
		
		System.out.println(res.jsonPath().prettify());
		
	}
	
	

}
