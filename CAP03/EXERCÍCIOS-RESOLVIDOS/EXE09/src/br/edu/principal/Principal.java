package br.edu.principal;

import java.util.Scanner;

public class Principal {	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	double n, tx, area;
	System.out.println("digite a base: ");
	n = sc.nextDouble();
	System.out.println("digite a altura: ");
	tx = sc.nextDouble();
	
	area = (n*tx)/2;
	System.out.println("A área é: "+area);
	}

}
