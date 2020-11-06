package br.edu.ifsp.cmp.livraria.produtos;

import br.edu.ifsp.cmp.livraria.Autor;

public class Ebook extends Livro {
    private String marcaDagua;

    public Ebook(String titulo, String isbn, double preco, Autor autor, String marcaDagua) {
        super(titulo, isbn, preco, autor);
        this.marcaDagua = marcaDagua;
    }

    @Override
    public double descontoMaximo() {
        return this.getPreco() * 0.15;
    }


    @Override
    public String toString() {
        return super.toString() + "\n" +
               "+ Marca Dágua: " + this.marcaDagua;
    }
}
