package agregadorarcos;

import basicos.Arco;
import basicos.Nodo;

public class AgregadorArcosSinPeso implements AgregadorArcos
{

	@Override
	public Arco addArco(Nodo nodo1, Nodo nodo2) {
		Arco arco = new Arco();
		arco.setNodo1(nodo1);
		arco.setNodo2(nodo2);
		return arco;
	}

	@Override
	public Arco addArco(Nodo nodo1, Nodo nodo2, int peso) {
		return null;
	}

}
