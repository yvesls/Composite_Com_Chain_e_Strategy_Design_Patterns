package com.composite.bussiness;

public class TipoRestricao extends RestricoesAbstract{

	public TipoRestricao(Componente item, Caixa caixa) {
		super(item, caixa);
	}

	@Override
	public void processar() throws Exception {
		int verifica = 0;
		for(String cx : this.caixa.getTipoSuportado()) {
			if(cx.equals(this.item.getTipo())) {
				verifica++;
			}
		}
		if(verifica == 0) {
			throw new Exception("A caixa não suporta esse tipo de item.");
		}
	}
}
