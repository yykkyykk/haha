package com.test;

import java.util.Arrays;

public class test {

	public static void main(String[] args) {
		int[] arr = {23, 2, 12, 33, 65, 46, 9, 1, 5};
		 for(int i = 0; i < arr.length; i++){
	            for(int j = 0; j < arr.length-1-i; j++){
	                if(arr[j] > arr[j+1]){
	                    int temp = arr[j];
	                    arr[j] = arr[j+1];
	                    arr[j+1] = temp;
	                
	                }
	            }
	        
	        }
		    System.out.print(Arrays.toString(arr));
	     
	}

}
