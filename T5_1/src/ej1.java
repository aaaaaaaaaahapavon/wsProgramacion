import java.util.Scanner;
/**Programa que identifica si un número es primo o no
*
*/
/** @author Ángel Pavón Fraile
* 
*/
public class ej1 {
 
	 static int n, i;
	
    public static void main(String[] args) {
        
    	introducirDatos();
    	
    	if (comprobarMayor0()) {
    		
    		comprobarPrimo();
    		
    	} else {
    		
    		System.out.println("cagaste");
    	}
    	

	}
    
    static public void introducirDatos() {
    	
    	Scanner teclado = new Scanner(System.in);
    	
    	System.out.println("introduce un número: ");
    	n = teclado.nextInt();
    	teclado.close();
    }
    
    static public boolean comprobarMayor0() {
    	
    	if (n > 0) {
    		
    		return true;
    		
    	} else {
    		
    		return false;
    	}
    }
    
    static public void comprobarPrimo() {
    	i=2;
		while(n%i != 0) {
				i++;
		}
			if (i==n) {
				System.out.print( n + " es primo");
			}
			else {System.out.print ( n + " no es primo");
			}
    }
  
}
