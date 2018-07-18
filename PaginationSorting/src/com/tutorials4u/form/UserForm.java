package com.tutorials4u.form;

import java.util.ArrayList;

/**
 *
 * @author info@tutorials4u.net
 */
public class UserForm extends org.apache.struts.action.ActionForm {
    
   private ArrayList actorList;
   

    public UserForm() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @return the actorList
     */
    public ArrayList getActorList() {
        return actorList;
    }

    /**
     * @param actorList the actorList to set
     */
    public void setActorList(ArrayList actorList) {
        this.actorList = actorList;
    }

   
}
