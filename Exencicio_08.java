package Fundamentos;

import java.util.Scanner;

public class Exencicio_08 {

	public static void main(String[] args) {
		

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um numero:");
		double num1 = entrada.nextDouble();
		
		System.out.println("Digite um numero:");
		double num2 = entrada.nextDouble();
	
		System.out.println("Digite um numero:");
		double num3 = entrada.nextDouble();
		
		if (num1 >num2) {
			if(num1>num3) {
				System.out.println("o numero maior é"+num1);
			}else {
				if(num2>num3) {
					System.out.println("O maior é"+num2);
				} else {
				System.out.println("o numero maior é"+num3);
				}
			}
		}
	}
}
