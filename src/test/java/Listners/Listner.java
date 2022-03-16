package Listners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listner implements ITestListener{
    ExtentReports extent=Extent.extent();
    ExtentTest test;

    @Override
    public void onTestStart(ITestResult result) {
        ITestListener.super.onTestStart(result);
     test= extent.createTest(result.getMethod().getMethodName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
       // ITestListener.super.onTestSuccess(result);
        test.log(Status.PASS,"Succes");
    }

    @Override
    public void onTestFailure(ITestResult result) {
//        ITestListener.super.onTestFailure(result);
        test.log(Status.FAIL,"FAIL");

    }

    @Override
    public void onTestSkipped(ITestResult result) {
//        ITestListener.super.onTestSkipped(result);
        test.log(Status.SKIP,"SKIP");

    }

    @Override
    public void onFinish(ITestContext context) {
        ITestListener.super.onFinish(context);
        extent.flush();
    }
}
