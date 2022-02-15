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

		public void setConjunto(int n) {
			do {
				if(esUnico()==true) {
					this.conjunto [n] = this.num;
				}
				else if(esUnico()==false){
					setNum();
				}
			}while(esUnico()==false);
		}
			
		public int getNum() {
			return num;
		}

		public void setNum() {
			this.num = (int) (Math.random()*100);;
		}
		public void mostrarElementos(int i){
			System.out.println(conjunto[i]);
			
		}
		
		public boolean esUnico() {
			boolean found = false;
			for(int n = 0; n<conjunto.length; n++) {
				if (this.conjunto [n]!= this.getNum()) {
					found = true;
				}
				else found = false;
			}
			if(found == false) {
				return false;
			}
			else return true;
		}


		
}
