package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n1, n2, n3, ps1, ps2, ps3, res;
		
		System.out.println("digite o número: ");
		n1 = sc.nextDouble();
		System.out.println("digite o número: ");
		n2 = sc.nextDouble();
		System.out.println("digite o número: ");
		n3 = sc.nextDouble();
		System.out.println("digite o peso 1: ");
		ps1 = sc.nextDouble();
		System.out.println("digite o peso 2: ");
		ps2 = sc.nextDouble();
		System.out.println("digite o peso 3: ");
		ps3 = sc.nextDouble();
		res = (n1*ps1+n2*ps2+n3*ps3)/(ps1+ps2+ps3);
		
		System.out.println("A média é: "+res);

	}

}
