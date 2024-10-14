package list.Pesquisa;

import java.util.List;
import java.util.ArrayList;

public class SomaNumeros {

    private List<Integer> listInteiros;

    public SomaNumeros() {
        this.listInteiros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        listInteiros.add(numero);
    }

    public int calcularSoma(){
        int soma=0;
        for(Integer i : listInteiros){
            soma=soma+i;
        }
        return soma;
    }

    public int encontrarMaiorNumero(){
        int maiorNumero=Integer.MIN_VALUE;
        if(!listInteiros.isEmpty()) {
            for (Integer i : listInteiros) {
                if (i >= maiorNumero) {
                    maiorNumero = i;
                }
            }
            return maiorNumero;
        }else{
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public int encontrarMenorNumero(){
        int menorNumero=Integer.MAX_VALUE;
        if(!listInteiros.isEmpty()) {
            for (Integer i : listInteiros) {
                if (i <= menorNumero) {
                    menorNumero = i;
                }
            }
            return menorNumero;
        }else{
            throw  new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirNumeros(){
        if(!listInteiros.isEmpty()) {
            System.out.println(listInteiros);
        }else{
            System.out.println("A lista está vazia!");
        }
    }

    public static void main(String[] args) {

        //criando instância da classe SomaNumeros
        SomaNumeros somaNumeros = new SomaNumeros();

        //adicionando números a lista
        somaNumeros.adicionarNumero(10);
        somaNumeros.adicionarNumero(15);
        somaNumeros.adicionarNumero(25);
        somaNumeros.adicionarNumero(-5);

        //exibindo a lista de números adicionados
        somaNumeros.exibirNumeros();

        //calculando e exibindo a soma dos números da lista
        System.out.println("A soma dos numeros é: " + somaNumeros.calcularSoma());

        //encontrando e exibindo o maior número da lista
        System.out.println("O maior número é: " + somaNumeros.encontrarMaiorNumero());

        //encontrando e exibindo o menor número da lista
        System.out.println("O menor número é: " + somaNumeros.encontrarMenorNumero());

    }
}
