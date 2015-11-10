package org.bisso.hr.employee;


public abstract class Funcionario {

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

	public abstract double getPlr() ;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cargo == null) ? 0 : cargo.hashCode());
		result = prime * result + (int) (chapa ^ (chapa >>> 32));
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salario);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + sexo;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
//		if (getClass() != obj.getClass())
//			return false;
		Funcionario other = (Funcionario) obj;
		if (cargo == null) {
			if (other.cargo != null)
				return false;
		} else if (!cargo.equals(other.cargo))
			return false;
		if (chapa != other.chapa)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (Double.doubleToLongBits(salario) != Double
				.doubleToLongBits(other.salario))
			return false;
		if (sexo != other.sexo)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Funcionario [ " + chapa 
				+ " / Cargo : " + cargo 
				+ " , Name " + nome + " Salario : " + salario + " ] ";
	}
	
	
//	@Override
//	public boolean equals(Object obj) {
//		
//		//Eh a mesma instancia
//		if (this == obj) return true;
//		
//		//Nao eh a mesma instanca blz
//		
//		if ( obj == null ) return false;
//		
//		//N Eh null 
//		if ( ! (obj instanceof Funcionario) ) return false;
//		
//		Funcionario outro = (Funcionario) obj;
//		
//		if ( this.chapa == 0 && outro.getChapa() != 0 ) return false;
//		
//		
//		//outro.
//		
//		return true;
//	}
//	
	
	
	
}
