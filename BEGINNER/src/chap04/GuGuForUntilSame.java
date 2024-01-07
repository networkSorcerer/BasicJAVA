package chap04;

public class GuGuForUntilSame {
	public static void main (String []args) {
		int i;
		int j;
		
		for(i=2 ; i <= 9 ; i++) {
			for (j =1; j<=9;j++) {
				if(i+1 <= j )
					break;
				System.out.println(i + "x" + j + "=" + i*j);
			}
			System.out.println();
		}
	}
}
