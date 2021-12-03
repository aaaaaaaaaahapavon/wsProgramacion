import java.util.Scanner;
/** Máquina tragaperras, genera números aleatorios y los relaciona con un simbolo hasta 3 simbolos. Si dichos simbolos 
 * corresponden a un premio, se sumará el premio al saldo. El saldo inicial es 10.
 */

/**
 * @author Ángel Pavón Fraile
 *
 */
public class ev3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		final String blanco= "     ";
		int d,m,a,p = 0;
		String diaS="";
		int dias = 6;
		String calendario = "";
		System.out.println("Mes");
		m = teclado.nextInt();
		System.out.println("año");
		a = teclado.nextInt();
		switch(m) {
		case 1: p=31;break;
		case 2: 
			p = 28;
			if((a % 4 == 0) && ((a % 100 != 0) || (a % 400 == 0))){
				p=29;
			}
			break;
		case 3: p =31; break;
		case 4: p =30 ; break;
		case 5: p =31 ; break;
		case 6: p =30 ; break;
		case 7: p =31 ; break;
		case 8: p =31 ; break;
		case 9: p =30 ; break;
		case 10: p =31 ; break;
		case 11: p =30 ; break;
		case 12: p =31 ; break;
		}
		do {
			d=1;
			if ( m <= 2 ) {
				m = m+12;
				a = a-1;
				}
				int pDia = ((d+2*m+3*(m+1)/5+a+a/4-a/100+a/400+2)%7);
			switch(pDia) {
				case 0: diaS = "S";break;
				case 1: diaS = "D";break;
				case 2: diaS = "L";break;
				case 3: diaS = "M";break;
				case 4: diaS = "X";break;
				case 5: diaS = "J";break;
				case 6: diaS = "V";break;					
				
			}
			while(pDia!=dias){
				calendario+=blanco;
				dias--;
			}
			if(diaS.equalsIgnoreCase("D")) {
				calendario+= d + diaS;
			}
			else {
				calendario+= d + diaS + "** ";
			}
			d++;
		}while(d!=p);
		System.out.println(calendario);
		teclado.close();
	}

}
