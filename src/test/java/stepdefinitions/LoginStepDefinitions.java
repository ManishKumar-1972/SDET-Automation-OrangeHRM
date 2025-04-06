package stepdefinitions;

import com.orangehrm.pages.LoginPage;
import com.orangehrm.utils.DriverFactory;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginStepDefinitions {

    WebDriver driver;
    LoginPage loginPage;

    @Given("I launch the OrangeHRM login page")
    public void i_launch_the_login_page() {
        driver = DriverFactory.initDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        loginPage = new LoginPage(driver);
    }

    @When("I enter valid username and password")
    public void i_enter_valid_credentials() {
        loginPage.loginAs("Admin", "admin123");
    }

    @Then("I should be redirected to the dashboard")
    public void i_should_see_dashboard() {
        boolean titleMatches = driver.getCurrentUrl().contains("dashboard");
        Assert.assertTrue(titleMatches, "Dashboard URL not found.");
        DriverFactory.quitDriver();
    }

    @When("I enter username {string} and password {string}")
    public void i_enter_invalid_credentials(String user, String pass) {
        loginPage.loginWith(user, pass);
    }

    @Then("I should see an error message")
    public void i_should_see_error_message() {
        String message = loginPage.getErrorMessageText();
        Assert.assertTrue(message.toLowerCase().contains("invalid credentials"));
        DriverFactory.quitDriver();
    }

    @When("I submit empty login form")
    public void i_submit_empty_form() {
        loginPage.submitEmptyForm();
    }

    @Then("I should see required field validation errors")
    public void i_should_see_required_validation() {
        String msg = loginPage.getRequiredFieldMessage();
        Assert.assertEquals(msg, "Required");
        DriverFactory.quitDriver();
    }
}