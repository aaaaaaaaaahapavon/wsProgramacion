import java.util.Scanner;

/**Lee N n�meros hasta que lea un 0, realiza y muestra la suma y la cantidad de n�meros 
 * introducidos
 */

/**
 * @author �ngel Pav�n Fraile
 *
 */
public class ejercicio5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n;
		int contador = 0;
		int suma = 0;
		
		do {
			System.out.print("Ingrese n�mero: ");
			n= teclado.nextInt();
			contador++;
			suma += n;
		} while (n!= 0);
		
		 System.out.println("La suma de tus n�meros es: " + suma);
		 System.out.print("Se han introducido " + --contador + " n�meros");
		 teclado.close();
}
}