package src;
import java.util.*;
public class Ejercicio9{
	Scanner scanner=new Scanner(System.in);
	int[][] matriz1;
	int[][] matriz2;
	int[][] matrizSumada;
	int m1;
	int n1;
	int m2;
	int n2;
	int numerosMatriz1;
	int numerosMatriz2;

	public Ejercicio9(){
		pedirTamañoMatrices();
	}

	public void pedirTamañoMatrices(){
		System.out.println("------------Suma de Matrices---------------");
		System.out.print("Ingrese el numero de filas para la matriz 1: ");
		m1=scanner.nextInt();
		System.out.print("Ingrese el numero de columnas para la matria 1: ");
		n1=scanner.nextInt();
		System.out.print("\n\nIngrese el numero de filas para la matriz 2: ");
		m2=scanner.nextInt();	
		System.out.print("Ingrese el numero de columnas para la matriz 2: ");
		n2=scanner.nextInt();
		crearMatrices(m1,n1,m2,n2);
	}

	public void crearMatrices(int m1,int n1,int m2,int n2){
		if (m1==m2 && n1==n2) {
			matriz1=new int[m1][n1];
			matriz2=new int[m2][n2];
			llenarMatrices();
			imprimirMatrices();	
			sumarMatrices();
			imprimirMatrizSumada();
		} else {
			System.out.println("Para sumar matrices las dimensiones deben ser las mismas");
		}
	}

	public void llenarMatrices(){
		for (int i=0;i<m1;i++) {
			for (int j=0;j<n1;j++) {
				System.out.print("Ingrese el numero de la matriz 1 en la posicion ("+(i+1)+","+(j+1)+"): ");
				matriz1[i][j]=scanner.nextInt();
			}
		}
		System.out.println("\n");
		for (int i=0;i<m2;i++) {
			for (int j=0;j<n2;j++ ) {
				System.out.print("Ingrese el numero de la matriz 2 en la posicion ("+(i+1)+","+(j+1)+"): ");
				matriz2[i][j]=scanner.nextInt();
			}
		}
	}

	public void imprimirMatrices(){
		System.out.println("\nMatriz 1: ");
		for (int i=0;i<m1;i++) {
			System.out.println("\n");
			for (int j=0;j<n1;j++) {
				System.out.print("["+matriz1[i][j]+"]");
			}
		}
		System.out.println("\n\nMatriz 2: ");
		for (int i=0;i<m2;i++) {
			System.out.println("\n");
			for (int j=0;j<n2;j++ ) {
				System.out.print("["+matriz2[i][j]+"]");
			}
		}
	}

	public void sumarMatrices(){
		matrizSumada=new int[m1][n1];
		System.out.println("\n\n--------Matriz 1 + Matriz 2------------- ");
		for (int i=0;i<m1;i++) {
			for (int j=0;j<n1;j++ ) {
				matrizSumada[i][j]=matriz1[i][j]+matriz2[i][j];
			}
			
		}
	}

	public void imprimirMatrizSumada(){
		for (int i=0;i<m1;i++ ) {
			System.out.println("\n");
			for (int j=0;j<n1;j++) {
				System.out.print("["+matrizSumada[i][j]+"]");
			}
		}
		System.out.println("\n");
	}

	public static void main(String[] args) {
		Ejercicio9 ej9=new Ejercicio9();
	}
}