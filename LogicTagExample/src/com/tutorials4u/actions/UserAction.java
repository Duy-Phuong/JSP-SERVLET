package com.tutorials4u.actions;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.tutorials4u.forms.UserForm;

/**
 *
 * @author info@tutorials4u.net
 */
public class UserAction extends org.apache.struts.action.Action {
    
    private final static String SUCCESS = "success";
    
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        ArrayList hobbiesList = new ArrayList();
        UserForm userForm = (UserForm)form;
        userForm.setName("Vinay");
        userForm.setAge(21);
        userForm.setHeight(5.11f);
        userForm.setWeight(70f);
        userForm.setFavouriteFood("Fish and Chicken");
        hobbiesList.add("Music");
        hobbiesList.add("Art");
        hobbiesList.add("Dance");
        userForm.setHobbies(hobbiesList);
        return mapping.findForward(SUCCESS);
    }
}
