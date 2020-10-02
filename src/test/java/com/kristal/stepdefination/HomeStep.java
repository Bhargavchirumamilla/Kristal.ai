package com.kristal.stepdefination;

import java.io.IOException;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.kristal.launcher.TestHarness;
import com.kristal.pageobjects.HomePage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomeStep extends TestHarness {
	private HomePage Home;

	@Given("^Search bar displayed on home page$")
	public void search_bar_displayed_on_home_page() throws Throwable {
		Home = new HomePage();
		Assert.assertTrue(Home.searchIsDisplayed(), "Home Page : Search bar displayed on home page is Mismatched");
	}

	@When("^EnterSearcKeyword is \"([^\"]*)\"$")
	public void entersearckeyword_is(String arg1) throws Throwable {
		Home = new HomePage();
		Assert.assertTrue(Home.enterSearcKeyword(arg1), "Enter Search  in Google is mismatched");
	}

	@Then("^Autosuggestion size is 0 or less than 0$")
	public void autosuggestion_size_is_0_or_less_than_0() throws Throwable {
		Assert.assertTrue(Home.getresults(), "Autosuggestion size is Mismatched ");
	}

	@When("^provide Name \"([^\"]*)\"$")
	public void provide_Name(String arg1) throws Throwable {
		Home = new HomePage();
		Assert.assertTrue(Home.enterSearcKeyword(arg1), "Give Name is mismatched");

	}

	@And("^NavigateFirstAutosuggestion$")
	public void navigatefirstautosuggestion() throws Throwable {
		Assert.assertTrue(Home.navigateFirstAutosuggestion(), "Navigation is Mismathced");
	}

	@Then("^ClickSearchbar$")
	public void clicksearchbar() throws Throwable {
		Assert.assertTrue(Home.clickSearchbar(), "Click Search Bar is mismatched");
	}

	@And("^Verify Images and Videos$")
	public void verify_images_and_videos() throws Throwable {
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(Home.imageDisplayed(), ": Image is not displayed is mismatched");
		softAssert.assertAll();
	}

	@Then("^Veify Home Page URL$")
	public void veify_home_page_url() throws Throwable {
		Home = new HomePage();
		Assert.assertTrue(Home.getTitle().contains("Google Search"), "Title is Mismatched");
	}

	@When("^Logo Present Results Page$")
	public void logo_present_results_page() throws Throwable {
		Home = new HomePage();
		Assert.assertTrue(Home.logoPresentResultsPage(),
				"Search results page does not have logo of  Google is Mismatched");

	}

	@Then("^Navigate Back$")
	public void navigate_back() throws Throwable {
		Home.navigateback();
	}

	@And("^Verify Logo In Home Page$")
	public void verify_logo_in_home_page() throws Throwable {
		Assert.assertTrue(Home.logoPresentHomePage(), "Logo is Mismatched");
	}

	public HomeStep() throws IOException {
		super();
	}

}
