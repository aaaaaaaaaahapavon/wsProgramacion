import java.util.Scanner;
/**Programa que identifica si un n�mero es primo o no
*
*/
/** @author �ngel Pav�n Fraile
* 
*/
public class ej2 {
 
	 static int p, q, i , contP = 0 , contQ = 0;
	
    public static void main(String[] args) {
    	
    	leerNum();
    	
    	if (comprobarPositivo()){
    		
    		contarDivisores();
    		comprobarMayor();
    	}
    	else {
    		System.out.println("error");
    	}
	}
    
    static public void leerNum() {
    	Scanner teclado = new Scanner (System.in);
    	System.out.println("Introduce primer n�mero: ");
    	p = teclado.nextInt();
    	System.out.println("Introduce segundo n�mero: ");
    	q = teclado.nextInt();
    	teclado.close();
    }
    
    static public boolean comprobarPositivo() {
    	if (p > 0 && q > 0) {
    		
    			return true;
    		
    		} else {
    		
    			return false;
    	}
    }
    
    static public void contarDivisores() {
    	i=1;
		while(i<p) {
				if(p%i == 0) {
					contP ++;
				}
				
				i++;
		}
		
		i=1;
		while(i<q) {
			if(q%i == 0) {
					contQ ++;
			}
					
			i++;
		}
	}
	static public void comprobarMayor( ) {
		if (contP > contQ) {
			System.out.println("El n�mero " + p + " tiene m�s divisores");
		}
		else if (contQ < contP) {
			System.out.println("El n�mero " + q + " tiene m�s divisores");
		}
		else{
			System.out.println("Ambos n�meros tienen el mismo n�mero de divisores");
		}
	}
}		