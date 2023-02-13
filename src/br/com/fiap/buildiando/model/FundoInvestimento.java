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
	
	
	public FundoInvestimento(int codigoCVM, String nomeFundo) {
		super();
		this.codigoCVM = codigoCVM;
		this.nomeFundo = nomeFundo;
	}


	public FundoInvestimento(int codigoCVM, String nomeFundo, Date dataOperacao) {
		super();
		this.codigoCVM = codigoCVM;
		this.nomeFundo = nomeFundo;
		this.dataOperacao = dataOperacao;
	}


	public FundoInvestimento(int codigoCVM, String nomeFundo, Date dataOperacao, double valorMinimo) {
		super();
		this.codigoCVM = codigoCVM;
		this.nomeFundo = nomeFundo;
		this.dataOperacao = dataOperacao;
		this.valorMinimo = valorMinimo;
	}


	public FundoInvestimento(int codigoCVM, String nomeFundo, double valorMinimo, double valorMaximo,
			double taxaAdministracao, double taxaCustodia) {
		super();
		this.codigoCVM = codigoCVM;
		this.nomeFundo = nomeFundo;
		this.valorMinimo = valorMinimo;
		this.valorMaximo = valorMaximo;
		this.taxaAdministracao = taxaAdministracao;
		this.taxaCustodia = taxaCustodia;
	}


	public FundoInvestimento(int codigoCVM, String nomeFundo, String economistaChefe, double taxaAdministracao,
			double taxaCustodia) {
		super();
		this.codigoCVM = codigoCVM;
		this.nomeFundo = nomeFundo;
		this.economistaChefe = economistaChefe;
		this.taxaAdministracao = taxaAdministracao;
		this.taxaCustodia = taxaCustodia;
	}


	public int getCodigoCVM() {
		return codigoCVM;
	}


	public String getNomeFundo() {
		return nomeFundo;
	}


	public Date getDataOperacao() {
		return dataOperacao;
	}


	public double getValorMinimo() {
		return valorMinimo;
	}


	public double getValorMaximo() {
		return valorMaximo;
	}


	public int getDiasResgate() {
		return diasResgate;
	}


	public double getTaxaAdministracao() {
		return taxaAdministracao;
	}


	public double getTaxaCustodia() {
		return taxaCustodia;
	}


	public boolean isFundoFechado() {
		return fundoFechado;
	}


	public String getEconomistaChefe() {
		return economistaChefe;
	}


	@Override
	public String toString() {
		return "FundoInvestimento [codigoCVM=" + codigoCVM + ", nomeFundo=" + nomeFundo + ", dataOperacao="
				+ dataOperacao + ", valorMinimo=" + valorMinimo + ", valorMaximo=" + valorMaximo + ", diasResgate="
				+ diasResgate + ", taxaAdministracao=" + taxaAdministracao + ", taxaCustodia=" + taxaCustodia
				+ ", fundoFechado=" + fundoFechado + ", economistaChefe=" + economistaChefe + "]";
	}

	
}
