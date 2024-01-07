package chap05;

public class FunctionTest {
	public static void main(String []args) {
		int num1 = 10;
		int num2 = 20;
		
		int sum = add(num1, num2);
		
		System.out.println(num1 + "+" + num2 + "=" +sum +"입니다");
		
		int subtraction = minus(num1, num2);
		System.out.println(subtraction);
		
		int xxx = ts(num1, num2);
		System.out.println(xxx);
		
		double yyy = div(num1, num2);
		
		System.out.println(yyy);
	}
	
	public static int add(int n1, int n2) {
		int result =n1 + n2;
		return result;
	}
	
	public static int minus(int n1, int n2) {
		int result = n1-n2;
		return result;
	}
	
	public static int ts (int n1, int n2) {
		int result = n1 * n2;
		return result;
	}
	
	public static double div( int n1, int n2) {
		double result = (double) n1 / n2;
		return result;
	}
}
