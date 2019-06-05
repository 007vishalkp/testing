package Steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class StudentSignUp {
    WebDriver driver;
    @Given("Student is at the signUp page")
    public void studentIsAtTheSignUpPage() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\vishal_kp\\IdeaProjects\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://ibbuali.learnyst.com/");
        driver.manage().window().maximize();// if not maximized then it throws an exception


        WebElement login = driver.findElement(By.xpath("//p[contains(text(),\"TRY NOW FOR FREE\")]/parent::button"));
        login.click();
        driver.manage().timeouts().implicitlyWait(5l, TimeUnit.SECONDS);

    }

    @When("Student enters the details")
    public void studentEntersTheDetails() {

        driver.findElement(By.id("simpleHeader_new_user_user_email")).sendKeys("email1@gmail.com");
        driver.findElement(By.id("simpleHeader_new_user_user_password")).sendKeys("password");
        driver.findElement(By.id("simpleHeader_new_user_signup-btn")).click();

    }

    @Then("Student SignUp successful")
    public void studentSignUpSuccessful() {
        if(driver.getTitle().equalsIgnoreCase("Ibrahim Ali Khan LNU"))
        {
            System.out.println("Passed");
        }
        else
        {
            System.out.println("Failed");
        }
        driver.quit();

    }

    @Given("Student is at the SignUp page via facebook")
    public void studentIsAtTheSignUpPageViaFacebook() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\vishal_kp\\IdeaProjects\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://ibbuali.learnyst.com/");
        driver.manage().window().maximize();

        //driver.fin
        WebElement login = driver.findElement(By.xpath("//p[contains(text(),\"TRY NOW FOR FREE\")]/parent::button"));
        login.click();
        driver.manage().timeouts().implicitlyWait(5l, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//button[text()=\" Signup with facebook \"]")).click();
       // driver.manage().timeouts().implicitlyWait(5l, TimeUnit.SECONDS);
        driver.switchTo().window("popupHandle").findElement(By.id("email")).sendKeys("9738900295");
        driver.switchTo().window("popupHandle").findElement(By.id("pass")).sendKeys("123pass");
        driver.manage().timeouts().implicitlyWait(5l, TimeUnit.SECONDS);


    }

    @When("Student enters the credentials")
    public void studentEntersTheCredentials() {
        
    }

    @Given("Student is at the SignUp page via Gmail")
    public void studentIsAtTheSignUpPageViaGmail() {
    }
}
