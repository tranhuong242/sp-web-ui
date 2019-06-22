package sanboxSenpay.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import vn.senpay.pages.TransactionPage;
import vn.senpay.steps.HomePageSteps;
import vn.senpay.steps.LoginSteps;

public class EndUserSteps {

    @Steps
    public LoginSteps loginSteps;

    @Steps
    public HomePageSteps homePageSteps;
    
    @Steps
    TransactionPage transactionPageSteps;

    @Step
    public void go_to_senpay_dashboared(String number, String pinCode) {
        homePageSteps.is_the_home_page();
        homePageSteps.click_on_the_login_button();
        loginSteps.login_applicaiton(number, pinCode);
    }

    @Step
    public void naviage_to_withdraw() {
        homePageSteps.click_on_transaction_menu();
    }

    @Step
	public void withdraw_with_amount(int amount) {
		transactionPageSteps.clickOnWithdrawLink();
    	
		
	}
}
