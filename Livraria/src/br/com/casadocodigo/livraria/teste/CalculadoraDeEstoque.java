package br.com.casadocodigo.livraria.teste;

public class CalculadoraDeEstoque {
	public static void main(String[] args) {
		double livroJava = 59.90;
		double livroTDD = 59.90;
		double soma = 0;
		//int contador = 0;
		
		/*
		while (contador < 35) {
			double valorDoLivro = 59.90;
			soma += valorDoLivro;
			contador++; //operador unário (incrementa +1)
		}
		*/
		
		for (int i=0; i<35; i++) {
			soma += 59.90;
		}
		
		
		System.out.printf("O total em estoque é %.2f\n", soma);
		
		if (soma < 150) {
			System.out.println("Estoque baixo!");
			
		} else if (soma >= 2000) {
			System.out.println("Estoque alto!");
			
		} else {
			System.out.println("Estoque suficiente!");
		}
		

	}

}
