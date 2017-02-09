package com.psl.arrays;

public class Searching_Sorting {
	
	public static void linearSearch(int[] nums, int key){
		
		for(int i= 0;i<nums.length;i++){
			if(nums[i]==key){
				System.out.println("Element Found at "+ (i+1)+"th position");
				return;
			}
			
		}
		System.out.println("Element not present");
		
	}
	
	public static void sorting(int[] n){
		
		for(int i=0; i<n.length;i++){
			for(int j=0;j<(n.length-1);j++){
				if(n[i]<n[j]){
					int x=n[i];
					n[i]=n[j];
					n[j]= x;
				}
			}
		}
		
		for(int i=0;i<n.length;i++)
			System.out.println(n[i]);
		
	}
	public static void main(String[] args){
		int n[]={1,2,13,4,55,6,71,58,9,21};
		
		linearSearch(n, 71);
		sorting(n);
	}

}
