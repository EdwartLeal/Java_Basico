package Fundamentos;

import java.util.Scanner;

public class Exemplo_09 {

	public static void main(String[] args) {
	

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um numero:");
		double num1 = entrada.nextDouble();
		
		if (num1 == 1) {
			System.out.println("é segunda feira <3");
		}if (num1 == 2) {
			System.out.println("É terça feira <3");
		}if (num1 == 3) {
			System.out.println("É quarta feira <3");
		}if (num1 == 4) {
			System.out.println("É quinta feira <3");
		}if (num1 == 5) {
			System.out.println("É sexta feira <3");
		}if (num1 == 6) {
			System.out.println("É sabado <3");
		}if (num1 == 7) {
			System.out.println("É Domingo <3");
		} else {
			System.out.println("numero invalido");
		}
	}

}
