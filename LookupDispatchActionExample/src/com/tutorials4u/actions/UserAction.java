/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tutorials4u.actions;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tutorials4u.forms.UserForm;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.LookupDispatchAction;

/**
 * 
 * @author info@tutorials4u.net
 */
public class UserAction extends LookupDispatchAction {

	/* forward name="success" path="" */
	private final static String SUCCESS = "success";

	/**
	 * Provides the mapping from resource key to method name.
	 * 
	 * @return Resource key / method name map.
	 */
	protected Map getKeyMethodMap() {
		Map map = new HashMap();
		map.put("UserForm.add", "add");
		map.put("UserForm.update", "update");
		map.put("UserForm.delete", "delete");
		return map;
	}

	public ActionForward add(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		UserForm userForm = (UserForm) form;
		userForm.setMessage("From add method.");
		return mapping.findForward(SUCCESS);
	}

	public ActionForward update(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		UserForm userForm = (UserForm) form;
		userForm.setMessage("From update method.");
		return mapping.findForward(SUCCESS);
	}

	public ActionForward delete(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		UserForm userForm = (UserForm) form;
		userForm.setMessage("From delete method.");
		return mapping.findForward(SUCCESS);
	}

}