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

	@Given("^User Navigated To Home Page$")
	public void user_Navigated_To_Home_Page() throws Throwable {
		Home = new HomePage();
	}

	@When("^If user seen any Change your country select any country or Close Popup$")
	public void if_user_seen_any_Change_your_country_select_any_country_or_Close_Popup() throws Throwable {
		Assert.assertTrue(Home.popUp(), "Pop Up Is Mismatched");
	}

	@When("^User Tap Login Button$")
	public void user_Tap_Login_Button() throws Throwable {
		Assert.assertTrue(Home.tapLoginButton(), "Login Button Mismatched");
	}

	@Then("^user Navigated To New Tab$")
	public void user_Navigated_To_New_Tab() throws Throwable {
		Assert.assertTrue(Home.newTab(1),"user Navigated To New Tab  is mismatched");
	}

	@When("^User Navigated to Login Page Provide Username \"([^\"]*)\"$")
	public void user_Navigated_to_Login_Page_Provide_Username(String arg1) throws Throwable {
		Home = new HomePage();
		Assert.assertTrue(Home.enterusername(arg1), "User name is Mismatched");
	}

	@Then("^User Navigated to Login Page Provide Password \"([^\"]*)\"$")
	public void user_Navigated_to_Login_Page_Provide_Password(String arg1) throws Throwable {
		Assert.assertTrue(Home.enterupassword(arg1), "password is Mismatched");
	}

	@And("^Tap Continue Button$")
	public void tap_Continue_Button() throws Throwable {
		Assert.assertTrue(Home.tapcontinueButton(), "Tap Continue Button is Mismatched");
	}

	@And("^Verify User Login to Kristal Website$")
	public void verify_User_Navigated_to_Kristal_Website() throws Throwable {
		Assert.assertTrue(Home.kristalLogoDisplayed(), "User Login to Kristal Website is Mismatched");
	}

}
