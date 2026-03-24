package com.preparation.eightfeature;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectionsEightFeature {
	
	public void setTest() {
		List<Integer> abc = List.of(1, 3, 2, 32, 5);
		Set<Integer> collect2 = abc.stream().collect(Collectors.toSet());
		abc.stream().collect(Collectors.toMap(x -> x, x -> x));
		IntSummaryStatistics sum  = abc.stream().collect(Collectors.summarizingInt(Integer::intValue));
		System.out.println(sum);
		String abcss= 	abc.stream().map(String::valueOf).collect(Collectors.joining(","));
		System.out.println(abcss);
		System.out.println(collect2);
		List<Person> abcd = List.of(new Person("vivek", 1, 23), new Person("srihari", 2, 21), new Person("Am", 3, 21));
		Map<Integer, List<Person>> collect = abcd.stream().collect(Collectors.groupingBy(Person::getSalary));
		System.out.println("vivek " + abcd);
		Map<Integer, Long> collectcount = abcd.stream()
				.collect(Collectors.groupingBy(Person::getAge,Collectors.counting()));
		Map<Integer, List<String>> cl = abcd.stream().collect(Collectors.groupingBy(Person::getAge,Collectors.mapping(Person::getName,Collectors.toList())));
		System.out.println(collect);
		System.out.println(collectcount);
		System.out.println(cl);
	}
	
	public void optuional() {
		Optional<String> ov = Optional.ofNullable("vivek").map(n->n.toUpperCase());
		 ov = Optional.ofNullable(ov.orElse("mahesh"));
		Optional<Integer> ab = Optional.ofNullable(10).filter(n->n>10);;
		Optional<String> abc = Optional.of("amarthya");
		abc.ifPresent(System.out::println);
		System.out.println(ab);
	}
	public void patternevneodd() {
		for (int i = 0; i < 4; i++) {
			int k = 0;
			for (int j = i + 1; k < 4; j++) {
				System.out.print(j);
				j++;
				k++;
			}
			System.out.println();
		}
	}
	
	public void DateAndTime() {
		LocalDate abc = LocalDate.MAX;
		LocalDateTime ab = LocalDateTime.now();
		LocalTime abcd = LocalTime.now();
		LocalDate pd = LocalDate.of(2000, 03, 13);
		
		DateTimeFormatter abcss = DateTimeFormatter.ofPattern("YY-MM-dd  HH:mm:ss");
		System.out.println("vivek " + ab.format(abcss));
		pd = pd.minusDays(2);
		pd = pd.plusYears(24);
		System.out.println(pd.getYear());
		System.out.println("sd " + abc);
		System.out.println(ab);
		System.out.println(abcd);
		
		System.out.println();
		LocalDate birthday = LocalDate.of(2000,02,16);
		Period cal = Period.between(birthday, LocalDate.now());
		Instant a = Instant.now();
		ZonedDateTime xd = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
		System.out.println(xd);
		System.out.println(a);
		
		System.out.println(cal.getYears() + " " + cal.getMonths() +" " +cal.getDays() + " "+ cal.toTotalMonths());
		
		
	}
//	5
//	45
//	345
//	2345
//	12345
	
	public void numberIncrease() {
		for(int i = 5; i>=1;i--) {
			for(int j=5; j>=i;j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	public void finddays() {
		LocalDate date = LocalDate.of(2000, 03, 13);
		LocalDate now = LocalDate.now();
//		long days = ChronoUnit.MONTHS.between(date, now);
//		System.out.println(days);
	}

	public void arrayReverse() {
		int[] arr = { 1, 2, 3, 4, 5};
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i]);
		}
//		System.out.println(arr);

	}
	
	public int[] twoSum(int[] nums, int target) {
		
		for (int i = 0; i <= nums.length - 2; i++) {
			for (int j = 1; j <= nums.length - 1; j++) {
				if (nums[i] + nums[j] == target) {
					return new int[]{i,j};
				}
			}
		}
		return null;
	}
	
	public void secoundLargest() {
		int[] abc = {3,5,3,7,3};
		int count = 0;
		Arrays.sort(abc);
		for(int i = 0;i<abc.length-1;i++) {
			if(abc[i+1] > abc[i]) {
				System.out.println("print");
			}
		}
		Map<Integer, Integer> abcs = new HashMap<Integer, Integer>();
		
	}
	
	public void redc() {
		List<Integer> ab = Arrays.asList(1,2,3,4,5);
		int sum = ab.stream().reduce(Integer.MIN_VALUE,Integer::max);
		System.out.println(sum);
	}

	public static void main(String[] args) {
		CollectionsEightFeature ce = new CollectionsEightFeature();
		ce.DateAndTime();
//		int[] nums = { 3, 2, 4 };
//		int[] twoSum = ce.twoSum(nums, 6);
//		System.out.println(twoSum[0] + " " + twoSum[1]);
	}
}
