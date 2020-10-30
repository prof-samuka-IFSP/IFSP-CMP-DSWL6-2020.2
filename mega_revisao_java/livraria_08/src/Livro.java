
public abstract class Livro implements Produto {
    private String titulo;
    private String isbn;
    private double preco;
    private Autor autor;

    public Livro(String titulo, String isbn, double preco, Autor autor) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.preco = preco;
        this.autor = autor;
    }

    // SETTERS
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    protected void setPreco(double preco) { this.preco = preco; }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }


    // GETTERS
    public String getTitulo() {
        return titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public double getPreco() {
        return preco;
    }

    public Autor getAutor() {
        return autor;
    }


    // true se o desconto for aplicado
    // false caso contrário
    public abstract boolean aplicaDesconto(double porcentagem);



    @Override
    public String toString() {
        return "+ Título: " + this.titulo + "\n" +
               "+ ISBN: " + this.isbn + "\n" +
               "+ Preço: " + this.preco + "\n" +
               "+ Autor\n" + this.autor;
    }

}














