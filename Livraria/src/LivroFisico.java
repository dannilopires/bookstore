
public class LivroFisico extends Livro {

	public LivroFisico(Autor autor) {
		super(autor);
		// TODO Auto-generated constructor stub
	}
	
	public double getTaxaImpressao() {
		return this.getValor() * 0.05;
	}


}
