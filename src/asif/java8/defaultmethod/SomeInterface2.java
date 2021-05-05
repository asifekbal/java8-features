package asif.java8.defaultmethod;

public interface SomeInterface2 {

	default void listen() {
		System.out.println("Listen Saavn Music");
	}

	default void watch() {
		System.out.println("Watch Amazon Prime");
	}

	default void order() {
		System.out.println("Order food from zomato");
	}

}
