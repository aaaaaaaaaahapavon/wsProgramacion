import java.util.Scanner;
/**Programa que muestra por pantalla todos los primos hasta el número que introduces por teclado.
 * 
 * @author alu
 *
 */
public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
			int numero;
			
			System.out.println("Introduce número: ");
			numero =teclado.nextInt();
			
			if(comprobarPositivo(numero)==true) {
				System.out.println(cadenaPrimos(numero));
			}
			else {
				System.out.println("El número debe ser mayor que 0");
			}
		
		teclado.close();
	}
	
	static public boolean comprobarPositivo(int num) {
    	if (num> 0) {
    		
    			return true;
    		
    		} else {
    		
    			return false;
    	}
    }
	
	public static boolean comprobarPrimo(int num) {
		boolean esPrimo = true;
		for(int cont = 2; cont<num; cont++) {
			if(num%cont==0) {
				esPrimo = false;
			}
		}
		return esPrimo;
	}
	
	public static String cadenaPrimos(int num) {
		String secuenciaNum = "";
		int contador;
		for(contador = 1; contador<num; contador++) {
			if(comprobarPrimo(contador)==true) {
				secuenciaNum += contador + " ";
			}
		}
		return secuenciaNum;
	}
}
