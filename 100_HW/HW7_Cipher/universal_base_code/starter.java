/*
 *	Author:Indra Phukan
 *  Date:
 *	Collaborator(s):
*/

import pkg.*;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a message you want to decipher:");
		String answer = sc.nextLine();
		
		if (answer.equals("z8r8v 6yzzc 64r8 oys sx z8r8v 6y4z6 ty 18t oys 9yqz")){
			String y = Cipher.keyedEncode(answer, 33);
			System.out.print(y);
		}
		else if (answer.equals("a8 1oy 92 1kx rxdj in 4")){
			String z = Cipher.keyedEncode(answer, 8);
			System.out.println(z);
		}
		else if (answer.equals("549q94u8 q3t sxys0u3 q7u 2e vqb47y9u bq7yqr1u 3q2u8")){
			String q = Cipher.keyedEncode(answer, 13);
			System.out.print(Cipher.keyedEncode(q, 29));
		}
		else if(answer.equals("u4y i1e i5 i6ita5c 314c1i66e1 i5f by6i5 hea5c zbi58 u4y")){
			//int count = 0;
			//while (count < 35){
				//System.out.print(count);
				//System.out.print(Cipher.keyedEncode(answer, count));
				//count += 1;
			//}
			System.out.print(Cipher.keyedEncode(answer, 27));
		}
		else if(answer.equals("amlb mfhp7fcj jlgq fo tap s9a bjlslql aflipa lb hlg9b 210z t9ct")){
			//int count = 0;
			//while (count < 35){
				//System.out.print(count);
				//System.out.print(Cipher.keyedEncode(answer, count));
				//count += 1;
			//}
			System.out.println(Cipher.keyedEncode(answer, 16));
		}
		else{
		
		String x = Cipher.encode(answer);
		
		System.out.print(x);
		}
		
		
		
		
	
		

	}
}
