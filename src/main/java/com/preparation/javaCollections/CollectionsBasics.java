package com.preparation.javaCollections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class CollectionsBasics {
	
	public void collectionMethods() {
		List<Integer>  abc = new ArrayList<Integer>();
		List<Integer>  dcb = new LinkedList<Integer>();
		
		abc.add(1,12);
		dcb.add(1);
		abc.add(2);
		abc.add(3);
		abc.add(4);
		
		abc.remove(1);
		abc.get(0);
		abc.set(0, 12);
	
		
		System.out.println(abc.contains(4));
	}
	
	public static void main(String[] args) {
		String v1 = new String("vivek");
		CollectionsBasics ab = new CollectionsBasics();
		String str = "vivek";
		String str1 = "vivek";
		String v = new String("vivek");
		StringBuilder abc = new StringBuilder("vivek");
		StringBuffer abcd = new StringBuffer("vivek");
		StringTokenizer abcaa = new StringTokenizer(str1);
		System.out.println(abcd.hashCode());
		System.out.println(abc.hashCode());
		System.out.println(str.hashCode());
		System.out.println(str1.hashCode());
		System.out.println(v.hashCode());
		System.out.println(v1.hashCode());
//		ab.collectionMethods();
	}
}
