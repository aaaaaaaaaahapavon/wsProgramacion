/**Programa que lee un vector de 10 comp. y calcula el mayor, menor y donde se encuentran estos.
 * 
 */

/**
 * @author �ngel Pav�n
 *
 */
public class array3 {

	public static void main(String[] args) {
			
		int [] secuencia = new int [10];
		int i = 0;
		int mayor = 0,menor = 1000000; 
		int posi_mayor = 0, posi_menor = 0;
		
		for(i = 0; i<secuencia.length; i++) {
			//genera n�meros, los agrega al vector y los muestra
			secuencia[i] = (int) (Math.random()*10);
			System.out.print(secuencia[i]);
		}
		//comprueba uno por uno los n�meros del vector y guarda la posici�n si es el m�s grande o peque�o encontrado 
		for ( int z = 0; z < secuencia.length; z++ ) {
			if ( secuencia[z] > mayor ) {
				mayor = secuencia[z];
				posi_mayor = z + 1;
			} 
			if ( secuencia[z] < menor ) {
				menor = secuencia[z];
				posi_menor = z + 1;
			}
		}
		//muestra el mayor y menor n�mero encontrado y sus respectivas posiciones dentro del vector
		System.out.println("\t");
		System.out.println("El n�mero m�s alto es " + mayor + " en la posici�n " + posi_mayor);
		System.out.println("El n�mero m�s bajo  es " + menor + " en la posici�n " + posi_menor);
	}

}
