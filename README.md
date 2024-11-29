# Calculator-Application-Test-By-Appium
To include the Trello board link in your project's README file, you can add a **section for resources or references**. Here's how you can incorporate the Trello link into the `README.md`:



```markdown
## Test Scenarios

The detailed test scenarios for this project are documented on the Trello board:

- [Trello Board for Test Scenarios](https://trello.com/b/NGd7ehbf)

You can view and track the test scenarios, their progress, and additional details directly on this board.
```

---

### Full README with Trello Link Integrated
Here’s how the link looks in the full README context:

```markdown
# Appium Automation Project

## Overview
This is a Maven-based Appium project designed to automate and test mobile applications, specifically a **Calculator app**. The project uses Appium's **Java Client**, Selenium WebDriver, and TestNG to perform end-to-end mobile testing.

---

## Features
- Supports basic and advanced operations testing on a Calculator app.
- Automates numeric inputs, floating-point operations, and edge-case scenarios like division by zero.
- Provides clean, modularized test structure using Page Object Model (POM).
- Configurable to work with various Android devices and platforms.

---

## Prerequisites
1. **Java Development Kit (JDK)**  
   Ensure JDK version 23 or higher is installed.  
   Verify with:
   ```bash
   java -version
   ```

2. **Maven**  
   Ensure Maven is installed and added to your system's PATH.  
   Verify with:
   ```bash
   mvn -version
   ```

3. **Android SDK**  
   Install and configure the Android SDK for Appium testing. Set the `ANDROID_HOME` environment variable.

4. **Appium**  
   Install Appium globally:
   ```bash
   npm install -g appium
   ```

5. **Device/Emulator Setup**  
   - Enable USB Debugging on your Android device.
   - Ensure the device is connected and detected:
     ```bash
     adb devices
     ```

---

## Technologies and Tools Used
- **Programming Language**: Java  
- **Build Tool**: Maven  
- **Test Framework**: TestNG  
- **Automation Tools**: Appium, Selenium WebDriver  
- **Dependencies**:
  - Appium Java Client `9.3.0`
  - Selenium WebDriver `4.26.0`
  - TestNG `7.4.0`

---

## Project Structure
```
Appium/
├── src/
│   ├── main/
│   │   ├── java/org/example/
│   │   │   ├── Appium_Base.java      # Appium setup and configuration
│   │   │   ├── Calculator_page.java  # Page Object Model for Calculator elements
│   ├── test/
│       ├── java/org/example/
│       │   ├── Test_Cal_Page.java    # Test cases for Calculator app
├── pom.xml                           # Maven project configuration
```

---

## Test Scenarios

The detailed test scenarios for this project are documented on the Trello board:

- [Trello Board for Test Scenarios](https://trello.com/b/NGd7ehbf)

You can view and track the test scenarios, their progress, and additional details directly on this board.

---

## How to Run the Tests

1. **Clone the Repository**
   ```bash
   git clone <repository-url>
   cd Appium
   ```

2. **Install Dependencies**
   Maven will automatically download dependencies listed in `pom.xml`:
   ```bash
   mvn clean install
   ```

3. **Configure Test Parameters**
   Edit `TestNG.xml` or set parameters for:
   - `Remote_Access`
   - `DeviceName`
   - `UDID`
   - `Platform_Version`
   - `App_Package`
   - `App_Activity`

4. **Run Tests**
   Execute the tests with Maven:
   ```bash
   mvn test
   ```



