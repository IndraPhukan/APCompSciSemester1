/*
 *	Author:  indra phukan
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class BaseClass {
	

	public BaseClass() {
		
		
	}
	
	public void toStringArray(int[] arr){
		for (int i = 0; i < arr.length; i++){
			System.out.println(arr[i]);
			return;
		}
	}
	
	public int getArrayAverage(int[] arr){
		int total = 0;
		int amount = 0;
		for (int i = 0; i < arr.length; i++){
			total += arr[i];
			amount = i;
		}
		return (int)(total/amount);
	}
	
	public int getArrayMax(int[] arr){
		int max = 0;
		for(int i = 0; i < arr.length; i++){
			if (arr[i] > max){
				max = arr[i];
			}
		}
		return max;
		
	}
	
	public int getArrayMin(int[] arr){
		int min = 100;
		for(int i = 0; i < arr.length; i++){
			if (arr[i] < min){
				min = arr[i];
			}
		}
		return min;
		
	}


}

