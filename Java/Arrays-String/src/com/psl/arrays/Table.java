package com.psl.arrays;

public class Table {
	public static void createTable(){
		int arr[][]= new int[13][13];
		
		for(int i=0;i<=12;i++){
			for(int j=0;j<13;j++){
				if(i==0)
				arr[i][j]=(j);
				else if(j==0)
					arr[i][j]=(i);
				
				
				else{
					
					arr[i][j]= (i*j);
				}
			}
		}
		
		for(int i=0;i<=12;i++){
			for(int j=0;j<13;j++){
				
				if(i==0 &j==0) System.out.print("       ");
								
				else{
					
					System.out.print(String.format("%7d", arr[i][j]));
				}
			}
			System.out.println();
			
		}
	}
	
	
	public static void main(String[] args){
		createTable();
	}

}
