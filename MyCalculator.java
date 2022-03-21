package week1.day2;

public class MyCalculator {

	public static void main(String[] args) {
		Calculator1 calc = new Calculator1();
		
		System.out.println("Sum of three numbers = "+calc.add1(23, 45, 54));
		System.out.println("Subtraction =  "+calc.sub(202, 12));
		System.out.println("Multiplication of double  =  "+calc.mul(-9.8768877, 8.9876566));
		System.out.println("Division of float =  "+calc.div(12.233456F, 34.5445567F));
	
	}

}
