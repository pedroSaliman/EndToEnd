package Listners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Extent {
 public  static   ExtentReports extent;
    public static  ExtentReports extent(){
        ExtentSparkReporter reporter = new ExtentSparkReporter("E:\\seleniumprojects\\EndToEnd\\reporter\\index.html");
        reporter.config().setReportName("Web Test Auomation");
        reporter.config().setDocumentTitle("Tests Result");
        extent = new ExtentReports();
        extent.attachReporter(reporter);
        extent.setSystemInfo("Tester","Mohamed");
        
        return extent;
    }
}
