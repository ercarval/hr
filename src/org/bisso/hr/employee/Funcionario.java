package org.bisso.hr.employee;

public class Funcionario {

	private long chapa;

	private String nome;

	private char sexo;

	private double salario;

	//
	private String cargo;

	public long getChapa() {
		return chapa;
	}

	public void setChapa(long chapa) {
		this.chapa = chapa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getPlr() {
		return salario * 2 + 3000;
	}

}
