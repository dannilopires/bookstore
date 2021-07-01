
public class Livro {
	String titulo;
	String descricao;
	double valor;
	String isbn; //International Standard Book Number (numero de identificação)
	Autor autor;
	
	//tipoRetorno nomeDoMétodo()
	void mostrarDetalhes() {
		String mensagem = "Detalhes do livro:";
		System.out.println(mensagem);
		System.out.println("Título: " + titulo);
		System.out.println("Descrição: " + descricao);
		System.out.println("Preço: " + valor);
		System.out.println("ISBN: " + isbn);
		
		if (this.temAutor()) {
			autor.mostrarDetalhes();	
		}
		
		System.out.println("  ");
	}
	
	/* A palavra reservada 'this' mostra que 
	 * se trata de um atributo da classe, e
	 * não uma variável qualquer.
	 */
	public void aplicaDescontoDe(double porcentagem) {
		this.valor -= this.valor * porcentagem;
	}
	
	boolean temAutor() {
		boolean notNull = this.autor != null;
		return notNull;
	}
	

}
