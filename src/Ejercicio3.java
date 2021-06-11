package src;
import java.util.Scanner;
public class Ejercicio3{
	Scanner scanner=new Scanner(System.in);
	int[] arreglo=new int[8];
	int numero;
	boolean encontrado;
	int numEncontrar;
	public Ejercicio3(){
		for (int i=0;i<8;i++) {
			numerosAleatorios(i);
		}
		econtrarNumero();
		System.out.println(encontrado);
	}

	public void numerosAleatorios(int indice){
		System.out.print("Ingrese el valor No."+(indice+1)+": ");
		numero=scanner.nextInt();
		arreglo[indice]=numero;
	}
	public boolean econtrarNumero(){
		System.out.print("Ingrese el numero que desea buscar: ");
		numEncontrar=scanner.nextInt();
		for (int i=0;i<8;i++){
			if (arreglo[i]==numEncontrar) {
				encontrado=true;
			} 
		}
		return encontrado;
	}

	public static void main(String[] args){
		Ejercicio3 ej3=new Ejercicio3();
	}
}