/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.psl.day8;

import java.sql.Date;

/**
 *
 * 
 */
public class ContactsMAin {
    public static void main(String[] args) {
        Login l1= new Login("ABCD", "xxyyxx");
        Login l2= new Login("EFGH", "abcdef");
        Login l3= new Login("IJKL", "pqrstuv");
        
        CSM cs1= new CSM(l1);
        CSM cs2= new CSM(l2);
        CSM cs3= new CSM(l3);
        cs1.createContacts(new Contacts("abcd", Date.valueOf("2012-12-12"), Date.valueOf("2016-04-12")));
        cs1.createContacts(new Contacts("xyz", Date.valueOf("2016-12-12"), Date.valueOf("2016-12-04")));
        cs1.createContacts(new Contacts("pqqq", Date.valueOf("2015-1-12"), Date.valueOf("2019-04-12")));
        
          cs2.createContacts(new Contacts("add", Date.valueOf("2051-10-12"), Date.valueOf("2010-04-12")));
        cs2.createContacts(new Contacts("sub", Date.valueOf("2000-12-12"), Date.valueOf("2016-12-04")));
        cs2.createContacts(new Contacts("mul", Date.valueOf("2022-1-12"), Date.valueOf("2018-04-12")));
        Contacts c=new Contacts("grey", Date.valueOf("2015-1-15"), Date.valueOf("2019-04-05"));
          cs3.createContacts(new Contacts("red", Date.valueOf("2012-10-10"), Date.valueOf("2016-04-04")));
        cs3.createContacts(new Contacts("blue", Date.valueOf("2016-04-04"), Date.valueOf("2016-10-04")));
        cs3.createContacts(c);
        
        System.out.println("CS1");
        cs1.display();
        System.out.println("CS2");
        cs2.display();
        System.out.println("CS3");
        cs3.display();
        
        cs3.update(c, new Contacts("brown", Date.valueOf("2000-02-02"), Date.valueOf("2010-12-4")));
        System.out.println("CS3");
        cs3.display();
    }
    
}
