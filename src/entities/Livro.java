package entities;

public class Livro extends Produto implements Imposto {
	public Livro(String nome, double preco, int quantidade, String autor, String tema, int quantPag) {
		super(nome, preco, quantidade);
		this.autor = autor;
		this.tema = tema;
		this.quantPag = quantPag;
	}

	private String autor;
	private String tema;
	private int quantPag;

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public int getQuantPag() {
		return quantPag;
	}

	public void setQuantPag(int quantPag) {
		this.quantPag = quantPag;
	}

	public Livro() {

	}

	@Override
	public double calcularImposto() {

		if (this.tema.equalsIgnoreCase("educativo")) {
			return 0;
		}
		return getPreco() * 0.10;
	}

	@Override
	public String toString() {
		return "Livro [ Título: " + getNome() 
		   + ", Preco: R$ " + String.format("%.2f", getPreco()) 
		   + ", Quantidade: "+ getQuantidade() 
		   + ", Autor: " + autor 
		   + ", Tema: " + tema 
		   + ", QuantPag: " + quantPag + "]";
	}

}
