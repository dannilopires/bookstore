
public class RegrasDeDesconto {
	public static void main(String[] args) {
		Autor autor3 = new Autor();
		autor3.setNome("Machado de Asssis");
		
		Livro livro = new Livro(autor3);
		livro.setValor(55.00); 
		
		System.out.println("Valor atual: " + livro.getValor());
		
		if (!livro.aplicaDescontoDe(0.4)) {
			System.out.println("Desconto não pode ser maior do que 30%");
		} else {
			System.out.println("Valor com desconto: " + livro.getValor());
		}
	}

}
