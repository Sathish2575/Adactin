package com.reports;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Reporting {
	/**
	 * @Descrption Used to perform generate report
	 * @param jsonFile
	 */
	public static void generatereport(String jsonFile) {

		File file = new File(System.getProperty("user.dir")+"\\target");

		Configuration configuration = new Configuration(file, "OMRBranchAdactinHotelAutomation");
		configuration.addClassifications("Brower", "Chrome");
		configuration.addClassifications("Brower Version", "104");
		configuration.addClassifications("OS", "WIN10");
		configuration.addClassifications("Sprint", "43");

		List<String> jsonFiles = new ArrayList<String>();
		jsonFiles.add(jsonFile);

		ReportBuilder report = new ReportBuilder(jsonFiles, configuration);
		report.generateReports();

	}

}
