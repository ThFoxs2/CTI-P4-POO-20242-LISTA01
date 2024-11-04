package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n, gt, im, salnovo;
		System.out.println("digite o salário: ");
		n = sc.nextDouble();
		gt = n*5/100;
		im = n*7/100;
		salnovo = n+gt-im;
		System.out.println("Novo salário: "+salnovo);

		
		
		
	}

}
