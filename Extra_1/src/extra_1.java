/**Serie Fibonacci
 */

/**
 * @author Ángel Pavón Fraile
 *
 */
public class extra_1 {

	public static void main(String[] args) {
		int n = 0;
		int acumulador= 1;
		int conservador;
		
		System.out.println(n);
		System.out.println(acumulador);
	while(n<1600) {
		conservador = acumulador;
		acumulador += n;
		System.out.println(acumulador);
		n=conservador;
		}
	}
}
