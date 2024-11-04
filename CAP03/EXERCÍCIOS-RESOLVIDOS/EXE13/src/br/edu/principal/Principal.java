package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n, p, j, m;
		System.out.println("digite o número: ");
		n = sc.nextDouble();
		p = n*12;
		j = n/3;
		m = j/1760;
		System.out.println("resultado em polegadas: "+p+ "resultado em Jardas: "+j+ "resultado em milhas: "+m);
		System.out.println("resultado em jardas: "+j);
		System.out.println("resultados: "+m);
		
		
	}

}
