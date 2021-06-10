package entities;

public class VideoGame extends Produto {

    private String marca;
    private String modelo;
    private boolean isUsado;

    public VideoGame() {
        super();
    }

    public VideoGame(String nome, double preco, int quantidade, String marca, String modelo, boolean isUsado) {
        super(nome, preco, quantidade);
        this.marca = marca;
        this.modelo = modelo;
        this.isUsado = isUsado;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isUsado() {
        return isUsado;
    }

    public void setUsado(boolean isUsado) {
        this.isUsado = isUsado;
    }

    public double calcularImpostoVideoGames() {
        if (isUsado == true) {
            return getQuantidade() * getPreco() * 0.25;
        }
        return getPreco() * 0.45;
    }

    @Override
    public String toString() {
        return "VideoGame [ Nome: " + getNome()
                + ", Preço: R$ " + String.format("%.2f", getPreco())
                + ", Quantidade: " + getQuantidade()
                + ", Marca: " + marca + ", Modelo: " + modelo + ", Usado? " + isUsado;
    }

}
