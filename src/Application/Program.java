package Application;

import java.util.ArrayList;
import java.util.List;

import entities.Jogos;
import entities.Livro;
import entities.Loja;
import entities.VideoGame;

public class Program {

    public static void main(String[] args) {
        Livro cabana = new Livro("A cabana", 35.50, 20, "Willian P. Youing", "História", 2);
        Livro orgulho = new Livro("Orgulho", 27.60, 50, "Desconhecido", "EDUCATIVO", 5);

        List<Livro> livros = new ArrayList<>();
        livros.add(cabana);
        livros.add(orgulho);

        VideoGame ps4 = new VideoGame("Playstation 4 ", 1500.00, 7, "Sony", "Slin", false);
        VideoGame ps2Usado = new VideoGame("Playstation 2", 527.53, 200, "Sony", "compact", true);
        VideoGame ps5 = new VideoGame("PS5", 2.600, 45, "SONY", "SLIN", false);

        List<VideoGame> games = new ArrayList<>();
        games.add(ps4);
        games.add(ps5);
        games.add(ps2Usado);

        Jogos jogo = new Jogos("Playstations", "Ficção", "God Of War", 150.0, 42, "SONY", "PS5", false);
        Jogos jogo1 = new Jogos("Miclosoft", "Ação", "Dark souls", 129.90, 100, "PC", "null", true);
        Jogos jogo2 = new Jogos("Playstation", "Avnetura", "Tonny Holks", 170.00,15, "SONY", "PS5", false);

        List<Jogos> jogos = new ArrayList<>();
        jogos.add(jogo);
        jogos.add(jogo1);
        jogos.add(jogo2);

        System.out.println();

        Loja loja = new Loja("Americanas", "123542132", livros, games, jogos);

        System.out.println("-------------Testando Calculo de imposto--------------");
        System.out.println(" Imposto do livro: " + cabana.getNome()
                + ", Tema: " + cabana.getTema() + ", é de R$" + String.format("%.2f", cabana.calcularImpostoLivros()));

        System.out.println(" Imposto do livro: " + orgulho.getNome()
                + ", Tema: " + orgulho.getTema() + ", é de R$" + String.format("%.2f", orgulho.calcularImpostoLivros()));

        System.out.println(" Imposto do VideoGame: " + ps4.getNome()
                + ", Usado? " + ps4.isUsado() + ", é de R$" + ps4.calcularImpostoVideoGames());

        System.out.println(" Imposto do Videogame: " + ps2Usado.getNome()
                + ", Usado? " + ps2Usado.isUsado() + ", é de R$ " + ps2Usado.calcularImpostoVideoGames() + "\n");

        System.out.println("-------------Fim do teste do calculo de impostos--------");

        System.out.println(" Testando o metodo de desconto ");
        System.out.println(" Desconto do jogo usado " + jogo.getPlataforma()
                + " foi de R$" + String.format("%.2f", jogo1.calcularDescontoJogos())
                + ", Você pagara o valor de R$" + String.format("%.2f", jogo1.getPreco() - jogo1.calcularDescontoJogos()) + "\n");

        System.out.println("-------------Testando Método Listar livros,games e jogos--------------\n");

        loja.listarLivros(livros);
        System.out.println();

        loja.listarGames(games);
        System.out.println();

        loja.listarJogos(jogos);
        System.out.println();

        System.out.println("--------------Testando Metodo calcularPatrimonio---------");
        System.out.println(" O patrimonio da loja " + loja.getNome() + " é igual a R$ " + String.format("%.2f", loja.calcularPatrimonio()));

    }

}
