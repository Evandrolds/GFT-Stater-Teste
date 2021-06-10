package entities;

import java.util.List;

public class Loja extends Produto {

    private String cnpj;
    private List<Livro> listLivros;
    private List<VideoGame> listGames;
    private List<Jogos> listJogos;

    public Loja(String nome, String cnpj, List<Livro> listLivros, List<VideoGame> listGames, List<Jogos> jogos) {

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
            game.forEach((list) -> {
                System.out.println("Games: " + list);
            });
        }else{
            System.out.println("Estoque de Video Games finalizado!");
        }
    }

    public void listarJogos(List<Jogos> jogos) {
        if (jogos != null) {
            jogos.forEach((list) -> {
                System.out.println("Jogos: " + list);
            });
        }else{
            System.out.println("Estoque d jogos finalizado!");
        }
    }

    public void listarLivros(List<Livro> livros) {
        if (livros != null) {
            livros.forEach((list) -> {
                System.out.println("Livros: " + list);
            });
        }else{
            System.out.println("Estoque de livros finalizado!");
        }
    }

    public double calcularPatrimonio() {

        double somaGames = 0.0;
        double somarLivro = 0.0;
        double somarJogos = 0.0;
        somaGames = listGames.stream().map((games) -> (games.getQuantidade() * games.getPreco())).reduce(somaGames, (vamo, vamos) -> vamos + vamo);
        somarLivro = listLivros.stream().map((livro) -> (livro.getQuantidade() * livro.getPreco())).reduce(somarLivro, (accumulator, _item) -> accumulator + _item);
        somarJogos = listJogos.stream().map((jogo) -> (jogo.getQuantidade() * jogo.getPreco())).reduce(somarJogos, (accumulator, _item) -> accumulator + _item);

        return somaGames + somarLivro + somarJogos;
    }

}
