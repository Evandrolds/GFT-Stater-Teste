package entities;

public class Jogos extends VideoGame {
	private String plataforma;
	private String titulo;
	private String genero;

	public Jogos(String titulo, String genero, String plataforma, double preco, int quantidade, boolean isUsado) {
		super();
		this.setUsado(isUsado);
		this.setPreco(preco);
		this.setQuantidade(quantidade);
		this.plataforma = plataforma;
		this.titulo = titulo;
		this.genero = genero;

	}

	@Override
	public String toString() {
		return "Jogos [ plataforma: " + plataforma 
				+ ", Título: " + titulo 
				+ ", Genero: " + genero 
				+ ", É usado? "+isUsado()
				+", Preço R$"+String.format("%.2f",getPreco())+
				", Quantidade:"+ getQuantidade()+"]";
	}

	public Jogos() {
		super();
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public double calcularDesconto() {
double desconto = 0.0;
		if (isUsado() == true) {
         
			desconto = this.getPreco()* 0.30;
			return desconto;
		}
		return this.getPreco();
	}

}
