package com.composite.bussiness;

public abstract class CaixaBuilder {
	protected Caixa componente;
	
	public abstract void criaCaixa();
	public abstract void addComestiveis();
	public abstract void addBebidas();
	public abstract void addOutros();
	public final Caixa getCaixa() {
		return this.componente;
	}
}
