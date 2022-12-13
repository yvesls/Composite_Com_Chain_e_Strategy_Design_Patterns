package com.composite.bussiness;

public class CaixaPlusBuilder extends CaixaBuilder {

	@Override
	public void criaCaixa() {
		String[] tiposSuportados = 	{"Caixa", "Produto"};
		this.componente = new Caixa("Caixa Plus", 5.0, 150.0, 5500.0, 360.0, "Caixa", tiposSuportados, 8);
	}

	@Override
	public void addComestiveis() {
		this.componente.add(new Produto("Pannetone Bauducco", 17.5, 300.0, 30.0, "Produto"));
		this.componente.add(new Produto("Peru Perdigão", 30.0, 3000.0, 100.0, "Produto"));
	}

	@Override
	public void addBebidas() {
		this.componente.add(new Produto("Sidra", 12.5, 1000.0, 50.0, "Produto"));
	}

	@Override
	public void addOutros() {
		String[] tiposSuportados = {"Produto"};
		Caixa caixa = new Caixa("Caixa de Bombons", 2.0, 30.0, 250.0, 100.0, "Caixa", tiposSuportados, 8);
		this.componente.add(caixa);
		caixa.add(new Produto("Bombom Sortido", 1.0, 25.0, 2.0, "Produto"));
		caixa.add(new Produto("Bombom Sortido", 1.0, 25.0, 2.0, "Produto"));
		caixa.add(new Produto("Bombom Sortido", 1.0, 25.0, 2.0, "Produto"));
		caixa.add(new Produto("Bombom Sortido", 1.0, 25.0, 2.0, "Produto"));
		caixa.add(new Produto("Bombom Sortido", 1.0, 25.0, 2.0, "Produto"));
		caixa.add(new Produto("Bombom Sortido", 1.0, 25.0, 2.0, "Produto"));
		caixa.add(new Produto("Bombom Sortido", 1.0, 25.0, 2.0, "Produto"));
		caixa.add(new Produto("Bombom Sortido", 1.0, 25.0, 2.0, "Produto"));
	}
}
