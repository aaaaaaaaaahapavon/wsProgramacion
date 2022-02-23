import java.util.Scanner;



public class Principal {
		
		static int Q = 0,P = 0;
		static boolean MCD = false;
	
	public static void main(String[] args) {
			
			introducirDatos();
			System.out.println(minComunMult());
			
	}
	
	 static public void introducirDatos() {
	    	
	    	Scanner teclado = new Scanner(System.in);
	    	
	    	System.out.println("Introduce primer número: ");
	    	Q = teclado.nextInt();
	    	
	    	System.out.println("Introduce segundo número: ");
	    	P = teclado.nextInt();
	    	
	    	teclado.close();
	    }
	 public static int maximoComunDivisor() {
		
		 int menor = Math.min(Q, P); //pilla el menor
		 
		 while( !MCD && menor >= 1) {
			 
			 if ( P%menor == 0 && Q%menor ==0) {
				 
				 MCD = true;
			 }
			 else menor--;
		 }	 
		 return menor;
	}
	 
	 public static int minComunMult() {
		 return (Q * P) / maximoComunDivisor();
	 }
	 
}