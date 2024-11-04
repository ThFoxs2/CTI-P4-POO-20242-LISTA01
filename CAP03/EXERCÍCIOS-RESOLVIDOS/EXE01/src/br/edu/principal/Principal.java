package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n1, n2, n3, n4, res;
		
		System.out.println("digite o primeiro número: ");
		n1 = sc.nextDouble();
		System.out.println("digite a digite o segundo número: ");
		n2 = sc.nextDouble();
		System.out.println("digite o número: ");
		n3 = sc.nextDouble();
		System.out.println("digite o número: ");
		n4 = sc.nextDouble();
		res =n1+n2+n3+n4;
		
		System.out.println("Resultado da subtração: "+res);

	}

}
