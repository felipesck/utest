package com.Utest.steps;


import com.Utest.pageObject.InicioUtestObject;
import com.Utest.utils.Utilidades;
import com.Utest.utils.EsperaImplicita;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class RegistroUtestStep {
    InicioUtestObject inicioUtestObject;
    EsperaImplicita esperaImplicita;

    @Step
    public void abrirWeb() {
        inicioUtestObject.open();
    }

    @Step
    public void seleccionarJoinToday() {
        Utilidades.esperarExplicito30(inicioUtestObject.getDriver(),inicioUtestObject.getBtnJoinToday());
        inicioUtestObject.getDriver().findElement(inicioUtestObject.getBtnJoinToday()).click();
    }

    @Step
    public void escribirFirstName(String firstName) {
        Utilidades.esperarExplicito30(inicioUtestObject.getDriver(), inicioUtestObject.getTxtFirstName());
        inicioUtestObject.getDriver().findElement(inicioUtestObject.getTxtFirstName()).sendKeys(firstName);
    }

    @Step
    public void escribirLastName(String lastName) {
        Utilidades.esperarExplicito30(inicioUtestObject.getDriver(), inicioUtestObject.getTxtLastName());
        inicioUtestObject.getDriver().findElement(inicioUtestObject.getTxtLastName()).sendKeys(lastName);
        Utilidades.esperar(2000);
    }

    @Step
    public void escribirEmail(String userName) {
        Utilidades.esperarExplicito30(inicioUtestObject.getDriver(), inicioUtestObject.getTxtEmail());
        inicioUtestObject.getDriver().findElement(inicioUtestObject.getTxtEmail()).sendKeys(userName);
        Utilidades.esperar(2000);
    }

    @Step
    public void escribirMes(String mes) {
        Utilidades.esperarExplicito30(inicioUtestObject.getDriver(), inicioUtestObject.getTxtEmail());
        inicioUtestObject.getDriver().findElement(By.xpath("//option[. = '"+mes+"']")).click();
        Utilidades.esperar(2000);
    }

    @Step
    public void escribirDia(String dia) {
        Utilidades.esperarExplicito30(inicioUtestObject.getDriver(), inicioUtestObject.getTxtEmail());
        inicioUtestObject.getDriver().findElement(By.xpath("//option[. = '"+dia+"']")).click();
        Utilidades.esperar(2000);
    }

    @Step
    public void escribirAño(String año) {
        Utilidades.esperarExplicito30(inicioUtestObject.getDriver(), inicioUtestObject.getTxtEmail());
        inicioUtestObject.getDriver().findElement(By.xpath("//option[. = '"+año+"']")).click();
        Utilidades.esperar(2000);
    }
    @Step
    public void escribirSelecionarIdioma(String idioma) {
        Utilidades.esperarExplicito30(inicioUtestObject.getDriver(), inicioUtestObject.getBtnSelectLenguage());
        inicioUtestObject.getDriver().findElement(inicioUtestObject.getBtnSelectLenguage()).click();
        inicioUtestObject.getDriver().findElement(inicioUtestObject.getBtnSelectLenguage()).sendKeys(idioma);
        Utilidades.esperar(2000);
        inicioUtestObject.getDriver().findElement(inicioUtestObject.getBtnSelectLenguage()).sendKeys(Keys.ENTER);
        Utilidades.esperar(2000);
    }

    @Step
    public void seleccionarNextLocation() {
        Utilidades.esperarExplicito30(inicioUtestObject.getDriver(),inicioUtestObject.getBtnNextLocation());
        inicioUtestObject.getDriver().findElement(inicioUtestObject.getBtnNextLocation()).click();
        Utilidades.esperar(2000);
    }

    @Step
    public void escribirCity(String city) {
        Utilidades.esperarExplicito30(inicioUtestObject.getDriver(), inicioUtestObject.getTxtCity());
        inicioUtestObject.getDriver().findElement(inicioUtestObject.getTxtCity()).sendKeys(city);
        inicioUtestObject.getDriver().findElement(inicioUtestObject.getTxtCity()).sendKeys(Keys.ARROW_DOWN);
        inicioUtestObject.getDriver().findElement(inicioUtestObject.getTxtCity()).sendKeys(Keys.ENTER);
        Utilidades.esperar(2000);
    }

    @Step
    public void escribirZip(String zip) {
        Utilidades.esperarExplicito30(inicioUtestObject.getDriver(), inicioUtestObject.getTxtZip());
        inicioUtestObject.getDriver().findElement(inicioUtestObject.getTxtZip()).sendKeys(zip);
        inicioUtestObject.getDriver().findElement(inicioUtestObject.getTxtZip()).sendKeys(Keys.ENTER);
        Utilidades.esperar(2000);
    }

    @Step
    public void seleccionarNextDevice() {
        Utilidades.esperarExplicito30(inicioUtestObject.getDriver(),inicioUtestObject.getBtnNextDevice());
        inicioUtestObject.getDriver().findElement(inicioUtestObject.getBtnNextDevice()).click();
        Utilidades.esperar(2000);
    }

    @Step
    public void seleccionarYourMobileDevice(String yourMobileDevice) {
        Utilidades.esperarExplicito30(inicioUtestObject.getDriver(), inicioUtestObject.getBtnYourMobileDevice());
        inicioUtestObject.getDriver().findElement(inicioUtestObject.getBtnYourMobileDevice()).click();
        inicioUtestObject.getDriver().findElement(By.xpath("//div[contains(text(),'"+yourMobileDevice+"')]")).click();
        Utilidades.esperar(2000);
    }

    @Step
    public void seleccionarModel(String model) {
        Utilidades.esperarExplicito30(inicioUtestObject.getDriver(), inicioUtestObject.getBtnModel());
        inicioUtestObject.getDriver().findElement(inicioUtestObject.getBtnModel()).click();
        inicioUtestObject.getDriver().findElement(By.xpath("//div[contains(text(),'"+model+"')]")).click();
        Utilidades.esperar(2000);
    }

    @Step
    public void seleccionarOperatingSystem(String operatingSystem) {
        Utilidades.esperarExplicito30(inicioUtestObject.getDriver(), inicioUtestObject.getBtnOperatingSystem());
        inicioUtestObject.getDriver().findElement(inicioUtestObject.getBtnOperatingSystem()).click();
        inicioUtestObject.getDriver().findElement(By.xpath("//div[contains(text(),'"+operatingSystem+"')]")).click();
        Utilidades.esperar(2000);
    }

    @Step
    public void seleccionarNextLastStep() {
        Utilidades.esperarExplicito30(inicioUtestObject.getDriver(),inicioUtestObject.getBtnNextLastStep());
        inicioUtestObject.getDriver().findElement(inicioUtestObject.getBtnNextLastStep()).click();
        Utilidades.esperar(2000);
    }

    @Step
    public void escribirPassword(String password) {
        Utilidades.esperarExplicito30(inicioUtestObject.getDriver(), inicioUtestObject.getTxtPassword());
        inicioUtestObject.getDriver().findElement(inicioUtestObject.getTxtPassword()).sendKeys(password);
        inicioUtestObject.getDriver().findElement(inicioUtestObject.getTxtPassword()).sendKeys(Keys.ENTER);
        Utilidades.esperar(2000);
    }

    @Step
    public void escribirConfirmPassword(String confirmPassword) {
        Utilidades.esperarExplicito30(inicioUtestObject.getDriver(), inicioUtestObject.getTxtConfirmPassword());
        inicioUtestObject.getDriver().findElement(inicioUtestObject.getTxtConfirmPassword()).sendKeys(confirmPassword);
        inicioUtestObject.getDriver().findElement(inicioUtestObject.getTxtConfirmPassword()).sendKeys(Keys.ENTER);
        Utilidades.esperar(2000);
    }

    @Step
    public void seleccionarStayInformed() {
        Utilidades.esperarExplicito30(inicioUtestObject.getDriver(),inicioUtestObject.getBtnStayInformed());
        inicioUtestObject.getDriver().findElement(inicioUtestObject.getBtnStayInformed()).click();
        Utilidades.esperar(2000);
    }

    @Step
    public void seleccionarUtestTerm() {
        Utilidades.esperarExplicito30(inicioUtestObject.getDriver(),inicioUtestObject.getBtnUtestTerm());
        inicioUtestObject.getDriver().findElement(inicioUtestObject.getBtnUtestTerm()).click();
        Utilidades.esperar(2000);
    }

    @Step
    public void seleccionarPrivacy() {
        Utilidades.esperarExplicito30(inicioUtestObject.getDriver(),inicioUtestObject.getBtnPrivacy());
        inicioUtestObject.getDriver().findElement(inicioUtestObject.getBtnPrivacy()).click();
        Utilidades.esperar(2000);
    }

    @Step
    public void seleccionarCompleteSetup() {
        Utilidades.esperarExplicito30(inicioUtestObject.getDriver(),inicioUtestObject.getBtnCompleteSetup());
        inicioUtestObject.getDriver().findElement(inicioUtestObject.getBtnCompleteSetup()).click();
        Utilidades.esperar(2000);
    }

    @Step
    public void validolblRegistroExitoso(){
        Utilidades.esperarExplicito30(inicioUtestObject.getDriver(), inicioUtestObject.getLblRegistroExitoso());
        Assert.assertTrue(inicioUtestObject.getDriver().findElement(inicioUtestObject.getLblRegistroExitoso()).getText(), true);
    }
}
