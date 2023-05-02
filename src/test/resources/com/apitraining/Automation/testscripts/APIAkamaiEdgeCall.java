package com.apitraining.Automation.testscripts;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class APIAkamaiEdgeCall {
	public static void main(String[] args) {
		String url = "https://reqres.in/api";
		String parameter = "id";
		String value = "1";
		String username = "sr@example.com";
		String password = "Nischal";
		String array = "{'id' : '1', 'name' : 'Nischal'}";
		Response response = RestAssured.given().baseUri(url).header("Auth", "client_token=UJHIUHNDKJDFOWUIFNDOWEI,access_token=LKKNDFKWENJFOWINOIEFNOWINEK,timestamp=WKEFNOWIEFNOWIENNFOIWJOIKENFOIWIEJFFOWE").param(parameter, value).when().get("/users").then().log().all().extract().response();
		System.out.println(response.getBody().asString());
	}

}
