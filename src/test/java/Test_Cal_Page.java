import io.appium.java_client.android.AndroidDriver;
import org.example.Appium_Base;
import org.example.Calculator_page;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.time.Duration;

public class Test_Cal_Page {
    private AndroidDriver driver = null; // AndroidDriver instance to interact with the app

    // Initialize the app and device settings before the tests
    @Parameters({"Remote_Access", "DeviceName", "UDID", "Platform", "APP_Package", "App_Activity_Calculator", "Automator_Name"})
    @BeforeClass
    public void Calculator_init(String Remote_Access, String DeviceName, String UDID_Val, String Platform_Version, String Cal_App_package, String Page_activity, String Automator_Driver) throws MalformedURLException {
        // Setting up the Appium configuration for remote or local execution
        driver = Appium_Base.Appium_configuration(Remote_Access, DeviceName, UDID_Val, Platform_Version, Cal_App_package, Page_activity, Automator_Driver);
    }

        // Test case for validating that numeric keys enter numbers correctly
        @Test(priority = 0)
        public void validate_That_user_can_enter_number_correctly_through_Numeric_keys() throws InterruptedException {
            // Set implicit wait for elements to load
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

            // Loop to test numeric keys (0-9)
            for (int counter = 0; counter < 10; counter++) {
                // Click each numeric key based on counter value
                Calculator_page.Numeric_keys_elements(driver, counter).click();

                // Get the actual result from the result text box
                String Actual_Number = Calculator_page.Result_text_Box(driver).getText();

                // Expected result should be the string representation of the counter
                String Expected_Number = Integer.toString(counter);

                // Compare actual and expected results

                Assert.assertTrue(Actual_Number.contains(Expected_Number));

                // Clear the result for the next iteration
                Calculator_page.Clear_Btn(driver).click();
            }

            // Print message to console if the test passes
            System.out.println("Keys is OKay");
        }

        // Test case for validating the addition of two numbers
        @Test(priority = 1)
        public void validate_the_user_can_add_two_numbers() {
            // Set implicit wait for elements to load
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

            // Clear any previous input or result
            Calculator_page.Clear_Btn(driver).click();

            // Click numeric key '1'
            Calculator_page.Numeric_keys_elements(driver, 1).click();

            // Click addition button
            Calculator_page.Addition_Btn(driver).click();

            // Click numeric key '2'
            Calculator_page.Numeric_keys_elements(driver, 2).click();

            // Click equal button to perform the addition
            Calculator_page.Equal_BTN(driver).click();

            // Get the result of the addition operation
            String Actual_Result = Calculator_page.Final_Result_Box(driver).getText();

            // Check if the result contains "3" (expected result for 1 + 2)
            boolean Final_check = Actual_Result.contains("3");

            // Assert that the result is correct
            Assert.assertEquals(Final_check, true, "Addition  Failed");

            // Print success message to console
            System.out.println("Addition is Successfully");
        }

