package br.com.casadocodigo.livraria.teste;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.Date;

import br.com.casadocodigo.livraria.Autor;
import br.com.casadocodigo.livraria.carrinhodecompras.CarrinhoDeCompras;
import br.com.casadocodigo.livraria.produtos.Ebook;
import br.com.casadocodigo.livraria.produtos.LivroFisico;
import br.com.casadocodigo.livraria.produtos.Produto;

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
	
		System.out.println(LocalDate.now());
		
		Produto[] produtos = carrinho.getProdutos();
	
		//enchanced-for
		for (Produto produto : produtos) {
			if (produto != null) {
				System.out.println(produto.getValor());
			}
		}
		
		/*
		 * Tratando exceptions: há uma forma bastante
		 * conhecida e utilizada em diversas linguagens
		 * para TENTAR executar um bloco de código de risco
		 * e CAPTURAR caso ocorra uma exception neste bloco,
		 * evitando que a STACKTRACE seja exibida para o 
		 * usuário final e que a exceção pare a execução
		 * de nosso código. Esse recurso é conhecido como
		 * TRY/CATCH
		 */
		
		//Com TRY-CATCH, a mensagem será exibida
			for (int i = 0; i <= produtos.length; i++) {
				try {
					Produto produto = produtos[i];
					if (produto != null) {
						System.out.println(produto.getValor());
					}
				}catch (ArrayIndexOutOfBoundsException e){
					System.out.println("Deu exception no índice: " + i);
				}
			}
			
			System.out.println("Fui executado");
			
		//Com TRY-CATCH, a mensagem será exibida
			for (int i = 0; i <= produtos.length; i++) {
				try {
					Produto produto = produtos[i];
					if (produto != null) {
						System.out.println(produto.getValor());
					}
				}catch (Exception e){
					System.out.println("Deu exception no índice: " + i);
					e.printStackTrace();
					}
				}
				
				System.out.println("Fui executado");
			
				
					
			//A mensagem NÃO será impressa, pois o programa
			//é interrompido com uma exception
			for (int i = 0; i <= produtos.length; i++) {
				Produto produto = produtos[i];
				if (produto != null) {
					System.out.println(produto.getValor());
				}
			}
			
			System.out.println("Fui executado");
	
	}
	
}
