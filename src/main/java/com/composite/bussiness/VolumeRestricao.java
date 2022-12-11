package com.composite.bussiness;

public class VolumeRestricao extends RestricoesAbstract{

	public VolumeRestricao(Componente item, Caixa caixa) {
		super(item, caixa);
	}

	@Override
	public void processar() throws Exception {
		if((this.caixa.getVolume()+this.item.getVolume()) > this.caixa.getVolumeSuportado()) {
			throw new Exception("O volume da caixa passou do limite suportado.");
		}
	}

}
