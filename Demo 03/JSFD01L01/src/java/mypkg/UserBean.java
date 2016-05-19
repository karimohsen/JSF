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
@ManagedBean(name="user")
@SessionScoped
public class UserBean {

    String name="";
    String pwd="";
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getMyPage() {
        if(name.equals("karim")){
            return "Welcome";
        }
        return "Home";
    }
    
    public String checkAjax(){
        if(name.length()==0)
            return "";
        else
            return "Welcome to Jsf "+name;
    }
    
    
    
    public UserBean() {
    }
    
}
