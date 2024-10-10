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

    public List pesquisaPorAutor(String autor){
        List<Livro> livrosEncontrados = new ArrayList<>();
        if (!livroList.isEmpty()){
            for(Livro l: livroList){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosEncontrados.add(l);
                }
            }
        }else{
            System.out.println("A lista está vazia");
        }
        return livrosEncontrados;
    }




    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        System.out.println(catalogoLivros.pesquisaPorAutor("Autor2"));
        catalogoLivros.adicionarLivro("Titulo1", "Autor1", 2002);
        catalogoLivros.adicionarLivro("Titulo2", "Autor1", 2003);
        catalogoLivros.adicionarLivro("Titulo3", "Autor1", 2004);
        catalogoLivros.adicionarLivro("Titulo10", "Autor2", 2002);
        catalogoLivros.adicionarLivro("Titulo20", "Autor2", 2003);
        catalogoLivros.adicionarLivro("Titulo30", "Autor2", 2004);
        catalogoLivros.adicionarLivro("Titulo100", "Autor3", 2002);
        catalogoLivros.adicionarLivro("Titulo200", "Autor3", 2003);
        catalogoLivros.adicionarLivro("Titulo300", "Autor3", 2004);

        System.out.println(catalogoLivros.pesquisaPorAutor("Autor2"));

    }
}
