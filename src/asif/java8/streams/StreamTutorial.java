package asif.java8.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTutorial {

	public static void main(String[] args) {
		filterOddNumbers();
		addSomeNumber();
		additionalMethods();
		reduceExampleMethods();
	}

	private static void filterOddNumbers() {
		List<Integer> list1 = Arrays.asList(0, 5, 10, 15, 20, 25, 30);
		System.out.println(list1);
		List<Integer> list2 = list1.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
		System.out.println(list2);
		long count = list1.stream().filter(x -> x % 2 == 0).count();
		System.out.println("Count : " + count);
		List<Integer> list3 = list1.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println(list3);
		int min = list1.stream().min((a, b) -> a.compareTo(b)).get();
		System.out.println("Minimum : " + min);
	}

	private static void addSomeNumber() {
		List<Integer> list1 = Arrays.asList(0, 5, 10, 15, 20, 25, 30);
		System.out.println(list1);
		List<Integer> list2 = list1.stream().map(x -> x = x + 1).collect(Collectors.toList());
		System.out.println(list2);
		Integer[] arr = list1.stream().toArray(Integer[]::new);
		Stream.of(arr).forEach(x -> System.out.println("Array ELement :" + x));
	}

	private static void additionalMethods() {
		List<Integer> list1 = Arrays.asList(0, 5, 10, 15, 20, 25, 30);
		System.out.println("ForEach : ");
		System.out.println();
		list1.forEach(x -> System.out.print(x + " ")); // Collection for-each
		System.out.println();
		list1.stream().forEach(x -> System.out.print(x + " ")); // Stream for-each
		Consumer<Integer> c = x -> System.out.println("Square of " + x + " is : " + x * x);
		System.out.println();
		list1.stream().forEach(c);
	}

	private static void reduceExampleMethods() {
		List<Integer> list = Arrays.asList(101, 202, 303, 404, 505);
		Optional<Integer> max = list.stream().reduce(Math::max);
		int min = list.stream().reduce(Math::min).get();
		System.out.println("Max : " + max.get());
		System.out.println("Min : " + min);
	}

}
