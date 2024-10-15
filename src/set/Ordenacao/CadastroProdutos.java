package set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long codigo, String nome, double preco, int quantidade){
        produtoSet.add(new Produto(codigo, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtosPorNome= new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco(){
       Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
       produtosPorPreco.addAll(produtoSet);
       return produtosPorPreco;
    }

    public Set<Produto> exibirProdutosPorQuantidade(){
        Set<Produto> produtosPorQuantidade = new TreeSet<>(new ComparatorPorQuantidade());
        produtosPorQuantidade.addAll(produtoSet);
        return produtosPorQuantidade;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto(1L, "Produto A", 10d, 3);
        cadastroProdutos.adicionarProduto(2L, "Produto B", 15d, 1);
        cadastroProdutos.adicionarProduto(3L, "Produto C", 5d, 5);
        cadastroProdutos.adicionarProduto(4L, "Produto D", 8d, 2);
        cadastroProdutos.adicionarProduto(5L, "Produto E", 3d, 9);

        System.out.println(cadastroProdutos.exibirProdutosPorNome());
        System.out.println(cadastroProdutos.exibirProdutosPorPreco());
        System.out.println(cadastroProdutos.exibirProdutosPorQuantidade());

    }
}
