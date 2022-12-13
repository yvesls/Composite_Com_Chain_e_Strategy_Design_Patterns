package com.composite.bussiness;

public class PesoRestricao extends RestricoesAbstract{

	public PesoRestricao(Componente item, Caixa caixa) {
		super(item, caixa);
	}

	@Override
	public void processar() {
		if((this.caixa.getPeso()+this.item.getPeso()) > this.caixa.getPesoSuportado()) {
			String[] itemRejeitado = {"Item: " + this.item.getNome(), "Motivo: Peso ultrapassa o limite suportado."};
			this.caixa.addItemRejeitado(itemRejeitado);
		}
	}
}
