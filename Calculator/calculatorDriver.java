
public class calculatorDriver {

	public static void main(String[] args) {
		calculator Calculator = new calculator();
		
		
		System.out.println(Calculator.add(5,4));
		System.out.println(Calculator.add(4,5));
		System.out.println(Calculator.multiply(5,5));
		System.out.println(Calculator.subtract(6,20));
		System.out.println(Calculator.divide(50,2));
		System.out.println(Calculator.modulus(100,6));

	}

}
