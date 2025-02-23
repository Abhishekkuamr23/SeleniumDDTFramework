# SeleniumDDTFramework
Selenium project with using Data Driven framework
# Selenium Data-Driven Framework with TestNG

This project is a Selenium-based automation framework using the TestNG framework for testing, with a focus on data-driven testing. The framework integrates various tools and libraries like Apache POI for Excel file handling, Log4j for logging, and ExtentReports for generating detailed HTML reports.

## Features
- **Data-Driven Testing**: Leverages TestNG's `@DataProvider` for running tests with multiple sets of data.
- **Excel File Handling**: Apache POI is used to read and write data from Excel files.
- **Logging**: Log4j is used for logging execution details to track the test progress and errors.
- **Reporting**: ExtentReports generates detailed HTML reports with visual representation of test execution results.
- **Utilities**: Includes utility classes for common tasks like file handling, browser setup, and configuration.
- **Configuration File**: Externalized configurations like URLs, browser settings, and timeouts are stored in `config.properties`.

## Project Structure

### 1. **Test Classes**
- **TestNG Framework**: Contains test classes with TestNG annotations like `@Test`, `@BeforeMethod`, `@AfterMethod` for test execution and setup.
- **Data Providers**: `@DataProvider` in TestNG is used to provide test data from external sources such as Excel files.

### 2. **Config File (`config.properties`)**
- A properties file that stores all configuration values such as the base URL, browser type, and timeout settings. It ensures flexibility in the test setup.

### 3. **`pom.xml`**
- Manages the dependencies required for the project, including:
  - **Selenium WebDriver** for browser automation.
  - **TestNG** for the test execution framework.
  - **Apache POI** for reading and writing Excel files.
  - **ExtentReports** for generating HTML reports.
  - **Log4j** for logging.

### 4. **Extent Reports**
- A customizable reporting tool that provides detailed test execution results. The reports include information such as test steps, logs, screenshots, and pass/fail status.

### 5. **Excel Data Handling (Apache POI)**
- Apache POI is used to read data from Excel sheets and feed it to the tests. This is useful for data-driven testing, where the same test is executed with multiple input sets.

### 6. **Log4j**
- Log4j is integrated to capture detailed logs of the test execution. Logs include browser actions, errors, and any other important events during the test lifecycle.

### 7. **Utility Package**
- Utility classes for common functionalities like:
  - Browser setup and teardown.
  - Reading/writing data to files.
  - Handling waits and other web driver actions.

## Getting Started

### Prerequisites

- **Java**: Java 8 or above.
- **Maven**: Used for dependency management.
- **TestNG**: TestNG framework for managing and running tests.
- **Selenium**: Selenium WebDriver for browser automation.
- **Apache POI**: For reading and writing Excel files.
- **Log4j**: For logging execution details.
- **ExtentReports**: For generating HTML reports.

### Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/your-repository.git
