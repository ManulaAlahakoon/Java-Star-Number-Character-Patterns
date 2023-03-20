
import java.util.*;

class RightSideTraingle{
	
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of rows to print a Right Side Traingle Star Pattern = ");
		int rows = input.nextInt();
		System.out.println();
		System.out.println("***>Right Side Traigle Pattern with "+rows+" rows<***");
		System.out.println();
						
		for(int i = 1; i<=rows; i++){
			
			for(int n = 1; n<=i; n++){
				
				System.out.print("*");
				}
				
			System.out.println();
			
			}
		for(int i = 1; i<=rows-1; i++){
			
			for(int n = rows-1; n>=i; n--){
			
			System.out.print("*");
			
			}
			
			System.out.println();
			
			}
		
		}

	
	}
