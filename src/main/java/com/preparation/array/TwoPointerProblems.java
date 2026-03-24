package com.preparation.array;

public class TwoPointerProblems {
	
	
	public void reverserArray() {
		int[] arr = {1,2,3,4,6};
		int start = 0;
		int end = arr.length-1;
		while(start <end) {
				int temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
				start++;
				end--;
		}
		
		for(int i =0; i<arr.length;i++) {
			System.out.print(arr[i]);
		}
	}
	
	public void twoSum() {
		int[] arr = {2,3,5,8,9,11};
		int target = 14;
		int start = 0;
		int end = arr.length-1;
		while(start < end) {
			int sum = arr[start] + arr[end];
			if(sum == target) {
				System.out.print(start + " "+ end);
				return;
			}else if(sum > target) {
				end--;
			}else {
				start++;
			}
		}
	}
	
	public void PalindromeCheck() {
		String str = "madam";
		int start = 0;
		int end = str.length()-1;
		while(start < end) {
			char[] charArray = str.toCharArray();
			if(charArray[start] != charArray[end]) {
				System.out.println("false"); 
				return;
			}
			start++;
			end--;
		}
		System.out.println("true");
	}
	
	
	
	public void moveZeros() {
		int[] arr = { 0, 1, 0, 3, 12 };
		int start = 0;
		for(int i =0; i<arr.length;i++) {
			if(arr[i] == 0) {
				continue;
			}else {
				int temp = arr[start];
				arr[start] = arr[i];
				arr[i] = temp;
				start++;
			}
		}
		for(int i =0; i< arr.length;i++) {
			System.out.print(arr[i]);
		}
	}
	
	public void removeDuplicates() {
		int[] arr = {1,1,2,2,3,3,4};
		int start = 0;
		for(int i =1; i<arr.length;i++) {
			if(arr[start] != arr[i]) {
				start++;
				arr[start] = arr[i];
			}
		}
		for(int i =0; i<=start;i++) {
			System.out.print(arr[i]);
		}
		
	}
	
	public void moveSmall() {
		int[] arr = {1,2,3,4,5,6};
		int start = 0;
		for(int i =0; i< arr.length;i++) {
			if(arr[i] % 2 ==0) {
				int temp = arr[i];
				arr[i] = arr[start];
				arr[start] = temp;
				start++;
			}
		}
		for(int i =0; i<=arr.length-1;i++) {
			System.out.print(arr[i]);
		}
	} 
	 
	public static void main(String[] args) {
		TwoPointerProblems tp = new TwoPointerProblems();
	//	tp.reverserArray();
//		tp.twoSum();
		tp.PalindromeCheck();
		//tp.moveZeros();
//		tp.removeDuplicates();
		tp.moveSmall();
	}

}
