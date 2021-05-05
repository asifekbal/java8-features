package asif.java8.streams;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsTutorial01 {

	public static void main(String[] args) {
		String[] arr = new String[] { "a", "b", "c" };
		Stream<String> stream = Arrays.stream(arr);
		System.out.println(stream.isParallel());
		stream = Stream.of("a", "b", "c");
		System.out.println(stream.isParallel());

		List<String> list = new ArrayList<>();
		list.add("Asif Ekbal");
		list.add("Gaurav Jain");
		list.add("Rohit Gupta");
		list.add("Rohit Lakshykar");
		Stream<String> nameStream = list.stream();
		list.parallelStream().forEach(ele -> {
			doSomething(ele);
		});

		System.out.println(nameStream.count());
		// distinct() - Intermediate operation - returns a stream
		// count() - Terminal operation - returns a result of definite type.
		long count = list.stream().distinct().count();
		System.out.println(count);
		// Iteration
		boolean isExist = list.stream().anyMatch(ele -> ele.contains("Ekbal"));

		System.out.println(isExist);
		// Filtering
		Stream<String> newStream = list.stream().filter(ele -> ele.contains("Rohit"));
		System.out.println(newStream.toString());
		// Map
		List<String> uris = new ArrayList<>();
		uris.add("C:\\My.txt");
		Stream<Path> pathStream = uris.stream().map(uri -> Paths.get(uri));
		System.out.println(pathStream.count());

		// FlatMap
		List<Detail> details = new ArrayList<>();
		details.add(new Detail());
		Stream<String> flatmapStream = details.stream().flatMap(detail -> detail.getParts().stream());
		System.out.println(flatmapStream.hashCode());

		// Terminal Operations
		boolean isValid = list.stream().anyMatch(element -> element.contains("h")); // true
		boolean isValidOne = list.stream().allMatch(element -> element.contains("h")); // false
		boolean isValidTwo = list.stream().noneMatch(element -> element.contains("h")); // false
		System.out.println(isValid + " " + isValidOne + " " + isValidTwo);

		// Empty Stream
		Stream.empty().allMatch(Objects::nonNull); // true
		Stream.empty().anyMatch(Objects::nonNull); // false

		// Reduction
		List<Integer> integers = Arrays.asList(2, 2, 2);
		Integer reduced = integers.stream().reduce(23, (a, b) -> a + b);
		System.out.print(reduced);

		// Collecting
		List<String> resultList = list.stream().map(element -> element.toUpperCase()).collect(Collectors.toList());
		System.out.println(resultList);

	}

	private static void doSomething(String ele) {

	}

}

class Detail {

	private List<String> parts;

	public List<String> getParts() {
		return parts;
	}

	public void setParts(List<String> parts) {
		this.parts = parts;
	}

}