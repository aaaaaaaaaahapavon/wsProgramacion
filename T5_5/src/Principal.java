import java.util.Scanner;

/**Programa que calcula el mcd de dos n�meros introducidos por teclado.
 * 
 * @author alu
 *
 */
public class Principal {
			
		static int Q = 0,P = 0;
		static boolean MCD = false;
	
	public static void main(String[] args) {
			
			introducirDatos();
			maximoComunDivisor();
			
	}
	
	 static public void introducirDatos() {
	    	
	    	Scanner teclado = new Scanner(System.in);
	    	
	    	System.out.println("Introduce primer n�mero: ");
	    	Q = teclado.nextInt();
	    	
	    	System.out.println("Introduce segundo n�mero: ");
	    	P = teclado.nextInt();
	    	
	    	teclado.close();
	    }
	 public static void maximoComunDivisor() {
		
		 int menor = Math.min(Q, P); //pilla el menor
		 
		 while( !MCD && menor >= 1) {
			 
			 if ( P%menor == 0 && Q%menor ==0) {
				 System.out.println("El MCD es:" + menor);
				 MCD = true;
			 }
			 else menor--;
		 }
		 
	}
	 
}

