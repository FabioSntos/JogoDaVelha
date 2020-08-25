package com.uninter;

import java.util.Scanner;

public class Jogo {

	public static void main(String[] args) {
		Tabuleiro tab =new Tabuleiro();
		Jogador jogador = new Jogador();
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Jogo da velha");
		System.out.println("Escolha a dificuldade 1,2 ou 3:");
		int opcao = teclado.nextInt();
		
		// IMPLEMENTAR E VALIDAR AS OPCOES
		Computador comp=null;
		//switch para escolher o nivel de dificuldade da partida
		switch(opcao){
			case 1: comp= new ComputadorA(); //o computador irá sempre jogar na diagonal da direita para esquerda
				break;
			case 2: comp= new ComputadorB(); //nesse nivel o computador vai jogar sempre na vertical
				break;
			case 3: comp= new ComputadorC(); //jogar sempre na horizontal
				break;
		}
		
		//DEFINIR COMPORTAMENTO PARA AS OUTRAS OPCOES
		int vez=1;
		tab.visualizar();
		
		while(tab.decisao()==0) {
			
			if(vez==1) { // JOGADOR HUMANO
				jogador.jogar(tab);
				vez=2;
			}
			else if(vez==2) {//JOGADOR COMPUTADOR
				System.out.println("Jogada do Computador");
				
				comp.jogar(tab);
				vez=1;
			}
			
			tab.visualizar();
			
		}
		//lógica para verificar quem ganha, quem perde, ou empate
		if (tab.decisao() == 1) {
			System.out.println("Jogador vencedor!");
		}else if(tab.decisao()== -1) {
			System.out.println("Computador vencedor!");
		}else if(tab.decisao()==2) {
			System.out.println("empate");
		}
	}
}
