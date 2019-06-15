package TestFeature;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class Feature {
	 WebDriver driver;

@Given("^user is on register page$")
 	public void login(){
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/");
	}
@When("^user navigate to skip sign In$")
	public void user_skipsignin()
	{
        driver.findElement(By.xpath("//button[@id='btn2']")).click();//to get skip sign in

	}
@Given("^user is on Register page$")
public void user_already_on_login_page() {
	}
//@Then("^user enters first name")
@Then("^user enters \"(.*)\"and \"(.*)\"$")
public void close_browser() {
	}

}
	