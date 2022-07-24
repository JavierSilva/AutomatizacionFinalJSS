package runner;

import io.cucumber.java.DataTableType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;
import page.MainPage;
import page.MenuSection;
import page.SignupModal;
import session.Session;

import java.util.Map;

public class SignupNewAccount
{
    MainPage mainPage = new MainPage();
    SignupModal loginModal = new SignupModal();

    MenuSection menuSection= new MenuSection();

    @Given("la pagina {string} este abierta")
    public void laPaginaEsteAbierta(String url) {
        Session.getInstance().getBrowser().get(url);
    }
    @And("quiero crear una nueva cuenta")
    public void quieroCrearUnaNuevaCuenta(NuevaCuenta nuevaCuenta)
    {
        mainPage.signUpFreeButton.click();
        loginModal.fullnameTextBox.writeText(nuevaCuenta.getFullName());
        loginModal.emailTxtBox.writeText(nuevaCuenta.getEmail());
        loginModal.pwdTxtBox.writeText(nuevaCuenta.getPassword());
        loginModal.checkbox.click();
        loginModal.signupButton.click();
    }

    @DataTableType
    public NuevaCuenta convertir(Map<String,String> objeto)
    {
        NuevaCuenta cuenta = new NuevaCuenta();

        cuenta.setFullName(objeto.get("fullName") );
        cuenta.setEmail(objeto.get("email"));
        cuenta.setPassword(objeto.get("password"));

        return cuenta;
    }

    @Then("debo ingresar a la app web")
    public void deboIngresarALaAppWeb()
    {
        Assertions.assertTrue(menuSection.logoutButton.isControlDisplayed(),
                "ERROR el login fallo");
    }
}
