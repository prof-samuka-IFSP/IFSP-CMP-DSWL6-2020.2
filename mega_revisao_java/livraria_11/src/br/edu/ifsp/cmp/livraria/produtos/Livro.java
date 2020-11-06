package br.edu.ifsp.cmp.livraria.produtos;

import br.edu.ifsp.cmp.livraria.Autor;

public abstract class Livro extends Produto {
    private String titulo;
    private String isbn;
    private Autor autor;

    public Livro(String titulo, String isbn, double preco, Autor autor) {
        super(preco);
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
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

    public Autor getAutor() {
        return autor;
    }


    @Override
    public String toString() {
        return "+ Título: " + this.titulo + "\n" +
               "+ ISBN: " + this.isbn + "\n" +
               "+ Preço: " + this.getPreco() + "\n" +
               "+ br.edu.ifsp.cmp.livraria.Autor\n" + this.autor;
    }


    // sem desconto
    public double descontoMaximo() {
        return 0;
    }
}














