package vn.senpay.steps;

import net.thucydides.core.annotations.Step;
import vn.senpay.pages.HomePage;


public class HomePageSteps {

    HomePage onHomePagePage;

    @Step
    public void click_on_the_login_button() {
        onHomePagePage.clickOnLoginLinkText();
    }

    @Step
    public void is_the_home_page() {
        onHomePagePage.open();
        
    }

    @Step
    public void click_on_transaction_menu() {
        onHomePagePage.clickOnTransactionLinkText();
    }
}
