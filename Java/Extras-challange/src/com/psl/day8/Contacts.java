/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.psl.day8;

import java.util.Date;

/**
 *
 * 
 */
public class Contacts {
    private String name;
    private Date dob,ann;

    public Contacts(String name, Date dob, Date ann) {
        this.name = name;
        this.dob = dob;
        this.ann = ann;
    }

    public Contacts() {
        super();
    }
  
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Date getAnn() {
        return ann;
    }

    public void setAnn(Date ann) {
        this.ann = ann;
    }
    
    
    public void displayDOB(){
        Date d= new Date();
        if(d.getDate()==dob.getDate() && d.getMonth()==dob.getMonth()){
            System.out.println(name+ "---Wish a happy birthday");
        }
    }
    
    public void displayAnn(){
        Date d= new Date();
        if(d.getDate()==ann.getDate() && d.getMonth()==ann.getMonth()){
            System.out.println(name+ "---Wish happy anniversary");
        }
    }

    String printdob() {
        return (dob.getDate()+"-"+(1+dob.getMonth())+"-"+(dob.getYear()+1900));
    }

    String printAnn() {
        return (ann.getDate()+"-"+(1+ann.getMonth())+"-"+(ann.getYear()+1900));
    }
    
}
