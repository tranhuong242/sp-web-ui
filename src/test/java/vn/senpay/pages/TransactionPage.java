package vn.senpay.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class TransactionPage extends PageObject{
	
	@FindBy(id="MainContent_transMenuLeft_hlPayWithDraw")
	private WebElementFacade withDrawLink;
	
	public void clickOnWithdrawLink(){
		withDrawLink.waitUntilClickable().click();
	}

}
