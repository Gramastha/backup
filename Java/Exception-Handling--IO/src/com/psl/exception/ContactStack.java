package com.psl.exception;

import java.util.ArrayList;
import java.util.List;

public class ContactStack {
	
	private Contact[] stack;
	int i=0;

    public ContactStack(int SIZE) 
    {
        stack = new Contact[SIZE];
    }

    public void push(Contact c) 
    {

       stack[i++]= c;
     }

     public Contact pop() throws Exception 
     { 
        if(!isEmpty()){
           Contact c= stack[--i];
           stack[i]=null;
           return c;
        } else{
           throw new Exception("Stack Empty");
        }
     }

     


     public boolean isEmpty() 
     {
       return i==-1;
     }

 }


