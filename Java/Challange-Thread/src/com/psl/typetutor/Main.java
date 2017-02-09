package com.psl.typetutor;


public class Main {

	public static void main(String[] args) throws InterruptedException {
		WORD word= new WORD();
        WordDropper wd= new WordDropper(word);
        wd.setPriority(8);
        
        WordInput wi= new WordInput(word);
        wi.setPriority(3);
        wd.start();
        wi.start();
		
				
				
			
	}

}
