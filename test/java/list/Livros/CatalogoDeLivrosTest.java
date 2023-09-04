package list.Livros;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import junit.framework.TestCase;
import list.operacoesBasicas.ListCompras;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CatalogoDeLivrosTest extends TestCase {
    private CatalogoDeLivros CatalogoDeLivros;

    @Before
    public void setUp() {
        CatalogoDeLivros = new CatalogoDeLivros();
        CatalogoDeLivros.adicionarlivro("Os 4 Compromissos", "Don Miguel Ruiz", 2021);
        CatalogoDeLivros.adicionarlivro("Os 4 Compromissos", "Don Miguel Ruiz", 2021);
        CatalogoDeLivros.adicionarlivro("Livro2", "Autor2", 2011);
        CatalogoDeLivros.adicionarlivro("Livro3", "Autor1", 2022);
    }

    @Test
    public void testAdicionarlivro() {
        CatalogoDeLivros.adicionarlivro("Os 4 Compromissos", "Don Miguel Ruiz", 2021);
        CatalogoDeLivros.adicionarlivro("Os 4 Compromissos", "Don Miguel Ruiz", 2021);
        assertNotNull(CatalogoDeLivros.pesquisarPorTitulo("Os 4 Compromissos"));
    }

    @Test
    public void testPesquisarPorAutor() {
        List<Livro> livrosPorAutor = CatalogoDeLivros.PesquisarPorAutor("Don Miguel Ruiz");
        assertEquals(2, livrosPorAutor.size());

    }

    @Test
    public void testPesquisarPorIntervalosDeAnos() {
        List<Livro> livrosPorIntervalosDeAnos = CatalogoDeLivros.PesquisarPorIntervalosDeAnos(2000, 2023);
        assertEquals(4, livrosPorIntervalosDeAnos.size());
        System.out.println(livrosPorIntervalosDeAnos);
    }

    @Test
    public void testBuscarLivrosPorAno() {

        List<Livro> livrosOrdenados = new ArrayList<>();
        livrosOrdenados.add(new Livro("Livro B", "Autor1", 2030));
        livrosOrdenados.add(new Livro("Livro A", "Autor2", 2025));
        livrosOrdenados.add(new Livro("Livro C", "Autor3", 2023));
        Collections.sort(livrosOrdenados);

        System.out.println(livrosOrdenados);
    }
}