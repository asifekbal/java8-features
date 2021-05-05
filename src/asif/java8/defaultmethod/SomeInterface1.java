package asif.java8.defaultmethod;

public interface SomeInterface1 extends SomeInterface2 {

	default void listen() {
		System.out.println("Listen Apple Music");
	}

	default void watch() {
		System.out.println("Watch Netflix");
	}

	default void shop() {
		System.out.println("Shop from Amazon");
	}
}
