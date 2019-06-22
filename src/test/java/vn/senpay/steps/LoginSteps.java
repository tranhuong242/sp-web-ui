package vn.senpay.steps;

import net.thucydides.core.annotations.Step;
import vn.senpay.pages.LoginPage;

public class LoginSteps {

    LoginPage onLoginPage;

    @Step
    public void enter_phone_number(String number) {
        onLoginPage.enterPhoneNumber(number);
        onLoginPage.clickOnNext();
    }

    @Step
    public void enter_phone_pin_code(String pinCode) {
        onLoginPage.enterPinCode(pinCode);
    }

    @Step
    public void login_applicaiton(String number, String pinCode) {
        enter_phone_number(number);
        enter_phone_pin_code(pinCode);
    }
}
