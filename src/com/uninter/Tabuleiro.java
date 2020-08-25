package com.uninter;

public class Tabuleiro {
	public int mat[][] = new int[3][3];
	//1 - X - Jogador humano
	//-1 - O - Computador
	//0 - Espa�o vazio
	public int decisao() {
			//condições para verificar vitória ou empate
			if (mat [0][0] == 1 && mat [0][1] == 1 && mat[0][2] == 1) { ;
				return 1;
			} else if(mat [1][0] == 1 && mat [1][1] == 1 && mat[1][2] == 1) {
				return 1;
			} else if (mat [2][0] == 1 && mat [2][1] == 1 && mat[2][2] == 1) {
				return 1;
			}//verticais
			  else if (mat [0][0] == 1 && mat [1][0] == 1 && mat[2][0] == 1) {
				return 1;
			}else if (mat [0][1] == 1 && mat [1][1] == 1 && mat[2][1] == 1) {
				return 1;
			}else if (mat [0][2] == 1 && mat [1][2] == 1 && mat[2][2] == 1) {
				return 1;
			}//diagonais
			 else if(mat [0][0] == 1 && mat [1][1] == 1 && mat[2][2] == 1) {
				return 1;
			}else if (mat [0][2] == 1 && mat [1][1] == 1 && mat[2][0] == 1) {
				return 1;
			}
				//horizontal pc
			else if (mat[0][0] == -1 && mat[0][1] == -1 && mat[0][2] == -1) { 
		        return -1;
		    } else if (mat[1][0] == -1 && mat[1][1] == -1 && mat[1][2] == -1) {
		        return -1;
		    } else if (mat[2][0] == -1 && mat[2][1] == -1 && mat[2][2] == -1) {
		        return -1;
		    }
				//vertical pc
		      else if (mat[0][0] == -1 && mat[1][0] == -1 && mat[2][0] == -1) { 
		        return -1;
		    } else if (mat[0][1] == -1 && mat[1][1] == -1 && mat[2][1] == -1) {
		        return -1;
		    } else if (mat[0][2] == -1 && mat[1][2] == -1 && mat[2][2] == -1) { 
		        return -1;
		    } //diagonal pc
		      else if (mat[0][0] == -1 && mat[1][1] == -1 && mat[2][2] == -1) { 
		        return -1;
		    } else if (mat[0][2] == -1 && mat[1][1] == -1 && mat[2][0] == -1) {
		        return -1;										
		    } else if(mat[0][0] != 0 && mat[0][1] != 0 && mat[0][2] != 0 && 
					  mat[1][0] != 0 && mat[1][1] != 0 && mat[1][2] != 0 && 
					  mat[2][0] != 0 && mat[2][1] != 0 && mat[2][2] != 0) {
		    	return 2;
		    }
		
		return 0;
				
    }
		//função para visualizar o tabuleiro
	public void visualizar() {
		
		for (int i = 0; i < mat.length; i++) {//linhas
			for (int j = 0; j < mat.length; j++) {//colunas
				if(mat[i][j]==1) {
					System.out.print("X ");
				}
				else if(mat[i][j]==-1) {
					System.out.print("O ");
				}
				else {
					System.out.print("- ");
				}
			}
			System.out.println();
		}
		
	}
	
}
