package br.com.casadocodigo.livraria.produtos;

/*
 * Como todo método sem corpo de uma interface é abstrato,
 * o uso do modificador abstract é opcional. Tb não precisamos
 * adicionar o modificador public, pois seus métodos são
 * públicos por padrão. 
 * 
 * Todo classe que implementa a interface Produto será 
 * obrigada a implementar seus métodos abstratos.
 */

/*
 * A partir do Java 8, as interfaces que obedecem essa regra
 * de ter um único métodod abstrato podem ser chamadas de
 * INTERFACE FUNCIONAL.
 */

public interface Produto {
	
	public abstract double getValor();

}
