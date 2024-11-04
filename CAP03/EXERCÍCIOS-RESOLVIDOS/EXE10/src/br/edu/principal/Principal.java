package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			double n, area;
			System.out.println("digite o raio: ");
			n = sc.nextDouble();
			area = 3.1415*(n*n);
			System.out.println("A área é:"+area);

	}

}
