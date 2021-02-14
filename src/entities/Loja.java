package entities;

import java.util.List;

public class Loja extends Produto {

	private String cnpj;
	private List<Livro> listLivros;
	private List<VideoGame> listGames;
	private List<Jogos> listJogos;

	public Loja(String nome, String cnpj, List<Livro> listLivros, List<VideoGame> listGames, List<Jogos> jogos) {

		this.setNome(nome);
		this.cnpj = cnpj;
		this.listLivros = listLivros;
		this.listGames = listGames;
		this.listJogos = jogos;
	}

	public Loja() {
		super();
	}

	public List<Jogos> getListJogos() {
		return listJogos;
	}

	public void setListJogos(List<Jogos> listJogos) {
		this.listJogos = listJogos;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public List<Livro> getListLivros() {
		return listLivros;
	}

	public void setListLivros(List<Livro> listLivros) {
		this.listLivros = listLivros;
	}

	public List<VideoGame> getListGames() {
		return listGames;
	}

	public void setListGames(List<VideoGame> listGames) {
		this.listGames = listGames;
	}

	public void listarGames(List<VideoGame> game) {
		if (game != null) {
			for (VideoGame obj : game) {
				System.out.println(obj);
			}
		}
	}
	public void listarJogos(List<Jogos> jogos) {
		if (jogos != null) {
			for (Jogos jogos2 : jogos) {
				System.out.println(jogos2);
			}
		}
	}
	
	public void listarLivros(List<Livro> livros) {
		if (livros != null) {
			for (Livro obj : livros) {

				System.out.println(obj);
			}
		}
	}

	public double calcularPatrimonio() {

		double somaGames = 0.0;
		double somarLivro = 0.0;
		double somarJogos = 0.0;

		for (VideoGame game : listGames) {
			somaGames += (game.getQuantidade() * game.getPreco());
		}
		for (Livro livro : listLivros) {
			somarLivro += (livro.getQuantidade() * livro.getPreco());
		}
		for (Jogos jogo : listJogos) {
			somarJogos += (jogo.getQuantidade() * jogo.getPreco());
		}

		return somaGames + somarLivro+ somarJogos;
	}

}
