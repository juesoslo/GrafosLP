package agregadorarcos;

import basicos.Arco;
import basicos.Nodo;

public class AgregadorArcosConPeso implements AgregadorArcos
{

	@Override
	public Arco addArco(Nodo nodo1, Nodo nodo2) {
		return null;
	}

	@Override
	public Arco addArco(Nodo nodo1, Nodo nodo2, int peso) {
		Arco arco = new Arco();
		arco.setNodo1(nodo1);
		arco.setNodo2(nodo2);
		arco.setPeso(peso);
		return arco;
	}

}
