package com.tutorials4u.forms;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 * 
 * @author info@tutorials4u.net
 */
public class LoginForm extends org.apache.struts.action.ActionForm {

	private static final long serialVersionUID = 3011799872287841118L;

	private String userName;

	private String password;
	
	private String mode;
	
	private String age;
	
	private String state;
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}

	List<String> stateList = new ArrayList<String>();
	
	public List<String> getStateList() {
		
		return stateList;
	}
	public void setStateList(List<String> stateList) {
		this.stateList = stateList;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	/**
     *
     */
	public LoginForm() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * This is the action called from the Struts framework.
	 * 
	 * @param mapping
	 *            The ActionMapping used to select this instance.
	 * @param request
	 *            The HTTP Request we are processing.
	 * @return
	 */
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
		ActionErrors errors = new ActionErrors();
		if (userName == null || userName.length() < 1) {
			errors
					.add("userName", new ActionMessage(
							"error.userName.required"));
			// TODO: add 'error.name.required' key to your resources
		}
		if (password == null || password.length() < 1) {
			errors
					.add("password", new ActionMessage(
							"error.password.required"));
			// TODO: add 'error.name.required' key to your resources
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
	 * @param userName
	 *            the userName to set
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
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
}
