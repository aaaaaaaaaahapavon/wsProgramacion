import java.util.Scanner;
public class Alumno extends Gestion {
		
		Scanner teclado = new Scanner (System.in);
		
		private String nombre;
		private int edad;
		private String nCurso;
		private int num_asignaturas;
		private int nota;
	
		public Alumno(String nombre, int edad, String nCurso, int num_asignaturas, int nota) {
			
			this.nombre = null;
			this.edad = 0;
			this.nCurso = null;
			this.num_asignaturas = 0;
			this.nota = 0;
		
			}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			nombre = teclado.next();
			this.nombre = nombre;
		}

		public int getEdad() {
			return edad;
		}

		public void setEdad(int edad) {
			edad = teclado.nextInt();
			this.edad = edad;
		}

		public String getnCurso() {
			return nCurso;
		}

		public void setnCurso(String nCurso) {
			nCurso = teclado.next();
			this.nCurso = nCurso;
		}

		public int getNum_asignaturas() {
			return num_asignaturas;
		}

		public void setNum_asignaturas(int num_asignaturas) {
			num_asignaturas = teclado.nextInt();
			this.num_asignaturas = num_asignaturas;
		}

		public int getNota() {
			return nota;
		}

		public void setNota(int nota) {
			nota = teclado.nextInt();
			this.nota = nota;
		}
		
		public String getTodo() {
			return getNombre() + " " + getEdad() + " " + getnCurso() + " " + getNum_asignaturas() + " " + getNota();
		}
}
