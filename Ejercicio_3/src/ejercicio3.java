import java.util.Scanner;

/**Lee un n�mero N y calcula los divisores propios
 * 
 */

/**
 * @author �ngel Pav�n Fraile
 *
 */
public class ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n, i;
	
		System.out.print("Ingresa n�mero: ");
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
