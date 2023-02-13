package br.com.fiap.buildiando.model;

import java.util.Date;

public class FundoInvestimento {

	
	private int codigoCVM;
	private String nomeFundo;
	private Date dataOperacao;
	private double valorMinimo;
	private double valorMaximo;
	private int diasResgate;
	private double taxaAdministracao;
	private double taxaCustodia;
	private boolean fundoFechado;
	private String economistaChefe;
	
	
	public static class Builder {
		
		//Requeridos
		private int codigo;
		private String nome;
		
		private Date dataOperacao;
		private double valorMinimo;
		private double valorMaximo;
		private int diasResgate;
		private double taxaAdministracao;
		private double taxaCustodia;
		private boolean fundoFechado;
		private String economistaChefe;
		
		
		public Builder(int codigo, String nome) {
			this.codigo = codigo;
			this.nome = nome;
		}


		public Builder dataOperacao(Date dataOperacao) {
			this.dataOperacao = dataOperacao;
			return this;
		}


		public Builder valorMinimo(double valorMinimo) {
			this.valorMinimo = valorMinimo;
			return this;
		}


		public Builder valorMaximo(double valorMaximo) {
			this.valorMaximo = valorMaximo;
			return this;
		}


		public Builder diasResgate(int diasResgate) {
			this.diasResgate = diasResgate;
			return this;
		}


		public Builder taxaAdministracao(double taxaAdministracao) {
			this.taxaAdministracao = taxaAdministracao;
			return this;
		}


		public Builder taxaCustodia(double taxaCustodia) {
			this.taxaCustodia = taxaCustodia;
			return this;
		}


		public Builder fechado() {
			this.fundoFechado = true;
			return this;
		}

		public Builder aberto() {
			this.fundoFechado = false;
			return this;
		}
		

		public Builder economistaChefe(String economistaChefe) {
			this.economistaChefe = economistaChefe;
			return this;
		}
		
		public FundoInvestimento build() {
			return new FundoInvestimento(this);
		}
		
	}

	
	private FundoInvestimento(Builder builder) {
		this.codigoCVM = builder.codigo;
		this.nomeFundo = builder.nome;
		this.dataOperacao = builder.dataOperacao;
		this.valorMinimo= builder.valorMaximo;
		this.valorMaximo = builder.valorMaximo;
		this.diasResgate = builder.diasResgate;
		this.taxaAdministracao= builder.taxaAdministracao;
		this.taxaCustodia= builder.taxaCustodia;
		this.fundoFechado= builder.fundoFechado;
		this.economistaChefe= builder.economistaChefe;
	}
	

	@Override
	public String toString() {
		return "FundoInvestimento [codigoCVM=" + codigoCVM + ", nomeFundo=" + nomeFundo + ", dataOperacao="
				+ dataOperacao + ", valorMinimo=" + valorMinimo + ", valorMaximo=" + valorMaximo + ", diasResgate="
				+ diasResgate + ", taxaAdministracao=" + taxaAdministracao + ", taxaCustodia=" + taxaCustodia
				+ ", fundoFechado=" + fundoFechado + ", economistaChefe=" + economistaChefe + "]";
	}

	
}
