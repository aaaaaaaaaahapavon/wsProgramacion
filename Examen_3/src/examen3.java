<<<<<<< HEAD
import java.util.Scanner;
/** Programa que hace cosas
 * 
 */

/**
 * @author ?ngel Pav?n Fraile
 *
 */
public class examen3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int d,m,a,reserva, diasM = 0, dActual, mActual, aActual, totalDias=0;
		
		System.out.println("Introduce el dia de nacimiento: ");
		d = teclado.nextInt();
		System.out.println("Introduce el mes de nacimiento(numero): ");
		m = teclado.nextInt();
		System.out.println("Introduce el a?o de nacimiento: ");
		a = teclado.nextInt();
		System.out.println("Introduce el dia actual: ");
		dActual = teclado.nextInt();
		System.out.println("Introduce el mes actual: ");
		mActual = teclado.nextInt();
		System.out.println("Introduce el a?o actual: ");
		aActual = teclado.nextInt();
		
		if(a==aActual) {
			totalDias -=365;
		if(a<=aActual) {
		reserva = m;
		m++;
		while(m<=12) {
			switch(m) {
			 case 1: totalDias += 31;break;
			 case 2: 
				 if(a%4==0) {
					 totalDias +=29;
				 }
				 else{
					 totalDias +=28;
					 };
				break;
			 case 3: totalDias += 31;break;
			 case 4: totalDias += 30;break;
			 case 5: totalDias += 31;break;
			 case 6: totalDias += 30;break;
			 case 7: totalDias += 31;break;
			 case 8: totalDias += 31;break;
			 case 9: totalDias += 30;break;
			 case 10: totalDias += 31;break;
			 case 11: totalDias += 30;break;
			 case 12: totalDias += 31;break;
			}
			m++;
		}
		m = reserva;
		switch(m){
		 case 1: diasM = 31;break;
		 case 2: 
			 if(a%4==0) {
				 diasM =29;
			 }
			 else{
				 diasM = 28;
				 };
			break;
		 case 3: diasM= 31;break;
		 case 4: diasM= 30;break;
		 case 5: diasM= 31;break;
		 case 6: diasM= 30;break;
		 case 7: diasM= 31;break;
		 case 8: diasM= 31;break;
		 case 9: diasM= 30;break;
		 case 10: diasM= 31;break;
		 case 11: diasM= 30;break;
		 case 12: diasM= 31;break;
		}
		totalDias += (diasM-d);
		
		a++;
		while(a<aActual) {
			if(a%4==0) {
				totalDias+= 366;	
			}
			else {
				totalDias += 365;
			}
			a++;
		}
		//a?o 2021
		reserva = mActual;
		mActual--;
		while(mActual>=1) {
			switch(mActual) {
			 case 1: totalDias += 31;break;
			 case 2: 
				 if(a%4==0) {
					 totalDias +=29;
				 }
				 else{
					 totalDias +=28;
					 };
				break;
			 case 3: totalDias += 31;break;
			 case 4: totalDias += 30;break;
			 case 5: totalDias += 31;break;
			 case 6: totalDias += 30;break;
			 case 7: totalDias += 31;break;
			 case 8: totalDias += 31;break;
			 case 9: totalDias += 30;break;
			 case 10: totalDias += 31;break;
			 case 11: totalDias += 30;break;
			 case 12: totalDias += 31;break;
			}
			mActual--;
		}
		}
			totalDias += dActual;
			System.out.println("El total de dias transcurridos es: " + totalDias);
		}
		else { System.out.println("IQ de las tardes");}
		teclado.close();
	}
}
=======
import java.util.Scanner;
/** Programa que hace cosas
 * 
 */

/**
 * @author ?ngel Pav?n Fraile
 *
 */
public class examen3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int d,m,a,reserva, diasM = 0, dActual, mActual, aActual, totalDias=0;
		
		System.out.println("Introduce el dia de nacimiento: ");
		d = teclado.nextInt();
		System.out.println("Introduce el mes de nacimiento(numero): ");
		m = teclado.nextInt();
		System.out.println("Introduce el a?o de nacimiento: ");
		a = teclado.nextInt();
		System.out.println("Introduce el dia actual: ");
		dActual = teclado.nextInt();
		System.out.println("Introduce el mes actual: ");
		mActual = teclado.nextInt();
		System.out.println("Introduce el a?o actual: ");
		aActual = teclado.nextInt();
		
		if(a==aActual) {
			totalDias -=365;
		if(a<=aActual) {
		reserva = m;
		m++;
		while(m<=12) {
			switch(m) {
			 case 1: totalDias += 31;break;
			 case 2: 
				 if(a%4==0) {
					 totalDias +=29;
				 }
				 else{
					 totalDias +=28;
					 };
				break;
			 case 3: totalDias += 31;break;
			 case 4: totalDias += 30;break;
			 case 5: totalDias += 31;break;
			 case 6: totalDias += 30;break;
			 case 7: totalDias += 31;break;
			 case 8: totalDias += 31;break;
			 case 9: totalDias += 30;break;
			 case 10: totalDias += 31;break;
			 case 11: totalDias += 30;break;
			 case 12: totalDias += 31;break;
			}
			m++;
		}
		m = reserva;
		switch(m){
		 case 1: diasM = 31;break;
		 case 2: 
			 if(a%4==0) {
				 diasM =29;
			 }
			 else{
				 diasM = 28;
				 };
			break;
		 case 3: diasM= 31;break;
		 case 4: diasM= 30;break;
		 case 5: diasM= 31;break;
		 case 6: diasM= 30;break;
		 case 7: diasM= 31;break;
		 case 8: diasM= 31;break;
		 case 9: diasM= 30;break;
		 case 10: diasM= 31;break;
		 case 11: diasM= 30;break;
		 case 12: diasM= 31;break;
		}
		totalDias += (diasM-d);
		
		a++;
		while(a<aActual) {
			if(a%4==0) {
				totalDias+= 366;	
			}
			else {
				totalDias += 365;
			}
			a++;
		}
		//a?o 2021
		reserva = mActual;
		mActual--;
		while(mActual>=1) {
			switch(mActual) {
			 case 1: totalDias += 31;break;
			 case 2: 
				 if(a%4==0) {
					 totalDias +=29;
				 }
				 else{
					 totalDias +=28;
					 };
				break;
			 case 3: totalDias += 31;break;
			 case 4: totalDias += 30;break;
			 case 5: totalDias += 31;break;
			 case 6: totalDias += 30;break;
			 case 7: totalDias += 31;break;
			 case 8: totalDias += 31;break;
			 case 9: totalDias += 30;break;
			 case 10: totalDias += 31;break;
			 case 11: totalDias += 30;break;
			 case 12: totalDias += 31;break;
			}
			mActual--;
		}
		}
			totalDias += dActual;
			System.out.println("El total de dias transcurridos es: " + totalDias);
		}
		else { System.out.println("IQ de las tardes");}
		teclado.close();
	}
}
>>>>>>> a08b2dc4e65cc1163ce2377c2240653af2eb5cc6
