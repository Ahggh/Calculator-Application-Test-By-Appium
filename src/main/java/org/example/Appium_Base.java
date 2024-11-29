package org.example;



import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;




import java.net.MalformedURLException;
import java.net.URL;


public class Appium_Base {


    public static AndroidDriver Appium_configuration(String Remote_Access, String DeviceName, String UDID_Val, String Platform_Version, String Cal_App_package, String Page_activity, String Automator_Driver) throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName(DeviceName);
        options.setAutomationName(Automator_Driver);
        options.setUdid(UDID_Val);
        options.setPlatformName("Android");
        options.setPlatformVersion(Platform_Version);
        options.setSkipDeviceInitialization(true);
        options.setCapability("appium:ignoreHiddenApiPolicyError", true); // Ignore hidden AP
        options.setAppPackage(Cal_App_package);
        options.setAppActivity(Page_activity);
        options.setCapability("noReset", true);
        options.setCapability("fullReset", false);

        URL remoteUrl = new URL(Remote_Access);
        return new AndroidDriver(remoteUrl, options);


    }
}
