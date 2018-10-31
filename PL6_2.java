import java.util.Scanner;

public class PL6_2 {

	public static void main(String[] args) {
		int num_alunos, num_dis,aprovados, reprovados = 0;
		Scanner scanner = new Scanner (System.in);
		do {
			System.out.println("Qual é o número de alunos?");
			num_alunos = scanner.nextInt();
		} while (num_alunos < 0);
		
		for (int i = 0; i < 1; ++i)
		    System.out.println ();
		
		do {
			System.out.println("Qual é o número de disciplinas?");
			num_dis = scanner.nextInt();
		} while (num_dis < 0);

		for (int i = 0; i < 1; ++i)
		    System.out.println ();
		
		
		for (int x = 0 ; x < num_dis ; x++) {
			 System.out.println ();
			System.out.println("Qual nome desta disciplina?");
			Scanner nome1 = new Scanner (System.in);
			String nome = nome1.nextLine();
			 System.out.println ();
				do {
					System.out.println("Quantos alunos foram aprovados a esta disciplina?");
					Scanner num = new Scanner (System.in);
					aprovados = num.nextInt();
				}while( aprovados < 0);
				reprovados = num_alunos - aprovados;
				mostrar (nome, aprovados,reprovados);

		}		
						
	}
		public static void mostrar (String disciplina , int aprovados1,int reprovados1) {
		System.out.println(""+disciplina );
		
		System.out.print("Aprovados:");
		for (int x1 = 0 ; x1 < aprovados1 ; x1++) {
		System.out.print("*" );
		}
		System.out.println ();
		System.out.print("Reprovados:");;
		for (int x1 = 0 ; x1 < reprovados1 ; x1++) {
		System.out.print("*" );}
		System.out.println();
		}
		
}
		
		

