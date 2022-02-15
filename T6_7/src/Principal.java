/**
 * 
 */

public class Principal {

	public static void main(String[] args) {
		Conjunto conjunto = new Conjunto();
		for(int i = 0; i<100;i++) {
				conjunto.setNum();
				conjunto.setConjunto(i);
		}
		for(int i = 0; i<100; i++) {
			
				conjunto.mostrarElementos(i);
		}
	}
}