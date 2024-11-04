package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n1, n2, n3, res;
		
		System.out.println("digite o número: ");
		n1 = sc.nextDouble();
		System.out.println("digite outro número: ");
		n2 = sc.nextDouble();
		System.out.println("Digite mais um número: ");
		n3 = sc.nextDouble();
		
		res = (n1+n2+n3)/3;
		
		System.out.println("A multiplicação é: "+res);

	}

}
