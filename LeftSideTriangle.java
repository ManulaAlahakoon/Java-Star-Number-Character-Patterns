
import java.util.*;
class LeftSideTriangle{
	
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of rows to print a Left Side Traingle Star Pattern = ");
		int rows = input.nextInt();
		System.out.println();
		System.out.println("***>Left Side Traigle Pattern with "+rows+" rows<***");
		System.out.println();
		
		for(int i = 1; i<=rows; i++){
			
			for(int n = rows; n>i; n--){
			
				System.out.print(" ");
			}
			
			for(int j = 1; j<=i; j++){
				
				System.out.print("*");
				}
			System.out.println();
		}
		
		for(int i = 1; i<=rows-1; i++){
			
			for(int n = 1; n<=i; n++){
				
				System.out.print(" ");
				}
			
			for(int j = rows-1; j>=i; j--){
			
				System.out.print("*");
			
				}
			System.out.println();
			}
	
	}}
