package control;

import org.openqa.selenium.By;

public class Checkbox extends Control{
    public Checkbox(By locator) {
        super(locator);
    }

    public void checkTrue(boolean value){
        findControl();
        control.clear();
        control.click();
    }
}
