package com.org.jav8a;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StremDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> myList = Arrays.asList("apple", "banana", "orange");
		Stream<String> sequentialStream = myList.stream();
		Stream<String> parallelStream = myList.parallelStream();
		
		//filter(): Filters elements based on a predicate.
				List<String> filtered = myList.stream()
		                .filter(s -> s.startsWith("a"))
		                .collect(Collectors.toList());
		
		//Stream.of() method creates a stream from individual values.
		Stream<String> stream = Stream.of("apple", "banana", "orange");
		sequentialStream  = Stream.of("red","blue");
		stream.forEach(System.out::println);
		//System.out.println("print   "+sequentialStream);
		//stream.forEach(System.out:: println);
		
		
		
		//map(): Transforms elements using a function.
		List<Integer> lengths = myList.stream()
                .map(String::length)
                .collect(Collectors.toList());
		
		//sorted(): Sorts elements
		List<String> sorted = myList.stream()
                .sorted() // we can use comparator here as a arg
                .collect(Collectors.toList());
		
		Stream<Integer> st = Stream.of(1,3,2,6,6,8);
		st.sorted((a,b)->b-a).forEach(System.out::println);
		
		List<Integer> l = Arrays.asList(2,4,6,8,10,4);
		List<Integer> st1 = l.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(st1);
		
		//distinct(): Removes duplicate elements.
		List<String> distinct = myList.stream()
                .distinct()
                .collect(Collectors.toList());
		
		//forEach(): Performs an action for each element.
		myList.stream().forEach(System.out::println);
		//collect(): Accumulates elements into a collection.
		List<String> collected = myList.stream()
                .collect(Collectors.toList());
		
		//flatMap() : Transforms each element into a stream of elements and then flattens these streams into a single stream.
		
		List<List<Integer>> nestedList = Arrays.asList(
			    Arrays.asList(1, 2),
			    Arrays.asList(3, 4),
			    Arrays.asList(5, 6)
			);

			List<Integer> flattenedList = nestedList.stream()
			                                        .flatMap(List::stream)
			                                        .collect(Collectors.toList());
			
			//Collectors.groupingBy(): Groups elements based on a classifier function.

			//Collectors.partitioningBy(): Partitions elements into two groups based on a predicate.
			Map<Integer, List<String>> groupedByLength = myList.stream()
                    .collect(Collectors.groupingBy(String::length));

Map<Boolean, List<String>> partitioned = myList.stream()
               .collect(Collectors.partitioningBy(s -> s.length() > 4));


			
			//Stream.concat(): Concatenates two streams.

Stream<String> stream1 = Stream.of("apple", "banana");
Stream<String> stream2 = Stream.of("orange", "kiwi");

Stream<String> combinedStream = Stream.concat(stream1, stream2);
	}

}
