package n3exercici1;

public class Main_n3exercici1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Smartphone smartphone1 = new Smartphone();
		
		System.out.println("The method limited by Phone cannot take photos:");
		GenericClass.usingPhone(smartphone1);
		System.out.println();
		System.out.println("The method limited by Smartphone can take photos:");
		GenericClass.usingSmartphone(smartphone1);
		
	}

}
