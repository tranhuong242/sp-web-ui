package vn.senpay.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class LoginPage extends PageObject {

    @FindBy(xpath = "//*[.='Số điện thoại di động']/following-sibling::input")
    private WebElementFacade phoneNumberFiled;

    @FindBy(xpath = "//button[.='TIẾP THEO']")
    private WebElementFacade nextBtn;

    @FindBy(xpath = "//*[.='Pin Code (Chuỗi 6 số bí mật)']/following-sibling::input")
    private WebElementFacade pinCopdeFiled;

    public void enterPhoneNumber(String number) {
        phoneNumberFiled.waitUntilPresent().type(number);
    }

    public void clickOnNext() {
        nextBtn.waitUntilClickable().click();
    }

    public void enterPinCode(String pinCode) {
        pinCopdeFiled.waitUntilPresent().type(pinCode);
    }
    
    public void enterPinCode() {
        nextBtn.waitUntilClickable().click();
    }

    // em co the liet ke het cai element tren trang login vao day
    // va dinh nghia cac single action cho tung element do

}
