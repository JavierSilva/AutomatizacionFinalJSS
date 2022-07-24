package runner;

import java.util.Random;

public class NuevaCuenta
{
    private String fullName;
    private String email;
    private String password;


    public NuevaCuenta()
    {
    }

    public String getFullName()
    {
        return fullName;
    }

    public String getEmail()
    {
        return email;
    }

    public String getPassword()
    {
        return password;
    }

    public NuevaCuenta setFullName(String pFullName)
    {
        this.fullName = pFullName;
        return this;
    }

    public NuevaCuenta setEmail(String pEmail)
    {
        Random random = new Random();

        int value = random.nextInt(999999);
        String strvalue = String.valueOf(value);

        String emailname = pEmail.substring(0, pEmail.indexOf("@")) + strvalue;
        String emaildomain = pEmail.substring(pEmail.indexOf("@") + 1);
        
        this.email = emailname + "@" + emaildomain;
        return this;
    }

    public NuevaCuenta setPassword(String pPassword)
    {
        Random random = new Random();

        int value = random.nextInt(9999999);
        String strvalue = String.valueOf(value);
        
        this.password = pPassword + strvalue;
        return this;
    }


}