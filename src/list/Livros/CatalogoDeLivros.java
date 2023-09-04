package list.Livros;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CatalogoDeLivros {
    private List<Livro> listaDeLivros;

    public CatalogoDeLivros() {
        this.listaDeLivros = new ArrayList<>();
    }
    public void adicionarlivro(String titulo, String autor, int anoDePublicacao){
    listaDeLivros.add(new Livro(titulo, autor, anoDePublicacao));
    }
    public List<Livro> PesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();

        if(!listaDeLivros.isEmpty()) {
            for (Livro l : listaDeLivros){
                if(l.getAutor().equalsIgnoreCase(autor)){
                   livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> PesquisarPorIntervalosDeAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervalosDeAnos = new ArrayList<>();

        if(!listaDeLivros.isEmpty()) {
            for (Livro ano : listaDeLivros){
                if (ano.getAnoDePublicacao() >= anoInicial && ano.getAnoDePublicacao() <= anoFinal){
                    livrosPorIntervalosDeAnos.add(ano);
                }
            }
        }
        return livrosPorIntervalosDeAnos;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if(!listaDeLivros.isEmpty()) {
            for (Livro title : listaDeLivros){
                if (title.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = title;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }
    public List<Livro> buscarLivrosPorAno() {
        List<Livro> livrosEncontrados = new ArrayList<>(listaDeLivros);
        Collections.sort(livrosEncontrados);
        return livrosEncontrados;
        }
}
