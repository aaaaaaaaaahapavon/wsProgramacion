import java.util.Scanner;

/**Lee N números hasta que lea un 0, realiza y muestra la suma de los que estan en lugar par 
 * y lo mismo para los de lugar impar
 */

/**
 * @author Ángel Pavón Fraile
 *
 */
public class ejercicio6 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int p, i;
		int sumapares = 0;
		int sumaimpares = 0;
		
		do {
			System.out.print("Ingrese número: ");
			i= teclado.nextInt();
			System.out.print("Ingrese número: ");
			p= teclado.nextInt();
			sumapares += p;
			sumaimpares += i;
				
		} while (i!= 0 && p!=0);
		
		 System.out.println("La suma de los números en lugar par es: " + sumapares);
		 System.out.println("La suma de los números en lugar impar es: " + sumaimpares);
		 teclado.close();

	}

}
