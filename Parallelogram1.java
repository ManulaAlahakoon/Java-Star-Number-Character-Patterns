
import java.util.*;
class Parallelogram1{
	
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of rows to print a parallelogram Star Pattern = ");
		int rows = input.nextInt();
		System.out.println();
		System.out.println("***>parallelogram Pattern with "+rows+" rows<***");
		System.out.println();
		
		for(int i = 1; i<=rows; i++){
			
			for(int n = rows; n>i; n--){
			
				System.out.print(" ");
			}
			
			for(int j = 1; j<=rows; j++){
				
				System.out.print("*");
				}
			System.out.println();
			
		}
		
		
	
	}}

