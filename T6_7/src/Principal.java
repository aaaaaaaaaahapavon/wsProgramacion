/**
 * 
 */

public class Principal {

	public static void main(String[] args) {
		
		Conjunto conjunto = new Conjunto();
		for(int i = 0; i<100;i++) {
			if(conjunto.esUnico()== true) {
				conjunto.setNum(0);
				conjunto.setConjunto();
				conjunto.mostrarElementos();
			}
			else i--;
	}
	}
}