package com.preparation.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;

public class SlidingWindow {

	public void maximumSumSubarrayofSize() {
		int[] arr = { -2, 1, 3, -4, 5, 6, -1 };
		int k = 3;
		int sum = 0;
		int max = 0;
		for (int i = 0; i < k; i++) {
			sum += arr[i];
		}

		for (int i = k; i < arr.length; i++) {
			sum = sum + arr[i] - arr[i - k];
			max = Math.max(max, sum);
		}
		System.out.println(max);
	}

	public void averageofSubarraysofSize() {
		int[] arr = { 1, 3, 2, 6, -1, 4, 1, 8, 2 };
		int k = 5;
		float sum = 0;
		float avg = 0;
		for (int i = 0; i < k; i++) {
			sum += arr[i];

		}
		System.out.println(sum / k);
		for (int i = k; i < arr.length; i++) {
			sum = sum + arr[i] - arr[i - k];
			avg = (sum / k);
			System.out.println(avg);
		}

	}

	public void smallestSubarraywithGivenSum() {
		int[] arr = { 2, 1, 5, 1, 3, 1 };
		int sum = 0;
		int k = 7;
		int min = Integer.MAX_VALUE;
		int left = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			while (sum >= k) {
				min = Math.min(min, i - left + 1);
				sum -= arr[left];
				left++;
			}
		}
		System.out.println(min);
	}

	public void largestSubArray() {
		int[] arr = { 4, 2, 1, 7, 8, 1, 2, 8, 1, 0 };
		int max = Integer.MIN_VALUE;
		int sum = 0;
		int k = 8;
		int left = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];

			while (sum >= k) {
				max = Math.max(max, i - left + 1);
				sum -= arr[left];
				left++;
			}
		}
		System.out.println(max);
	}

	public void longestSubstringWithoutRepeatingCharacters() {
		String str = "pwwkew";

	}

	public void maximumConsecutive1s() {
		int[] arr = { 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0 };
		int onces = 0;
		for (int i = 0; i < arr.length; i++) {

		}
	}

	public void maxArea() {
		int[] arr = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
		int right = arr.length - 1;
		int left = 0;
		int max = 0;
		while (left <= right) {
			int min = Math.min(arr[left], arr[right]);
			int width = right - left;
			int le = min * width;
			max = Math.max(max, le);
			if (arr[left] < arr[right]) {
				left++;
			} else {
				right--;
			}

		}
		System.out.println(max);
	}

	public String longestPalindrome(String s) {
		int start = 0;
		int end = 0;
		for (int i = 1; i < s.length(); i++) {
			int a = expand(s, i, i);// even
			int b = expand(s, i, i+1);// odd
			int max = Math.max(a, b);
			if (max > end - start) {
				start = i - (max - 1) / 2;
				end = i + (max) / 2;
			}
		}
		
		return s.substring(start,end+1);
	}

	private int expand(String s, int left, int right) {
		while(left > 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
				left--;
				right++;
		}
		return right - left - 1;
	}
	
	public void longestSubArrayWithSum() {
		int[] arr = {3,2,2,4};
		int k = 5;
		int sum =0;
		int left = 0;
		int max = 0;
		for(int i =0; i< arr.length;i++) {
			sum += arr[i];
			while(sum > k) {
				sum -= arr[left];
				left++;
			}
			max=Math.max(max, i - left + 1);
		}
		System.out.println(max);
	}
	
	public void maximunConsecutiveOnces() {
		int[] arr = {1,1,0,0,1,1,1,0,1};
		int left = 0;
		int count = 0;
		int size =0;
		for(int i =0; i< arr.length;i++) {
			if(arr[i] == 0) {
				count++;
			}
			while(count > 2) {
				if(arr[left] == 0) {
					count--;
				}
				left++;
			}
			size = Math.max(size, i - left + 1);
		}
		System.out.println(size);
	}
	
	public void productOfElement() {
		int[] arr = {10,5,2,6};
		int sum = 0;
		int left = 0;
		int k = 100;
		int right = 0;
		int count = 0;
		
		System.out.println(count);
	}
	
	public void highestDuplicateNumberInArray() {
		int[] arr = {1,2,3,2,1,3,4,2,4,1,2,34,5,3};
		int temp = 0;
		int left = 0;
		int max = 0;
		int count=0;
		for(int i =0; i<arr.length;i++) {
			for(int j =0; j< arr.length;j++) {
				if(arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		for(int i =1; i<arr.length;i++) {
			count++;
			if(arr[i] > arr[left]) {
				max = Math.max(max, count);
				left = i;
				count = 0;
			}
		}
		System.out.println(max);
		
	}
	
	public void highestDuplicateNumberInArrayNumber() {
		int[] arr = { 1, 2, 3, 2, 1, 3, 4, 2, 4, 1, 2, 34, 5, 3 };
		int max = 0;
		int count = 0;
		for (int right = 0; right < arr.length; right++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[right] == arr[j]) {
					count++;
				}
			}
			max = Math.max(max, count);
			count = 0;
		}
		System.out.println(max);
	}

	public static void main(String[] args) {
		SlidingWindow sw = new SlidingWindow();
//		sw.maximumSumSubarrayofSize();
//		sw.averageofSubarraysofSize();
//		sw.smallestSubarraywithGivenSum();
//		sw.largestSubArray();
//		sw.maxArea();
//		System.out.println(sw.longestPalindrome("bb"));
//		sw.longestSubArrayWithSum();
//		sw.maximunConsecutiveOnces();
//		sw.productOfElement();
		sw.highestDuplicateNumberInArrayNumber();
	}
}
