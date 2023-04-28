package com.apitraining.Automation.testscripts;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class APIPatchCall {

	public static void main(String[] args) {
		String url = "https://reqres.in/api";
		String payload_str = "{'name' : 'Sri Nischal','job' : 'Senior Software Engineer'}";
		Response response = RestAssured.given().baseUri(url).body(payload_str.toString()).patch("/users/1").then().log().all().extract().response();
		System.out.println(response);
	}

}
