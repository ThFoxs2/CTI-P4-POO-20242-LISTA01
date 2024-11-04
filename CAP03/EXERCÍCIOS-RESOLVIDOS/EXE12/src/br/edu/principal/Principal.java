package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n, n2, r1, r2;
		System.out.println("digite o número: ");
		n = sc.nextDouble();
		System.out.println("digite o número: ");
		n2 = sc.nextDouble();
		
		if(n>0 && n2>0) {
		r1 = Math.pow(n, n2);
		r2 = Math.pow(n2, n);
		System.out.println("resultado 1:"+r1);
		System.out.println("resultado 1:"+r2);
		}

	}

}
