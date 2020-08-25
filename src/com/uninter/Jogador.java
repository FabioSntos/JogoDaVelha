package com.uninter;

import java.util.Scanner;

public class Jogador {
	//metodo para capturar as jogadas do Jogador Humano
	void jogar(Tabuleiro tab) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite as Coordenadas da jogada: ");
		int i = teclado.nextInt();
		int j = teclado.nextInt();
		tab.mat[i][j] = 1; 
		
	}
	
}
