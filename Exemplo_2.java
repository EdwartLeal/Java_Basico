package aula01;

public class Exemplo_2 {
	public static void main(String args[]) {
		int a = 10;
		int b = 10;
		System.out.println(a++ + ++a); // 10 + 12 = 22
		System.out.println(b++ + b++); // 10 + 11 = 21
		System.out.println(b); // 12
	}
}