package tests;

import actions.Action;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;
import org.w3c.dom.DOMConfiguration;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import static org.testng.ITestResult.FAILURE;

public class Base {
    ExtentReports extent = new ExtentReports();

    Action act;
    public static Properties prop;
  public static   WebDriver driver;
    @BeforeTest
    public void setup() {
        //ExtentReport
//        ExtentSparkReporter reporter = new ExtentSparkReporter("E:\\seleniumprojects\\EndToEnd\\reporter\\index.html");
//        reporter.config().setReportName("Web Test Auomation");
//        reporter.config().setDocumentTitle("Tests Result");
//        extent.attachReporter(reporter);
//        extent.setSystemInfo("Tester","Mohamed");


        try {
            prop = new Properties();
            FileInputStream ip = new FileInputStream("E:\\seleniumprojects\\EndToEnd\\src\\test\\java\\configration\\config.properties");
            prop.load(ip);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
//chrome
        WebDriverManager.chromedriver().setup();
        //firefox
        WebDriverManager.firefoxdriver().setup();
        String browserName = prop.getProperty("browser");
        if (browserName.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("FireFox")) {
            driver = new FirefoxDriver();

        }
//action class
        act = new Action(driver);
        act.implicitWait(driver,30);
        act.pageLoadTimeOut(driver,30);
        driver.manage().window().maximize();
        driver.get(prop.getProperty("url"));

        DOMConfigurator.configure("Log4g.xml");



    }
    @AfterMethod
    public void screen(ITestResult result){
        act = new Action(driver);
        if (ITestResult.FAILURE==result.getStatus()){
            act.screenShot(driver,"ScreenShots");
        }

    }

    @AfterSuite
    public void close(){
        driver.quit();
    }


}
