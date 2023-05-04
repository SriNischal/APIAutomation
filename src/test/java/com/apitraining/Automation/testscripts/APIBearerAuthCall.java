package com.apitraining.Automation.testscripts;


import org.testng.annotations.Test;

import com.apitraining.Automation.util.APIutil;


public class APIBearerAuthCall {

	@Test
	public void bearerauth() {
		APIutil util = new APIutil();
		util.bearerauth();

	}

}
