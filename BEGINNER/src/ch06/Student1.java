package ch06;

public class Student1 {
	public String studentName;
	public int money;
	public String grade;
	
	public Student1(String studentName, int studentMoney) {
		super();
		this.studentName = studentName;
		this.money = studentMoney;
	}
	
	public void takeTaxi(Taxi taxi ) {
		 taxi.take(1000);
		this.money -= 1000;
	}

}
