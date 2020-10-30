
public class LivroRuim {
    private String titulo;
    private String isbn;
    public double preco;
    private Autor autor;
    public boolean impresso;
    public String marcaDagua;

    public LivroRuim(String titulo, String isbn, double preco, Autor autor, boolean impresso) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.preco = preco;
        this.autor = autor;
        this.impresso = impresso;
    }

    public LivroRuim(String titulo, String isbn, double preco, Autor autor, String marcaDagua) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.preco = preco;
        this.autor = autor;
        this.impresso = false;
        this.marcaDagua = marcaDagua;
    }

    // SETTERS
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

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

    public double getPreco() {
        return preco;
    }

    public Autor getAutor() {
        return autor;
    }


    // true se o desconto for aplicado
    // false caso contrário
    public boolean aplicaDesconto(double porcentagem) {
        if (porcentagem < 0.0 || porcentagem > 1.0) { return false; }

        double porcentagemMaxima = (this.impresso == true) ? 0.3 : 0.15;
//        if (this.impresso == true) {
//            porcentagemMaxima = 0.3;
//        }
//        else {
//            porcentagemMaxima = 0.15;
//        }

        if (porcentagem <= porcentagemMaxima) {
            double desconto = this.preco * porcentagem;
            this.preco -= desconto; // this.preco = this.preco - desconto
            return true;
        }
        else { return false; }
    }



    @Override
    public String toString() {
        return "Livro\n" +
               "+ Título: " + this.titulo + "\n" +
               "+ ISBN: " + this.isbn + "\n" +
               "+ Preço: " + this.preco + "\n" +
               "+ Autor\n" + this.autor;
    }

}














