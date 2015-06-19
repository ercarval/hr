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

	public void somaPlr(Gerente gerente) {
		plrTotal += gerente.getPlr();
	}

	public void somaPlr(Diretor diretor) {
		plrTotal += diretor.getPlr();
	}

	public void somaPlr(Engenheiro diretor) {
		plrTotal += diretor.getPlr();
	}

	public double getPlrTotal() {
		return plrTotal;
	}


}
