import java.util.Scanner;

public class PL6_8 {

	public static void main(String[] args) {
		int dec ;
		Scanner scanner = new Scanner (System.in);
			
		do {
			do {
					System.out.println("Qual é o número que pretende converter em hexadecimal. O programa termina quando inserido o valor 0");
					dec = scanner.nextInt();
									
			} while(dec < 0);
			
				if (dec == 0) {
					break;
				}
			
					System.out.println("Hex value is " + decToHex(dec).toUpperCase());
			}while(dec != 0);		
}
	
	
	public static String decToHex(int a)
	  {
	        return Integer.toHexString(a);
	  }
	
}