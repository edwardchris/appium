package io.appium;

import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * @ClassName AppiumDemoIOS
 * @Description IOS-AppiumDemo
 * @Author huangxiang
 * @Date 2018/11/21 3:28 PM
 * @Version 1.0
 **/
public class AppiumDemoIOS {

    private IOSDriver driver;


    @BeforeClass
    public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "ios");
        capabilities.setCapability("platformVersion", "12.1");
        capabilities.setCapability("deviceName", "iPhone XS Max");
        capabilities.setCapability("app", "/Users/huangxiang/Downloads/TestApp.app");
        capabilities.setCapability("noReset", true);

        driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }


    @AfterClass
    public void tearDown() {
        driver.quit();
    }



    @Test
    public void testDemo()  {


    }


}
