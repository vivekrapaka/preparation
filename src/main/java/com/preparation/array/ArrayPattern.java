package com.preparation.array;

import java.nio.file.spi.FileSystemProvider;

public class ArrayPattern {

	public void travasel() {
		int[] a = {5, 10, 15, 20, 25};
		for(int i = 0; i< a.length; i++) {
			System.out.println(a[i]);
		}
		
		System.out.println();
		for(int i = a.length -1; i >= 0; i--) {
			System.out.println(a[i]);
		}
		System.out.println();
		int temp =0;
		for(int i =0;i<a.length;i++) {
			temp = a[i] + temp;
		}
		System.out.println(temp);
		System.out.println();
		for(int i =0;i<a.length;i++) {
			if(temp>a[i]) {
				temp = a[i];
			}
		}
		System.out.println(temp);
		System.out.println();
		for(int i =0;i<a.length;i++) {
			if(temp<a[i]) {
				temp = a[i];
			}
		}
		System.out.println(temp);
		System.out.println();
	}
	
	public void countOccurrenceofElement() {
		int[] arr = {5,2,3,2,7,2,9};
		int count = 0;
		int target = 2; 
		for(int i =0; i< arr.length;i++) {
			if(target == arr[i]) {
				count++;
			}
		}
		System.out.println(count);
	}
	
	public void findSecondLargestElement() {
		int[] ab = {8, 3, 12,13};
		int firstLargest = 0;
		int secoundLargest = 0;
		for(int i =ab.length; i<0;i--) {
			if(ab[i] < firstLargest) {
				secoundLargest = firstLargest;
				firstLargest = ab[i];
				
			}else if (ab[i] > secoundLargest && ab[i] != firstLargest){
				secoundLargest = ab[i];
			}
		}
		System.out.println("printing the secoung element "+  secoundLargest);
	}
	
	public boolean CheckifArrayisSorted() {
		int[] arr = { 1, 2, 3, 4, 5 };
		for (int i = 1; i < arr.length; i++) {
			if(arr[i] < arr[i-1]) {
				return false;
			}
		}
		return true;
	}
	
	public void MoveZerostoEnd() {
		int[] ab = {0,1,0,3,12};
		for(int i =1; i< ab.length;i++) {
			if(ab[i] == 0) {
				int temp = ab[i];
				ab[i-1] = temp;
				ab[i] = ab[i-1];
			}
		}
		for(int i =0; i< ab.length;i++) {
			System.out.print(ab[i]);
		}
		System.out.println(ab);
	}
	
	public static void main(String[] args) {
		ArrayPattern ap = new ArrayPattern();
//		ap.travasel();
		ap.countOccurrenceofElement();
		ap.findSecondLargestElement();
		System.out.println(ap.CheckifArrayisSorted());
		ap.MoveZerostoEnd();
	}
}
