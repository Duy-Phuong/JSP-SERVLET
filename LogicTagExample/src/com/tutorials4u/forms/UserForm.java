package com.tutorials4u.forms;

import java.util.ArrayList;

/**
 *
 * @author info@tutorials4u.net
 */
public class UserForm extends org.apache.struts.action.ActionForm {

  	private static final long serialVersionUID = 1L;
	private String name;
    private int age;
    private float height;
    private float weight;
    private String favouriteFood;
    private ArrayList hobbies;

    public UserForm() {
        super();
       
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
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the height
     */
    public float getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(float height) {
        this.height = height;
    }

    /**
     * @return the weight
     */
    public float getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(float weight) {
        this.weight = weight;
    }

    /**
     * @return the favouriteFood
     */
    public String getFavouriteFood() {
        return favouriteFood;
    }

    /**
     * @param favouriteFood the favouriteFood to set
     */
    public void setFavouriteFood(String favouriteFood) {
        this.favouriteFood = favouriteFood;
    }

    /**
     * @return the hobbies
     */
    public ArrayList getHobbies() {
        return hobbies;
    }

    /**
     * @param hobbies the hobbies to set
     */
    public void setHobbies(ArrayList hobbies) {
        this.hobbies = hobbies;
    }
}
