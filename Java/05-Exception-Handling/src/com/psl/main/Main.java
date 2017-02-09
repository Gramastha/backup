package com.psl.main;

public class Main {

	public static void main(String[] args) {
		
		/*try{
			
		}catch(Exception e){
			System.out.println(e.getMessage());
		}*/

		try {
			System.out.println(countChar("hi abhishek Today is Thursday", 'i'));
		} catch (StringIndexOutOfBoundsException | CharNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static int countChar(String str, char ch) throws CharNotFoundException{
		
			int count=0, index=0;
			
			assert ch>='a' && ch<='z' || ch<='Z' && ch>='A';
			
			for(; ;){
				index= str.indexOf(ch, index);
				if(index==-1) break;
				index++;
				count++;
			}
			
			if(count==0) throw new CharNotFoundException(ch+ " not found in-- "+str);
			
			return count;
	}

}
