package com.preparation.eightfeature;

import java.nio.file.spi.FileSystemProvider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.print.attribute.HashAttributeSet;

public class InterviewJavaStreams {
	
	public void secoundHighest() {
		List<Integer> input = List.of(10,20,5,8,20);
		List<Integer> sorted = input.stream().distinct().sorted((n1,n2)-> n2-n1).collect(Collectors.toList());
		Optional<Integer> sortede = input.stream().distinct().sorted((n1,n2)-> n2-n1).skip(1).findFirst();
		System.out.println(sortede);
	}
	
	public void duplicateElement() {
		List<Integer> input = List.of(1,2,3,2,4,3,5);
		Map<Integer, Long> collect = input.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		for(Entry<Integer, Long> ab : collect.entrySet()) {
			if(ab.getValue() > 1) {
				System.out.println(ab.getKey());
			}
		}
//		System.out.println(collect.entrySet());
	}
	
	public void characterFrequency() {
		String abc = "java";
		Map<Character, Long> abcs = abc.chars().mapToObj(c-> (char)(c)).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(abcs);
	
	}
	
	public void flattenList() {
		List<List<Integer>> ab = List.of(List.of(1,2),List.of(3,4),List.of(5,6));
		 List<List<Integer>> list = List.of(
	                List.of(1,2,3),
	                List.of(4,5),
	                List.of(6,7,8)
	        );
		 int sum = ab.stream().flatMap(a->a.stream()).mapToInt(Integer::intValue).sum();
		 System.out.println(sum);
		List<Integer> aba = ab.stream().flatMap(n-> n.stream()).toList();
		System.out.println(aba);
	}
	
	public void countCurr() {
		List<Integer> aa = List.of(1,2,2,3,3,3);
		Map<Integer, Long> collect = aa.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(collect.entrySet());
	} 
	
	public void evenNumbersSquared() {
		List<Integer> aa = List.of(1,2,3,4);
		List<Integer> aaa = aa.stream().filter(n -> n%2 == 0).map(nq -> nq * nq).collect(Collectors.toList());
		System.out.println(aaa);
	}
	
	public void findFirstNonRepeatedCharacter() {
		String str = "stress";
		LinkedHashMap<Character, Long> collect = str.chars().mapToObj(c -> (char)c).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
		for(Entry<Character, Long> ab : collect.entrySet()) {
			if(ab.getValue() == 1) {
				System.out.println(ab.getKey());
				break;
			}
		}
	}
	
	public void findDuplicateCharacters() {
		String str = "programming";
		Map<Character, Long> collect = str.chars().mapToObj(c-> (char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		for(Entry<Character, Long> abc : collect.entrySet()) {
			if(abc.getValue() > 1) {
				System.out.println(abc.getKey());
			}
		}
	}
	
	public void convertListToMap() {
		List<String> words = List.of("java","spring","boot");
		Map<String, Integer> collect = words.stream().collect(Collectors.toMap(s -> s, s -> s.length()));
		System.out.println(collect);
	}
	
	public void findTopThreeNumbers() {
		List<Integer> abc = List.of(5,10,15,20,25,30);
		List<Integer> limit =  abc.stream().sorted().limit(3).collect(Collectors.toList());
		System.out.println(limit);
	}
	
	public void partication() {
		List<Integer> oo = List.of(1,2,3,4,5,6,7,8,9);
		System.out.println(oo.stream().collect(Collectors.partitioningBy(n -> n%2 ==0)));
	}
	
	public void findLongestString() {
		List<String> str = List.of("java","springboot","microservices");
		Optional<String> max = str.stream().max(Comparator.comparing(String::length));
		System.out.println(max);
	}
	
	public static void main(String[] args) {
		InterviewJavaStreams IJ = new InterviewJavaStreams();
		IJ.secoundHighest();
		IJ.duplicateElement();
		IJ.countCurr();
		IJ.evenNumbersSquared();
		IJ.characterFrequency();
		IJ.findFirstNonRepeatedCharacter();
		IJ.findDuplicateCharacters();
		IJ.convertListToMap();
		IJ.flattenList();
		IJ.findTopThreeNumbers();
		IJ.partication();
		IJ.findLongestString();
	}

}
	
