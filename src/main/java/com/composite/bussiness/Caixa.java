package com.composite.bussiness;

import java.util.ArrayList;
import java.util.List;

import com.composite.service.ProcessadoraRestricoesService;

public class Caixa extends Componente {
	private List<Componente> itens;
	private List<String[]> itensRejeitados;
	private ProcessadoraRestricoesService restricoes;
	private int qtdItens;
	private int qtdItensSuportado;
	private Double pesoSuportado;
	private Double volumeSuportado;
	private String[] tipoSuportado;

	public Caixa(String nome, Double preco, Double peso, Double pesoSuportado, Double volume, String tipo, String[] tipoSuportado, int QtdItensSuportado) {
		super(nome, preco, peso, 0.0, tipo);
		this.itens = new ArrayList<Componente>();
		this.itensRejeitados = new ArrayList<String[]>();
		this.qtdItens = 0;
		this.qtdItensSuportado = QtdItensSuportado;
		this.pesoSuportado = pesoSuportado;
		this.volumeSuportado = volume - (volume*0.02);
		this.tipoSuportado = tipoSuportado;
	}

	public void add(Componente item) {
		this.restricoes = new ProcessadoraRestricoesService(item, this);
		this.restricoes.processar();
		this.itens.add(item);
		qtdItens ++;
	}
	
	public List<String[]> getItensRejeitados(){
		return this.itensRejeitados;
	}
	
	public void addItemRejeitado(String[] item) {
		this.itensRejeitados.add(item);
	}
	
	@Override
	public String getNome() {
		for(Componente item: itens) {
			this.nome += ", " + item.getNome();
		}
		return this.nome;
	}

	@Override
	public Double getPreco() {
		Double presoSomado = this.preco;
		for(Componente item: this.itens) {
			presoSomado += item.getPreco();
		}
		return presoSomado;
	}
	
	@Override
	public Double getPeso() {
		Double pesoSomado = this.peso;
		for(Componente item: this.itens) {
			pesoSomado += item.getPeso();
		}
		return pesoSomado;
	}
	
	public int getQtdItens() {
		return this.qtdItens;
	}
	
	public int getQtdItensSuportado() {
		return this.qtdItensSuportado;
	}
	
	public Double getPesoSuportado() {
		return this.pesoSuportado;
	}

	public Double getVolumeSuportado() {
		return this.volumeSuportado;
	}
	
	public String[] getTipoSuportado() {
		return this.tipoSuportado;
	}

	@Override
	public Double getVolume() {
		for(Componente item: this.itens) {
			this.volume += item.getVolume();
		}
		return this.volume;
	}
}
