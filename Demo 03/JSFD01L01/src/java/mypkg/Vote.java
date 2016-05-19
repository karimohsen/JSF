/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypkg;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Karim
 */
@ManagedBean(name = "voteBean")
@SessionScoped
public class Vote implements Serializable {

    @ManagedProperty(value = "#{listBean}")
    VoteListBean listBean;

    @ManagedProperty(value = "#{user}")
    UserBean userBean;

    boolean voted = false;
    String choosen = "";

    public boolean isVoted() {
        return voted;
    }

    public void setVoted(boolean voted) {
        this.voted = voted;
    }

    public String getChoosen() {
        return choosen;
    }

    public void setChoosen(String choosen) {
        this.choosen = choosen;
    }

    public void setListBean(VoteListBean listBean) {
        this.listBean = listBean;
    }

    public String voteButton() {
        if (!userBean.name.equals("")) {
            if (getChoosen() != null) {
                listBean.incrementCat(getChoosen());
                setVoted(true);
                return "result";
            }
        }
        return "";
    }

    public void setUserBean(UserBean userBean) {
        this.userBean = userBean;
    }

    public Vote() {
    }

}
