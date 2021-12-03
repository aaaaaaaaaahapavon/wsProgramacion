import java.util.Scanner;

/**Programa que lee una frase de no mas de 80 caracteres
 * y construye otras 2 cadenas, 1 contiene los caracteres en posicion par
 * y la otra cadena los caracteres en posicion impar.
 * 
 */

/**
 * @author alu
 *
 */
public class cadenas5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.print("Introduce una frase de de menos de 80 caracteres");
		Scanner teclado=new Scanner (System.in);
		String p=teclado.nextLine();
		if (p.length() <=80) {
			String par="";
			String impar="";
			int contador;
				for (int x=0;x<p.length();x++) {
					contador= x;
					par+=p.charAt(x);
					contador++;
					impar+= p.charAt(contador);
					x++;}
				System.out.println("par: " + par);
				System.out.println("impar: "+ impar);
		}
		teclado.close();
	}

}

