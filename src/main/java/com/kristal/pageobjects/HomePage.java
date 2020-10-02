package com.kristal.pageobjects;

import java.util.List;
import java.util.concurrent.TimeUnit;

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
