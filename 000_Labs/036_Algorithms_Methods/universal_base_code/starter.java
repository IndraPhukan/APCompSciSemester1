/*
 *	Author:  indra phukan
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void toStringArray(int[] arr){
		for (int i = 0; i < arr.length; i++){
			System.out.println(arr[i]);
		}
		return;
	}
	
	public static int getArrayAverage(int[] arr){
		int total = 0;
		int amount = 0;
		for (int i = 0; i < arr.length; i++){
			total += arr[i];
			amount = i;
		}
		return (int)(total/amount);
	}
	
	public static int getArrayMax(int[] arr){
		int max = 0;
		for(int i = 0; i < arr.length; i++){
			if (arr[i] > max){
				max = arr[i];
			}
		}
		return max;
		
	}
	
	public static int getArrayMin(int[] arr){
		int min = 100;
		for(int i = 0; i < arr.length; i++){
			if (arr[i] < min){
				min = arr[i];
			}
		}
		return min;
		
	}
	
	public static void main(String args[]) {
		int [] arr = new int [100];
		for (int i = 0; i < arr.length; i++){
			arr[i] = (int)((Math.random() * 100) + 1);
		}
		
		toStringArray(arr);
		System.out.println("The average is " + getArrayAverage(arr));
		System.out.println("The maximum is " + getArrayMax(arr));
		System.out.println("The minimum is " + getArrayMin(arr));


		
	}
}
