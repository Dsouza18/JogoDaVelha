package jogoDaVelha;

public class JogoDaVelha {

	private String [] [] mat1 = {{"1", "2", "3"}, {"4","5","6"}, {"7","8","9"}};

	public String Mostrar(){
		for (int linha = 0; linha <3; linha++) {
			for(int coluna = 0; coluna <3; coluna++) {
				System.out.print("    | "  + mat1[linha] [coluna] + " |  ");
				
			}
			
			System.out.println("\n");
		}
		return null;
	}//---------------------------------------------

	public boolean Valido(String Posicao) {
		for(int linha=0; linha<3; linha++) {
			for (int coluna=0; coluna<3; coluna++) {
				if(mat1[linha][coluna].equals(Posicao))
					return true;
			}
		}
		return false;
	}//----------------------------------------------

	public void Jogada(String posicao, String Jogador) {
		if (posicao.equals("1"))
			mat1 [0][0] = Jogador;
		else if(posicao.equals("2"))
			mat1 [0] [1] = Jogador;
		else if(posicao.equals("3"))
			mat1 [0] [2] = Jogador;
		else if(posicao.equals("4"))
			mat1 [1] [0] = Jogador;
		else if(posicao.equals("5"))
			mat1 [1] [1] = Jogador;
		else if(posicao.equals("6"))
			mat1 [1] [2] = Jogador;
		else if(posicao.equals("7"))
			mat1 [2] [0] = Jogador;
		else if(posicao.equals("8"))
			mat1 [2] [1] = Jogador;
		else if(posicao.equals("9"))
			mat1 [2] [2] = Jogador;
	}//----------------------------------------------

	public String Ganhador(int jogadas) {
		String [] T = new String [8];
		String vencedor = "null";
		
		if(jogadas == 9) {
			vencedor = "EMPATE";
		}
		
		T [0] = mat1[0][0] + mat1 [0][1] + mat1 [0][2];
		T [1] = mat1[1][0] + mat1 [1][1] + mat1 [1][2];
		T [2] = mat1[2][0] + mat1 [2][1] + mat1 [2][2];

		T [3] = mat1[0][0] + mat1 [1][0] + mat1 [2][0];
		T [4] = mat1[0][1] + mat1 [1][1] + mat1 [2][1];
		T [5] = mat1[0][2] + mat1 [1][2] + mat1 [2][2];

		T [6] = mat1[0][0] + mat1 [1][1] + mat1 [2][2];
		T [7] = mat1[0][2] + mat1 [1][1] + mat1 [2][0];

		for(int i = 0; i < T.length; i++){
			if(T[i].equals("XXX")) { 
				vencedor = "Jogador 1 venceu";
			} else if(T[i].equals("OOO")) {  
				vencedor = "Jogador 2 venceu";
			}
		}
		return vencedor;
	}//----------------------------------------------
}
