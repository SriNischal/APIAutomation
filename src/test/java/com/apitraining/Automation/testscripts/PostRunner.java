package com.apitraining.Automation.testscripts;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class PostRunner extends Testngclass{
  @Test
  public void f() {
	  Response response = RestAssured.given().when().post("/users").then().log().all().extract().response();
		System.out.println(response);
  }
}
