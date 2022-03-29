package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Banco;
import br.com.caelum.contas.modelo.ContaCorrente;

public class TestaBanco {

	public static void main(String[] args) {
		Banco banco = new Banco("Pablobank", 100);

		for (int i = 0; i < 20; i++) {
			ContaCorrente conta = new ContaCorrente();
			conta.setTitular("Titular " + (i+1));
			conta.setNumero((i+1) * 10);
			conta.deposita((i+1) * 1000);
			banco.adiciona(conta);
		}
		banco.mostraContas();
		
		//Testando se uma conta existe no Banco
		ContaCorrente conta_teste = new ContaCorrente();
		conta_teste.setTitular("Titular 10");
		banco.contem(conta_teste);

	}

}
