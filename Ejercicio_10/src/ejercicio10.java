import java.util.Scanner;

/**Lee un n�mero por teclado y muestra el primo m�s proximo.
/**
 * @author �ngel Pav�n Fraile
 *
 */
public class ejercicio10 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n, i;
		
		System.out.print("Ingresa n�mero: ");
		n= teclado.nextInt();
		i=2;
		while(n!=i) {
			while(n%i != 0) {
					i++;
			}
				if (i==n) {
					System.out.print( n + " es el primo m�s cercano");
				}
				else {n++;
				}
		}
		teclado.close();
	}
}
