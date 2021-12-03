import java.util.Scanner;
/** lee una oración y una palabra y muestra la posición de la palabra dentro de la oración, si no está muestra 0
 */

/**
 * @author Ángel Pavón Fraile
 *
 */
public class cadenas3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce una oración: ");
		String p = teclado.nextLine();
		System.out.print("Introduce una palabra: ");
		String s = teclado.nextLine();
	
		System.out.print("La posicion de tu palabra es: " + (p.indexOf(s)+1/**como empieza en 0 se suma 1*/)/**busca la 
		palabra en la oración*/ );
		
		
		teclado.close();
	}
}
