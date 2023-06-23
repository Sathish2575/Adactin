package com.stepdefinition;

import java.io.FileNotFoundException;

import java.io.IOException;

import com.base.Base_Class;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

/**
 * 
 * @author Sathish Kumar
 * @Descrption Used to perform hookclass testcases
 * @Date 22-Sep-2022
 */

public class HookClass extends Base_Class{
	/**
	 * @Descrption User to perform driver, url and maximize the window
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	@Before
	public void BeforeScenario() throws FileNotFoundException, IOException {
		
		getDriver(getPropertyFileValue("brower"));
		getUrl(getPropertyFileValue("url"));
		Maximizewindow();
	}
	/**
	 * @Descrption Used to perform take a screenshot and close a window
	 * @param Scenario
	 */
	@After
	public void AfterScenario(Scenario Scenario) {
		Scenario.attach(getScreeenShot(), "image/png", "EveryScenario");
		closewindow();
	
	}

}
