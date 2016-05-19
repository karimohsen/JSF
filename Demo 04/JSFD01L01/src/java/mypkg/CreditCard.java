/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mypkg;

/**
 *
 * @author Karim
 */
public class CreditCard {
    public CreditCard(String[] cPart) {
        this.cPart = cPart;
    }

    public CreditCard() {
    }

    String[] cPart;

    public String[] getcPart() {
        return cPart;
    }

    public void setcPart(String[] cPart) {
        this.cPart = cPart;
    }
}
