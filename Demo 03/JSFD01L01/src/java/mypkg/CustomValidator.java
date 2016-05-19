/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mypkg;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;
import javax.xml.bind.ValidationException;

/**
 *
 * @author Karim
 */
@FacesValidator("myvalidator")
public class CustomValidator implements Validator {
    private static final String EMAIL_PATTERN
            = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    Pattern pat;
    public boolean validate(final String hex) {
        pat = Pattern.compile(EMAIL_PATTERN);
        Matcher  matcher = pat.matcher(hex);
        return matcher.matches();
    }
    @Override
    public void validate(FacesContext fc, UIComponent uic, Object o) throws ValidatorException {
        String mail = (String) o;
        if (!validate(mail)) {
            FacesMessage msg = new FacesMessage("E-mail validation failed.", "Invalid E-mail format.");
			msg.setSeverity(FacesMessage.SEVERITY_ERROR);
			throw new ValidatorException(msg);
        }
    }
    
}
