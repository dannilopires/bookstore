package br.com.casadocodigo.livraria.carrinhodecompras;

import br.com.casadocodigo.livraria.produtos.Livro;
import br.com.casadocodigo.livraria.produtos.Produto;
import br.com.casadocodigo.livraria.produtos.Revista;

public class CarrinhoDeCompras {

	private double total;
	private Produto[] produtos = new Produto[10];
	private int contador = 0;

	/*
	 * Apesar de não poder instanciar uma classe abstrata, você ainda pode usá-la
	 * como referência.
	 */

	/*
	 * public void adiciona(Livro livro) { System.out.println("Adicionando : " +
	 * livro); //livro.aplicaDescontoDe(0.05); total += livro.getValor();
	 * 
	 * Como estamos imprimindo o objeto inteiro e não um de seus atributos, o
	 * comportamento padrão é mostrar o nome da classe mais um
	 * 
	 * @codigoEstranho. Ex: Adicionando: LivroFisico@15db9742 Adicionando :
	 * Ebook@6d06d69c
	 * 
	 * }
	 * 
	 * public void adiciona(Revista revista) { System.out.println("Adicionando: " +
	 * revista); revista.aplicaDescontoDe(0.05); total += revista.getValor(); }
	 */

	public void adiciona(Produto produto) {
		System.out.println("Adicionando: " + produto);
		this.produtos[contador] = produto;
		contador++;
		this.total += produto.getValor();
	}

	public double getTotal() {
		return total;
	}

	public Produto[] getProdutos() {
		return produtos;
	}

}
