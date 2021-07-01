
public class CadastroDeLivros {
	public static void main(String[] args) {
		Livro livro = new Livro();
		livro.titulo = "Java 8 Prático";
		livro.descricao = "Novos recursos da linguagem";
		livro.valor = 59.90;
		livro.isbn = "978-85-66250-46-6\n";
		
		Autor autor = new Autor();
		autor.nome = "Rodrigo Turini";
		autor.email = "turini@caelum.com.br";
		autor.cpf = "123.456.789-10";
		
		livro.autor = autor;
		
		livro.mostrarDetalhes();
		
		
		Livro livro2 = new Livro();
		livro2.titulo = "Lógica de programação";
		livro2.descricao = "Aprenda algoritmos e entenda os fundamentos";
		livro2.valor = 55.90;
		livro2.isbn = "978-85-66250-22-0\n";
		
		Autor autor2 = new Autor();
		autor2.nome = "Paulo Silveira";
		autor2.email = "silveira@caelum.com.br";
		autor2.cpf = "123.456.789-10";
		
		livro2.autor = autor2;
		
		livro2.mostrarDetalhes();
		
		//livro.valor -= livro.valor * 0.1; //desconto de 10%
		
		livro.aplicaDescontoDe(0.1);
		
		System.out.println("Valor do livro com  10% de desconto: " + livro.valor);
		
	}
	

}
