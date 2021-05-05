package asif.java8.defaultmethod;

public interface RandomInterface {

	void smile();

	default void love() {
		System.out.println("Love is blind and sometimes overrated!");
	}

	default void hate() {
		System.out.println("Hate never solves a problem but creates so many !");
	}

	default void sleep() {
		System.out.println("Early to bed early to rise makes you lazy.");
	}

	static void heartbreak() {
		System.out.println("Did someone broke your heart.");
	}

	static void moveon() {
		heartbreak();
		System.out.println("Say them buy and move on, Life is too short to waste on someone");
	}
}
