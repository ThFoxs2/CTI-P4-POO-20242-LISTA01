package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n, res, per, aumento;
		System.out.println("digite o salário: ");
		n = sc.nextDouble();
		System.out.println("digite o percentual de aumento: ");
		per = sc.nextDouble();
		aumento= n*per/100;
		
		res = n+aumento;
		System.out.println("aumento foi: "+aumento);

		System.out.println("Novo salário: "+res);

	}

}
