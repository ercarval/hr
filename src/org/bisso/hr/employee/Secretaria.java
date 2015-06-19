package org.bisso.hr.employee;

public class Secretaria extends Funcionario {
 
	@Override
	public double getPlr() {
		return super.getPlr() + 5000;
	}
     

}
