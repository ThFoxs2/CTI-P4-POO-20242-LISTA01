package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n1, res;
		
		System.out.println("digite a n1: ");
		n1 = sc.nextDouble();
		res = n1+n1*0.25;
		
		System.out.println("novo salário é:: "+res);
	}

}
