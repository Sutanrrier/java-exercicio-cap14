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
		if(idConta <= 10) {
			contas[idConta-1] = conta;
		}
		else {
			System.out.println("Limite de contas alcançado");
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
