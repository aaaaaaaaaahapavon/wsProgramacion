public class Empleado {

		private static String nombre;	
		public Empleado(){
			
				Empleado.nombre = "";
		}
		
		public void setNombre() {
				String [] listaNombre = { "Andrea", "David", "Baldomero", "Balduino", "Baldwin", "Baltasar", "Barry", "Bartolo",
					"Bartolomé", "Baruc", "Baruj", "Candelaria", "Cándida", "Canela", "Caridad", "Carina", "Carisa",
					"Caritina", "Carlota", "Baltazar"};
				
				String [] apellido = { "Gomez", "Guerrero", "Cardenas", "Cardiel", "Cardona", "Cardoso", "Cariaga", "Carillo",
						"Carion", "Castiyo", "Castorena", "Castro", "Grande", "Grangenal", "Grano", "Grasia", "Griego",
						"Grigalva" };

			
				Empleado.nombre= listaNombre[(int)Math.random()*20] + apellido [(int)Math.random()*20];
		}
		public static String getNombre(){
			
				return nombre;
		}
		
}
