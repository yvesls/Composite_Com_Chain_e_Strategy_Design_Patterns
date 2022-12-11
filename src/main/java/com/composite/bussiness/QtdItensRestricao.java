package com.composite.bussiness;

public class QtdItensRestricao extends RestricoesAbstract{

	public QtdItensRestricao(Componente item, Caixa caixa) {
		super(item, caixa);
	}

	@Override
	public void processar() throws Exception {
		if(this.caixa.getQtdItens()+1 > this.caixa.getQtdItensSuportado()) {
			throw new Exception("A quantidade de itens da caixa passou do limite suportado.");
		}
	}

}
