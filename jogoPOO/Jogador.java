package jogoPOO;

import java.util.Scanner;

public class Jogador {

	private static int menuItem;
	private static int menuFaz;
	
	
	

	public static void main(String[] args) {
		ArmaUm um = new ArmaUm();
		ArmaDois dois = new ArmaDois();
		
		final Scanner scanear = new Scanner(System.in);
		
		um.atirar();
		um.recarregar();
		dois.atirar();
		dois.recarregar();
		
		boolean RepetirComando = true;
		boolean Continue = true;
		while(Continue) {
			System.out.println("Selecione a arma: ");
			System.out.println("Digite 1 para Arma01");
			System.out.println("Digite 2 para Arma02");
			menuItem = scanear.nextInt();
			
			switch (menuItem) {
			case  1:
				Continue = false;
				System.out.println("Você escolheu Arma01");
				System.out.println("Digite 5 para atirar e 6 para recarregar.");
				while(RepetirComando) {
				menuFaz = scanear.nextInt();
				while(RepetirComando) {
					switch (menuFaz) {
					case 5: 
				        System.out.println("Você atirou!");
				        break;
					case 6:
						System.out.println("Recarregando ");
						break;
					default:
						System.out.println("[ERROR]Opção inválida!");
					}
		          break;
				}
			}
		          
		          
			case 2:
				Continue = false;
				System.out.println("Você escolheu Arma02");
				System.out.println("Digite 5 para atirar e 6 para recarregar.");
				while(RepetirComando) {
				menuFaz = scanear.nextInt();
					switch (menuFaz) {
					case 5: 
				        System.out.println("Você atirou!");
				        break;
					case 6:
						System.out.println("Recarregando ");
						break;
					default:
						System.out.println("[ERROR]Opção inválida!");
			}
		}
			default:
				Continue = false;
				System.out.println("[ERROR]Opção inválida!");
		}
	 }
		
  }

}