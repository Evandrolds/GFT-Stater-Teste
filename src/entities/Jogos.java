package entities;

public class Jogos extends VideoGame {

    private String plataforma;
    private String genero;

    public Jogos(String plataforma, String genero, String nome, double preco, int quantidade, String marca, String modelo, boolean isUsado) {
        super(nome, preco, quantidade, marca, modelo, isUsado);
        this.plataforma = plataforma;
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Jogos [ plataforma: " + plataforma
                + ", Genero: " + genero
                + ", Usado? " + isUsado()
                + ", Preco R$" + String.format("%.2f", getPreco())
                + ", Quantidade:" + getQuantidade() + "]";
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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double calcularDescontoJogos() {
        double desconto;
        if (isUsado()) {

            desconto =+ this.getPreco() * 0.3;
            return desconto;
        }
        return this.getPreco();
    }

}
