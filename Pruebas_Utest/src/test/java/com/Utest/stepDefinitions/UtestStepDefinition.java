package com.Utest.stepDefinitions;

import com.Utest.steps.RegistroUtestStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.awt.*;


public class UtestStepDefinition {
    @Steps
    RegistroUtestStep registroUtestStep;

    @Given("^Ingresar al portal$")
    public void ingresarAlPortal() {
        registroUtestStep.abrirWeb();
    }

    @When("^Realizar el resgistro \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void loginExitoso(String firstName, String lastName, String email, String mes, String dia, String año, String idioma, String city, String zip, String yourMobileDevice, String model, String operatingSystem, String password, String confirmPassword)  {
        registroUtestStep.seleccionarJoinToday();
        registroUtestStep.escribirFirstName(firstName);
        registroUtestStep.escribirLastName(lastName);
        registroUtestStep.escribirEmail(email);
        registroUtestStep.escribirMes(mes);
        registroUtestStep.escribirDia(dia);
        registroUtestStep.escribirAño(año);
        registroUtestStep.escribirSelecionarIdioma(idioma);
        registroUtestStep.seleccionarNextLocation();
//        registroUtestStep.escribirCity(city);
  //      registroUtestStep.escribirZip(zip);
        registroUtestStep.seleccionarNextDevice();
        registroUtestStep.seleccionarYourMobileDevice(yourMobileDevice);
        registroUtestStep.seleccionarModel(model);
        registroUtestStep.seleccionarOperatingSystem(operatingSystem);
        registroUtestStep.seleccionarNextLastStep();
        registroUtestStep.escribirPassword(password);
        registroUtestStep.escribirConfirmPassword(confirmPassword);
        registroUtestStep.seleccionarStayInformed();
        registroUtestStep.seleccionarUtestTerm();
        registroUtestStep.seleccionarPrivacy();
        registroUtestStep.seleccionarCompleteSetup();
    }

    @Then("^Valido creacion$")
    public void validoLoginExitoso() throws AWTException {
        registroUtestStep.validolblRegistroExitoso();
    }



}
