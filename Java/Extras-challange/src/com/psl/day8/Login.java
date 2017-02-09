/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.psl.day8;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * 
 */
public class Login {
  private  String uid,password;
   private static Map<String ,String> validate= new HashMap<String,String>();

    public Login(String uid, String password) {
        this.uid = uid;
        this.password = password;
        if(this.uid.isEmpty() || this.password.isEmpty()) System.out.println("Enter valid credentials");
        else{
            validate.put(this.uid, this.password);
            }
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }
    
    public static  boolean isValidUser(Login L){
        String u=L.getUid();
        String p= L.getPassword();
        if(validate.containsKey(u)){
            if(validate.get(u).equals(p)){
                return true;
            }
        }
        return false;
        
    }

    private String getPassword() {
        return password;
    }

    private void setPassword(String password) {
        this.password = password;
    }
    
    
    
}
