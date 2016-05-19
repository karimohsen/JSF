/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mypkg;

import java.io.Serializable;
import java.util.ArrayList;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Karim
 */
@ManagedBean(name="listBean")
@ApplicationScoped
public class VoteListBean implements Serializable{

    /**
     * Creates a new instance of VoteListBean
     */
    ArrayList<Categories> catList = new ArrayList<>();
    public VoteListBean() {
        catList.add(new Categories("Cars","car", 0));
        catList.add(new Categories("Houses","house", 0));
        catList.add(new Categories("Buildings","build", 0));
        catList.add(new Categories("Sports","sport", 0));
        catList.add(new Categories("Swimming","swim", 0));
        catList.add(new Categories("Football","ftball", 0));
    }
    public void incrementCat(String catval){
        int index=0;
        for(int i = 0 ; i < catList.size() ; i++){
            if(catList.get(i).getCatValue().equals(catval)){
                index = i ;
                break;
            }
        }
        int var = catList.get(index).getCatVotes();
        var++;
        catList.get(index).setCatVotes(var);
    }

    public ArrayList<Categories> getCatList() {
        return catList;
    }

    public void setCatList(ArrayList<Categories> catList) {
        this.catList = catList;
    }
    
}
