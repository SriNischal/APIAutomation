package com.apitraining.Automation.utils;

import java.io.FileInputStream;
import java.util.Properties;

import com.apitraining.Automation.interfac.APIInterface;

import io.restassured.RestAssured;
import io.restassured.config.Config;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class APIutil implements APIInterface{
	
	public void apideletecall() {
		Response response = RestAssured.given().baseUri().param(parameter,value).when().delete("/users").then().log().all().extract().response();
		System.out.println(response.getBody().asString());
	}

	public void apigetcall() {
		Response response = RestAssured.given().param(parameter, value).when().get("/users").then().log()
				.all().extract().response();
		System.out.println(response.getBody().asString());
	}

	public void apipostcall() {
		Response response = RestAssured.given().baseUri(url).body(postpayload_str.toString()).post("/users").then().log().all().extract().response();
		System.out.println(response);
	}

	public void apipatchcall() {
		Response response = RestAssured.given().baseUri(url).body(patchpayload_str.toString()).patch("/users/1").then().log().all().extract().response();
		System.out.println(response);
	}

	public void apiputcall() {
		Response response = RestAssured.given().baseUri(url).body(putpayload_str.toString()).put("/users").then().log().all().extract().response();
		System.out.println(response);
	}
	
	public void bearerauth() {
		Response response = RestAssured.given().baseUri("https://reqres.in/api").header("Auth", token).when().get("/users/1").then().log().all().extract().response();
		System.out.println(response.getBody().asString());	
	}

	public void basicauth() {
		Response response = RestAssured.given().baseUri(url).auth().basic(username, password).param(parameter, value).when().get("/users").then().log().all().extract().response();
		System.out.println(response.getBody().asString());
	}

	public void akamaiauth() {
		Response response = RestAssured.given().baseUri(url).header("Auth", "client_token=UJHIUHNDKJDFOWUIFNDOWEI,access_token=LKKNDFKWENJFOWINOIEFNOWINEK,timestamp=WKEFNOWIEFNOWIENNFOIWJOIKENFOIWIEJFFOWE").param(parameter, value).when().get("/users").then().log().all().extract().response();
		System.out.println(response.getBody().asString());
	}

	public void awsauth() {
        Response response = RestAssured.given().baseUri(url).header("Authorization", "AccessKey=LJLASNFOWEJNF,SecretKey=KJNSDKWELWKENFPOWEJMFPOWIEFNOLWEBEF").param(parameter, value).when().get("/users").then().log().all().extract().response();
		System.out.println(response.getBody().asString());
	}

	public void digestauth() {
		Response response = RestAssured.given().baseUri(url).auth().digest(username, password).when().get("/users").then().log().all().extract().response();
		System.out.println(response.getBody().asString());
	}

	public void hawkauth() {
		Response response = RestAssured.given().baseUri(url).header("Authorization", "Hawk id=12345, Hawk Auth key = a2V5c3RvcmUxMjM0NTY=").param(parameter, value).when().get("/users").then().log().all().extract().response();
		System.out.println(response.getBody().asString());
	}

	public void jwtauth() {
		Response response = RestAssured.given().baseUri(url).header("Auth", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c").param(parameter, value).when().get("/users").then().log().all().extract().response();
		System.out.println(response.getBody().asString());
	}

	public void apikeyauth() {
		Response response = RestAssured.given().baseUri(url).header("Authorization", keyvalue).param(parameter, value).when().get("/users").then().log().all().extract().response();
		System.out.println(response.getBody().asString());
	}

	public void ntmlauth() {
		Response response = RestAssured.given().baseUri(url).auth().ntlm(username, password, "nischal", "Nischal").param(parameter, value).when().get("/users").then().log().all().extract().response();
		System.out.println(response.getBody().asString());
	}

	public void oauth1() {
		Response response = RestAssured.given().baseUri(url)
				.header("ABC123DEF456GHI789", "secret123", token, "abcdefgh123456").when().get("/users").then().log()
				.all().extract().response();
		System.out.println(response.getBody().asString());	
	}

	public void oauth2() {
		Response response = RestAssured.given().baseUri(url).auth().oauth2(token).when().get("/users").then().log()
				.all().extract().response();
		System.out.println(response.getBody().asString());	
	}

}
