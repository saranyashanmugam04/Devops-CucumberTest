package projectskeleton;

import cucumber.api.java.en.Given;

public class stepdefinition {
	@Given("user launches chrome browser")
	public void user_launches_chrome_browser() {
		System.out.println("lucnhes Chrome browser");
	    
	}

	@Given("user navigates to login application")
	public void user_navigates_to_login_application() {
	    System.out.println("navigated to login application");
	}

	@Given("user enter username as {string}")
	public void user_enter_username_as(String un) {
	   System.out.println("entered username as "+un);
	}

	@Given("user enter password as {string}")
	public void user_enter_password_as(String psd) {
	  System.out.println("entered password is "+psd);
	}

	@Given("user click on sign-in button")
	public void user_click_on_sign_in_button() {
	   System.out.println("click signin");
	}

	@Given("user closes the application")
	public void user_closes_the_application() {
		System.out.println("application closed");
	}


}
