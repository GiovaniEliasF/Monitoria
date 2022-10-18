import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int option = 10;
		do {
			Calc a = new Calc();
			Scanner input = new Scanner(System.in);
			System.out.println("Questão 2: Calcular tempo de Emprego");
			System.out.println("1 - Calcular Tempo de Emprego");
			System.out.println("2 - Sair");
			option = input.nextInt();
			
			switch(option) {
			case 1: a.calc();
				break;
			case 2: System.out.println("Fim do Programa");
				break;
			default: System.out.println("Opção inválida");
				break;
			}
			
		}while(option != 2);
	}
}
