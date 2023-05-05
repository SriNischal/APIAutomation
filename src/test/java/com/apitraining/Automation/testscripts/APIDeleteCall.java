package com.apitraining.Automation.testscripts;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.apitraining.Automation.interfac.APIInterface;
import com.apitraining.Automation.utils.APIutil;
import com.apitraining.Automation.utils.Helperutil;



public class APIDeleteCall{
	@Test
	public void deletecall() {
		APIutil util = new APIutil();
		util.apideletecall();
	}
}
