/**Programa que lee un vector de 10 comp. y calcula el mayor, menor y donde se encuentran estos.
 * 
 */

/**
 * @author Ángel Pavón
 *
 */
public class array3 {

	public static void main(String[] args) {
			
		int [] secuencia = new int [10];
		int i = 0;
		int mayor = 0,menor = 1000000; 
		int posi_mayor = 0, posi_menor = 0;
		
		for(i = 0; i<secuencia.length; i++) {
			//genera números, los agrega al vector y los muestra
			secuencia[i] = (int) (Math.random()*10);
			System.out.print(secuencia[i]);
		}
		//comprueba uno por uno los números del vector y guarda la posición si es el más grande o pequeño encontrado 
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
		//muestra el mayor y menor número encontrado y sus respectivas posiciones dentro del vector
		System.out.println("\t");
		System.out.println("El número más alto es " + mayor + " en la posición " + posi_mayor);
		System.out.println("El número más bajo  es " + menor + " en la posición " + posi_menor);
	}

}
