package Fundamentos;

import java.util.Scanner;

public class Exercicio_10 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite uma nota:");
		float num1 = entrada.nextFloat();

		System.out.println("Digite a segunda nota:");
		float num2 = entrada.nextFloat();
		
		float soma = num1 + num2;
		float media = soma / 2;
		
		entrada.close();
		
		System.out.println("a media é:"+media);
	}
	

}
