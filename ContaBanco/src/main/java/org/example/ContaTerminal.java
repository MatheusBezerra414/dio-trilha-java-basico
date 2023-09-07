package org.example;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Bem-vindo ao banco A! \nDigite o numero de conta: ");
        int numero = sc.nextInt();
        System.out.println("Digite o numero de agencia: ");
        String agencia = sc.next();
        System.out.println("Digite o nome do cliente:");
        String nomeCliente = sc.next();
        System.out.println("Digite o valor do saldo: ");
        double saldo = sc.nextDouble();

        Conta novaConta = new Conta(numero, agencia, nomeCliente, saldo);

        System.out.println(novaConta);

    }
}