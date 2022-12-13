package com.composite.bussiness;

public class VolumeRestricao extends RestricoesAbstract{

	public VolumeRestricao(Componente item, Caixa caixa) {
		super(item, caixa);
	}

	@Override
	public void processar() {
		if((this.caixa.getVolume()+this.item.getVolume()) > this.caixa.getVolumeSuportado()) {
			String[] itemRejeitado = {"Item: " + this.item.getNome(), "Motivo: Volume ultrapassa o limite suportado."};
			this.caixa.addItemRejeitado(itemRejeitado);
		}
	}

}
