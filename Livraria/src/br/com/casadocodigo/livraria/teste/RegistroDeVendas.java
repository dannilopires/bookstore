package br.com.casadocodigo.livraria.teste;
import java.time.LocalDate;
import java.util.Date;

import CarrinhoDeCompras;
import br.com.casadocodigo.livraria.Autor;
import br.com.casadocodigo.livraria.produtos.Ebook;
import br.com.casadocodigo.livraria.produtos.LivroFisico;

public class RegistroDeVendas {
	public static void main(String[] args) {
		Autor autor = new Autor();
		autor.setNome("Graciliano Ramos");
		
		Autor autor2 = new Autor();
		autor.setNome("Machado de Assis");
		
		LivroFisico livroFisico = new LivroFisico(autor);
		livroFisico.setTitulo("Vidas Secas");
		livroFisico.setValor(59.90);
		
		Ebook ebook = new Ebook(autor);
		ebook.setTitulo("Vidas Secas");
		ebook.setValor(29.90);
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		carrinho.adiciona(livroFisico);
		carrinho.adiciona(ebook);
		
		
		System.out.println("TOTAL = " + carrinho.getTotal());
	
		if (livroFisico.aplicaDescontoDe10PorCento()) {
			System.out.println("Valor agora é " + livroFisico.getValor());
		}
		
	System.out.println(new Date());
	}
}
