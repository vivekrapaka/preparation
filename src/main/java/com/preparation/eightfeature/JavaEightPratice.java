package com.preparation.eightfeature;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaEightPratice {
	

	public void maxNum() {
		List<Integer> list = Arrays.asList(10, 50, 20, 80, 30);
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8);
		List<Integer> map = numbers.stream().map(n -> n * n).filter(n -> n%2== 0)
				.collect(Collectors.toList());
		System.out.println(map);
		Integer max = Collections.max(list);
		System.out.println(max);
//		Optional<Integer> ab = Optional.of(numbers -> n > 5)
				
	}
	
	public void removeDuplicate() {
		List<Integer> list = Arrays.asList(1,2,2,3,3,4,5,5);
		 List<Integer> collect = list.stream().distinct().sorted((n1,n2)-> n2 -n1).collect(Collectors.toList());
		 System.out.println(collect);
		 
		 List<String> abc = Arrays.asList("java","spring","boot");
		 List<String> collect2 = abc.stream().flatMap(list1 -> Arrays.stream(list1.split(" "))).collect(Collectors.toList());
		 System.out.println(collect2);
		 final String message = "vivek";
//		 message = "suresh";
		 Runnable r = ()-> System.out.println(message);
		 System.out.println(message);
	} 

	public static void main(String[] args) {
		JavaEightPratice abc = new JavaEightPratice();
		abc.removeDuplicate();
	}
}