        // Test case for validating the subtraction of two numbers
        @Test(priority = 2)
        public void validate_the_user_can_subtract_two_numbers() {
            // Set implicit wait for elements to load
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

            // Clear any previous input or result
            Calculator_page.Clear_Btn(driver).click();

            // Click numeric key '2'
            Calculator_page.Numeric_keys_elements(driver, 2).click();

            // Click subtract button
            Calculator_page.Subtract_Btn(driver).click();

            // Click numeric key '1'
            Calculator_page.Numeric_keys_elements(driver, 1).click();

            // Click equal button to perform the subtraction
            Calculator_page.Equal_BTN(driver).click();

            // Get the result of the subtraction operation
            String Actual_Result = Calculator_page.Final_Result_Box(driver).getText();

            // Check if the result contains "1" (expected result for 2 - 1)
            boolean Final_check = Actual_Result.contains("1");

            // Assert that the result is correct
            Assert.assertEquals(Final_check, true, "Subtraction  Failed");

            // Print success message to console
            System.out.println("Subtraction is Successfully");
        }
        // Test case for validating the subtraction of two numbers
        @Test(priority = 3)
        public void validate_the_user_can_multiply_two_numbers() {
            // Set implicit wait for elements to load
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

            // Clear any previous input or result
            Calculator_page.Clear_Btn(driver).click();

            // Click numeric key '2'
            Calculator_page.Numeric_keys_elements(driver, 2).click();

            // Click multiply button
            Calculator_page.multiply_Btn(driver).click();

            // Click numeric key '1'
            Calculator_page.Numeric_keys_elements(driver, 1).click();

            // Click equal button to perform the subtraction
            Calculator_page.Equal_BTN(driver).click();

            // Get the result of the multiplication operation
            String Actual_Result = Calculator_page.Final_Result_Box(driver).getText();

            // Check if the result contains "2" (expected result for 2 * 1)
            boolean Final_check = Actual_Result.contains("2");

            // Assert that the result is correct
            Assert.assertEquals(Final_check, true, "multiplication  Failed");

            // Print success message to console
            System.out.println("multiplication is Successfully");
        }
        @Test(priority = 4)
        public void validate_the_user_can_division_two_numbers() {
            // Set implicit wait for elements to load
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

            // Clear any previous input or result
            Calculator_page.Clear_Btn(driver).click();

            // Click numeric key '2'
            Calculator_page.Numeric_keys_elements(driver, 2).click();

            // Click division button
            Calculator_page.divsion_Btn(driver).click();

            // Click numeric key '1'
            Calculator_page.Numeric_keys_elements(driver, 1).click();

            // Click equal button to perform the subtraction
            Calculator_page.Equal_BTN(driver).click();

            // Get the result of the division operation
            String Actual_Result = Calculator_page.Final_Result_Box(driver).getText();

            // Check if the result contains "2" (expected result for 2 * 1)
            boolean Final_check = Actual_Result.contains("2");

            // Assert that the result is correct
            Assert.assertEquals(Final_check, true, "division  Failed");

            // Print success message to console
            System.out.println("division is Successfully");
        }
        @Test(priority = 4)
        public void validate_the_user_can_type_Floating_Numbers(){
            // Clear any existing input
            Calculator_page.Clear_Btn(driver).click();

    // Enter "0"
            Calculator_page.Numeric_keys_elements(driver, 0).click();

    // Enter floating point "."
            Calculator_page.floating_point_Btn(driver).click();

    // Enter "5"
            Calculator_page.Numeric_keys_elements(driver, 5).click();
    String Actual_Result=Calculator_page.Result_text_Box(driver).getText();
    // Print confirmation
            Assert.assertTrue(Actual_Result.contains("0.5"));
    System.out.println("Input completed: 0.5");

        }
        @Test(priority = 5)
        public void validate_the_user_can_add_two_Floating_Numbers(){
            // Clear any existing input
            Calculator_page.Clear_Btn(driver).click();

    // Enter "0"
            Calculator_page.Numeric_keys_elements(driver, 0).click();

    // Enter floating point "."
            Calculator_page.floating_point_Btn(driver).click();

    // Enter "5"
            Calculator_page.Numeric_keys_elements(driver, 5).click();
            Calculator_page.Addition_Btn(driver).click();
    // Enter "0"
            Calculator_page.Numeric_keys_elements(driver, 0).click();

    // Enter floating point "."
            Calculator_page.floating_point_Btn(driver).click();

    // Enter "5"
            Calculator_page.Numeric_keys_elements(driver, 5).click();
            Calculator_page.Equal_BTN(driver).click();
            String Actual_Result=Calculator_page.Final_Result_Box(driver).getText();
    // Print confirmation
            Assert.assertTrue(Actual_Result.contains("1"));
            System.out.println("Addition Two Numbers is successful");

        }
              /*
            Negative Scenarios Running
             */
    @Test(priority = 0)
public void validate_the_user_division_By_zero(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String Expected_Result="= Can't divide by zero";
        Calculator_page.Clear_Btn(driver).click();
        Calculator_page.Numeric_keys_elements(driver,5).click();
        Calculator_page.divsion_Btn(driver).click();
        Calculator_page.Numeric_keys_elements(driver,0).click();
       // Calculator_page.Equal_BTN(driver).click();
        String Actual_Result=Calculator_page.Final_Result_Box(driver).getText();
        System.out.println(Actual_Result);
        Assert.assertTrue(Actual_Result.equals(Expected_Result));
}
    // Method that runs after each test method, useful for cleanup if needed
    @AfterMethod
    public void Final() {
        // This can be used to log out, close the app, or clean up resources after each test
    }
}
