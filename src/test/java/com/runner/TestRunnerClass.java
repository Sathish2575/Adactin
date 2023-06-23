package com.runner;

import org.junit.AfterClass;

import org.junit.runner.RunWith;

import com.reports.Reporting;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

/**
 * 
 * @author Sathish Kumar
 * @Descrption Used to run feature file and run to generate json report 
 * @Date 22-Sep-2022
 *
 */
@RunWith(Cucumber.class)
@CucumberOptions(stepNotifications = true, dryRun = false, monochrome = true, plugin = { "pretty",
		"json:target/output.json" }, glue = "com.stepdefinition", features = "src\\test\\resources")

public class TestRunnerClass {

	/**
	 * @Descrption Used to generate report
	 */
	
	@AfterClass

	public static void afterclass() {

		Reporting.generatereport(System.getProperty("user.dir")+"\\target\\output.json");

	}

}
