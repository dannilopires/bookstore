package br.com.casadocodigo.livraria.produtos;
import br.com.casadocodigo.livraria.Editora;

public class Revista implements Produto, Promocional {
	private String titulo;
	private String descricao;
	private double valor;
	private Editora editora;
	
	
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
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public Editora getEditora() {
		return editora;
	}
	public void setEditora(Editora editora) {
		this.editora = editora;
	}

	public boolean aplicaDescontoDe(double porcentagem) {
		if (porcentagem > 0.1) {
			return false;
		} 
		double desconto = getValor() * porcentagem;
		setValor(getValor() - desconto);
		return true;
	}
	
}
