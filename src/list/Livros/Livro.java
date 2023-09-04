package list.Livros;

public class Livro implements Comparable<Livro> {
    private  String titulo;
    private String autor;

    private  int anoDePublicacao;

    @Override
    public int compareTo(Livro ano) {
        return Integer.compare(anoDePublicacao, ano.getAnoDePublicacao());
    }
    public Livro(String titulo, String autor, int anoDePublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoDePublicacao = anoDePublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoDePublicacao() {
        return anoDePublicacao;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anoDePublicacao=" + anoDePublicacao +
                '}';
    }

}

