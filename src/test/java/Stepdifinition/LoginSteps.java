package Stepdifinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	WebDriver driver = null;
	String urlWeb = "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/manager";
	String titleWeb = "XYZ Bank";

	@Given("user navigates to Bank manager login page")
	public void user_navigates_to_Bank_manager_login_page() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sang.dang22\\eclipse-workspace\\MidSelenium\\src\\test\\resources\\browsers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(urlWeb);
		sleepInSecond(2);
		driver.quit();
		sleepInSecond(2);
	}

	@And("user verify page")
	public void user_verify_page() {
		driver = new ChromeDriver();
		driver.get(urlWeb);
		// Assert.assertEquals(driver.getCurrentUrl(), urlWeb);
		// Assert.assertEquals(driver.getTitle(), titleWeb);

		if (urlWeb.equals(driver.getCurrentUrl())) {
			System.out.println("Test URL_PASSed");
		} else
			System.out.println("Test URL _Failed");

		if (titleWeb.equals(driver.getTitle())) {
			System.out.println("Test Title Passed");
		} else
			System.out.println("Test Title Failed");

		sleepInSecond(2);

	}

	@When("user click on Add Customer - top button")
	public void user_click_on_Add_Customer_top_button() {
		driver.findElement(By.xpath("//button[contains(text(),'Add Customer')]")).click();
		sleepInSecond(2);
	}

	@Then("user enters <firstname> ,<lastname> and <postcode>")
	public void user_enters_firstname_lastname_and_postcode() {
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Sang");
		sleepInSecond(1);
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Dang");
		sleepInSecond(1);
		driver.findElement(By.xpath("//input[@placeholder='Post Code']")).sendKeys("E123BC");
		sleepInSecond(1);
	}

	@And("user click on Add Customer - bottom button")
	public void user_click_on_Add_Customer_bottom_button() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		sleepInSecond(2);
	}

	@And("user click on OK button of the alert")
	public void user_click_on_OK_button_of_the_alert() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
		sleepInSecond(2);
	}

	@And("user verify data")
	public void user_verify_data() {

		driver.findElement(By.xpath("//button[contains(text(),'Customers')]")).click();
		sleepInSecond(2);
		driver.findElement(By.xpath("//input[@placeholder='Search Customer']")).sendKeys("Sang");
		String newAcc = "Sang";
		// identify elements with text()
		List<WebElement> checkNewAcc = driver.findElements(By.xpath("//*[contains(text(),'Sang')]"));
		// verify list size
		if (checkNewAcc.size() > 0) {
			System.out.println("Text: " + newAcc + " is present. ");
		} else {
			System.out.println("Text: " + newAcc + " is not present. ");
		}
		sleepInSecond(2);
	}


	@Then("user enters <lastname> and <postcode>")
	public void user_enters_lastname_and_postcode() {
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Mai");
		sleepInSecond(2);
		driver.findElement(By.xpath("//input[@placeholder='Post Code']")).sendKeys("E12345");
		sleepInSecond(2);
	}

	@Then("user enters <lastname>, <postcode> and <inFirstname>")
	public void user_enters_lastname_postcode_and_inFirstname() {
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("765-#");
		sleepInSecond(2);
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Trinh");
		sleepInSecond(2);
		driver.findElement(By.xpath("//input[@placeholder='Post Code']")).sendKeys("E12345");
		sleepInSecond(2);

	}

	@Then("user enter <Firstname> again")
	public void user_enter_Firstname_again() {
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Trung2");
		sleepInSecond(2);
	}

	@Then("user enters <firstname> and <postcode>")
	public void user_enters_firstname_and_postcode() {
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Hanh");
		sleepInSecond(2);
		driver.findElement(By.xpath("//input[@placeholder='Post Code']")).sendKeys("E123BC");
		sleepInSecond(2);
	}

	@Then("user enters <firstname>, <postcode> and <inLastname>")
	public void user_enters_firstname_postcode_and_inLastname() {
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Mai");
		sleepInSecond(2);
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("6443f@");
		sleepInSecond(2);
		driver.findElement(By.xpath("//input[@placeholder='Post Code']")).sendKeys("E12345");
		sleepInSecond(2);
	}

	@Then("user enter <Lastname> again")
	public void user_enter_Lastname_again() {
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Tran");
		sleepInSecond(2);
	}

	@Then("user enters <firstname> and <lastname>")
	public void user_enters_firstname_and_lastname() {
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Hihi");
		sleepInSecond(2);
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Le");
		sleepInSecond(2);
	}

	@Then("user enters <firstname> ,<lastname> and <inPostcode>")
	public void user_enters_firstname_lastname_and_inPostcode(){
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Mai");
		sleepInSecond(2);
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Tran");
		sleepInSecond(2);
		driver.findElement(By.xpath("//input[@placeholder='Post Code']")).sendKeys("@33##");
		sleepInSecond(2);
	}

	@When("user click on Open Account button")
	public void user_click_on_Open_Account_button() {
		driver.findElement(By.xpath("//button[contains(text(),'Open Account')]")).click();
		sleepInSecond(2);
	}

	@Then("user select <customer> and <currency>")
	public void user_select_customer_and_currency() {
		driver.findElement(By.id("userSelect")).click();
		driver.findElement(By.xpath("//option[contains(text(),'Hermoine Granger')]")).click();
		sleepInSecond(2);

		driver.findElement(By.id("currency")).click();
		driver.findElement(By.xpath("//option[contains(text(),'Pound')]")).click();
		sleepInSecond(2);
	}

	@Then("user click on Process button")
	public void user_click_on_Process_button() {
		driver.findElement(By.xpath("//button[contains(text(),'Process')]")).click();
		sleepInSecond(2);
	}

	@Then("user select <currency>")
	public void user_select_currency() {
		driver.findElement(By.id("currency")).click();
		driver.findElement(By.xpath("//option[contains(text(),'Pound')]")).click();
		sleepInSecond(2);
	}

	@Then("user select <customer>")
	public void user_select_customer() {
		driver.findElement(By.id("userSelect")).click();
		driver.findElement(By.xpath("//option[contains(text(),'Hermoine Granger')]")).click();
		sleepInSecond(2);
	}

	@When("user click on Customers button")
	public void user_click_on_Customers_button() {
		driver.findElement(By.xpath("//button[contains(text(),'Customers')]")).click();
		sleepInSecond(2);
	}

	@Then("user enter <customer> in Search Customer input")
	public void user_enter_customer_in_Search_Customer_input() {
		driver.findElement(By.xpath("//button[contains(text(),'Customers')]")).click();
		sleepInSecond(2);
		driver.findElement(By.xpath("//input[@placeholder='Search Customer']")).sendKeys("Albus");
		int newAcc = driver.findElements(By.xpath("//td[contains(text(),'Albus')]")).size();
		if (newAcc != 1) {
			System.out.println("Search data exit");
		} else {
			System.out.println("Search data is not exit");
		}
		sleepInSecond(2);
	}

	@Then("customer information just found is displayed")
	public void customer_information_just_found_is_displayed() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("Customers list should be showed")
	public void customers_list_should_be_showed() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}
//	@Then("click on Delete button")
//	public void click_on_Delete_button() throws InterruptedException {
//		driver.findElement(By.xpath("//button[contains(text(),'Delete')]")).click();
//		Thread.sleep(1000);
//	}	

	
	@Then("user enter invalidate <customer> in Search Customer input")
	public void user_enter_invalidate_customer_in_Search_Customer_input() {
		driver.findElement(By.xpath("//button[contains(text(),'Customers')]")).click();
		sleepInSecond(2);
		driver.findElement(By.xpath("//input[@placeholder='Search Customer']")).sendKeys("Nguyen");
		String acc = "Nguyen";
		// identify elements with text()
		List<WebElement> checkAcc = driver.findElements(By.xpath("//*[contains(text(),'Nguyen')]"));
		// verify list size
		if (checkAcc.size() == 0) {
			System.out.println("Passed ");
		} else {
			System.out.println("Failed");
		}
		sleepInSecond(2);
	}
//



	@Then("close executions")
	public void close_executions() {
		driver.quit();
		System.out.println("Done Test Excution");
	}

	public void sleepInSecond(long second) {
		try {
			Thread.sleep(second * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
