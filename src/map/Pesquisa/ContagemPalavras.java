package map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {

    private Map<String, Integer> contagemPalavrasMap;

    public ContagemPalavras() {
        this.contagemPalavrasMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem){
        contagemPalavrasMap.put(palavra, contagem);
    }

    public void removerPalavra(String palavra){
        if (!contagemPalavrasMap.isEmpty()){
            if (contagemPalavrasMap.containsKey(palavra)){
                contagemPalavrasMap.remove(palavra);
            }else{
                System.out.println("palavra não encontrada");
            }

        }
    }

    public void exibirContagemPalavras(){
        System.out.println(contagemPalavrasMap);
    }

    public String encontrarPalavraMaisFrequente(){
        String palavraMaisFrequente=null;
        int maiorFrequencia=Integer.MIN_VALUE;
        if (!contagemPalavrasMap.isEmpty()){
            for( Map.Entry<String, Integer> entry : contagemPalavrasMap.entrySet()){
                if(entry.getValue() > maiorFrequencia){
                    palavraMaisFrequente = entry.getKey();
                    maiorFrequencia= entry.getValue();

                }
            }
        }
        return palavraMaisFrequente;
    }


    public static void main(String[] args) {
        ContagemPalavras contagemPalavras = new ContagemPalavras();

        contagemPalavras.exibirContagemPalavras();

        contagemPalavras.adicionarPalavra("Palavra 1", 2);
        contagemPalavras.adicionarPalavra("Palavra 2", 1);
        contagemPalavras.adicionarPalavra("Palavra 3", 7);
        contagemPalavras.adicionarPalavra("Palavra 4", 11);
        contagemPalavras.adicionarPalavra("Palavra 5", 6);

        contagemPalavras.exibirContagemPalavras();

        System.out.println(contagemPalavras.encontrarPalavraMaisFrequente());
        contagemPalavras.removerPalavra("Palavra 3");

        contagemPalavras.exibirContagemPalavras();


    }

}
