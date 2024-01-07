package chap04;

import java.util.Scanner;

public class P1 {
	public static void main (String [] args) {
		int op;
		int num1;
		int num2;
		int re;
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("1은 + ,2는 - ,3은 *,4는 / , 원하는 연산자를 고르시오");
		op = stdIn.nextInt();
		System.out.println("원하는 두수를 입력하시오");
		num1 =stdIn.nextInt();
		num2 = stdIn.nextInt();
		
		switch(op) {
		case 1 : op = 1;
			re = num1 + num2;
			System.out.println(re);
			break;
		case 2 : op = 2;
		re = num1 - num2;
		System.out.println(re);
		break;
		case 3 : op = 3;
		re = num1 * num2;
		System.out.println(re);
		break;
		case 4 : op = 4;
		re = num1 / num2;
		System.out.println(re);
		break;
		}
	}
}
