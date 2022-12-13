package com.composite.bussiness;

public class TipoRestricao extends RestricoesAbstract{

	public TipoRestricao(Componente item, Caixa caixa) {
		super(item, caixa);
	}

	@Override
	public void processar() {
		int verifica = 0;
		for(String cx : this.caixa.getTipoSuportado()) {
			if(cx.equals(this.item.getTipo())) {
				verifica++;
			}
		}
		if(verifica == 0) {
			String[] itemRejeitado = {"Item: " + this.item.getNome(), "Motivo: Tipo não suportado."};
			this.caixa.addItemRejeitado(itemRejeitado);
		}
	}
}
