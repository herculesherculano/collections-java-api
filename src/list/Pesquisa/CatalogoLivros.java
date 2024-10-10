package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(titulo,autor,anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()){
            for(Livro l: livroList){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorInvervaloAnos = new ArrayList<>();
        if (!livroList.isEmpty()){
            for (Livro l: livroList){
                if(l.getAnoPublicacao()>=anoInicial && l.getAnoPublicacao()<=anoFinal){
                    livrosPorInvervaloAnos.add(l);
                }
            }
        }
        return livrosPorInvervaloAnos;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo= null;
        if(!livroList.isEmpty()){
            for(Livro l: livroList){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo=l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }


    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        System.out.println(catalogoLivros.pesquisarPorAutor("Autor2"));
        catalogoLivros.adicionarLivro("Titulo1", "Autor1", 2002);
        catalogoLivros.adicionarLivro("Titulo2", "Autor1", 2003);
        catalogoLivros.adicionarLivro("Titulo3", "Autor1", 2004);
        catalogoLivros.adicionarLivro("Titulo10", "Autor2", 2002);
        catalogoLivros.adicionarLivro("Titulo20", "Autor2", 2003);
        catalogoLivros.adicionarLivro("Titulo30", "Autor2", 2004);
        catalogoLivros.adicionarLivro("Titulo100", "Autor3", 2002);
        catalogoLivros.adicionarLivro("Titulo200", "Autor3", 2003);
        catalogoLivros.adicionarLivro("Titulo300", "Autor3", 2005);
        catalogoLivros.adicionarLivro("Titulo1", "Autor3", 2003);

        System.out.println(catalogoLivros.pesquisarPorAutor("Autor2"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2002,2003));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Titulo1"));

    }
}
