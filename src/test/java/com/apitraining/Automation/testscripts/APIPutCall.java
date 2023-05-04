package com.apitraining.Automation.testscripts;

import org.testng.annotations.Test;

import com.apitraining.Automation.utils.Helperutil;



public class APIPutCall extends Testngclass{

	@Test
	public void putcall() {
		Helperutil util = new Helperutil();
		util.apiputcall();
	}

}
