import java.util.Scanner;

/**Lee N n�meros hasta que lea un 0, realiza y muestra la suma de los que estan en lugar par 
 * y lo mismo para los de lugar impar
 */

/**
 * @author �ngel Pav�n Fraile
 *
 */
public class ejercicio6 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int p, i;
		int sumapares = 0;
		int sumaimpares = 0;
		
		do {
			System.out.print("Ingrese n�mero: ");
			i= teclado.nextInt();
			System.out.print("Ingrese n�mero: ");
			p= teclado.nextInt();
			sumapares += p;
			sumaimpares += i;
				
		} while (i!= 0 && p!=0);
		
		 System.out.println("La suma de los n�meros en lugar par es: " + sumapares);
		 System.out.println("La suma de los n�meros en lugar impar es: " + sumaimpares);
		 teclado.close();

	}

}
