import java.util.Arrays;
public class Album {
	
		private static String [] listaDisco = new String [100];;
		private static int indice;
		static Disco disco = new Disco(Disco.getNombre());
		
		public Album(int i) {
			Arrays.fill(Album.listaDisco,"");
			Album.indice = 0;
		}

		public static String[] getListaDisco() {
			return listaDisco;
		}

		public static void setListaDisco(String[] listaDisco) {
			Album.listaDisco = listaDisco;
		}

		public static int getIndice() {
			return indice;
		}

		public static void setIndice(int indice) {
			Album.indice = indice;
		}
		
		static public void AñadirDiscoAlbum() {
			listaDisco [indice] = Disco.getNombre();
		}
		
		public static String getDiscoAlbum(int indice) {
			indice = Album.indice;
			return listaDisco [indice];
		}

		
}
