package br.com.fia.buildiando;

import br.com.fiap.buildiando.model.FundoInvestimento;

public class Runner {

	public static void main(String[] args) {
		
		FundoInvestimento f1 = new FundoInvestimento(43001, "Fiap 1 RF");
		
		FundoInvestimento f2 = new FundoInvestimento(43002, "Fiap 2 LCA");
		
		
		
		System.out.println(f1);
		System.out.println(f2);
		
	}

}
