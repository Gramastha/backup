/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.psl.day8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * 
 */
public class CSM {
   static  Map<String, List> usercontact=new HashMap<String, List>();
    String user="";
    List<Contacts> cs= new ArrayList<Contacts>();
    public CSM(Login l) {
        if(Login.isValidUser(l)){
            user=l.getUid();
        }
    }
    
    public void createContacts(Contacts c){
        cs.add(c);
        usercontact.put(user, cs);
        
    }
    public void update(Contacts old, Contacts nc){
        if(cs.contains(old)){
            int x=cs.indexOf(old);
            cs.remove(x);
            cs.add(x, nc);
        }
        else{
            System.out.println(old+" does not exists enter correct value to update");
        }
    }
    public void remove(Contacts c){
        if(cs.contains(c)){
            cs.remove(c);
            
        }
        else{
            System.out.println(c+" does not exists enter correct value to remove");
        }
    }
    public void display(){
        
        for(Contacts c: cs){
            c.displayAnn();
            c.displayDOB();
            System.out.println(c.getName()+"[ Date of birth: "+c.printdob()+", Anniversary Date: " +c.printAnn()+" ].");
        }
    }
    
}
