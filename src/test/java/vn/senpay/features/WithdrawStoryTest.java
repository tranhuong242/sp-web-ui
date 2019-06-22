package vn.senpay.features;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import sanboxSenpay.steps.serenity.EndUserSteps;

@RunWith(SerenityRunner.class)
public class WithdrawStoryTest {

    @Managed
    public WebDriver webdriver;

    @Steps
    public EndUserSteps anna;

    private String phoneNumber = "0328998838";
    private String pinCode = "123456";

    @Test
    public void withdraw() {
        anna.go_to_senpay_dashboared(phoneNumber, pinCode);
        anna.naviage_to_withdraw();
        anna.withdraw_with_amount(100000);
        

    }
}
