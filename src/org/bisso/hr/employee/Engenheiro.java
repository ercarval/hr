package org.bisso.hr.employee;

public class Engenheiro extends Funcionario {

	private String crea;
	
	public double getPlr() {
		return super.getPlr() + 10000;
	}

}
