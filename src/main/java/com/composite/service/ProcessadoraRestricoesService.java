package com.composite.service;

import com.composite.bussiness.Caixa;
import com.composite.bussiness.Componente;
import com.composite.bussiness.PesoRestricao;
import com.composite.bussiness.ProcessadoraRestricoesChain;
import com.composite.bussiness.QtdItensRestricao;
import com.composite.bussiness.TipoRestricao;
import com.composite.bussiness.VolumeRestricao;

public class ProcessadoraRestricoesService {
	private ProcessadoraRestricoesChain chain;

	public ProcessadoraRestricoesService(Componente item, Caixa caixa) {
		chain = new ProcessadoraRestricoesChain(new PesoRestricao(item, caixa),
				new ProcessadoraRestricoesChain(new VolumeRestricao(item, caixa),
						new ProcessadoraRestricoesChain(new TipoRestricao(item, caixa),
								new ProcessadoraRestricoesChain(new QtdItensRestricao(item, caixa), null))));
	}

	public void processar() throws Exception {
		chain.executar();
	}
}
