package stepDefinition;

import static org.junit.Assert.assertTrue;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageObjectModel.HomePage;
import PageObjectModel.MenuBar;
import PageObjectModel.ProductPage;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.percy.selenium.Percy;

public class PraticeHomePage  {
	private TestBase testBase = new TestBase();
	private HomePage homePage = new HomePage();
	private MenuBar menuBar = new MenuBar();
	private ProductPage productPage = new ProductPage();

	public WebDriver driver = new ChromeDriver();
	public WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));;
	

	@Given("I visit pratice website")
	public void user_is_on_login_page() {
		driver.get(System.getProperty("webLink"));
		Percy percy = new Percy(driver);
		
	}

	@When("I click on Shop Menu")
	public void click_ShopMenu() {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(menuBar.getLnkShopMenuLocator())));
		driver.findElement(By.xpath(menuBar.getLnkShopMenuLocator())).click();
	}

	@And("I click on Home menu button")
	public void click_Home_Btn() {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(menuBar.getBtnHomeLocator())));
		driver.navigate().refresh();
		driver.findElement(By.xpath(menuBar.getBtnHomeLocator())).click();
		driver.navigate().refresh();
		try {
			Thread.sleep(3000);
			driver.get(System.getProperty("webLink"));

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(menuBar.getBtnHomeLocator())));
		driver.findElement(By.xpath(menuBar.getBtnHomeLocator())).click();

	}

	@Then("The Home page must contains only three sliders")
	public void check_contains_Silders_homepage() throws Throwable {
		boolean result = ExpectedConditions.numberOfElementsToBe(By.xpath(homePage.getSiderLocator()), 3) != null;
		assertTrue(result);
	}

	@Then("Home page must contains only three Arrivals")
	public void check_contains_Arrivals() throws Throwable {
		boolean result = ExpectedConditions.numberOfElementsToBe(By.xpath(homePage.getArrvialsLocator()), 3) != null;
		assertTrue(result);
	}

	@And("Now click the {string} in the Arrivals")
	public void click_image_Arrivals(String imageName) {
		driver.navigate().refresh();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(homePage.getListImage().get(imageName.trim()))));
		driver.findElement(By.xpath(homePage.getListImage().get(imageName.trim()))).click();
	}
	@Then("User can add that book to basket")
	public void check_exits_addBasket_Btn() {
		boolean result = ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(productPage.getBtn_AddBasket_Locator())) != null;
		assertTrue(result);
	}

	@After(order = 0)
	public void closeBrowser() {
		driver.quit();
	}
	@AfterStep(order = 1)
	public void takeScraenshotOnFailure(Scenario scenario) {

	//if (scenario.isFailed()) 
	{

	TakesScreenshot ts = (TakesScreenshot) driver;

	byte[] src = ts.getScreenshotAs(OutputType.BYTES);
	scenario.attach(src, "image/png", scenario.getName());
	}

	}

}
