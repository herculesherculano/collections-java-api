package list.OperacoesBasicas;

public class Item {

    private String nome;
    private int quantidade;
    private double preco;

    public Item(String nome, int quantidade, double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Item{" +
                    "nome='" + nome + '\'' +
                    ", quantidade=" + quantidade +
                    ", preco=" + preco +
                    '}';
    }
}
