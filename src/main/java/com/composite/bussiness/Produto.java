package com.composite.bussiness;

public class Produto extends Componente{

	public Produto(String nome, Double preco, Double peso, Double volume, String tipo) {
		super(nome, preco, peso, volume, tipo);
	}

	@Override
	public String getNome() {
		return this.nome;
	}

	@Override
	public Double getPreco() {
		return this.preco;
	}

	@Override
	public Double getPeso() {
		return this.peso;
	}

	@Override
	public Double getVolume() {
		return this.volume;
	}
}
