package basicos;

public class Arco
{
	private boolean dirigido;
	private boolean conPeso;
	private int peso;
	private Nodo nodo1;
	private Nodo nodo2;
	
	public Arco() {
		
	}
	
	
	
	public Nodo getNodo1() {
		return nodo1;
	}



	public void setNodo1(Nodo nodo1) {
		this.nodo1 = nodo1;
	}



	public Nodo getNodo2() {
		return nodo2;
	}



	public void setNodo2(Nodo nodo2) {
		this.nodo2 = nodo2;
	}



	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public boolean isDirigido() {
		return dirigido;
	}
	public void setDirigido(boolean dirigido) {
		this.dirigido = dirigido;
	}
	public boolean isConPeso() {
		return conPeso;
	}
	public void setConPeso(boolean conPeso) {
		this.conPeso = conPeso;
	}
	
	@Override
	public String toString()
	{
		String texto = "El arco es " + 
				( !isDirigido() ? "no ": "" ) +"dirigido, "+
				( !isConPeso()  ? "no tiene peso,": "pesa " +getPeso()+ ", " )+
				"y va de " +nodo1+ " a " +nodo2;
		
		return texto;
	}
	
	
}
