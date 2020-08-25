package com.uninter;
//herdando a classe COmputador
public class ComputadorC extends Computador {

	//jogar sempre na horizontal
	public void jogar(Tabuleiro tab) {
		//condições para verificar se a posição está vazia ou se ja foi ocupada pelo Jogador HUMANO
		if (tab.mat[0][0] == 0 && tab.mat[0][0] != 1)
			tab.mat[0][0] = -1;
		
		else if (tab.mat [0][1]== 0 && tab.mat[0][1] != 1) 
			tab.mat[0][1] = -1;
		
		else if (tab.mat [0][2] == 0 && tab.mat[0][2] != 1) 
			tab.mat[0][2] = -1;
		
		else if (tab.mat [1][0] == 0 && tab.mat[1][0] != 1) 
			tab.mat[1][0] = -1;
		
		else if (tab.mat [1][1] == 0 && tab.mat[1][1] != 1) 
			tab.mat[1][1] = -1;
		
		else if (tab.mat [1][2] == 0 && tab.mat[1][2] != 1) 
			tab.mat[1][2] = -1;
		
		else if (tab.mat [2][0] == 0 && tab.mat[2][0] != 1) 
			tab.mat[2][0] = -1;
		
		else if (tab.mat [2][1] == 0 && tab.mat[2][1] != 1) 
			tab.mat[2][1] = -1;
		
		else if (tab.mat [2][2] == 0 && tab.mat[2][2] != 1) 
			tab.mat[2][2] = -1;

	}


}
