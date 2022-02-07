public class ListaDisco {
	
		private  static String [] listaDisco;
		private  static int indice;
		
		public ListaDisco() {
			
			ListaDisco.listaDisco = new String [100];
			ListaDisco.indice = 0;
		}

		
		public String [] getListaDisco() {
			
			return listaDisco;
		}

		
		public static void setListaDisco(String [] listaDisco,int x) {
			x = 0;
			ListaDisco.listaDisco [x] = new String (Disco.nombre);
				x++;
				indice++;
		}
		

		public int getIndice() {
			
			return indice;
		}

		
		public void setIndice(int indice) {
			
			ListaDisco.indice = indice;
		}
}
