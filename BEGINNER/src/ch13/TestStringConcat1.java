package ch13;

public class TestStringConcat1 {
	public static void main(String [] args) {
		String s1 = "Hello";
		String s2 = "World";
		StringConcat concat2 = (s, v) -> System.out.println(s+ "," + v);
		concat2.makeString(s1, s2);
	}
}
