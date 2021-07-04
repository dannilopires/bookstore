
public class RegrasDeDesconto {
	public static void main(String[] args) {
		Autor autor3 = new Autor();
		autor3.setNome("Machado de Assis");
		
		Livro livro = new Livro(autor3);
		livro.setValor(55.00); 
		
		System.out.println("Valor atual: " + livro.getValor());
		
		if (!livro.aplicaDescontoDe(0.4)) {
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
