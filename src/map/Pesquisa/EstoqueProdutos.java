package map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(long codigo, String nome, int quantidade, double preco){
        estoqueProdutosMap.put(codigo,new Produto(nome,quantidade,preco));
    }

    public void exibirProdutos(){
        System.out.println(estoqueProdutosMap);
    }

    public double calcularValorTotalEstoque(){
        double valorTotalEstoque=0d;
        if(!estoqueProdutosMap.isEmpty()){
            for(Produto p : estoqueProdutosMap.values()){
                valorTotalEstoque+=p.getQuantidade()*p.getPreco();
            }
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if(!estoqueProdutosMap.isEmpty()){
            for(Produto p: estoqueProdutosMap.values()){
                if (p.getPreco() > maiorPreco){
                    produtoMaisCaro=p;
                    maiorPreco=p.getPreco();
                }
            }
        }
        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato(){
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        if(!estoqueProdutosMap.isEmpty()){
            for(Produto p: estoqueProdutosMap.values()){
                if (p.getPreco() < menorPreco){
                    produtoMaisBarato=p;
                    menorPreco=p.getPreco();
                }
            }
        }
        return produtoMaisBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque(){
        Produto produtoMaiorQuantidadeValorTotal = null;
        double maiorQuantidadeValorTotal= Double.MIN_VALUE;
        if(!estoqueProdutosMap.isEmpty()){
            for(Produto p: estoqueProdutosMap.values()){
                if(p.getPreco()*p.getQuantidade()>maiorQuantidadeValorTotal){
                    produtoMaiorQuantidadeValorTotal=p;
                    maiorQuantidadeValorTotal=p.getPreco()*p.getQuantidade();
                }
            }
        }
        return produtoMaiorQuantidadeValorTotal;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        estoqueProdutos.exibirProdutos();

        estoqueProdutos.adicionarProduto(1L,"Produto A",10,2.0);
        estoqueProdutos.adicionarProduto(2L,"Produto B",5,10.0);
        estoqueProdutos.adicionarProduto(3L,"Produto C",2,15.0);
        estoqueProdutos.adicionarProduto(8L,"Produto D",2,20.0);
        estoqueProdutos.exibirProdutos();

        System.out.println("Valor total do estoque: R$ " + estoqueProdutos.calcularValorTotalEstoque());
        System.out.println("Produto mais caro: " + estoqueProdutos.obterProdutoMaisCaro());
        System.out.println("Produto mais barato " + estoqueProdutos.obterProdutoMaisBarato());
        System.out.println(estoqueProdutos.obterProdutoMaiorQuantidadeValorTotalNoEstoque());

    }
}
