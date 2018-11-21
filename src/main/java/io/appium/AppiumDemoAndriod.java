package io.appium;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * @ClassName AppiumDemoAndriod
 * @Description Android-AppiumDemo
 * @Author huangxiang
 * @Date 2018/11/21 3:48 PM
 * @Version 1.0
 **/
public class AppiumDemoAndriod {
        private AndroidDriver driver;

        @BeforeClass
        public void setUp() throws MalformedURLException {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("platformVersion", "8.0");
            capabilities.setCapability("deviceName", "emulator-5554");
            capabilities.setCapability("app", "/Users/huangxiang/Downloads/ApiDemos-debug.apk");
            capabilities.setCapability("appPackage", "io.appium.android.apis");
            capabilities.setCapability("appActivity","ApiDemos");
            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        }


    @AfterClass
    public void tearDown() {
        driver.quit();
    }



    @Test
    public void testDemo()  {


    }

}
