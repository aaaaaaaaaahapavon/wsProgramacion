public class Conjunto {
		
		private int num;
		private int [] conjunto;
		
		public Conjunto() {
			
			this.conjunto = new int [100];
			this.num = 0;
		}

		public int [] getConjunto() {
			return conjunto;
		}

		public void setConjunto() {
			int i = 0;
			this.conjunto [i] = this.num;
			i++;
		}

		public int getNum() {
			return num;
		}

		public void setNum(int num) {
			this.num = (int) (Math.random()*100);;
		}
		public void mostrarElementos(){
			int i = 0;
			System.out.println(conjunto[i]);
			
		}
		
		public boolean esUnico() {
			boolean found = false;
			for(int n = 0; n<conjunto.length; n++) {
				if (conjunto [n]==num) {
					found = false;
				}
				else found = true;
			}
			if(found == false) {
				return false;
			}
			else return true;
		}


		
}
