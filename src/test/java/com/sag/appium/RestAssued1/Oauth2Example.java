package com.sag.appium.RestAssued1;

import static org.hamcrest.CoreMatchers.containsString;

//import com.sun.xml.internal.ws.client.sei.ResponseBuilder.Body;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Oauth2Example {
	public static String token;
	
	public static void tokenGeneration(){
		
		Response res1=RestAssured.given().formParam("client_id", "Sagar") 
		.formParam("client_secret", "fbb8a16b2da1b64d698e149461a28458")
		.formParam("grant_type", "client_credentials")
		.when().post("http://coop.apps.symfonycasts.com/token");
		
		  token=res1.jsonPath().get("access_token");
		  System.out.println(res1.jsonPath().prettify());
		System.out.println(token);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tokenGeneration();
		//oauth2("d7da040fcf554f883908478ebcf71e99893888aa")
		Response res=RestAssured.given().when().auth().oauth2(token)
				.post("http://coop.apps.symfonycasts.com/api/832/chickens-feed")
				//body("author", containsString("sagar"));
				;
				
		System.out.println(res.jsonPath().prettify());
		//System.out.println(res.asString());

	}

}
