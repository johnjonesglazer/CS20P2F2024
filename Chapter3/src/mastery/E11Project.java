package mastery;

public class E11Project {
	
	public static void main(String[] args) {
	
		
		System.out.println("Decimal		Binary		Hexadecimal");
		
		int a = 1;
		String binary = Integer.toBinaryString(a);
		String hex = Integer.toHexString(a);
		System.out.println(a + "		" + binary + "		" + hex);
		
		for (int i = 0; i < 19; i++) {
		
			a += 1;
			binary = Integer.toBinaryString(a);
			hex = Integer.toHexString(a);
			System.out.println(a + "		" + binary + "		" + hex);
		
		}
		
	}	
}