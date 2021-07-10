package br.com.casadocodigo.livraria.teste;
import br.com.casadocodigo.livraria.Autor;
import br.com.casadocodigo.livraria.produtos.Ebook;
import br.com.casadocodigo.livraria.produtos.Livro;
import br.com.casadocodigo.livraria.produtos.LivroFisico;

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
	
	
		System.out.println("Valor do livro com desconto: " + livro.getValor());
		
		//Livro livro3 = new LivroFisico(null); // testando o construtor 
		//livro3.mostrarDetalhes();
		
		Autor autor3 = new Autor();
		autor3.setNome("Lima Barreto");
		autor3.setEmail("lima-barreto@gmail.com.br");
		autor3.setCpf("98765312");
		
		Ebook ebook = new Ebook(autor3);
		ebook.setTitulo("Clara dos Anjos");
		
		ebook.mostrarDetalhes();
		
		System.out.println(ebook);
		/*
		 * Note que estamos imprimindo um ebook, não
		 * seu título, valor ou algum de seus demais
		 * atributos. O resultado será:
		 * 
		 * br.com.casadocodigo.livraria.produtos.Ebook@15db9742
		 * 
		 * Observe que foi impresso o FULLY QUALIFIED NAME
		 * da classe concatenado com @ e uma espécie de
		 * identificador único para a classe, seu hashcode.
		 * 
		 * A saída será identica se colocarmos 
		 * 
		 * System.out.println(ebook.toString());
		 * 
		 * Isso acontece porque, quando passamos um obj
		 * para o método println, ele invoca seu método
		 * toString, portanto os dois códigos que fizemos
		 * são equivalentes.
		 * 
		 */
		
		//comparando objetos 
		if (autor == autor2) {
			System.out.println("Igual");
		} else {
			System.out.println("Diferente");
		}
		
		/*
		 * podemos sobrescrever o método equals, alterando
		 * seus critérios de comparação
		 * 
		 */
		if (autor.equals(autor2)) {
			System.out.println("Igual");
		} else {
			System.out.println("Diferente");
		}
		
		
		//conversão de tipos
		boolean resultado = Boolean.parseBoolean("true");
		
		byte parseByte = Byte.parseByte("1");
		
		int parseInt = Integer.parseInt("10");
		
		long parseLong = Long.parseLong("10");
		
		float parseFloat = Float.parseFloat("10.5");
		
		double parseDouble = Double.parseDouble("4.8");
		
		String numeroEmTexto = String.valueOf(10);
		
		// prova de que String não é um tipo primitivo: podemos instanciá-la
		String java = new String("Java");
		
		String java2 = "Java";
		
		System.out.println(java.equals(java2));
		
		System.out.println("\n<<<<<>>>>>\n");
		
		// o output será "Java" (toda String é imutável)
		java.replace("J", "f");
		System.out.println(java);
		
		System.out.println("jovem".replace("v", "gu"));
		
		String novaString = java.replace("J", "f");
		System.out.println(novaString);
		
		/*
		 * O mesmo princípio do exemplo acima é válido para
		 * todo método que aplica transformações da String:
		 * Eles sempre retornam uma referência nova para o valor
		 * transformado. 
		 * 
		 */
		
		String upperCase = java.toUpperCase();
		System.out.println(upperCase);
		
		String lowerCase = java.toLowerCase();
		System.out.println(lowerCase);
		
		char charAt = java.charAt(0);
		System.out.println(charAt);
		
		boolean endsWith = java.endsWith("a");
		System.out.println(endsWith);
		
		boolean startsWith = java.startsWith("k");
		System.out.println(startsWith);
		
		boolean equals = java.equalsIgnoreCase("JaVA");
		System.out.println(equals);
		
		
		
		
		
	
		
	
	}
	

}
