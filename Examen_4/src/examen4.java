import java.util.Scanner;
/**Programa que solicite introducir un correo electrónico hasta que sea válido.
*
*/
/** @author Ángel Pavón Fraile
* 
*/
public class examen4 {
 
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
       
        String local = "";
        String dominio = "";
        boolean corrector = false;
       
        do {
            System.out.print ("Introduce la parte local: ");
            local = teclado.nextLine();
           
            if (local.length() <= 64) {
                for (int i=0; i < local.length(); i++) {
                    char caracter = local.charAt(i);
                    if ((caracter >= 'A' && caracter <= 'Z') || (caracter >= 'a' && caracter <= 'z') || caracter == '-' || 
                    	 caracter == '_' || (caracter >= '0' && caracter <= '9')) {
                       corrector = true;
                    } 
                    else {
                    	if(caracter == '.' && (i != 0 && i != (local.length()-1) && caracter != (local.charAt(i-1)))) {
                    		corrector = true;
                    	}
                    	else{
                    		System.out.println ("Has introducido mal la parte local");
                    		System.out.println("Sólo caracteres A-Z, a-z, - y _ o . siempre que no hayan 2 seguidos o estén "
                    				+ "al principio o al final");
                    		corrector = false;
                    		i = local.length();
                    	}
                    }
                }
            if(corrector == true) {   
                System.out.print ("Introduce la parte del dominio: ");
                dominio = teclado.nextLine();
               
                for (int j=0; j < dominio.length(); j++) {
                    char character = dominio.charAt(j);
                    if ((character >= 'A' && character <= 'Z') || (character >= 'a' && character <= 'z') || character == '-' || 
                    	(character >= '0' && character <= '9')) {
                       corrector = true;
                    } 
                    else {
                    	if(character == '.' && (j != 0 && j != (dominio.length()-1) && character != (dominio.charAt(j-1)))) {
                    		corrector = true;
                    	}
                    	else{
                    		System.out.println ("Has introducido mal la parte dominio");
                    		System.out.println("Sólo caracteres A-Z, a-z, - o . siempre que no hayan 2 seguidos o estén "
                    				+ "al principio o al final");
                    		corrector = false;
                    		j = dominio.length();
                    	}
                    }
                }
            }
          }
        } while (corrector == false);
       
       System.out.print (local + '@' + dominio + " es válida");
       teclado.close();
    }
}
