package com.apitraining.Automation.utils;



import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Helperutil{	
	
	public void apiputcall() {
		Response response = RestAssured.given().when().post("/users").then().log().all().extract().response();
		System.out.println(response);
	}
//	public void apigetcall() {
//		Response finalcall = getcall.then().log().all().extract().response();
//		System.out.println(finalcall);
//	}
////	public void apipostcall() {
////		Response finalcall = postcall.then().log().all().extract().response();
////		System.out.println(finalcall);
////	}
//	public void apipatchcall() {
//		Response finalcall = patchcall.then().log().all().extract().response();
//		System.out.println(finalcall);
//	}
//	public void apideletecall() {
//		Response finalcall = deletecall.then().log().all().extract().response();
//		System.out.println(finalcall);
//	}

}
