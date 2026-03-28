package com.preparation.hashMap;

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
	
	public void twoSum() {
		int[] nums = {2,7,11,15};
		int target = 9;
				
	}
	public static void main(String[] args) {
		HashMapProblems hmp = new HashMapProblems();
//		hmp.countFrequency();
		hmp.firstNonRepeatingCharacter();
	}
}
