package src;
import java.util.*;
public class Ejercicio10{
	Scanner scanner=new Scanner(System.in);
	int[][] matriz=new int[3][4];
	int[][] matrizTranspuesta=new int[4][3];

	public Ejercicio10(){
		llenarMatriz();
		crearMatrizTranspuesta();
		imprimirMatrices();
	}

	public void llenarMatriz(){
		for (int i=0;i<3;i++) {
			for (int j=0;j<4;j++) {
				System.out.print("Ingrese el numero de la matriz en la posicion ("+(i+1)+","+(j+1)+"): ");
				matriz[i][j]=scanner.nextInt();
			}
		}
	}
	
	public void crearMatrizTranspuesta(){
		for (int i=0;i<3;i++) {
			for (int j=0;j<4;j++) {
				matrizTranspuesta[j][i]=matriz[i][j];
			}
		}
	}

	public void imprimirMatrices(){
		System.out.println("\nMatriz:");
		for (int i=0;i<3;i++){
			System.out.println("\n");
			for (int j=0;j<4;j++) {
				System.out.print("["+matriz[i][j]+"]");	 	
			}
			System.out.print("                       ");
				
			
		}
		System.out.print("\n\nMatriz Transpuesta: ");
		for (int i=0;i<4;i++) {
			System.out.println("\n");
			for (int j=0;j<3 ;j++ ) {
				System.out.print("["+matrizTranspuesta[i][j]+"]");
			}
					
		}	
		System.out.println("\n");
	}

	public static void main(String[] args) {
		Ejercicio10 ej10=new Ejercicio10();
	}
}