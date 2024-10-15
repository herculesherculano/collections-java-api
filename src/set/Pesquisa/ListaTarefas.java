package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {

    private Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        Tarefa tarefaParaRemover = null;
        if(!tarefaSet.isEmpty()){
            for(Tarefa t: tarefaSet){
                if(t.getDescricao().equalsIgnoreCase(descricao)){
                    tarefaParaRemover=t;
                    break;
                }
            }
            tarefaSet.remove(tarefaParaRemover);
        }else{
            System.out.println("A lista de tarefas está vazia!");
        }
        if(tarefaParaRemover == null){
            System.out.println("Tarefa não encontrada!");
        }
    }

    public void exibirTarefas(){
        if (!tarefaSet.isEmpty()){
            System.out.println(tarefaSet);
        }else{
            System.out.println(("A lista de tarefas está vazia!"));
        }
    }

    public int contarTarefas(){
        return tarefaSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas=new HashSet<>();
        if(!tarefaSet.isEmpty()){
            for(Tarefa t: tarefaSet){
                if(t.isTarefaConcluida()) {
                    tarefasConcluidas.add(t);
                }
            }
        }else{
            System.out.println("A lista de tarefas está vazia!");
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentes=new HashSet<>();
        if(!tarefaSet.isEmpty()){
            for(Tarefa t: tarefaSet){
                if(!t.isTarefaConcluida()){
                    tarefasPendentes.add(t);
                }
            }
        }else{
            System.out.println("A lista de tarefas está vazia!");
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao){
        if (!tarefaSet.isEmpty()){
            for(Tarefa t: tarefaSet){
                if(t.getDescricao().equalsIgnoreCase(descricao)){
                    t.setTarefaConcluida(true);
                    break;
                }
            }
        }else{
            System.out.println("A lista de tarefas está vazia!");
        }
    }

    public void marcarTarefaPendente(String descricao){
        if (!tarefaSet.isEmpty()){
            for(Tarefa t: tarefaSet){
                if(t.getDescricao().equalsIgnoreCase(descricao)){
                    t.setTarefaConcluida(false);
                    break;
                }
            }
        }else{
            System.out.println("A lista de tarefas está vazia!");
        }
    }

    public void limparListaTarefas(){
        tarefaSet.clear();
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.exibirTarefas();


        listaTarefas.adicionarTarefa("Tarefa 1");
        listaTarefas.adicionarTarefa("Tarefa 2");
        listaTarefas.adicionarTarefa("Tarefa 3");
        listaTarefas.adicionarTarefa("Tarefa 4");
        listaTarefas.adicionarTarefa("Tarefa 5");

        listaTarefas.marcarTarefaConcluida("Tarefa 1");

        listaTarefas.exibirTarefas();

        System.out.println(listaTarefas.contarTarefas());

        System.out.println("lista de tarefas concluidas" + listaTarefas.obterTarefasConcluidas());
        System.out.println();
        listaTarefas.marcarTarefaPendente("Tarefa 1");
        System.out.println("lista de tarefas pendentes" + listaTarefas.obterTarefasPendentes());

        listaTarefas.limparListaTarefas();

        listaTarefas.exibirTarefas();
    }

}
