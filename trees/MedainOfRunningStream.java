package BinaryTree;

import java.util.Arrays;

public class MedainOfRunningStream {
	public static void main(String[] args) {
		int arr[] = {3,1,5,4};
		Arrays.sort(arr);
		int sum = 0;
		for(int i = 0; i < arr.length ; i++) {
			sum = sum + arr[i];
		}
		System.out.println(sum/arr.length);
	}
	
}
