

import java.util.*;
class Parallelogram2v2{
	
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of rows to print a parallelogram Star Pattern = ");
		int rows = input.nextInt();
		System.out.println();
		System.out.println("***>parallelogram Pattern with "+rows+" rows<***");
		System.out.println();
		
		for(int i = 1; i<=rows; i++){
			
			for(int n = 1; n<= i-1; n++){
			
				System.out.print(" ");
			}
			
			for(int j = 1; j<=rows; j++){
				
				System.out.print("*");
				}
			System.out.println();
			
		}
		
		
	
	}}
