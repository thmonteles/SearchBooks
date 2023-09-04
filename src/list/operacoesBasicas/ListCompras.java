package list.operacoesBasicas;
import java.util.ArrayList;
import java.util.List;

public class ListCompras {
    private List<Compra> compraList;
    public ListCompras() {
        this.compraList = new ArrayList<>();
    }

    public void adicionarCompras(String descricao){
        compraList.add(new Compra(descricao));
    }

    public void removerCompra(String descricao){
        List<Compra> tarefasParaRemover = new ArrayList<>();
        for(Compra t : compraList){
            if (t.getDescricao().equals(descricao)) {
                tarefasParaRemover.add(t);
            }
        }
       compraList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalDeCompras(){
        return compraList.size();
    }

    public void obterDescricaoDaCompra(){
        System.out.println(compraList);
    }

    public static void main(String[] args) {
        ListCompras ListCompras = new ListCompras();

        System.out.println("Total de itens na sua lista: " + ListCompras.obterNumeroTotalDeCompras());

        ListCompras.adicionarCompras( "Tarefa 1");
        ListCompras.adicionarCompras( "Tarefa 2");
        ListCompras.adicionarCompras( "Tarefa 2");
        System.out.println("Total de itens na sua lista: " + ListCompras.obterNumeroTotalDeCompras());
        ListCompras.removerCompra("Tarefa 1");
        System.out.println("Total de itens na sua lista: " + ListCompras.obterNumeroTotalDeCompras());
        System.out.println("Sua Lista:");
        ListCompras.obterDescricaoDaCompra();


    }
}
