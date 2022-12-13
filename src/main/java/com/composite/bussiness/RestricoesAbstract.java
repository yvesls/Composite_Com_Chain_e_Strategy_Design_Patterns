package com.composite.bussiness;

public abstract class RestricoesAbstract {
	protected Componente item;
	protected Caixa caixa;
	
	public RestricoesAbstract(Componente item, Caixa caixa) {
		this.item = item;
		this.caixa = caixa;
	}
	
	public abstract void processar();
}
