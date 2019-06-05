package Steps;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
    WebDriver driver;
    @Given("User is at the login page")
    public void userIsAtTheLoginPage() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\vishal_kp\\IdeaProjects\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.learnyst.com/");
        driver.findElement(By.id("login")).click();
    }

    @When("User gives valid credentials")
    public void userGivesValidCredentials() {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.findElement(By.id("school_domain")).sendKeys("selflearn.learnyst.com");
        driver.findElement(By.id("js-school-domain-clicked")).click();
        driver.findElement(By.id("lernystLogin_new_user_user_email")).sendKeys("vishal@learnyst.com");
        //driver.findElement(By.xpath("//input[@type='password'"))

    }

    @Then("The user should login successfully")
    public void theUserShouldLoginSuccessfully() {
        if(driver.getTitle().equalsIgnoreCase("Login"))
        {
            System.out.println("Passed");

        }
        else
        {
            System.out.println("Failed");
        }
        driver.quit(); //giving it at the last will not destroy the value which was given previously
    }
}
