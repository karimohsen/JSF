/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mypkg;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author Karim
 */
@FacesConverter(forClass = CreditCard.class)
public class CustomConverter implements Converter{

    @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String string) {
        if(string.length() < 15){
            FacesMessage message = new FacesMessage("Unable to convert","invalid creidt card number");
            message.setSeverity(FacesMessage.SEVERITY_ERROR);
            throw new ConverterException(message);
        }
        CreditCard cc = new CreditCard();
        cc.setcPart(string.split("-"));
        return cc;
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object o) {
        CreditCard cc = (CreditCard)o;
        StringBuilder build = new StringBuilder();
        for(String s : cc.getcPart()){
            build.append(s);
        }
        return build.toString();
        
    }
    
    
}
