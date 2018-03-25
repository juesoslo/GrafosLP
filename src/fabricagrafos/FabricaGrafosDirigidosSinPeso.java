package fabricagrafos;

import agregadorarcos.AgregadorArcosSinPeso;
import basicos.Arco;
import basicos.Nodo;

public class FabricaGrafosDirigidosSinPeso extends FabricaGrafos {
	
	public FabricaGrafosDirigidosSinPeso() {
		setAgregadorArcos(new AgregadorArcosSinPeso());
	}

	@Override
	public Arco createArco(Nodo nodo1, Nodo nodo2) {
		Arco arco = getAgregadorArcos().addArco(nodo1, nodo2);
		arco.setConPeso(false);
		arco.setDirigido(true);
		return arco;
	}

	@Override
	public Arco createArco(Nodo nodo1, Nodo nodo2, int peso) {
		return null;
	}

}
