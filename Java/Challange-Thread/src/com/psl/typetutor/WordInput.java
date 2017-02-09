package com.psl.typetutor;

import java.util.Scanner;

public class WordInput extends Thread {
	WORD w;
	Scanner s;
	
    public WordInput(WORD w) {
        super("WordInput");
        this.w = w;
    }
    @Override
    public void run() {
       boolean b= getInput();
        if(b==false){
        	WORD.avail= false;
            w.result();
            s.close();
        }
        
    }

    private boolean getInput() {
        s= new Scanner(System.in);
        String str=" ";
        while(WORD.avail){
          
            str=s.next();
           
            if(str.equals("*")) return false;
            else{
                w.setTypedWord(str);
                if(w.getGeneratedWord().equalsIgnoreCase(w.getTypedWord())) w.setHitCount(w.getHitCount()+1);
            
            }
        }
        
        return true;
    }
}
    