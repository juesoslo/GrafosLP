package fabricagrafos;

import agregadorarcos.AgregadorArcos;
import basicos.Arco;
import basicos.Nodo;

public abstract class FabricaGrafos
{
	private AgregadorArcos agregadorArcos;
	
	public Nodo createNodo(String nombre)
	{
		return new Nodo(nombre);
	}
	
	public abstract Arco createArco(Nodo nodo1, Nodo nodo2);
	public abstract Arco createArco(Nodo nodo1, Nodo nodo2, int peso);

	public AgregadorArcos getAgregadorArcos() {
		return agregadorArcos;
	}

	public void setAgregadorArcos(AgregadorArcos agregadorArcos) {
		this.agregadorArcos = agregadorArcos;
	}
}
