package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros  {

    private List<Integer> inteirosList;

    public OrdenacaoNumeros() {
        this.inteirosList = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        inteirosList.add(numero);
    }

    public List<Integer> ordenarAscendente(){
        List<Integer> listAscendente = new ArrayList<>(inteirosList);
        if(!inteirosList.isEmpty()){
            Collections.sort(listAscendente);
            return listAscendente;
        }else{
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public List<Integer> ordenarDescendente(){
        List<Integer> listDescendente = new ArrayList<>(inteirosList);
        if(!inteirosList.isEmpty()){
           listDescendente.sort(Collections.reverseOrder());
           return listDescendente;
        }else{
            throw new RuntimeException("A lista está vazia");
        }
    }

    public void exibirNumeros() {
        if (!inteirosList.isEmpty()) {
            System.out.println(inteirosList);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public static void main(String[] args) {

        // instanciando a classe ordenacaoNumeros
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

        //adicionando numeros a lista
        ordenacaoNumeros.adicionarNumero(2);
        ordenacaoNumeros.adicionarNumero(7);
        ordenacaoNumeros.adicionarNumero(3);
        ordenacaoNumeros.adicionarNumero(44);
        ordenacaoNumeros.adicionarNumero(18);
        ordenacaoNumeros.adicionarNumero(15);
        ordenacaoNumeros.adicionarNumero(36);
        ordenacaoNumeros.adicionarNumero(11);

        //exibindo a lista de numeros adicionados
        ordenacaoNumeros.exibirNumeros();

        //ordenando e exibindo em ordem ascendente
        System.out.println(ordenacaoNumeros.ordenarAscendente());

        //ordenando e exibindo em ordem descendente
        System.out.println(ordenacaoNumeros.ordenarDescendente());

    }
}
