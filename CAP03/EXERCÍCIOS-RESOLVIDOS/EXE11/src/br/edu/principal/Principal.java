package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n, q, c, r2, r3;
		System.out.println("digite o número: ");
		n = sc.nextDouble();
		if(n>0) {
		q = n*n;
		c = n*n*n;
		r2 = Math.sqrt(n);
		r3 = Math.cbrt(n);
		System.out.println("O resultado ao quadrado "+q);
		System.out.println("O resultado ao cubo: "+c);
		System.out.println("O resultado da raiz quadrada: "+r2);
		System.out.println("O resultado da raiz cubica: "+r3);
		}
		else {
			System.out.println("Número fora do intervelo");
		}


	}

}
