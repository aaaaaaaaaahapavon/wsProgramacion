import java.util.Scanner;

/**Lee N números hasta que lea un 0, realiza y muestra la media de los números introducidos
 */

/**
 * @author Ángel Pavón Fraile
 *
 */
public class ejercicio7 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n;
		int acumulador = 0;
		int contador = 0;
		int media = 0;
		int mayor=0;
		int menor=1999999999;
		
		do {
			System.out.println("Ingrese número: ");
			n= teclado.nextInt();
			acumulador +=n;
			contador++;
			if (mayor<n) {
			mayor = n;
			}
			if(menor>n && n != 0) {
			menor = n;
			}
		} while (n!= 0);
		contador--;
		media= acumulador / contador;
		System.out.println("La media de tus números es: " + media);
		System.out.println("El mayor número que has puesto es: " + mayor);
		System.out.println("El menor número que has puesto es: " + menor);	
		 teclado.close();

	}

}
