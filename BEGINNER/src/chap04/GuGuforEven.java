package chap04;

public class GuGuforEven {
	public static void main (String []args) {
		int i;
		int j;
	
		for( i=2 ;i <=9; i++ ) {
			for( j =1; j<=9; j++) {
				if(i %2 != 0)
					continue;
				System.out.println(i + "X" + j +"=" +i*j);
			}
			System.out.println();
		}
	}
}
