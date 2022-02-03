/**programa que genera numeros, calcula la media y separa entre mayores, menores e iguales a esta
 * 
 */

/**
 * @author Ángel Pavón Fraile
 *
 */
public class array1 {

		public static void main(String[] args) {
			
			int [] num = new int[20];
			String mayor = "";
			String menor = "";
			String igual = "";
			int media = 0;
			int contadorma = 0;
			int contadorme = 0;
			int contadorig = 0;
			
			//genera numeros 
			for(int i = 0; i< num.length; i++) {
				
				num[i] = (int) (Math.random()*10);
				media += num[i];
			}
			
			//media 
			media = media/20;
			System.out.println("la media es: " + media);
			
			//separa entre mayores, menor e iguales a la media
			for (int i=0; i<num.length;i++) {
				if (num[i]> media) { //mayores
					contadorma++;
					mayor += num[i] + ",";
				}
				else if (num[i]< media) { //menores 
					contadorme++;
					menor += num[i]+ ",";
				}
				else if (num [i] == media){ //iguales
					contadorig++;
					igual += num[i]+ ",";
				}
			}
			
			//salida datos
			System.out.println("Hay " + contadorma + " números superiores a la media");
			System.out.println("Los números superiores a la media son: " + mayor);
			
			System.out.println("Hay " + contadorme + " números inferior a la media");
			System.out.println("Los números inferior a la media son: " + menor);
			
			System.out.println("Hay " + contadorig + " números igual a la media");
			System.out.println("Los números igual a la media son: " + igual);
	}

}
