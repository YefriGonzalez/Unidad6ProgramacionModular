package src;
import java.util.*;
public class Ejercicio5{
	Scanner scanner=new Scanner(System.in);
	int numeroNotasA_Ingresar;
	int[] arregloNotas;
	int nota=0;
	int totalNotas=0;
	double valorMedio;
	int opcion=0;
	
	public Ejercicio5(){
		opciones();
	}

	public void opciones(){
		while(opcion!=2){
			System.out.print("\n1.Ingresar Notas, 2. Salir, Elija la opcion: ");
			opcion=scanner.nextInt();
			if (opcion==1) {
				incializarArreglo();
			} else{
				System.out.println("-------Adios-------");
			}
		}
	}

	public int[] incializarArreglo(){
		System.out.println("\nPuede haber un minimo de 1 y un maximo de 100 notas");
		System.out.print("Ingrese la cantidad de notas que desea ingresar: ");
		numeroNotasA_Ingresar=scanner.nextInt();
		if (numeroNotasA_Ingresar>=1 && numeroNotasA_Ingresar<=100) {
			arregloNotas=new int[numeroNotasA_Ingresar];
			ingresarNotas(numeroNotasA_Ingresar);
		} else {
			System.out.println("!El numero de notas que desea ingresar es incorrecto!"); 
		}
		return arregloNotas;
	}

	public void ingresarNotas(int cantidadNotas){
		int i=0;
		while(nota!=-50 && i<cantidadNotas){
			System.out.print("Ingrese la Nota No."+(i+1)+": ");
			nota=scanner.nextInt();
			arregloNotas[i]=nota;
			if (nota>=1 && nota<=10) {
				totalNotas+=nota;
				i++;		
			} else if(nota==-50) {
				numeroNotasA_Ingresar=i;
				System.out.println("-----------Ingreso el Dato Bandera, Adios------------------");
			} else {
				System.out.println("Ingreso una nota incorrecta");
			}			
		}
		System.out.println("\nLa suma de notas ingresadas es: "+totalNotas);
		calcularValorMedio(totalNotas);
		nota=0;
		totalNotas=0;
	}

	
	public void calcularValorMedio(int totalNotas){
		valorMedio=(double)totalNotas/numeroNotasA_Ingresar;
		System.out.println("\nEl valor medio de las notas ingresadas es: "+valorMedio);
		valorMedio=0;
	}

	public static void main(String[] args) {
		Ejercicio5 ej5=new Ejercicio5();
	}
}