package asif.java8.methodreference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/*
 	1.	Reference to a static method.
 		Syntax- ContainingClass::staticMethodName  
 		Eg -  Arithmetic::addtwoNumber
	2.	Reference to an instance method.
		Syntax- ContainingObject::instanceMethodName  
		Eg - new InstanceOfClass()::saySomething
	3.	Reference to a constructor.
		Syntax- ClassName::new  
		Eg - Integer::new
 */

public class MethodReference {

	public static void main(String[] args) {

		System.out.println("Reference to a static method");
		List<Integer> list = Arrays.asList(101, 202, 303, 404, 505);
		Optional<Integer> max = list.stream().reduce(Math::max);
		int min = list.stream().reduce(Math::min).get();
		System.out.println("Max : " + max.get());
		System.out.println("Min : " + min);

		System.out.println("Reference to an instance method from instance");
		max.ifPresent(System.out::println);
		System.out.println("Reference to an instance method from Class type");
		List<String> nameList = Arrays.asList("Asif", "Rohit", "Sweta", "Rahul", "Bikram", "Gaurav", "Kush");
		List<String> sortedNames = nameList.stream().sorted(String::compareTo).collect(Collectors.toList());
		System.out.println(sortedNames);
		System.out.println("Reference to a constructor");
		List<String> reverseSortedNames = nameList.stream().sorted(Collections.reverseOrder(String::compareTo))
				.collect(Collectors.toCollection(ArrayList::new));
		System.out.println(reverseSortedNames);

	}

}
