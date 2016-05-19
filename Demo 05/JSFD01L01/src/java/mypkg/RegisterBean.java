/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypkg;

import java.io.Serializable;
import java.util.Date;
import java.util.Locale;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Karim
 */
@ManagedBean(name = "register")
@RequestScoped
public class RegisterBean implements Serializable {

    private String username;
    private String password;
    private Date mydate;
    private int ammount;
    private CreditCard creditCard;
    private String email;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getMydate() {
        return mydate;
    }

    public void setMydate(Date mydate) {
        this.mydate = mydate;
    }

    public int getAmmount() {
        return ammount;
    }

    public void setAmmount(int ammount) {
        this.ammount = ammount;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
    public void changelanguage(){
        Locale locale = FacesContext.getCurrentInstance().getViewRoot().getLocale();
        System.out.println(locale.toString());
        if(locale.getLanguage().equals("en")){
            locale = new Locale("ar");
            FacesContext.getCurrentInstance().getViewRoot().setLocale(locale);
        }
        else{
            locale = new Locale("en");
            FacesContext.getCurrentInstance().getViewRoot().setLocale(locale);
        }
    }
    

    /**
     * Creates a new instance of RegisterBean
     */
    public RegisterBean() {
    }

}
