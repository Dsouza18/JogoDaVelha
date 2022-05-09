package jogoDaVelha;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) { 
		Scanner Obter = new Scanner(System.in);
		JogoDaVelha jogo = new JogoDaVelha();
		String posicao;
		int valida = 0, Jogadas = 0;
		
		while (true) {//------------------------
			System.out.println("---------- JOGO DA VELHA -------");
			System.out.println("\n");
			jogo.Mostrar();
			
			do {//inicia jogador 1...............................
				System.out.print("Jogador 1, informe uma posição: ");
				posicao = Obter.next();
				while(!jogo.Valido(posicao)) {
					System.out.println("Jogada inválida, tente novamente");
					System.out.print("Jogador 1, informe uma posição");
					posicao = Obter.next();
					valida = 0;
				}
				jogo.Jogada(posicao, "X");
				valida = 1;
				
			}while(valida == 0);//Fim jogador 1..............................
			
			Jogadas++;
			valida = 0;
			jogo.Mostrar();
			if(!jogo.Ganhador(Jogadas).equals("null")) {
				break;
			}
			
			do {//inicia jogador 2...............................
				System.out.print("Jogador 2, informe uma posição: ");
				posicao = Obter.next();
				while(!jogo.Valido(posicao)) {
					System.out.println("Jogada inválida, tente novamente");
					System.out.print("Jogador 2, informe uma posição");
					posicao = Obter.next();
					valida = 0;
				}
				jogo.Jogada(posicao, "O");
				valida = 1;
				
			}while(valida == 0);//Fim jogador 2..............................
			
			Jogadas ++;
			valida = 0;
			jogo.Mostrar();
			if(!jogo.Ganhador(Jogadas).equals("null")) {
				break;
			}
			
		}//-----------------------------------------------------------------------
		System.out.println("Resultado: "+ jogo.Ganhador(Jogadas));
	}

}
