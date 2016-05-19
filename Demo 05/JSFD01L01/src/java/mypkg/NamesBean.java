/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypkg;

import java.io.Serializable;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.ArrayDataModel;
import javax.faces.model.DataModel;

/**
 *
 * @author Karim
 */
@ManagedBean(name = "nameBean")
@SessionScoped
public class NamesBean implements Serializable {

    /**
     * Creates a new instance of NamesBean
     */
    ArrayList<Names> list = new ArrayList<Names>();
    Names addObj=new Names();
    DataModel<Names> model;

    public Names getAddObj() {
        return addObj;
    }

    public void setAddObj(Names addObj) {
        this.addObj = addObj;
    }

    public DataModel<Names> getModel() {
        return model;
    }

    public void setModel(DataModel<Names> model) {
        this.model = model;
    }

    public String deletRow() {
        Names name = model.getRowData();
        list.remove(name);
        model = new ArrayDataModel<Names>(list.toArray(new Names[list.size()]));
        return null;
    }

    public String update(){
        Names name = model.getRowData();
        int index = model.getRowIndex();
        list.get(index).equals(name);
        model = new ArrayDataModel<Names>(list.toArray(new Names[list.size()]));
        return null;
    }
    public String addData(){
        list.add(addObj);
        model = new ArrayDataModel<Names>(list.toArray(new Names[list.size()]));
        return null;
    }
    public NamesBean() {
        list.add(new Names("Mohsen", "karim", 22));
        list.add(new Names("Abbas", "Mohamed", 33));
        list.add(new Names("henady", "Mohamed", 50));
        list.add(new Names("elsaka", "Ahmed", 22));
        model = new ArrayDataModel<Names>(list.toArray(new Names[list.size()]));
    }

}
