import java.util.Scanner;
/** Juego de adivinanzas, se genera un n�mero random y te pide n�meros hasta que lo adivines. Tienes 7 intentos.
 * Dependiendo de si el n�mero es mayor o menor que el generado, te dice si dicho n�mero es m�s grande o m�s peque�o
 */

/**
 * @author �ngel Pav�n Fraile
 *
 */
public class ev2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double x;
		int i;
		int contador = 7;
		int n;
		x = Math.random() *50;
		n=(int)x;
		do {
			System.out.println("Su n�mero: ");
			i = teclado.nextInt();
			if(i>n) {
				System.out.println("M�s peque�o");
			}
			else if(i<n) {
				System.out.println("M�s grande");
			}
			contador--;
		}while(contador > 0 && n!=i);
		if(n==i) {
			System.out.println("Has acertado!");
		}
		else {
			System.out.println("Has perdido...");
		}
		teclado.close();
	}
}
