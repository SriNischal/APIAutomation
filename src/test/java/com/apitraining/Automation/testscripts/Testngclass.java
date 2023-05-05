package com.apitraining.Automation.testscripts;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.config.Config;
import io.restassured.response.Response;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;

public class Testngclass {
	//private Properties prop;
 
  private Response response;

	@Test
	public void test() {

	}

	@BeforeMethod
	public void beforemethod() {

	}

	@AfterMethod
	public void aftermethod() {

	}

	@BeforeClass
	public void beforeclass() throws Exception {
		Properties prop = new Properties();
		JSONObject input = new JSONObject();
		input.put("name", prop.getProperty("name"));
		input.put("job", prop.getProperty("job"));
		response = RestAssured.given().baseUri(prop.getProperty("BaseURL")).body(input.toString()).auth()
				.basic(prop.getProperty("username"), prop.getProperty("password")).when().post("/users").then().log().all()
				.extract().response();
		System.out.println(response);
	}

	@AfterClass
	public void afterclass() {

	}

	@BeforeTest
	public void beforetest() throws Exception {
		Properties prop = new Properties();
		//FileInputStream path = new FileInputStream(
			//	"D:\\API Automation\\Automation\\src\\main\\resources\\properties\\config.properties");
		//prop.load(path);
		JSONObject input = new JSONObject();
		input.put("name", prop.getProperty("name"));
		input.put("job", prop.getProperty("job"));
		RestAssured.given().body(input.toString());

	}

	@AfterTest
	public void aftertest() {
		//Assert.assertEquals(response.getStatusCode(), "HTTP/1.1 200 OK" , "Validated Success");
	}

	@BeforeSuite
	public void beforeSuite() throws IOException {
		Properties prop = new Properties();
		FileInputStream path = new FileInputStream(
				"D:\\AutomationAPI\\Automation\\src\\main\\resources\\properties\\config.properties");
		prop.load(path);
		RestAssured.baseURI = prop.getProperty("BaseURL");
	}
}
