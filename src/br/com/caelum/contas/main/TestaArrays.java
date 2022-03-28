package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;

public class TestaArrays {

	public static void main(String[] args) {
		//TestaArrays
		Conta[] contas = new Conta[10];
		
		for (int i = 0; i < contas.length; i++) {
			contas[i] = new ContaCorrente();
			contas[i].deposita((i+1) * 100.0);
		}
		
		double mediaSaldos = 0;
		for (Conta c: contas) {
			mediaSaldos += c.getSaldo();
		}
		System.out.println("Média dos Saldos: " + (mediaSaldos/contas.length));
	}

}
