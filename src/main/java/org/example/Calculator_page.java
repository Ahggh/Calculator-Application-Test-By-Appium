package org.example;


import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


public class Calculator_page {
static WebElement Object=null;
static WebElement NumericNumber=null;
    public static WebElement Numeric_keys_elements(AndroidDriver driver,int target_number){
        switch (target_number)
        {
            case 0:
                NumericNumber=driver.findElement(By.id("com.miui.calculator:id/digit_0"));
                break;
            case 1:
                NumericNumber=driver.findElement(By.id("com.miui.calculator:id/digit_1"));
                break;
            case 2:
                NumericNumber=driver.findElement(By.id("com.miui.calculator:id/digit_2"));
                break;
            case 3:
                NumericNumber=driver.findElement(By.id("com.miui.calculator:id/digit_3"));
                break;
            case 4:
                NumericNumber=driver.findElement(By.id("com.miui.calculator:id/digit_4"));
                break;
            case 5:
                NumericNumber=driver.findElement(By.id("com.miui.calculator:id/digit_5"));
                break;
            case 6:
                NumericNumber=driver.findElement(By.id("com.miui.calculator:id/digit_6"));
                break;
            case 7:
                NumericNumber=driver.findElement(By.id("com.miui.calculator:id/digit_7"));
                break;
            case 8:
                NumericNumber=driver.findElement(By.id("com.miui.calculator:id/digit_8"));
                break;
            case 9:
                NumericNumber=driver.findElement(By.id("com.miui.calculator:id/digit_9"));
                break;
            default:
                Assert.fail("Error Locator Numeric Number");
        }
        return NumericNumber;
    }
    public static WebElement Result_text_Box(AndroidDriver driver)
    {
        Object=driver.findElement(By.className("android.widget.EditText"));
        return Object;
    }
    public static WebElement Final_Result_Box(AndroidDriver driver){
       return Object=driver.findElement(By.id("com.miui.calculator:id/result"));
    }
    public static WebElement Clear_Btn(AndroidDriver driver){
        Object=driver.findElement(By.id("com.miui.calculator:id/btn_c_s"));
        return Object;
    }
    public static WebElement Equal_BTN(AndroidDriver driver)
    {
        Object=driver.findElement(By.id("com.miui.calculator:id/btn_equal_s"));
        return Object;
    }
    public static WebElement Addition_Btn(AndroidDriver driver){
        Object=driver.findElement(By.id("com.miui.calculator:id/op_add"));
        return Object;
    }
    public static WebElement Subtract_Btn(AndroidDriver driver){
        return Object=driver.findElement(By.id("com.miui.calculator:id/op_sub"));
    }
    public static WebElement multiply_Btn(AndroidDriver driver){
        return Object=driver.findElement(By.id("com.miui.calculator:id/op_mul"));
    }
    public static WebElement divsion_Btn(AndroidDriver driver){
        return Object=driver.findElement(By.id("com.miui.calculator:id/op_div"));
    }
    public static WebElement floating_point_Btn(AndroidDriver driver){
        return Object=driver.findElement(By.id("com.miui.calculator:id/dec_point"));
    }

}
