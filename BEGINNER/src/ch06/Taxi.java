package ch06;

public class Taxi {
	public String taxiCo;
	public int taxiNum;
	int passengerCount;
	int money;
	
	public Taxi(String taxiCo, int taxiNum) {
		super();
		this.taxiCo = taxiCo;
		this.taxiNum = taxiNum;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
		
	
		public void showInfo() {
	System.out.println(taxiCo + "의 승객은" + passengerCount + "명이고, 수입은" + money + "입니다");
	}
}
