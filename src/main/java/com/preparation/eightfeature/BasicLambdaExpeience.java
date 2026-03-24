package com.preparation.eightfeature;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;


public class BasicLambdaExpeience {

	public static void main() {
		Runnable r = () -> System.out.println("start");
		r.run();
		List<Integer> ab = Arrays.asList(1,4,3,21);
		Collections.sort(ab,(a,b)-> a-b);
		System.out.println(ab);
	}
	static Calculator add = (a,b)->  a+b;
	Calculator sub = (a,b) -> a-b;
	Calculator multiplicate = (a,b) -> a*b;
//	
//	 Transformer abx = (str) -> str.toLowerCase();
//	 Transformer abcd = str -> new StringBuilder(str).reverse().toString();
//	 Transformer brackets = str -> str + " vivek"+ "]";
	 
	static Predicate<Integer> isEven = (n)-> n%2 == 0; 
	static Function<String,String> upper = n-> n.toUpperCase();
	static Function<Integer, Integer> square = n -> n * n;
	static Function<Integer, String> formate = n -> n.toString(n);
	static Predicate<Integer> sala = n-> n>50;
	static Consumer<String> print = n-> System.out.println(n);
	static Consumer<Integer> sqn = n -> System.out.println(n* n);
	static Supplier<List> lo = ()-> new ArrayList<>();
	static Supplier<String> time = ()-> LocalDateTime.now().toString();
	private List<Department> list;
	

	
	
	public List<Integer> filter(List<Integer> abc , Predicate<Integer> p){
		return null;
	}
	
	
	public void predictAndcombined() {
		Predicate<Integer> iseven = n -> {
			System.out.println("calling isevern test implementation");
			return n % 2 ==0;
		};
		Predicate<Integer> greaterValue = n -> {
			System.out.println("calling greaterValue test implementation");
			return n>5;
		};
		Predicate<Integer> combined = greaterValue.and(iseven);
		System.out.println(combined.test(10));
		System.out.println(greaterValue.test(10));
		Predicate<Integer> odd = iseven.negate();
		
		
		Predicate<String> leng = n -> n.length()>5;
		Predicate<String> starts = n -> n.startsWith("v");
		Predicate<String> com = leng.and(starts);
		Predicate<String> coms = com.negate();
		System.out.println("string predict " + coms.test("siavek"));
		System.out.println(odd.test(100));
		System.out.println(" ");
		Function<String, String> trim = n-> {
			System.out.println("calling trim ");
			return n.trim();
		};
		Function<String, String> upper = n-> {
			System.out.println("calling upper ");
			return n.toUpperCase();
		};
		Function<String, String> prefix = trim.andThen(upper);
		String apply = prefix.apply("   vivek  ");
		System.out.println(apply);
		Function<Integer, String> or = n-> n.toString();
		String abc = or.apply(100);
		System.out.println(abc);
		 
 	} 
	public void methodReference() {
		//Function<Integer,String> f = x -> String.valueOf(x);
		//Consumer<String> c = s -> System.out.println(s);
//		Comparator<String> cmp = (a,b) -> a.compareToIgnoreCase(b)
//		Supplier<HashSet<Integer>> s = () -> new HashSet<>();
//		list.forEach(System.out::println);
		List<String> kl = Arrays.asList("A","B","C","D");
		kl.forEach(System.out::println);
		Function<Integer,String> f = String::valueOf;
		Consumer<String> s = System.out::print;
		Comparator<String> abc = String::compareToIgnoreCase;
		System.out.println(f.apply(100));
		System.out.println(abc.compare("vivek", "suresh"));
		s.accept("vivek");
		Supplier<HashSet<Integer>> sa = HashSet::new;
		System.out.println();
	}
	
	public void streamPratice() {
		List<Integer> abc = Arrays.asList(1,2,3,4,1,4);
		Long absa = abc.stream().filter(n->n>3).count();
		List<Integer> list3 = abc.stream().sorted((a,b)-> b-a).toList();
		List<Integer> list = abc.stream().filter(a -> a % 2==0).distinct().toList();
		List<Integer> multiple = abc.stream().limit(1).toList();
		List<Integer> com = abc.stream().filter(n->n%2==0).map(n-> n *2).distinct().toList();
		List<String> ab = Arrays.asList("vivek","suresh","mahesh");
		List<String> list2 = ab.stream().map(n-> n.toUpperCase()).toList();
		System.out.println(abc);
		System.out.println(list);
		System.out.println(absa);
		System.out.println(list2);
		System.out.println(list3);
	}
	public void streamdeep() {
		List<Integer> abc = Arrays.asList(1,2,3,4,1,4);
		List<Integer> list = abc.stream().distinct().toList();
		Integer sumNumber = abc.stream().reduce(0,(a,b)-> a+b);
		boolean match = abc.stream().anyMatch(n-> n >5);
		Integer product = abc.stream().reduce(1, (a,b)-> a*b);
		Integer sum = abc.stream().reduce(1, (a,b)-> a+b);
		Optional<Integer> maxValue = abc.stream().reduce(Integer::max);
		Optional<Integer> minvalue = abc.stream().min(Integer::compareTo);
		Optional<Integer> minvaluess = abc.stream().max(Integer::compareTo);
		System.out.println(match);
		System.out.println(product);
		System.out.println("minvalue " + minvalue);
		System.out.println("minvaluess "+ minvaluess);
	}
	
	public void flatmap() {
		List<List<Integer>> data = List.of(List.of(1,2),List.of(3,4),List.of(5,6));
		List<List<Integer>> list2 = data.stream().map(list->list).toList();
		List<String> words = List.of("vivek" , "ramesh");
		List<String> chards = words.stream().flatMap(list-> Arrays.stream(list.split(""))).toList();
		System.out.println(chards);
  		List<Integer> list3 = data.stream().flatMap(list-> list.stream()).toList();
		System.out.println(list2);
		System.out.println(list3);
		List<Department> depart = List.of(new Department("Development", List.of("vivek","srihari")),
				new Department("Testing",List.of("varun","mahesh")),new Department("support", List.of("sai","swamy")));
		List<String> employee = depart.stream().flatMap(n -> n.employee.stream()).toList();
		System.out.println(employee);
	}
	public void sorts() {
		List<Department> data = List.of(new Department("vivek", 23,50000),new Department("srihari", 29,40000),new Department("amarthya", 20, 30000));
		list = data.stream().sorted(Comparator.comparing(Department::getAge).thenComparing(Department::getSalary)).toList();
		System.out.println(list);
	}
	public static void main(String[] args) {
		BasicLambdaExpeience ab = new BasicLambdaExpeience();
		ab.sorts();
	}	
	
}

