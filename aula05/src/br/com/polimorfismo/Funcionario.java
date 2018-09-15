package br.com.polimorfismo;

public class Funcionario {

	private String matricula;

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public void exibirDados() {
		System.out.println("Funcionario matricula" + matricula);
	}
}
