package com.tutorials4u.forms;

/**
 *
 * @author info@tutorials4u.net
 */
public class FeedbackForm extends org.apache.struts.action.ActionForm {
    
	private static final long serialVersionUID = 1L;

	private String name;
    
    private String sex;
    
    private String comments;
    

    public FeedbackForm() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * @param sex the sex to set
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    
    /**
     * @return the comments
     */
    public String getComments() {
        return comments;
    }

    /**
     * @param comments the comments to set
     */
    public void setComments(String comments) {
        this.comments = comments;
    }

    
}
