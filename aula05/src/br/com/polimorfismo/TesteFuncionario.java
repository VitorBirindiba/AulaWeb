package br.com.polimorfismo;

public class TesteFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		Programador01 programador = new Programador01();
		programador.exibirDados();
		
		GerenteProjetos gerente = new GerenteProjetos();
		gerente.exibirDados();
		
		Funcionario funcionario = new Funcionario();
		funcionario.exibirDados();
	}

}
