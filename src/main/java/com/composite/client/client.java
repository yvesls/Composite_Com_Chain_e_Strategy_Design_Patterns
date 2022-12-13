package com.composite.client;

import java.util.List;

import com.composite.bussiness.Caixa;
import com.composite.bussiness.CaixaPlusBuilder;
import com.composite.bussiness.CaixaPremiumBuilder;
import com.composite.bussiness.Diretor;
import com.composite.bussiness.Produto;

public class client {
	public static void main(String args[]) {
		String[] tiposSuportados = 	{"Caixa", "Produto"};
		
		Caixa caixaGrande = new Caixa("Compras de natal", 2.0, 120.0, 800.0, 100.0, "Caixa", tiposSuportados, 5);
		Caixa caixaBrinquedos = new Caixa("Brinquedos Diversos", 2.0, 70.0, 600.0, 60.0, "Caixa", tiposSuportados, 2);
		Produto carrinhoHotWells = new Produto("Carrinho HotWells", 5.0, 120.0, 5.0, "Produto");
		Produto bonecoAcaoPR = new Produto("Boneco Power Ranger", 10.0, 200.0, 30.0, "Produto");
		Produto botijaoGas = new Produto("Botij�o", 105.0, 15000.0, 100.0, "Produto");
		
		// Insere brinquedos na caixa de brinquedos
		caixaBrinquedos.add(carrinhoHotWells);
		caixaBrinquedos.add(bonecoAcaoPR);
		
		// Insere caixa de brinquedos na caixa grande
		caixaGrande.add(caixaBrinquedos);
		// Forçando erro
		caixaGrande.add(botijaoGas);
		
		System.out.println(caixaBrinquedos.getNome());
		System.out.println("Pre�o: " + caixaBrinquedos.getPreco() + " R$");
		System.out.println("Peso: " + caixaBrinquedos.getPeso() + " gramas");
		System.out.println("Volume suportado: " + caixaBrinquedos.getVolumeSuportado() + " cm3");
		System.out.println("Quantidade de item: " + caixaBrinquedos.getQtdItens());
		System.out.println("...............................");
		System.out.println(caixaGrande.getNome());
		System.out.println("Pre�o: " + caixaGrande.getPreco() + " R$");
		System.out.println("Peso: " + caixaGrande.getPeso() + " gramas");
		System.out.println("Volume suportado: " + caixaGrande.getVolumeSuportado() + " cm3");
		System.out.println("Quantidade de item: " + caixaGrande.getQtdItens());
		System.out.println("...............................");
		
		// utilizando o builder para criar caixas prontas
		Diretor diretor1 = new Diretor();
		Diretor diretor2 = new Diretor();
		Caixa caixaPlus = diretor1.Build(new CaixaPlusBuilder());
		Caixa caixaPremium = diretor2.Build(new CaixaPremiumBuilder());
		
		System.out.println(caixaPlus.getNome());
		System.out.println("Pre�o: " + caixaPlus.getPreco() + " R$");
		System.out.println("Peso: " + caixaPlus.getPeso() + " gramas");
		System.out.println("Volume suportado: " + caixaPlus.getVolumeSuportado() + " cm3");
		System.out.println("Quantidade de item: " + caixaPlus.getQtdItens());
		System.out.println("...............................");
		System.out.println(caixaPremium.getNome());
		System.out.println("Pre�o: " + caixaPremium.getPreco() + " R$");
		System.out.println("Peso: " + caixaPremium.getPeso() + " gramas");
		System.out.println("Volume suportado: " + caixaPremium.getVolumeSuportado() + " cm3");
		System.out.println("Quantidade de item: " + caixaPremium.getQtdItens());
		System.out.println("...............................");
		
		// Imprime itens rejeitados para cada caixa
		if(caixaGrande.getItensRejeitados().size() != 0) {
			System.out.println("Itens rejeitados da caixa 'Compras de natal':");
			List<String[]> itens = caixaGrande.getItensRejeitados();
			for(String[] item : itens) {
				for(String value : item) {
					System.out.println(value);
				}
			}
		}
		
		if(caixaBrinquedos.getItensRejeitados().size() != 0) {
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
			System.out.println("Itens rejeitados da caixa 'Brinquedos Diversos':");
			List<String[]> itens = caixaBrinquedos.getItensRejeitados();
			for(String[] item : itens) {
				for(String value : item) {
					System.out.println(value);
				}
			}
		}
		
		if(caixaPlus.getItensRejeitados().size() != 0) {
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
			System.out.println("Itens rejeitados da Caixa Plus:");
			List<String[]> itens = caixaPlus.getItensRejeitados();
			for(String[] item : itens) {
				for(String value : item) {
					System.out.println(value);
				}
			}
		}
		
		if(caixaPremium.getItensRejeitados().size() != 0) {
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
			System.out.println("Itens rejeitados da Caixa Premium:");
			List<String[]> itens = caixaPremium.getItensRejeitados();
			for(String[] item : itens) {
				for(String value : item) {
					System.out.println(value);
				}
			}
		}
	}
}
