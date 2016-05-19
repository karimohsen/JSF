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
public class Categories {
    private String catLabel;
    private String catValue;
    private int catVotes;

    public Categories(String catLabel, String catValue, int catVotes) {
        this.catLabel = catLabel;
        this.catValue = catValue;
        this.catVotes = catVotes;
    }

    public Categories(){
        
    }
    public String getCatLabel() {
        return catLabel;
    }

    public void setCatLabel(String catLabel) {
        this.catLabel = catLabel;
    }

    public String getCatValue() {
        return catValue;
    }

    public void setCatValue(String catValue) {
        this.catValue = catValue;
    }

    public int getCatVotes() {
        return catVotes;
    }

    public void setCatVotes(int catVotes) {
        this.catVotes = catVotes;
    }
    
}
