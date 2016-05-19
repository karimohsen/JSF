/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mypkg;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Karim
 */
@ManagedBean(name="customTag")
@SessionScoped
public class CustomTagManagedBean {

    private String username;
    private String password;

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
    public String go(){
        return "Home.xhtml";
    }
    /**
     * Creates a new instance of CustomTagManagedBean
     */
    public CustomTagManagedBean() {
    }
    
}
