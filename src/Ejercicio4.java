package src;
import java.util.*;
public class Ejercicio4{
	int[] arreglo=new int[10];
	int numero;
	int mayor=0;	
	public Ejercicio4(){
		generarAleatorios();
		System.out.println("");
		separacionConMayor();

	}

	public void generarAleatorios(){
		for (int i=0;i<10;i++) {
			numero=(int)(Math.random()*100);
			System.out.println("Valor No."+(i+1)+": "+numero);
			arreglo[i]=numero;
			numeroMayor(numero);
		}
	}

	public void numeroMayor(int numero){
		if (numero>mayor) {
			mayor=numero;
		}
	}

	public void separacionConMayor(){
		int separacion;
		for (int i=0;i<10;i++) {
			separacion=mayor-arreglo[i];
			System.out.println("La separacion de "+mayor+" con "+ arreglo[i]+" es: "+separacion);
		}
	}




	public static void main(String[] args) {
		Ejercicio4 ej4=new Ejercicio4();
	}
}