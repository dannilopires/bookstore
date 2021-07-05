
/*
 * Afinal, para que serve a classe Livro, se não podemos 
 * mais instanciá-la? Esta classe idealiza tudo o que um
 * Livro tem, ela ainda está sendo muito útil isolando
 * todos os atributos e comportamentos que são uma padrão
 * entre os diferentes tipos de livro. A classe passa a
 * servir exclusivamente para HERANÇA e POLIMORFISMO.
 */

public abstract class Livro {
	/*Todo atributo de classe deve ser privado,
	 * assim garantimos que ninguém os acesse
	 * diretamente e viole nossas regras de negócio
	 */
	private String titulo;
	private String descricao;
	private double valor;
	private String isbn; //International Standard Book Number (numero de identificação)
	private Autor autor;
	private boolean impresso;

	public Livro(Autor autor) {
		this.autor = autor;
		this.isbn = "000-00-00000-00-0";
		this.impresso = true;
	}
	
	
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
	
	/*
	 * Toda classe abstrata pode ter métodos abstratos.
	 * Toda classe filha(subclasse) concreta(não abstrata)
	 * é obrigada a escrever os métodos abstratos da classe
	 * pai(superclasse), caso contrário seu código não 
	 * compilará.
	 */
	public abstract boolean aplicaDescontoDe(double porcentagem);
	
	boolean temAutor() {
		boolean notNull = this.autor != null;
		return notNull;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public double getValor() {
		return this.valor;
	}
	
	

	/*Lembre-se de evitar deixar informações
	 * tão específicas em seus moldes, além de
	 * não sobrecarregá-los com comportamentos
	 * que não deveriam ser de sua responsabilidade.
	 */
}
