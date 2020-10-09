package com.kristal.pageobjects;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.kristal.launcher.TestHarness;

public class HomePage extends TestHarness {

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "q")
	private WebElement search;

	@FindBy(xpath = "//ul[@class='erkvQe']/li")
	private List<WebElement> results;

	@FindBy(xpath = "//a[@class='q qs'][contains(text(),'Images')]")
	private WebElement image;

	@FindBy(xpath = "//a[contains(text(),'Videos')]")
	private WebElement video;

	@FindBy(xpath = "//div[@class='logo']//a")
	private WebElement logoResultPage;

	@FindBy(css = "#hplogo")
	private WebElement logoHomePage;

	@FindBy(xpath = "//span[@class='cross_country_pop']//img")
	private WebElement popUp;

	@FindBy(xpath = "//span[contains(text(),'Login')]")
	private WebElement loginButton;

	@FindBy(xpath = "//input[@id='phone-email']")
	private WebElement username;

	@FindBy(id = "password")
	private WebElement userPassword;

	@FindBy(xpath = "//button[contains(text(),'Continue')]")
	private WebElement continueButton;
	
	@FindBy(id = "test-demo")
	private WebElement kristalLogo;
	
	
	public boolean newTab(int index) throws InterruptedException {
		Thread.sleep(2000);
		
		ArrayList tabs= new ArrayList(driver.getWindowHandles());
		System.out.print(tabs.size());
		driver.switchTo().window((String) tabs.get(index));
		Thread.sleep(1000);
		return true;
	}
	
	public boolean kristalLogoDisplayed() throws InterruptedException {
		boolean imageRes = false;
		
		if (kristalLogo.isDisplayed()) {
			System.out.println("Results page kristalLogo is diplayed");
			imageRes = true;
		}
		return imageRes;

	}
	

	public boolean enterusername(String email) throws InterruptedException {
        
		username.sendKeys(email);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		return true;

	}

	public boolean enterupassword(String password) throws InterruptedException {

		userPassword.sendKeys(password);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		return true;

	}
	
	public boolean tapcontinueButton() throws InterruptedException {
		continueButton.click();
		Thread.sleep(5000);

		return true;
	}

	public boolean tapLoginButton() {
		loginButton.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		return true;
	}

	public boolean popUp() {
		try {
			popUp.click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		} catch (Exception ex) {
			System.out.println("User didn't find Any Popup");
		}
		return true;
	}

	public boolean enterSearcKeyword(String searchText) throws InterruptedException {

		search.sendKeys(searchText);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		return true;

	}

	public boolean getresults() {
		boolean res = false;
		int result = results.size();
		System.out.println("no of auto suffestion results " + result);
		if (result > 0) {
			res = true;
		}
		return res;
	}

	public boolean navigateFirstAutosuggestion() {
		results.get(0).click();
		System.out.println("serach result -1st autosuggestion clicked !!");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		navigateback();
		return true;
	}

	public boolean clickSearchbar() {

		search.sendKeys(Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return true;
	}

	public boolean imageDisplayed() throws InterruptedException {
		boolean imageRes = false;

		if (image.isDisplayed()) {
			System.out.println("Results page image is diplayed");
			imageRes = true;
		}
		return imageRes;

	}

	public String getTitle() {
		String titlepage = driver.getTitle();
		System.out.println("title of serach page " + titlepage);
		return titlepage;
	}

	public void navigateback() {
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	public boolean logoPresentResultsPage() {
		boolean logoRes = false;
		if (logoResultPage.isDisplayed()) {
			System.out.println("Google logo in Results page");
			logoRes = true;
		}
		return logoRes;
	}

	public boolean logoPresentHomePage() {
		boolean logoHome = false;
		if (logoHomePage.isDisplayed()) {
			System.out.println("Google logo in Home page");
			logoHome = true;
		}
		return logoHome;
	}

	public boolean searchIsDisplayed() {
		boolean searchbar = false;
		if (search.isDisplayed()) {
			System.out.println("search bar displayed in chrome");
			searchbar = true;
		}
		return searchbar;

	}
}
