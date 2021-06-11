package src;
import java.util.*;
public class Ejercicio1{
	Scanner scanner=new  Scanner(System.in);
	// variables Globales
	int[] elementos=new int[5];
	
	//Contrusctor
	public Ejercicio1(){
		for(int i=0;i<5;i++){
			pedirValor(i);
		}
		System.out.println("");
		for(int i=0;i<5;i++){
			mostrarDatos(i);
		}
	}

	public void pedirValor(int numero){
		System.out.print("Ingrese el Valor No."+(numero+1)+": ");
		elementos[numero]=scanner.nextInt();
	}

	public void mostrarDatos(int numero){
		System.out.println("Indice "+(numero+1)+", valor: "+elementos[numero]);
	}

	public static void main(String[] args) {
		Ejercicio1 ej=new Ejercicio1();
	}
}
