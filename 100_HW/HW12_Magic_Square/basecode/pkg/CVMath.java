package pkg;

public class CVMath {	
	
	public static int findMid(int one, int two, int three){
		return (one + two + three - Math.min(one,Math.min(two,three)) - Math.max(one,Math.max(two,three)));
	}
	
	public static int specialSquare(int x){
		int sum = 0;

		for (int i = 0; i < x; i++){
			sum+=(x-i);
		}
		if (Math.sqrt(sum) % 1 == 0){
			return sum;
		}
		return 0; //if the number is not a special square it returns this
		
	}
		
}
		
	
	
	
	
