package com.apitraining.Automation.testscripts;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.apitraining.Automation.interfac.APIInterface;
import com.apitraining.Automation.util.APIutil;
import com.apitraining.Automation.util.Helperutil;


public class APIDeleteCall{
	@Test
	public void deletecall() {
		Helperutil util = new Helperutil();
		util.apideletecall();
	}
}
