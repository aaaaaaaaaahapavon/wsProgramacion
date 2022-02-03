/**
 * 
 */

/**
 * @author Ángel Pavón Fraile
 *
 */
public class array2 {

		public static void main(String[] args) {
			
			int [] v1 = new int[10];
			int [] v2 = new int[10];
			int [] v3 = new int[10];


			//genera numeros para v1
			for(int i = 0; i< v1.length; i++) {
				v1[i] = (int) (Math.random()*10);			}
			//genera numeros para v2
			for(int i = 0; i< v2.length; i++) {
				v2[i] = (int) (Math.random()*10);			}

			//suma los vectores, y guarda el resultado en v3. Luego lo muestra
			for(int i = 0; i< v1.length; i++) {
			v3[i] = v1[i] + v2[i];
			System.out.println(v3[i]);
			}
}
}
