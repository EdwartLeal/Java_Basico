package Fundamentos;

import java.util.Scanner;

public class Exercicio_12_Investigacao {

	public static void main(String[] args) {
		
		System.out.println("digite 1 para sim ou 0 para não:");
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Telefonou para a vitima?:");
		int num1 = entrada.nextInt();
		
		System.out.println("Esteve no local do crime?:");
		int num2 = entrada.nextInt();
		
		System.out.println("Mora proximo a vitima?:");
		int num3 = entrada.nextInt();
		
		System.out.println("Devia a vitima??:");
		int num4 = entrada.nextInt();
		
		System.out.println("Já trabalhou com a vitima?:");
		int num5 = entrada.nextInt();
int cont = (0);
	

	
		if (num1 == 1) {
		 cont = cont+1;
		}
	if (num2 == 1) {
		cont = cont+1;
		}
	if (num3 == 1) {
	 cont = cont+1;
		}
	if (num4 == 1) {
		 cont = cont+1;
		}
	if (num5 == 1) {
		 cont = cont+1;
		}
	System.out.println(cont);
	
	}
	}



