
public class Album {

		private String [] coleccion = new String[100];
		private int indice;
		
		public Album(){
			indice = 0;
			this.coleccion [indice] = Disco.getNombre();
		}
}
