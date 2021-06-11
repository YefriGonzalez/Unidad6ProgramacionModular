package src;
public class Ejercicio7{
	int[][] matriz;
	
	int numero;
	int suma=0;
	int m;
	int n;
	public Ejercicio7(){
		m=4;
		n=3;
		llenarMatriz();
		mostrarMatriz();
		sumarFilaPar();
	}

	public void llenarMatriz(){
		matriz=new int[m][n];
		for (int i=0;i<m;i++) {
			for (int j=0;j<n;j++){
				matriz[i][j]=(int)(Math.random()*555);
			}
		}
	}

	public void mostrarMatriz(){
		System.out.println("Matriz con numeros aleatorios: ");
		for (int i=0;i<m;i++) {
			System.out.println("\n");
			for (int j=0;j<n;j++){
				System.out.print("["+matriz[i][j]+"]");
			}
		}
	}

	public void sumarFilaPar(){
		int i=1;
		for (int j=0;j<n;j++) {
			suma+=matriz[i][j];	
		}
		int k=3;
		for (int j=0;j<n;j++) {
			suma+=matriz[k][j];
		}
		System.out.println("\n\nLa suma es: "+suma);
	}

	public static void main(String[] args) {
		Ejercicio7 ej7=new Ejercicio7();
	}
}