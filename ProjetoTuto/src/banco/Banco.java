package banco;

import modelos.Conta;

public class Banco {

	public static void main(String[] args) {
		
		Conta a = new Conta("Conta 1");
		Conta b = new Conta("Conta 2");
		System.out.println(a.tostring());
		System.out.println(b.tostring());
		a.depositar(200);
		System.out.println(a.tostring());
		a.sacar(300);
		System.out.println(a.tostring());
		a.sacar(100);
		System.out.println(a.tostring());
		a.depositar(400);
		System.out.println(a.tostring());

		
	}

}
