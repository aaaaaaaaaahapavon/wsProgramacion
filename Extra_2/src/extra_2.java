/**Serie Fibonacci
 */

/**
 * @author Ángel Pavón Fraile
 *
 */
public class extra_2 {

	public static void main(String[] args) {
		int n = 1;
		int acumulador= 0;
		
	while(n<160000) {
		acumulador += n;
		System.out.println(acumulador);
		n = acumulador;
		}
	}
}

