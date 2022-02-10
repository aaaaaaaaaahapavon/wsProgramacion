
public class Empleado {
		
		private String nombre;
		private float sueldo;
		
		public Empleado() {
			this.nombre = "";
			this.sueldo = 0;
		}

		/**
		 * @return the nombre
		 */
		public String getNombre() {
			return nombre;
		}

		/**
		 * @param nombre the nombre to set
		 */
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		/**
		 * @return the sueldo
		 */
		public float getSueldo() {
			return sueldo;
		}

		/**
		 * @param sueldo the sueldo to set
		 */
		public void setSueldo(float sueldo) {
			this.sueldo = sueldo;
		}
		
		public void setTodo(String nombre, float sueldo) {
			this.nombre = nombre;
			this.sueldo = sueldo;
		}
		public String impNombre() {
			return "\n\t\tNOMBRE " + nombre;
		}
		public String impSueldo() {
			return "\n\t\tSUELDO " + sueldo;
		}
		public String impTodo() {
			return impNombre() + impSueldo();
		}
}
