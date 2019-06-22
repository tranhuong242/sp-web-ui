package vn.senpay.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://senpay.vn/")
public class SenPayIDHomePage extends PageObject {

    @FindBy(id = "btnLogin")
    private WebElementFacade loginBtn;

    @FindBy(id = "btnRegister")
    private WebElementFacade registerBtn;

    public void clickOnLoginButton() {
        loginBtn.waitUntilPresent().click();
    }

    public void clickOnRegisterButton() {
        registerBtn.waitUntilPresent().click();
    }

    // em co the liet ke het cai element tren trang homepage vao day
    // va dinh nghia cac single action cho tung element do

}
