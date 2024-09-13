package contaBanco;

import java.util.Scanner;

public class ContaBanco {
	
	public static void main(String args[]) throws Exception  {
		
		Scanner scanner = new Scanner(System.in);
		
		int numeroConta = 0 ;
		String agencia = "";
		String nomeCliente = "";
		float saldo = 0;
		
		System.out.println("Informe o numero da conta: ");
		numeroConta = scanner.nextInt();
		
		System.out.println("Informe o numero da Agencia: ");
		agencia = scanner.next();
		
		System.out.println("Informe o nome do cliente: ");
		nomeCliente = scanner.next();
		
		System.out.println("Informe o saldo da conta: ");
		saldo = scanner.nextFloat();
		
		
		System.out.println("Olá "+ nomeCliente + ", obrigado por criar uma conta em nosso banco, "
				+ "sua agência é " + agencia +", conta " + numeroConta + " e seu saldo R$ " + saldo + " já está disponível para saque");
		
		
	}

}
