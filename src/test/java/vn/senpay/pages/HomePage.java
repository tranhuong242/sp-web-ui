package vn.senpay.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://senpay.vn/")
public class HomePage extends PageObject {

    @FindBy(id = "btnLogin")
    private WebElementFacade loginBtn;

    @FindBy(id = "btnRegister")
    private WebElementFacade registerBtn;

    @FindBy(partialLinkText = "Xem tài khoản")
    private WebElementFacade inForLink;

    @FindBy(linkText = "Đăng xuất")
    private WebElementFacade logoutBtn;

    public void clickOnLoginLinkText() {
        loginBtn.waitUntilPresent().click();
    }

    public void clickOnRegisterLinkText() {
        registerBtn.waitUntilPresent().click();
    }

    public void clickOnInforLinkText() {
        registerBtn.waitUntilPresent().click();
    }

    public void clickOnLogOutLinkText() {
        registerBtn.waitUntilPresent().click();
    }

    @FindBy(id = "MainMenu_hlTrans")
    private WebElementFacade giaoDich;

    public void clickOnTransactionLinkText() {
        giaoDich.waitUntilPresent().click();
    }

    // em co the liet ke het cai element tren trang homepage vao day
    // va dinh nghia cac single action cho tung element do

}
