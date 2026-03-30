package com.preparation.hashMap;

import java.util.*;

public class HashMapFoundation {

	public void hash() {
		Map<Integer, String> map = new HashMap<Integer, String>();
		Map<String, Integer> map1 = new HashMap<String, Integer>();
		map1.put("vivek", 1);
		map1.put("Ravi", 2);
		map1.put("Mahesh", 3);
		map1.put("Teja", 4);
		map1.put("Avinash", 5);
		map1.put("vivek", 6);
		
		
		System.out.println(map1.get("vivek"));
		
		map.put(1, "vivek");
		map.put(2, "Ravi");
		
		
		System.out.println(map.get(1));
		System.out.println(map.remove(1));
	}
	
	public static void main(String[] args) {
		HashMapFoundation hmf = new HashMapFoundation();
		hmf.hash();
	}
}
