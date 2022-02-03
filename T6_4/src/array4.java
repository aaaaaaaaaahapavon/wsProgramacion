/**Programa que genera dos vectores [10] aleatorios y comprueba cuantas veces se repiten los números del primero
 * en el segundo 
 * 
 */

/**
 * @author Ángel Pavón
 *
 */
public class array4 {

	public static void main(String[] args) {
		
		int [] v1 = new int [10];
		int [] v2 = new int [10];
		int i = 0; //cont generador
		int v_1 = 0; //posicion vectores
		int v_2 = 0; //posicion vectores
		int k = 0; //pos vector contador
		int [] contador = {0,0,0,0,0};
		
		
		
		for(i = 0; i<10 ;i++) {
			
			v1 [i] = (int) (Math.random()*5 + 1);
			v2 [i] = (int) (Math.random()*5 + 1);
			System.out.print("a");
		}
		
		for(int n = 0; n < v1.length; n++ ) {
			do {
				v_2 = 0;
				do {
					if(v1[v_1] == v2[v_2]) {
						contador[k] = contador[k] + 1 ;
					}
					v_2++;
					}while(v_2 < v2.length);
				v_1++;
			}while(v_1<v1.length);
			}
		for(int q = 0; q<contador.length; q++) {
			System.out.println("El número de veces que esta el número "+ q+1 + " es: " + contador[q] );
		}
		}
	}

