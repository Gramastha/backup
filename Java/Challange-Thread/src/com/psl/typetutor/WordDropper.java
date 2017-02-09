package com.psl.typetutor;



public class WordDropper extends Thread{
	 
    WORD w;

    public WordDropper(WORD w) {
        super("WordDropper");
        this.w = w;
    }

    @Override
    public void run() {
        try {
            generateWord();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        
    }
    private void generateWord() throws InterruptedException{
        
        while(WORD.avail){
            
            int i= (int) (Math.random()*Dictionary.EARTH.getCount());
            w.setGeneratedWord(Dictionary.values()[i].name());
            System.out.println(w.getGeneratedWord());
            w.setgCount(w.getgCount()+1);
           
            Thread.sleep(5000);
        }
    }
    
    
    
}
