package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n, ano_n, idade, idade_fu;
		System.out.println("digite o ano atual: ");
		n = sc.nextDouble();
		System.out.println("Digite o ano de nascimento: ");
		ano_n = sc.nextDouble();
		idade = n - ano_n;
		idade_fu = 2050 - ano_n;
		System.out.println("A idade atual é: "+idade);
		System.out.println("Idade em 2050: "+idade_fu);

	}

}
