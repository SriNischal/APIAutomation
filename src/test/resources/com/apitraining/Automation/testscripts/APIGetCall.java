package com.apitraining.Automation.testscripts;

import com.apitraining.Automation.helper.APIGetHelper;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class APIGetCall {
	public static void main(String [] args) {
		APIGetHelper helper = new APIGetHelper();
		helper.getcall();
	}
}
