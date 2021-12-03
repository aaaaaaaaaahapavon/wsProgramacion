import java.util.Scanner;
/** Juego de adivinanzas, se genera un número random y te pide números hasta que lo adivines. Tienes 7 intentos.
 * Dependiendo de si el número es mayor o menor que el generado, te dice si dicho número es más grande o más pequeño
 */

/**
 * @author Ángel Pavón Fraile
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
			System.out.println("Su número: ");
			i = teclado.nextInt();
			if(i>n) {
				System.out.println("Más pequeño");
			}
			else if(i<n) {
				System.out.println("Más grande");
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
