package com.psl.assignment1;

public class PnC {
	

    public static void pnc(String input){
        int f=1, pos=0;
        for(int i=1;i<input.length();i++) {f=f*i;}
        
//        String[] s= new String[f];
        char[] a= new char[input.length()];
        for(int i=0;i<input.length();i++)
            a[i]= input.charAt(i);
        cal(a,input.length());
        
//        return s;
    }
    
    public static void main(String[] args) {
        pnc("123");
    }

    private static void cal(char[] a, int length) {
        if(length==1){ System.out.println(a);
        return;}
        for(int i=0;i<length;i++){
           swap(a, i, length-1);
           cal(a,length-1);
          swap(a,i,length-1);
            
            
        }

    }

    private static void swap(char[] a, int i, int i0) {
        char c= a[i];
        a[i]= a[i0];
        a[i0]= c;
    }
    
}
