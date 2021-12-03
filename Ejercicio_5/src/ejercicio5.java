import java.util.Scanner;

/**Lee N números hasta que lea un 0, realiza y muestra la suma y la cantidad de números 
 * introducidos
 */

/**
 * @author Ángel Pavón Fraile
 *
 */
public class ejercicio5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n;
		int contador = 0;
		int suma = 0;
		
		do {
			System.out.print("Ingrese número: ");
			n= teclado.nextInt();
			contador++;
			suma += n;
		} while (n!= 0);
		
		 System.out.println("La suma de tus números es: " + suma);
		 System.out.print("Se han introducido " + --contador + " números");
		 teclado.close();
}
}