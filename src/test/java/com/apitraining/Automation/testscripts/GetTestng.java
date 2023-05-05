package com.apitraining.Automation.testscripts;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.expectThrows;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class GetTestng {
	private FileInputStream path;
	private Properties prop;
	private RequestSpecification request;
	private Response response;
	
	@BeforeSuite
	public void beforeSuite() {
		prop = new Properties();
		try {
			path = new FileInputStream(
					"D:\\AutomationAPI\\Automation\\src\\main\\resources\\properties\\config.properties");
		} catch (FileNotFoundException e) {
			System.out.println("file not found");
		}
		try {
			prop.load(path);
		} catch (IOException e) {
			System.out.println("path is invalid");
		}
		RestAssured.baseURI = prop.getProperty("BaseURL");
		System.out.println(prop.getProperty("BaseURL"));
	}

	@BeforeTest
	public void beforeTest(){
		request = RestAssured.given().auth().basic(prop.getProperty("username"), prop.getProperty("password")).param(prop.getProperty("parameter"), prop.getProperty("value"));
		System.out.println(request);
	}
	
	@Test
	public void f() {
		response = request.when().get("/users").then().log()
				.all().extract().response();
		System.out.println(response);
	}

	@AfterTest
	public void afterTest() {
		Assert.assertEquals(response.getStatusLine(), "HTTP/1.1 200 OK" , "Validated Success");
		System.out.println("Response is successfully validated");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("Suite executed successfully");
	}

}
