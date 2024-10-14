package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {

    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoaPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoaPorAltura, new ComparatorPorAltura());
        return pessoaPorAltura;
    }

    public static void main(String[] args) {
        //instanciando a classe OrdenacaoPessoa
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();

        //adicionando pessoas a lista de ordenação de pessoas
        ordenacaoPessoa.adicionarPessoa("João", 30, 1.60);
        ordenacaoPessoa.adicionarPessoa("Maria", 28, 1.65);
        ordenacaoPessoa.adicionarPessoa("José", 29, 1.70);
        ordenacaoPessoa.adicionarPessoa("Pedro", 25, 1.75);

        //ordenando e exibindo a lista de pessoas por idade
        System.out.println(ordenacaoPessoa.ordenarPorIdade());

        //ordenando e exibindo a lista de pessoas por altura
        System.out.println(ordenacaoPessoa.ordenarPorAltura());

    }
}
