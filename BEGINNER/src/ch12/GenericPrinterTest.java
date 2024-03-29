package ch12;

public class GenericPrinterTest {
	public static void main(String [] arsg) {
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
		
		powderPrinter.setMaterial(new Powder());
		Powder powder = powderPrinter.getMaterial();
		System.out.println(powderPrinter);
		
		GenericPrinter<Plastic>plasticPrinter = new GenericPrinter<Plastic>();
		
		plasticPrinter.setMaterial(new Plastic());
		Plastic printer = plasticPrinter.getMaterial();
		System.out.println(plasticPrinter);
	}
}
