import java.util.List;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		Cliente gilvan = new Cliente();
		gilvan.setNome("Gilvan");
		
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);

		Conta cc2 = new ContaCorrente(gilvan);
		Conta poupanca2 = new ContaPoupanca(gilvan);

		Banco banco = new Banco();
		banco.setNome("Banco A");
		List<Conta> contas = new ArrayList<>();
		contas.add(cc);
		contas.add(poupanca);
		contas.add(cc2);
		contas.add(poupanca2);
		banco.setContas(contas);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		cc2.depositar(200);
		cc2.transferir(150, poupanca2);
		
		cc.imprimirExtrato();
		cc2.imprimirExtrato();
		poupanca.imprimirExtrato();
		poupanca2.imprimirExtrato();

		banco.imprimirClientes();
	}

}
