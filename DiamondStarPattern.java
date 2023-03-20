//2023/03/17

import java.util.*;

class DiamondStarPattern{
	
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of rows to print a Diamond Star Pattern = ");
		int rows = input.nextInt();
		System.out.println();
		System.out.println("***>Diamond Star Pattern with "+rows+" rows<***");
		System.out.println();
				
		for(int i = 1; i<=rows; i++){
					
			for(int n = rows; n>i; n--){
				
				System.out.print(" ");			
			}
			
			for(int j = 1; j<=(i*2)-1; j++){
				
				System.out.print("*");				
			}
			
			System.out.println();
							
		}
		
		for(int i = rows-1; i>=1; i--){
			
			for(int n = rows-1; n>=i; n--){
				
				System.out.print(" ");
				
			}
			
			for(int j = 1;j<=(i*2)-1; j++){
				
				System.out.print("*");
				
			}
				
			System.out.println(" ");
			
		}
		
			
	}
 }
