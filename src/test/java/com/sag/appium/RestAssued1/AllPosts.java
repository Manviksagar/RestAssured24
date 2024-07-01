package com.sag.appium.RestAssued1;




import com.fasterxml.jackson.core.type.TypeReference;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import com.sag.appium.RestAssued1.Posts;
import org.json.JSONObject;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class AllPosts {
	
	public static void main(String[] args) {
		

		/*Type type =new TypeReference<List<Posts>>(){}.getType();
		Response res=RestAssured.given().contentType(ContentType.JSON).get("http://localhost:3000/posts");
		List<Posts> ls=res.as(type);
		System.out.println(ls.get(1).toString());

		//Second way of deserilization
		Posts p[]=res.as(Posts[].class);
		System.out.println(p[1].toString());*/

		//ArrayList<Object> lr = new ArrayList<>();




	}
	
	
	
}