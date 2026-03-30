package com.preparation.hashMap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapProblems {
	public void countFrequency() {
		int[] arr = { 1, 2, 2, 3, 1, 2 };
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int a : arr) {
			if (map.containsKey(a)) {
				map.put(a, map.get(a) + 1);
			} else {
				map.put(a, 1);
			}
		}

		for (Entry<Integer, Integer> maps : map.entrySet()) {
			System.out.println(maps.getKey() + "->" + maps.getValue());
		}
	}
	
	public void firstNonRepeatingCharacter() {
		String str = "aabbcde";
		char[] charArray = str.toCharArray();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(Character ch : charArray) {
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}else {
				map.put(ch, 1);
			}
		}
		for(Entry<Character, Integer> abc : map.entrySet()) {
			if(abc.getValue() == 1) {
				System.out.println(abc.getKey());
				break;
			}
//			System.out.println(abc.getKey() + "->"+ abc.getValue());
		}
	}
	
	private static int[] twoSum() {
		int[] arr = {2,7,11,15};
		int[] nums = new int [2];
		int target = 9;
		Integer value = 0;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i =0; i<arr.length;i++) {
			value = map.get(target - arr[i]);
			if(value == null) {
				map.put(arr[i], i);
			}else {
				nums[0] = value;
				nums[1] = i;
			}
		}
		return nums;
	}
	
	public void subarraySumEqualsK() {
		int[] arr = {2,7,11,15};
		int k = 9;
		int fast =0;
		int sum= 0;
		for(int i =0;i<arr.length;i++) {
			sum+= arr[i];
			
			while(sum > k  && fast <= i) {
				sum -= arr[fast];
				fast++;
			}
			if(sum == k) {
				System.out.println(true);
				return;
			}
		}
	}
	
	public void subarraySumEqualsKByHashMap() {
		int[] arr = {2,7,11,15};
		int k = 9;
		int fast =0;
		int sum= 0;
		
		for(int a : arr) {
			
		}
	}
	
	public static void main(String[] args) {
		HashMapProblems hmp = new HashMapProblems();
//		hmp.countFrequency();
		hmp.firstNonRepeatingCharacter();
		System.out.println(Arrays.toString(hmp.twoSum()));
	}
}
