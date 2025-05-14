package extentreports;

import java.time.LocalDateTime;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ToLearnextentreports {
	@Test
	public void createreport() {
		
		String time = LocalDateTime.now().toString().replace(":", "-");
		// step 1: create ExtentSparkReporter object
		
		ExtentSparkReporter spark=new ExtentSparkReporter("./HTML_reports/ExtentReport_"+time+".html");
		
		//step 2: create Extentreport object
		
		ExtentReports eReport=new ExtentReports();
		
		//step 3: attach ExtentSparkReporter to Extentreport
		
		eReport.attachReporter(spark);
		
		//step 4:create extentTest object
		ExtentTest test=eReport.createTest("createREport");
		
		//step5: call log(status,message)
		
		test.log(Status.PASS, "log message added into report");
		
		//step6: call flush()
		eReport.flush();
		
	}

}
