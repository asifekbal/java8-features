package asif.java8.defaultmethod;

public class RandomClass implements RandomInterface {

	public static void main(String[] args) {
		RandomClass rClass = new RandomClass();
		rClass.smile();
		rClass.sleep();
		rClass.love();
		rClass.hate();
		RandomInterface.moveon();

		System.out.println("************* Advanced Topic ***********************");

		SomeClass someClass = new SomeClass();
		someClass.listen();
		someClass.watch();
		someClass.order();
		someClass.shop();
	}

	@Override
	public void smile() {
		System.out.println("A smile on her face, makes the heart beats faster. ");
	}

	@Override
	public void sleep() {
		System.out.println("Early to bed early to rise makes you intelligent and wise.");
	}

}

class SomeClass implements SomeInterface1, SomeInterface3 {

	@Override
	public void listen() {
		System.out.println("Listen Spotify");
	}

	// if we don't override, compiler will throw error as it is unable to figure out
	// which shop to call
	@Override
	public void shop() {
		SomeInterface3.super.shop();
	}
}
