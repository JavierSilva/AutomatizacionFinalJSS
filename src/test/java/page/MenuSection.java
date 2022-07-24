package page;


import control.Button;
import control.Link;
import org.openqa.selenium.By;

public class MenuSection {
    public Button logoutButton = new Button(By.id("ctl00_HeaderTopControl1_LinkButtonLogout"));
    public Link settingsLink = new Link(By.xpath("//a[text()='Settings']"));
}
