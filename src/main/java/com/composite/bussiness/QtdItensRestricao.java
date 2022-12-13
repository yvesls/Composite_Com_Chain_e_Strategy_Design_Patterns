package com.composite.bussiness;

public class QtdItensRestricao extends RestricoesAbstract{

	public QtdItensRestricao(Componente item, Caixa caixa) {
		super(item, caixa);
	}

	@Override
	public void processar() {
		if(this.caixa.getQtdItens()+1 > this.caixa.getQtdItensSuportado()) {
			String[] itemRejeitado = {"Item: " + this.item.getNome(), "Motivo: Quantidade de itens ultrapassa o limite suportado."};
			this.caixa.addItemRejeitado(itemRejeitado);
		}
	}

}
