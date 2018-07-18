package com.tutorials4u.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import com.tutorials4u.forms.UserForm;

/**
 *
 * @author info@tutorials4u.net
 */
public class UserAction extends DispatchAction {

    /* forward name="success" path="" */
    private final static String SUCCESS = "success";

    /**
     * This is the Struts action method called on
     * http://.../actionPath?method=myAction1,
     * where "method" is the value specified in <action> element : 
     * ( <action parameter="method" .../> )
     */
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