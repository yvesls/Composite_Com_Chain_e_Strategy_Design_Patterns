package com.composite.bussiness;

public class PesoRestricao extends RestricoesAbstract{

	public PesoRestricao(Componente item, Caixa caixa) {
		super(item, caixa);
	}

	@Override
	public void processar() throws Exception {
		if((this.caixa.getPeso()+this.item.getPeso()) > this.caixa.getPesoSuportado()) {
			throw new Exception("O peso da caixa passou do limite suportado.");
		}
	}
}
