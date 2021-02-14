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

		VideoGame ps4 = new VideoGame("Playstation 4 ", 3500.00, 7, "Sony", "Slin", false);
		VideoGame ps2Usado = new VideoGame("Playstation 2", 500.00, 10, "Sony", "compact", true);
		
		List<VideoGame> games = new ArrayList<>();
		games.add(ps4);
		games.add(ps2Usado);
		
		Jogos jogo = new Jogos("God of war", "Acão", "PS4", 156.00, 50, false);
		Jogos jogo1 = new Jogos("Dark souls", "Aventura", "PC",60.00,20, true);
		Jogos jogo2 = new Jogos("Tonny Holks", "Skate","PS3",75.00,14, false);
		
		List<Jogos> jogos = new ArrayList<>();
		jogos.add(jogo);
		jogos.add(jogo1);
		jogos.add(jogo2);


		System.out.println();
		
		Loja loja = new Loja("Americanas", "2154785", livros, games,jogos);
		
		System.out.println("-------------Testando Calculo de imposto--------------");
		System.out.println(" Imposto do livro: "+cabana.getNome() +", Tema: "+ cabana.getTema()+", é de R$"+String.format("%.2f", cabana.calcularImposto()));
		System.out.println(" Imposto do livro: "+orgulho.getNome()+", Tema: "+ orgulho.getTema()+", é de R$"+String.format("%.2f",orgulho.calcularImposto()));
		System.out.println(" Imposto do VideoGame: "+ps4.getNome()+", É usado? "+ ps4.isUsado() +", é de R$"+ps4.calcularImposto());
		System.out.println(" Imposto do Videogame: "+ps2Usado.getNome()+", É usado? "+ ps2Usado.isUsado()+", é de R$ "+ps2Usado.calcularImposto());
		System.out.println();
		System.out.println("-------------Fim do teste do calculo de impostos--------");
		
		System.out.println(" Testando o metodo de desconto ");
		System.out.println(" Desconto do jogo usado de Titulo: "+jogo1.getTitulo() 
		                   +" foi de R$"+ String.format("%.2f",jogo1.calcularDesconto())
		                   +", Você pagará o valor de R$"+String.format("%.2f", jogo1.getPreco()-jogo1.calcularDesconto()));
		System.out.println();
		
		System.out.println("-------------Testando Método Listar livros,games e jogos--------------");
		System.out.println();
		
		loja.listarLivros(livros);
		System.out.println();
	   loja.listarGames(games);
		System.out.println();
	   loja.listarJogos(jogos);
		System.out.println();
		System.out.println("--------------Testando Metodo calcularPatrimonio---------");
		System.out.println(" O patrimonio da loja "+loja.getNome()+" é igual a R$ "+String.format("%.2f", loja.calcularPatrimonio()));
		

	}

}
