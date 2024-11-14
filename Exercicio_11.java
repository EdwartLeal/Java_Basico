package Fundamentos;

import java.util.Scanner;

public class Exercicio_11 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite M para masculino ou F para feminino:");
		char gen = entrada.next().charAt(0);
		
	
	if (gen == 'F' || gen == 'f') {
		System.out.println("Voce selecionou Feminino");
	}
	else if (gen == 'M' || gen == 'm') {
		System.out.println("Voce selecionou Masculino");
	}
	else {
		System.out.println("Opção invalida");
	}

}
}