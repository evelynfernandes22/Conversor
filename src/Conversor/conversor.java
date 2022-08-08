package Conversor;

import java.util.Stack;

public class conversor {

	public static void main(String[] args) {
		imprimeResultado(25);
		imprimeResultado(100);
		imprimeResultado(10035);
		imprimeResultadoQualquerBase(25, 16);
		imprimeResultadoQualquerBase(10035, 8);

	}

	public static void imprimeResultado(int numero) {
		System.out.println(numero + " convertido em binario é: " + decimalBinario(numero));
	}

	public static void imprimeResultadoQualquerBase(int numero, int base) {
		System.out.println(numero + " na base " + base + " é: " + decimalQualquerBase(numero, base));
	}

	public static String decimalBinario(int numero) {

		Stack<Integer> pilha = new Stack<Integer>();
		String numeroBinario = "";
		int resto;

		while (numero > 0) {
			resto = numero % 2;
			pilha.push(resto);
			numero /= 2;
		}

		while (!pilha.isEmpty()) {
			numeroBinario += pilha.pop();
		}
		return numeroBinario;
	}

	public static String decimalQualquerBase(int numero, int base) {

		if (base > 16) {
			throw new IllegalArgumentException();
		}

		Stack<Integer> stack = new Stack<Integer>();
		String numeroBase = "";
		int resto;
		String bases = "0123456789ABCDEF";

		while (numero > 0) {
			resto = numero % base;
			stack.push(resto);
			numero /= base;
		}

		while (!stack.isEmpty()) {
			numeroBase += bases.charAt(stack.pop());
		}

		return numeroBase;
	}

}
