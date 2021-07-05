
public class CadastroDeLivros {
	public static void main(String[] args) {
		Autor autor = new Autor();
		autor.setNome("Rodrigo Turini");
		autor.setEmail("turini@caelum.com.br");
		autor.setCpf("123.456.789-10");
		
		Livro livro = new LivroFisico(autor);
		livro.setTitulo("Java 8 Prático");
		livro.setDescricao("Novos recursos da linguagem");
		livro.setValor(35.90);
		livro.setIsbn("978-85-66250-46-6\n");
		
		livro.mostrarDetalhes();
		
		Autor autor2 = new Autor();
		autor2.setNome("Paulo Silveira");
		autor2.setEmail("silveira@caelum.com.br");
		autor2.setCpf("123.456.789-10");
		
		Livro livro2 = new LivroFisico(autor2);
		livro2.setTitulo("Lógica de programação");
		livro2.setDescricao("Aprenda algoritmos e entenda os fundamentos");
		livro2.setValor(55.90);
		livro2.setIsbn("978-85-66250-22-0\n");
		
		livro2.mostrarDetalhes();
		
		//livro.valor -= livro.valor * 0.1; //desconto de 10%
		
		livro.aplicaDescontoDe(0.3);
		
		System.out.println("Valor do livro com desconto: " + livro.getValor());
		
		//Livro livro3 = new Livro(); // testando o construtor 
		
		//Livro livro4 = new Livro();
		
		Autor autor3 = new Autor();
		autor3.setNome("Lima Barreto");
		autor3.setEmail("lima-barreto@gmail.com.br");
		autor3.setCpf("98765312");
		
		Ebook ebook = new Ebook(autor3);
		ebook.setTitulo("Clara dos Anjos");
		
		ebook.mostrarDetalhes();
	}
	

}
