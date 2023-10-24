package com.Utest.pageObject;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://utest.com/")
public class InicioUtestObject extends PageObject {

    By btnJoinToday = By.linkText("Join Today");
    By txtFirstName = By.id("firstName");
    By txtLastName = By.id("lastName");
    By txtEmail = By.id("email");
    By btnSelectLenguage = By.cssSelector(".ui-select-search");
    By btnNextLocation = By.xpath("//span[contains(text(),'Next: Location')]");
    By txtCity = By.id("city");
    By txtZip = By.id("zip");
    By btnNextDevice = By.xpath("//span[contains(text(),'Next: Devices')]");
    By btnYourMobileDevice = By.xpath("//span[contains(text(),'Select Brand')]");
    By btnModel = By.xpath("//span[contains(text(),'Select a Model')]");
    By btnOperatingSystem = By.xpath("(//span[contains(text(),'Select OS')])[3]");
    By btnNextLastStep = By.xpath("//span[contains(text(),'Next: Last Step')]");
    By txtPassword = By.id("password");
    By txtConfirmPassword = By.id("confirmPassword");
    By btnStayInformed = By.xpath("//*[contains(text(),' STAY INFORMED!')]");
    By btnUtestTerm = By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[5]/label[1]/span[1]");
    By btnPrivacy = By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[6]/label[1]/span[1]");
    By btnCompleteSetup = By.xpath("//span[contains(text(),'Complete Setup')]");
    By lblRegistroExitoso = By.xpath("(//*[contains(text(),'Welcome to ')])[2]");


    public By getBtnNextDevice() {return btnNextDevice;}

    public By getBtnJoinToday() {
        return btnJoinToday;
    }

    public By getTxtFirstName() {
        return txtFirstName;
    }

    public By getTxtLastName() {
        return txtLastName;
    }

    public By getTxtEmail() {
        return txtEmail;
    }

    public By getBtnSelectLenguage() {return btnSelectLenguage;}

    public By getBtnNextLocation() {return btnNextLocation;}

    public By getTxtCity() {return txtCity;}

    public By getTxtZip() {return txtZip;}

    public By getBtnYourMobileDevice() {return btnYourMobileDevice;}

    public By getBtnModel() {return btnModel;}

    public By getBtnOperatingSystem() {return btnOperatingSystem;}

    public By getBtnNextLastStep() {return btnNextLastStep;}

    public By getTxtPassword() {return txtPassword;}

    public By getTxtConfirmPassword() {return txtConfirmPassword;}

    public By getBtnStayInformed() {return btnStayInformed;}

    public By getBtnUtestTerm() {return btnUtestTerm;}

    public By getBtnPrivacy() {return btnPrivacy;}

    public By getBtnCompleteSetup() {return btnCompleteSetup;}

    public By getLblRegistroExitoso() {return lblRegistroExitoso;}
}
