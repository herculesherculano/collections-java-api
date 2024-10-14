package list.Ordenacao;

import java.util.ArrayList;
import java.util.List;

public class OrdenacaoNumeros {

    private List<Integer> inteirosList;

    public OrdenacaoNumeros() {
        this.inteirosList = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        inteirosList.add(numero);
    }


}
