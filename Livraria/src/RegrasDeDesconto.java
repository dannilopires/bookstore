
public class RegrasDeDesconto {
	public static void main(String[] args) {
		Autor autor3 = new Autor();
		autor3.setNome("Machado de Assis");
		
		Livro livro = new MiniLivro(autor3);
		livro.setValor(39.90); 
		
		System.out.println("Valor atual: " + livro.getValor());
		
		if (!livro.aplicaDescontoDe(0.3)) {
			System.out.println("Desconto não pode ser maior do que 30%");
		} else {
			System.out.println("Valor com desconto: " + livro.getValor());
		}
		
		Ebook ebook = new Ebook(autor3);
		ebook.setValor(29.90);
		
		if (!ebook.aplicaDescontoDe(0.15)) {
			System.out.println("Desconto no ebook não pode ser maior do que 15%");
		} else {
			System.out.println("Valor do ebook com desconto: " + ebook.getValor());
		}
		
	}

}
