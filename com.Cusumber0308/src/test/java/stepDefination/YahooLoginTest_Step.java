package stepDefination;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class YahooLoginTest_Step {
	
	WebDriver driver=null;
	@Given("^user opens login page$")
		public void user_opens_login_page(){
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.yahoo.com");
		}
	
	@Then("^user Enter loginid$")
	public void user_Enter_loginid(){
		driver.findElement(By.id("uh-signin")).click();
		driver.findElement(By.id("login-username")).sendKeys("kk23_vanteru");
		driver.findElement(By.id("login-signin")).click();
	}

@Then("^user Enter password")
public void user_Enter_password(){
	driver.findElement(By.id("login-passwd")).sendKeys("infoguyusad1");
}

@And("^user clicks on signin button")
public void user_clicks_on_signin_button() throws Exception{
	driver.findElement(By.id("login-signin")).click();
	Thread.sleep(6000);
}

@And("^close the browser")
public void close_the_browser(){
	driver.quit();
}

@Then("^get the title of login page and verify$")

public void get_the_title_of_login_page_and_verify(){
	String title=driver.getTitle();
	System.out.println("atcual tile is: "+title);
	Assert.assertEquals("Yahoo", title);
	
	
}
}
