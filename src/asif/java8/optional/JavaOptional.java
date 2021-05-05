package asif.java8.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class JavaOptional {

	public static void main(String[] args) {

		// Empty Optional
		Optional<String> optional = Optional.empty();
		System.out.println(optional.isPresent());
		// Non null optional
		Optional<String> optional2 = Optional.of("Asif");
		System.out.println(optional2.isPresent());
		// Non null optional or Empty Optional
		Optional<String> optional3 = Optional.ofNullable("Asif");
		System.out.println(optional3.isPresent());

		// Without optional
		List<String> list = getList();
		List<String> listOpt = list != null ? list : new ArrayList<>();
		System.out.println(listOpt.isEmpty());

		// With Optional
		List<String> listOpt2 = Optional.ofNullable(getList()).orElseGet(() -> new ArrayList<>());
		System.out.println(listOpt2);

	}

	private static List<String> getList() {
		return null;
	}

}

class User {
	private Address address;

	public Address getAddress() {
		return address;
	}

}

class Address {
	private String street;

	public String getStreet() {
		return street;
	}

}
