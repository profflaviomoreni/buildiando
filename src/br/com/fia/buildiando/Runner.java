package br.com.fia.buildiando;

import br.com.fiap.buildiando.model.FundoInvestimento;

public class Runner {

	public static void main(String[] args) {
		
		FundoInvestimento f1 = new FundoInvestimento.Builder(43001, "Fiap 1 RF")
					.aberto()
					.diasResgate(30)
					.economistaChefe("Pedro Malan")
					.taxaAdministracao(2)
					.build();
		
		FundoInvestimento f2 = new FundoInvestimento.Builder(43002, "Fiap 2 LCA")
					.fechado()
					.build();
		
		
		
		System.out.println(f1);
		System.out.println(f2);
		
	}

}
