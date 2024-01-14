package ch13;

interface PrintString {
	void showString(String str);
}

public class TestLambda1 {
	public static void main(String []args) {
		PrintString reStr = returnString ();
		reStr.showString("hello");
	}
	
	public static PrintString returnString () {
		return s-> System.out.println(s + "world");
	}
}
