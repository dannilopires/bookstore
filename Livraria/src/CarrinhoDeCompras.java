
public class CarrinhoDeCompras {

	private double total;
	
	public void adiciona(Livro livro) {
		System.out.println("Adicionando : " + livro);
		livro.aplicaDescontoDe(0.05);
		total += livro.getValor();
	
		/*Como estamos imprimindo o objeto inteiro
		 * e não um de seus atributos, o comportamento
		 * padrão é mostrar o nome da classe mais um
		 * @codigoEstranho. 
		 * Ex: Adicionando: LivroFisico@15db9742
		 * Adicionando : Ebook@6d06d69c
		 */
	}
	
	public double getTotal() {
		return total;
	}
	
}
