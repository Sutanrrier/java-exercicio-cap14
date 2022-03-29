package br.com.caelum.contas.modelo;

public class Banco {
	private String nome;
	private int numero;
	private Conta[] contas;
	private static int idConta = 0;
	
	public Banco(String nome, int numero) {
		this.nome = nome;
		this.numero = numero;
		this.contas = new ContaCorrente[10];
	}

	public String getNome() {
		return nome;
	}

	public int getNumero() {
		return numero;
	}
	
	
	public void adiciona(Conta conta) {
		idConta++;
		if(idConta <= this.contas.length) {
			contas[idConta-1] = conta;
		}
		else {
			Conta[] contas = new ContaCorrente[this.contas.length+10];
			for(int i=0; i<this.contas.length;i++) {
				contas[i] = this.contas[i];
			}
			this.contas = contas;
			this.contas[idConta-1] = conta;
			System.out.println(this.contas.length);
		}
	}
	
	public void mostraContas() {
		for(int i=0; i<contas.length; i++) {
			System.out.println("\nConta #" + (i+1));
			System.out.println("Titular: " + contas[i].getTitular());
			System.out.println("Número: " + contas[i].getNumero());
			System.out.println("Saldo: " + contas[i].getSaldo());
			System.out.println("Tipo da contas: " + contas[i].getTipo());
		}
	}
	
	public boolean contem(Conta conta) {
		for(int i=0; i<contas.length; i++) {
			if(conta.getTitular().equals(contas[i].getTitular())){
				System.out.println("\nNosso banco contém esta conta!");
				return true;
			}
		}
		System.out.println("\nNosso banco não contém registros desta conta!");
		return false;
	}
	
}
