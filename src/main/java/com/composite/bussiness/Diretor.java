package com.composite.bussiness;

public class Diretor {
	
	public Caixa Build(CaixaBuilder builder) {
		builder.criaCaixa();
		builder.addComestiveis();
		builder.addBebidas();
		builder.addOutros();
		return builder.getCaixa();
	}
}
