package com.composite.bussiness;

public class CaixaPremiumBuilder extends CaixaBuilder {

	@Override
	public void criaCaixa() {
		String[] tiposSuportados = 	{"Caixa", "Produto"};
		this.componente = new Caixa("Caixa Premium", 10.0, 230.0, 10000.0, 700.0, "Caixa", tiposSuportados, 8);
	}

	@Override
	public void addComestiveis() {
		this.componente.add(new Produto("Pannetone Cacau Show", 50.5, 700.0, 40.0, "Produto"));
		this.componente.add(new Produto("Peru Sadia", 60.0, 4000.0, 130.0, "Produto"));
	}

	@Override
	public void addBebidas() {
		this.componente.add(new Produto("Champanhe", 70.5, 1000.0, 50.0, "Produto"));
	}

	@Override
	public void addOutros() {
		String[] tiposSuportados = {"Produto"};
		Caixa caixaBombons = new Caixa("Caixa de Bombons", 0.3, 30.0, 230.0, 100.0, "Caixa", tiposSuportados, 8);
		Caixa caixaNozes = new Caixa("Caixa de Nozes", 1.0, 30.0, 220.0, 100.0, "Caixa", tiposSuportados, 6);
		this.componente.add(caixaBombons);
		this.componente.add(caixaNozes);
		
		caixaBombons.add(new Produto("Bombom Sortido", 1.5, 25.0, 2.0, "Produto"));
		caixaBombons.add(new Produto("Bombom Sortido", 1.5, 25.0, 2.0, "Produto"));
		caixaBombons.add(new Produto("Bombom Sortido", 1.5, 25.0, 2.0, "Produto"));
		caixaBombons.add(new Produto("Bombom Sortido", 1.5, 25.0, 2.0, "Produto"));
		caixaBombons.add(new Produto("Bombom Sortido", 1.5, 25.0, 2.0, "Produto"));
		caixaBombons.add(new Produto("Bombom Sortido", 1.5, 25.0, 2.0, "Produto"));
		caixaBombons.add(new Produto("Bombom Sortido", 1.5, 25.0, 1.0, "Produto"));
		caixaBombons.add(new Produto("Bombom Sortido", 1.5, 25.0, 1.0, "Produto"));
		
		caixaNozes.add(new Produto("Noz", 4.0, 18.0, 3.5, "Produto"));
		caixaNozes.add(new Produto("Noz", 4.0, 18.0, 3.5, "Produto"));
		caixaNozes.add(new Produto("Noz", 4.0, 18.0, 3.5, "Produto"));
		caixaNozes.add(new Produto("Noz", 4.0, 18.0, 3.5, "Produto"));
		caixaNozes.add(new Produto("Noz", 4.0, 18.0, 3.5, "Produto"));
		caixaNozes.add(new Produto("Noz", 4.0, 18.0, 3.5, "Produto"));
	}
}
