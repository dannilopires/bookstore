
public class RegistroDeVendas {
	public static void main(String[] args) {
		Autor autor = new Autor();
		autor.setNome("Graciliano Ramos");
		
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
	
	}
}
