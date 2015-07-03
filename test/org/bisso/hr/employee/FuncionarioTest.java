package org.bisso.hr.employee;

public class FuncionarioTest {

	public static void main(String[] args) {

		Funcionario funcionarioUm = new Funcionario();
		Funcionario funcionarioDois = new Funcionario();
		
		funcionarioUm.setChapa(1234l);
		funcionarioUm.setCargo("Analista");
		funcionarioUm.setNome("Zé das Cove");
		funcionarioUm.setSalario(2345.0);
		funcionarioUm.setSexo('X');

		funcionarioDois.setChapa(1234l);
		funcionarioDois.setCargo("Analista");
		funcionarioDois.setNome("Zé das Cove");
		funcionarioDois.setSalario(2345.0);
		funcionarioDois.setSexo('X');

		boolean equals = funcionarioUm.equals(funcionarioDois);
		funcionarioUm.equals(1);
		
		
	}

}
