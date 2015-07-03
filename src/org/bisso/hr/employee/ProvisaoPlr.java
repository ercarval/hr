package org.bisso.hr.employee;

/**
 * 
 * @author ERCARVAL
 *
 */
public class ProvisaoPlr {
	
	private double plrTotal;
	
	public void somaPlr(Funcionario funcionario) {
		plrTotal += funcionario.getPlr();
	}

	public double getPlrTotal() {
		return plrTotal;
	}
}
