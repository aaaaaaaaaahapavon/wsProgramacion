import java.util.Scanner;
/** lee una palabra y a?ade una letra de dicha palabra cada linea hasta completarla.
 */

/**
 * @author ?ngel Pav?n Fraile
 *
 */
public class ejercicio1 {

	public static void main(String[] args) {
		System.out.print("Introduce una oraci?n de menos de 80 caracteres");
		Scanner teclado = new Scanner(System.in);
		String p = teclado.nextLine();
		int x;
		
		if (p.length()<=80) {
			for(x=0;x<=p.length();x++) {
			System.out.println(p.substring(0,x));
			}
		}
		else {
			System.out.print("creo haber dicho menos de 80 caracteres");
		}
		teclado.close();
	}
}
