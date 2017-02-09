package com.psl.asss2;

public class Leap {

		public static boolean isLeap(int yr){
			
			if(yr%100==0){
				if(yr%400==0)
					return true;
			}
			else if(yr%4==0){
				return true;
			}
			else{
				return false;
			}
			return false;
			
		}
	public static void main(String[] args) {
		

	}

}
