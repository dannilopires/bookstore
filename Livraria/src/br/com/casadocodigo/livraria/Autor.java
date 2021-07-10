package br.com.casadocodigo.livraria;

public class Autor {
	private String nome;
	private String email;
	private String cpf;
	
	public void mostrarDetalhes() {
		System.out.println("Detalhes do autor:");
		System.out.println("Nome: " + nome);
		System.out.println("Email: " + email);
		System.out.println("CPF: " + cpf);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	/*
	 *  Estamos delegando a comparação do nome (String) para
	 *  o método equals da própria classe String.
	 *  Ele foi sobrescrito para fazer a comparação
	 *  pelo texto passado, e não pela referência de 
	 *  memória.
	 *  
	 */
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Autor)) return false;
		Autor outro = (Autor) obj;
		return this.nome.equals(outro.nome);
	}

}
