

package com.psl.day6;

/**
 *
 * 
 */
public class LinkedMain {
    public static void main(String[] args) {
          Linkedlist<String> il= new Linkedlist<String>();
        il.add("Sun");
        il.add("Earth");
        il.add("Water");
        il.add("MOON");
        il.add("FIRE");
        il.change("Sun", "Surya");
        System.out.println("Size: "+il.size());
        
        try{
            while(il.hasNext()){
            System.out.println(il.get());
        }
        }
        catch(NullPointerException e){
            System.out.println("end of file");
        }
    }
    
}
