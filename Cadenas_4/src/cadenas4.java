import java.util.Scanner;
/** lee una oración y una palabra y muestra la posición de la palabra dentro de la oración, si no está muestra 0
 */

/**
 * @author Ángel Pavón Fraile
 *
 */
public class cadenas4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int x;
		
		System.out.print("Introduce una oración de como mucho 80 caracteres: ");
		String p = teclado.nextLine();
		System.out.print("Elige entre mayusculas (1) o minusculas (2)");
		x = teclado.nextInt();
		if(p.length()<=80) {
			switch(x) {
			case 1:System.out.print(p.toUpperCase());break;
			case 2:System.out.print(p.toLowerCase());break;
			default: System.out.print("Prueba otra vez");
		
			}
		}
		else System.out.print("error404");
		teclado.close();
	}
}
