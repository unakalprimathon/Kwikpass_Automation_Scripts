package com.kwikpass.utilities;

//Listener class used to generate Extent reports

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Report extends TestListenerAdapter {
	public ExtentHtmlReporter htmlReporter;
	public ExtentReports extent;
	public ExtentTest logger;

	public void onStart(ITestContext testContext) {
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd").format(new Date());// time stamp
		String repName = "Kwikpass-Automation-Testing-Report-" + timeStamp + ".html";
		String fileName = "Kwikpass-Automation-Testing-Report-" + timeStamp + ".html";
		String filePath = System.getProperty("user.dir") + "/test-output/";

		// Check if the file already exists
		File reportFile = new File(filePath + fileName);
		if (reportFile.exists()) {
			// If it exists, delete the file
			boolean isDeleted = reportFile.delete();
			if (isDeleted) {
				System.out.println("Existing report file deleted.");
			} else {
				System.out.println("Failed to delete existing report file.");
			}
		}

		htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") + "/test-output/" + repName);// specify location of the report
		htmlReporter.loadXMLConfig(System.getProperty("user.dir") + "/extent-config.xml");

		extent = new ExtentReports();

		extent.attachReporter(htmlReporter);
		extent.setSystemInfo("Host name", "localhost");
		extent.setSystemInfo("Environemnt", "QA");
		extent.setSystemInfo("user", "Naveen_Unakal");

		htmlReporter.config().setDocumentTitle("Kwikpass Automation Testing Report"); // Tile of report
		htmlReporter.config().setReportName("Kwikpass Automation Testing Report"); // name of the report
		htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP); // location of the chart
		htmlReporter.config().setTheme(Theme.DARK);
	}

	public void onTestSuccess(ITestResult tr) {
		logger = extent.createTest(tr.getName()); // create new entry in the report
		logger.log(Status.PASS, MarkupHelper.createLabel(tr.getName(), ExtentColor.GREEN)); // send the passed
																							// information to the report
																							// with GREEN color
																							// highlighted
	}

	public void onTestFailure(ITestResult tr) {
		logger = extent.createTest(tr.getName()); // create new entry in the report
		logger.log(Status.FAIL, MarkupHelper.createLabel(tr.getName(), ExtentColor.RED)); // send the passed information
																							// to the report with GREEN
																							// color highlighted

		String screenshotPath = System.getProperty("user.dir") + "\\Screenshot\\" + tr.getName() + ".png";

		File f = new File(screenshotPath);

		if (f.exists()) {
			try {
				logger.fail("Screenshot is below:" + logger.addScreenCaptureFromPath(screenshotPath));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	public void onTestSkipped(ITestResult tr) {
		logger = extent.createTest(tr.getName()); // create new entry in the report
		logger.log(Status.SKIP, MarkupHelper.createLabel(tr.getName(), ExtentColor.ORANGE));
	}

	public void onFinish(ITestContext testContext) {
		extent.flush();
	}
}