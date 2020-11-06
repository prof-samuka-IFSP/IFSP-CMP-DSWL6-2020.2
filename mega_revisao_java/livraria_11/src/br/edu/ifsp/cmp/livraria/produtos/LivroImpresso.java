package br.edu.ifsp.cmp.livraria.produtos;

import br.edu.ifsp.cmp.livraria.Autor;

public class LivroImpresso extends Livro {
    private double taxaDeImpresao;

    public LivroImpresso(String titulo, String isbn, double preco, Autor autor, double taxaDeImpresao) {
        super(titulo, isbn, preco, autor);
        this.taxaDeImpresao = taxaDeImpresao;
    }


    @Override
    public double descontoMaximo() {
        return this.taxaDeImpresao * 2;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
               "+ Taxa de Impressao: " + this.taxaDeImpresao;
    }
}
