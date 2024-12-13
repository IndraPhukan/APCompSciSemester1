import pkg.*;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter how many magic squares you want to see: ");
		int userNum = sc.nextInt();
		int numOfSquares = 0;
		
		
		for (int i = 1; numOfSquares < userNum; i++){
			if (CVMath.specialSquare(i) != 0){
				System.out.println(CVMath.specialSquare(i));
				numOfSquares++;
			}
				
		}
			
		
		
		//System.out.println(CVMath.findMid(2,3,1));
		//System.out.println(CVMath.specialSquare(49));
		
				
				
			
			
			
		}
		
		
	}

