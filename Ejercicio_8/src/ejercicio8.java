import java.util.Scanner;

/**Lee un n�mero introducido por teclado y calcula el factorial
 */

/**
 * @author �ngel Pav�n Fraile
 *
 */
public class ejercicio8 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n;
		long acumulador = 1;
		int contador;
		
		System.out.print("Introduzca n�mero: ");
		n = teclado.nextInt();
		teclado.close();
		for(contador=n;contador>=1;contador--) {
		acumulador = contador * acumulador;
		}
		System.out.print("El factorial de " + n + " es: " + acumulador);
		
	}
}
