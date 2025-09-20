package ads.coding.lista.ex06;

/*Não me preocupei em colocar os atributos como privados 
 e usar os métodos get e set, já que o assunto de encapsulamento vai ser visto mais para frente, mas sei que
 deixar esses atributos como publico é muito perigoso em sistemas reais
 */
public class ContaBancariaSimples {
	String numero;
	double saldo;
	
	//Construtor com validações
	// Usei o exemplo que o senhor deu na aula como base :))
	
	public ContaBancariaSimples(String numero, double saldoInicial) {
		if (numero == null || numero.isBlank()) {
			throw new IllegalArgumentException("Numero de conta invalido");
		}
		if (saldoInicial < 0) {
			throw new IllegalArgumentException("O saldo inicial não pode ser negativo");
			
		}
		this.numero = numero;
		this.saldo = saldoInicial;
		
	} 
	//Método para depositar
	public void depositar(double valor) {
		if (valor <=0) {
			System.out.println("Não é possivel fazer depositos com valores menores, ou igual a 0 R$");	
		} else {
			saldo += valor;
			System.out.println("Deposito no valor de " + valor + " efetuado com sucesso");
		}
		
	}
	//Método para sacar
	public void sacar(double valor) {
		if (valor <=0) {
			System.out.println("Não é possivel sacar valores menores, ou igual a 0 R$");	
		} else if (valor>saldo) {
			System.out.println("Saldo insuficiente");
		} else {saldo -= valor;	
			System.out.println("Saque no valor de " + valor + " efetuado com sucesso");
		}
	}
	//Método para ver o saldo atual da conta
	public void status() {
		System.out.println("Saldo atual da conta: " + saldo);
		
	}
	
}
