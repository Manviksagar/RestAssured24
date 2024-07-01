package com.sag.appium.RestAssued1;

import static io.restassured.RestAssured.*;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class ParamCheck {
	
	@Test
	public static void checkGet() {
	given()
		.contentType(ContentType.JSON)
		.with()
			.pathParams("id", 1)
			
		.when()
			.get("http://localhost:3000/posts/{id}")
					
		.then()
			.//body("author", containsString("typicode"));
	//body("author", is("typicode"));
	assertThat().statusCode(200).and().contentType(ContentType.JSON);
		
	
	}

}
