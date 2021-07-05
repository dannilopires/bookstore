
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
		
		Ebook ebook2 = new Ebook(autor2);
		ebook2.setTitulo("Quincas Borba");
		ebook.setValor(20.00);
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		carrinho.adiciona(livroFisico);
		carrinho.adiciona(ebook);
		carrinho.adiciona(ebook2);
		
		
		System.out.println("TOTAL = " + carrinho.getTotal());
	
	}
}
