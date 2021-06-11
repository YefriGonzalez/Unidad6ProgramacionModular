package src;
import java.util.*;
public class Ejercicio2{
	int[] array=new int[10];
	int numero;
	int mayor=0;
	int repetido=0;
	public Ejercicio2(){
		for (int i=0;i<10 ;i++){
			numerosAleatorios(i);
		}
		for (int i=0;i<10;i++) {
			vecesRepetidas(i);
		}
		System.out.println("\nEl numero mayor es: "+mayor);
		System.out.println("El numero mayor se repite: "+repetido+" veces");
	}

	public void numerosAleatorios(int indice){
		numero=(int)(Math.random()*(99-1)+1);
		System.out.println("Numero aletorio "+(indice+1)+": "+numero);
		array[indice]=numero;	
		numeroMayor(numero);
	}

	public void numeroMayor(int numero){
		if (numero>mayor) {
			mayor=numero;
		}	
	}
	public void vecesRepetidas(int numero){
		if (mayor==array[numero]) {
			repetido++;
		}
	}

	public static void main(String[] args) {
		Ejercicio2 ej2=new Ejercicio2();	
	}
}