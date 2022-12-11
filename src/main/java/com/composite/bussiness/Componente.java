package com.composite.bussiness;

public abstract class Componente {
	protected String nome;
	protected Double preco;
	protected Double peso;
	protected Double volume;
	protected String tipo;
	
	public Componente(String nome, Double preco, Double peso, Double volume, String tipo) {
		this.nome = nome;
		this.preco = preco;
		this.peso = peso;
		this.volume = volume;
		this.tipo = tipo;
	}
	
	public abstract String getNome();
	public abstract Double getPreco();
	public abstract Double getPeso();
	public abstract Double getVolume();
	public String getTipo() {
		return tipo;
	}
}
