package com.sag.appium.RestAssued1;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class AppTest{
	
	public static void main(String[] args) {
		
		Response res=RestAssured.get("http://localhost:3000/posts/1");
		System.out.println(res.asString());
		//System.out.println(res);
		
		Posts post=res.getBody().as(Posts.class);
		System.out.println(post.getAuthor());
		
	}
	
	
	
}