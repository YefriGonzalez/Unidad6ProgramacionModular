package src;
import java.util.*;
public class Ejercicio8{
	Scanner scanner=new Scanner(System.in);
	String posicionP1;
	String posicionP2;
	String[] array1= new String[5];
	String[] array2=new String[5];
	
	public Ejercicio8(){
		llenarArreglo();
		comparacionStrings();
	}

	public void llenarArreglo(){
		for (int i=0;i<array1.length;i++ ) {
			System.out.print("Ingrese la palabra "+(i+1)+" de la lista 1: ");
			array1[i]=scanner.nextLine();
		}
		System.out.println("\n");
		for (int j=0;j<array2.length;j++ ) {
			System.out.print("Ingrese la palabra "+(j+1)+" de la lista 2: ");
			array2[j]=scanner.nextLine();
		}
		System.out.println("");
	}

	public void comparacionStrings(){
		for (int i=0;i<array1.length;i++) {
			if (array1[i].length()==array2[i].length()) {
			System.out.println("\nEl tamaño de la palabras en el indice "+ (i+1) +" son iguales");
			System.out.println("El tamaño de las palabras "+array1[i] +" y "+array2[i]+" es: "+array2[i].length()+" letras");
			} else {
				System.out.println("\nEl tamaño de las palabras en el indice "+(i+1)+" no son iguales");
			}	
		}
	}

	public static void main(String[] args) {
		Ejercicio8 ej8=new Ejercicio8();
	}
}