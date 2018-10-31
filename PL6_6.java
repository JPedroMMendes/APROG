import java.util.Scanner;

public class PL6_6 {

	
	public static void main (String[]args)
	{	
		Scanner scanner = new Scanner (System.in);
		String escolha;
		int altura, base;
		
		System.out.println("Qual é o sólido que pretende calcular o volume? Cone, cilindro ou esfera? O programa termina quando inserida a palavra FIM");
		do {
				
				escolha = scanner.nextLine();
				
		if (escolha.equalsIgnoreCase("cilindro")) {
			
			System.out.println("Qual a altura do sólido?");
			altura = scanner.nextInt();
			System.out.println("Qual o raio do sólido?");
			base = scanner.nextInt();
			areacilindro (altura, base); }
		
		if (escolha.equalsIgnoreCase("cone")) {
					
					System.out.println("Qual a altura do sólido?");
					altura = scanner.nextInt();
					System.out.println("Qual o raio do sólido?");
					base = scanner.nextInt();
					areacone (altura, base); }
			
		if (escolha.equalsIgnoreCase("esfera")) {
			
			System.out.println("Qual o raio do sólido?");
			base = scanner.nextInt();
			areaesfera ( base); }
	
		} while(!escolha.equals("FIM"));
		
	}
		
		
	public static void areacilindro (int a,int b) {
		
		double area;
		area = a * Math.PI * (b*b);
		System.out.println("A àrea é:" +area);
		
	}
	
	public static void areacone (int a,int b) {
			
			double area;
			area =( a* Math.PI * (b*b))/3;
			System.out.println("A àrea é:" +area);
			
		}
	
	public static void areaesfera (int b) {
		
		double area;
		area =Math.PI * (b*b*b) * (4/3);
		System.out.println("A àrea é:" +area);
		
	}
		
		
	}
	
	
	
	

