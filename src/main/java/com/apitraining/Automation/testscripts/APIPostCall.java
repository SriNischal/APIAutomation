package com.apitraining.Automation.testscripts;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class APIPostCall {

	public static void main(String[] args) {
		String url = "https://reqres.in/api";
		String payload_str = "{'name' : 'Nischal','job' : 'Software Engineer'}";
		//String ContentType = "application/json";
		Response response = RestAssured.given().baseUri(url).body(payload_str.toString()).post("/users").then().log().all().extract().response();
		System.out.println(response);
		//System.out.println("Token Value : " + response.jsonPath().get("data.Token"));
//		if(response.jsonPath().get("data")!= null) {
//			System.out.println("Token Value : " + response.jsonPath().get("data.Token"));
//		}
//		else {
//			System.out.println("Response message : " + response.jsonPath().get("data.message"));
//		}
	}

}
