import java.util.Scanner;

/**Lee un número N y dice si es primo o no
/**
 * @author Ángel Pavón Fraile
 *
 */
public class ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n, i;
		
		System.out.print("Ingresa número: ");
		n= teclado.nextInt();
		i=2;
		while(n%i != 0) {
				i++;
		}
			if (i==n) {
				System.out.print( n + " es primo");
			}
			else {System.out.print ( n + " no es primo");
			}
			teclado.close();
		}
}
