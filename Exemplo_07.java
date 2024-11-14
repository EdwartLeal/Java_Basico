package Fundamentos;

import java.util.Scanner;

public class Exemplo_07 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um numero:");
		double resp = entrada.nextDouble();
		
		if (resp >= 0) {
		System.out.printf("O numero é positivo");
		
		}
		else if (resp<0) { 
			System.out.printf("o numero é negativo");
		}}
	}


