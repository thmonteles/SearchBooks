package list.operacoesBasicas;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

public class CompraTest extends TestCase {
    private ListCompras listTarefas;

    @Before
    public void setUp() {
        listTarefas = new ListCompras();
    }

    @Test
    public void testValidarDescricaoDaTarefa() {
        var expectedDescriptionResult = "Ir ao laboratorio";
        var descricao = new Compra(expectedDescriptionResult);
        assertEquals(expectedDescriptionResult, descricao.getDescricao());

    }
    @Test
    public void testObterNumeroTotalDeTarefas(){
        listTarefas.adicionarCompras("Tarefa 1");
        listTarefas.adicionarCompras("Tarefa 2");
        assertEquals(2, listTarefas.obterNumeroTotalDeCompras());
    }

}