import java.util.Scanner;

/**Lee un número por teclado y muestra el primo más proximo.
/**
 * @author Ángel Pavón Fraile
 *
 */
public class ejercicio10 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n, i;
		
		System.out.print("Ingresa número: ");
		n= teclado.nextInt();
		i=2;
		while(n!=i) {
			while(n%i != 0) {
					i++;
			}
				if (i==n) {
					System.out.print( n + " es el primo más cercano");
				}
				else {n++;
				}
		}
		teclado.close();
	}
}
