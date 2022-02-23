
public class Termometro {
		
		private final int valorInicial = 0;
		private final int valorMax = 100;
		private final int valorMin = (-100);
		private int valorVariable;
		
	public Termometro() {
			
		this.valorVariable = valorInicial;
			
	}

	public int getValorVariable() {
		return valorVariable;
	}

	public void setValorVariable(int valorVariable) {
		this.valorVariable = valorVariable;
	}
	
	public void cambiarTemp() {
	
		System.out.println("Que temperatura hace?");
		
	}
	
	
}
