package asif.java8.functionalinterface;

public class LambdaTest {

	public static void main(String[] args) {
		int n1 = 5;
		int n2 = 10;
		// String movie = "Ice";
		IntegerIntegerIntegerInterface addFi = (a, b) -> a + b;
		IntegerIntegerIntegerInterface subFi = (a, b) -> b - a;
		IntegerIntegerIntegerInterface mulFi = (a, b) -> a * b;
		IntegerIntegerIntegerInterface divFi = (a, b) -> b / a;
		int sum = addFi.foo(n1, n2);
		System.out.println("SUM = " + sum);
		int sub = subFi.foo(n1, n2);
		System.out.println("SUB = " + sub);
		int mul = mulFi.foo(n1, n2);
		System.out.println("MUL = " + mul);
		int div = divFi.foo(n1, n2);
		System.out.println("DIV = " + div);

		System.out.println("***********************************");

		String name = "Asif";
		StringStringInterface helloFi = (str) -> "Hello " + str;
		System.out.println(helloFi.foo(name));

		StringVoidInterface msgFi = () -> "Hey I love you.";
		System.out.println(msgFi.foo());

		// VoidVoidInterface funFi = () -> {str + " and Fire"}; // wrong implementation

	}

}
