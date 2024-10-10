package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, int quantidade, double preco) {
        itemList.add(new Item(nome, quantidade, preco));
    }

    public void removerItem(String nome) {
        List<Item> itemParaRemover = new ArrayList<>();
        if(!itemList.isEmpty()) {
            for (Item i : itemList) {
                if (i.getNome().equalsIgnoreCase(nome)) {
                    itemParaRemover.add(i);
                }
            }
            itemList.removeAll(itemParaRemover);
        }else{
            System.out.println("A lista está vazia");
        }
    }

    public double calcularValorTotal() {
        double valorTotal = 0d;
        if(!itemList.isEmpty()) {
            for (Item i : itemList) {
                valorTotal = valorTotal + (i.getQuantidade() * i.getPreco());
            }
            return valorTotal;
        }else{
            throw new  RuntimeException("A lista está vazia");
        }
    }

    public void exibirItens() {
        if(!itemList.isEmpty()){
            System.out.println(itemList);
        }else{
            System.out.println("A lista está vazia");
        }
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompras{" +
                "itemList=" + itemList +
                '}';
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.exibirItens();
        carrinhoDeCompras.removerItem("Item1");
        carrinhoDeCompras.calcularValorTotal();
        carrinhoDeCompras.adicionarItem("Item1", 2, 10);
        carrinhoDeCompras.adicionarItem("Item2", 3, 30);
        carrinhoDeCompras.adicionarItem("Item3", 1, 40);
        carrinhoDeCompras.adicionarItem("Item4", 10, 5);
        carrinhoDeCompras.exibirItens();
        System.out.println(carrinhoDeCompras.calcularValorTotal());
    }


}
