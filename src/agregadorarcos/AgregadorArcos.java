package agregadorarcos;

import basicos.Arco;
import basicos.Nodo;

public interface AgregadorArcos
{
	public abstract Arco addArco(Nodo nodo1, Nodo nodo2);
	public abstract Arco addArco(Nodo nodo1, Nodo nodo2, int peso);
}
