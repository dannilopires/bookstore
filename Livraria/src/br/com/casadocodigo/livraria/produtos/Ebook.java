package br.com.casadocodigo.livraria.produtos;
import br.com.casadocodigo.livraria.Autor;

/*
 * Ao utilizarmos a palavra reservada extends,
 * estamos dizendo que um Ebook(subclasse) HERDA
 * tudo o que a classe Livro(superclasse) tem
 */
public class Ebook extends Livro {
	
	private String waterMark;
	
	/*
	 * Como a classe Livro tinha um construtor
	 * obrigando a passagem de um Autor como parâmetro,
	 * ao herdar de um Livro, a classe Ebook tb
	 * herdou essa responsabilidade. Utilizamos a palavra
	 * SUPER para delegar a responsabilidade para
	 * a superclasse que já tem esse comportamento
	 * bem definido
	 */
	public Ebook(Autor autor) {
		super(autor);
		// TODO Auto-generated constructor stub
	}
	
	/*
	 * Ao anotar nosso método com @Override, o código
	 * não compilará caso esse método não exista na 
	 * classe pai(superclasse).
	 */
	@Override
	public boolean aplicaDescontoDe(double porcentagem) {
		return false;
	}

		
		/*
		 * Um atributo private só pode ser acessado
		 * pela própria classe, nem mesmo as classes 
		 * filhas (subclasses) podem violar essa regra.
		 * 
		 * Para contornar este problema sem precisar modificar
		 * a visibilidade dos atributos (mantendo o encapsulamento
		 * da classe Livro), utilizamos a interface
		 * da classe pai. Ou seja, no lugar de acessar o atributo
		 * diretamente, usamos os métodos getValor e setValor
		 */
		
	
	public String getWaterMark() {
		return waterMark;
	}
	public void setWaterMark(String waterMark) {
		this.waterMark = waterMark;
	}
	

}
