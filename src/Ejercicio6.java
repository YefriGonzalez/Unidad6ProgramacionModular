package src;
import java.util.*;
public class Ejercicio6{

	int[][] matriz=new int[3][3];
	int[][] matrizMultiplicada;
	public Ejercicio6(){
		crearMatriz();
		multiplicarMatriz();

	}

	public void crearMatriz(){
		matriz[0][0]=5;
		matriz[0][1]=6;
		matriz[0][2]=13;
		matriz[1][0]=14;
		matriz[1][1]=2;
		matriz[1][2]=4;
		matriz[2][0]=21;
		matriz[2][1]=7;
		matriz[2][2]=6;
		for (int i=0;i<matriz.length;i++) {
			System.out.println("\n");
			for (int j=0;j<matriz.length;j++){
				System.out.print("["+matriz[i][j]+"]");
			}
		}
	}

	public void multiplicarMatriz(){
		System.out.println("\n\nMatriz multiplicada en 2: ");
		matrizMultiplicada=new int[matriz.length][matriz.length];
		for (int i=0;i<matriz.length;i++) {
			System.out.println("\n");
			for (int j=0;j<matriz.length;j++) {
				matrizMultiplicada[i][j]=matriz[i][j]*2;
				System.out.print("["+matrizMultiplicada[i][j]+"]");
			}
		}
		System.out.println("");
	}
	public static void main(String[] args) {
		Ejercicio6 ej6=new Ejercicio6();
	}
}