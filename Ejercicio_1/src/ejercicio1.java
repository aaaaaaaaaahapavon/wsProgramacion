import java.util.Scanner;

/**Realiza la suma de todos los números compilados entre dos numeros, sin incluirlos.
 * fecha:02112021
 */

/**
 * @author Ángel Pavón
 *
 */
public class ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int a, b; //numeros de los extremos
		int suma; //acumulador para la suma de los números
		
		// Leo los números A y B, extremos de los que debo sumar
		System.out.print("Introduzca el número menor: ");
		a = teclado.nextInt();
		System.out.print("Introduzca el número mayor: ");
		b = teclado.nextInt();
		
		// Sumo los números entre A y B sin incluirlos
		suma = 0;
		for (int contador = a+1; contador < b; contador++)
			suma += contador;
		
		System.out.print("La suma es: " + suma);
		teclado.close();
	}

}