package com.psl.asss2;

public class Pattern {
	  
    public static void draw(int num){
        for(int i=1;i<num;i+=2) {
         for(int j=0;j<num-i;j++) {
             System.out.print(" ");
         }
        for(int k=0;k<i;k++) {
            
            System.out.print(i+" ");
            
            
        }
        System.out.println();  
    }
    }
    public static void main(String[] args) {
        draw(10);
    }
}
