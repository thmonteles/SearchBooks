package list.operacoesBasicas;

public class Compra {

    private String descricao;

    public Compra(String descricao) {

        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }
}
