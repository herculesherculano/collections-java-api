package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos(){
        if(!contatoSet.isEmpty()){
            System.out.println(contatoSet);
        }else{
            System.out.println("A agenda está vazia!");
        }
    }

    public Set<Contato> pesquisarContato(String nome){
        Set<Contato> contatosPorNome=new HashSet<>();
        for(Contato c: contatoSet){
            if(c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for(Contato c: contatoSet){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return  contatoAtualizado;
    }

    public static void main(String[] args) {
       AgendaContatos agendaContatos = new AgendaContatos();

       agendaContatos.exibirContatos();

       agendaContatos.adicionarContato("Hercules", 123456);
       agendaContatos.adicionarContato("Bruno", 124365);
       agendaContatos.adicionarContato("Bruno Miguel", 132567);
       agendaContatos.adicionarContato("João", 283491);

       agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarContato("Bruno"));
        agendaContatos.atualizarNumeroContato("Bruno", 986473);

        agendaContatos.exibirContatos();

    }
}
