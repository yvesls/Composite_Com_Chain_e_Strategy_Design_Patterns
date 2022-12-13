package com.composite.bussiness;

public class ProcessadoraRestricoesChain {
	private RestricoesAbstract restricao;
	private ProcessadoraRestricoesChain proximo;

	public ProcessadoraRestricoesChain(RestricoesAbstract restricao) {
		this.restricao = restricao;
	}

	public ProcessadoraRestricoesChain(RestricoesAbstract restricao, ProcessadoraRestricoesChain proximo) {
		this.restricao = restricao;
		this.proximo = proximo;
	}

	public void executar() {
		restricao.processar();
		
		if (restricao == null)
			return;
		if (this.proximo != null)
			this.proximo.executar();
	}
}
