package com.tutorials4u.forms;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author info@tutorials4u.net
 */
public class LoginForm extends org.apache.struts.validator.ValidatorForm {

  	private static final long serialVersionUID = 1L;
	private String userName;
    private String password;

    public LoginForm() {
        super();
    }

    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        if (getUserName() == null || getUserName().length() < 1) {
            errors.add("userName", new ActionMessage("error.userName.required"));
        }
        if (getPassword() == null || getPassword().length() < 1) {
            errors.add("password", new ActionMessage("error.password.required"));
        } else if (getPassword().length() < 6) {
            errors.add("password", new ActionMessage("error.password.minlength"));
        }
        return errors;
    }

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
}
