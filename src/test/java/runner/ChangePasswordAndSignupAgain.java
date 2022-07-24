package runner;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;
import page.*;

import java.util.Map;


public class ChangePasswordAndSignupAgain
{
    MenuSection menuSection = new MenuSection();

    SettingsModal settingsModal = new SettingsModal();

    TodoPage todoPage = new TodoPage();

    MainPage mainPage = new MainPage();
    LoginModal loginModal = new LoginModal();
    @Given("la pagina este abierta y con sesion iniciada")
    public void laPaginaEsteAbiertaYConSesionIniciada()
    {
        Assertions.assertTrue(menuSection.logoutButton.isControlDisplayed(),   "ERROR no se inicio sesion");
    }

    @And("quiero ir a settings y cambiar el password")
    public void quieroIrASettingsYCambiarElPassword(Map<String, String> pOldPasswordNuevoPassword)
    {
        menuSection.settingsLink.click();
        settingsModal.oldPassword.writeText(pOldPasswordNuevoPassword.get("old password"));
        settingsModal.newPassword.writeText(pOldPasswordNuevoPassword.get("new password"));
        settingsModal.okButton.click();

    }

    @And("quiero cerrar sesion y volver a iniciar sesion con el nuevo password")
    public void quieroCerrarSesionYVolverAIniciarSesionConElNuevoPassword(Map<String,String> credenciales)
    {
        todoPage.logoutButton.click();

        mainPage.loginButton.click();
        loginModal.emailTxtBox.writeText(credenciales.get("email"));
        loginModal.pwdTxtBox.writeText(credenciales.get("password"));
        loginModal.loginButton.click();
    }

    @Then("tendria que lograr ingresar a la app web con las nuevas credenciales")
    public void tendriaQueLograrIngresarALaAppWebConLasNuevasCredenciales()
    {
        Assertions.assertTrue(menuSection.logoutButton.isControlDisplayed(),
                "ERROR el login fallo");
    }
}
