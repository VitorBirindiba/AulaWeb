package Lista;

import java.util.HashSet;

public class TesteHashSet {

	public static void main(String[] args) {

		HashSet<Clientes> clientes = new HashSet<Clientes>();
		clientes.add(new Clientes("Jesus"));
		//duplicando
		clientes.add(new Clientes("Jesus"));
		clientes.add(new Clientes("Mateus"));
		clientes.add(new Clientes("Maria"));
		//duplicando
		clientes.add(new Clientes("Maria"));
		clientes.add(new Clientes("Paulo"));
		clientes.add(new Clientes("João"));
		
		//imprimir como toString() de Cliente sem override de equals() e hashCode
		System.out.println(clientes);
		
		System.out.println();
		
		HashSet<Conta> contas = new HashSet<Conta>();
		//contas.add(new Conta(new Clientes ("Zé"), 5));
		//contas.add(new Conta(new Clientes ("Lucas"), 2));
		//contas.add(new Conta(new Clientes ("Pedro"), 1));
		//duplicando número da conta
		//contas.add(new Conta(new Clientes ("Maria"), 1));
		//contas.add(new Conta(new Clientes ("João"), 0));
		//.add(new Conta(new Clientes ("Ana"), 4));
		
		//imprimir com override de equals () e HashCode()
		System.out.println(contas);
		
	}

}
