import java.util.Scanner;
/** lee una palabra y añade una letra de dicha palabra cada linea hasta completarla.
 */

/**
 * @author Ángel Pavón Fraile
 *
 */
public class cadenas1 {

	public static void main(String[] args) {
		System.out.print("Introduce una oración de menos de 80 caracteres");
		Scanner teclado = new Scanner(System.in);
		String p = teclado.nextLine();
		int x;
		
		if (p.length()<=80) {
			for(x=0;x<=p.length();x++) //cuenta caracteres {
			System.out.println(p.substring(0,x)); //muestra los caracteres desde el primero
			//hasta el número dado
			}
		else{
			System.out.print("creo haber dicho menos de 80 caracteres");
		}
		teclado.close();
	}
}
