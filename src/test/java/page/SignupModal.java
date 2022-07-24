package page;

import control.Button;
import control.Checkbox;
import control.TextBox;
import org.openqa.selenium.By;

public class SignupModal
{
    public TextBox fullnameTextBox = new TextBox(By.id("ctl00_MainContent_SignupControl1_TextBoxFullName"));
    public TextBox emailTxtBox = new TextBox(By.id("ctl00_MainContent_SignupControl1_TextBoxEmail"));
    public TextBox pwdTxtBox = new TextBox(By.id("ctl00_MainContent_SignupControl1_TextBoxPassword"));
    public Checkbox checkbox = new Checkbox(By.id("ctl00_MainContent_SignupControl1_CheckBoxTerms"));

    public Button signupButton = new Button(By.id("ctl00_MainContent_SignupControl1_ButtonSignup"));

}
