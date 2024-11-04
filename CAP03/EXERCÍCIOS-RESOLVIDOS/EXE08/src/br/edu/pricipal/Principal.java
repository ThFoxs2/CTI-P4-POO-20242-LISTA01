package br.edu.pricipal;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n, tx, red, salnovo;
		System.out.println("digite o depósito: ");
		n = sc.nextDouble();
		System.out.println("digite o salário: ");
		tx = sc.nextDouble();
		red = n*tx/100;
		
		salnovo = n+red;
		System.out.println("redndimento: "+red);
		System.out.println("valor total do depósito: "+salnovo);

	}

}
