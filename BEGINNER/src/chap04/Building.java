package chap04;

import java.util.Scanner;

public class Building {
	public static void main (String []args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		int layer;
		System.out.println("층수를 입력하라");
		layer =stdIn.nextInt();
		
		switch(layer) {
		case 1 : layer = 1;
		System.out.println("약국");
		break;
		case 2 : layer = 2;
		System.out.println("정형");
		break;
		case 3 : layer = 3;
		System.out.println("피부");
		break;
		case 4 : layer = 4;
		System.out.println("치과");
		break;
		case 5 : layer = 5;
		System.out.println("헬스");
		break;
		}
	}
}
