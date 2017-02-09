package com.psl.typetutor;

public class WORD {
	private String generatedWord, typedWord;
	private int gCount,hitCount;
	 static boolean avail;
	
	public WORD() {
		gCount=0;
		hitCount=0;
		avail=true;
	}
	
	public String getGeneratedWord() {
		return generatedWord;
	}
	public void setGeneratedWord(String generatedWord) {
		this.generatedWord = generatedWord;
	}
	public String getTypedWord() {
		return typedWord;
	}
	public void setTypedWord(String typedWord) {
		this.typedWord = typedWord;
	}
	public int getgCount() {
		return gCount;
	}
	public void setgCount(int gCount) {
		this.gCount = gCount;
	}
	public int getHitCount() {
		return hitCount;
	}
	public void setHitCount(int hitCount) {
		this.hitCount = hitCount;
	}
	
	void result() {
        System.out.println("Your score: "+(getHitCount()*100/getgCount())+"%");
    }
}
