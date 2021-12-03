import java.util.Scanner;

/**Lee un número N y calcula los divisores propios
 * 
 */

/**
 * @author Ángel Pavón Fraile
 *
 */
public class ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n, i;
	
		System.out.print("Ingresa número: ");
		n= teclado.nextInt();
		i=1;
		while(i<n) {
				if(n%i == 0) {
					System.out.print(i + " ");
				}
				
				i++;

		}
		teclado.close();
	}
}
