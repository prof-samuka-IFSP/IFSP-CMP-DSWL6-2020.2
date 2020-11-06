package br.edu.ifsp.cmp.livraria.produtos;

import br.edu.ifsp.cmp.livraria.Editora;

public class Revista extends Produto {
    private String nome;
    private String descricao;
    private Editora editora;

    public Revista(String nome, String descricao, double preco, Editora editora) {
        super(preco);
        this.nome = nome;
        this.descricao = descricao;
        this.editora = editora;
    }

    // OMITINDO ALGUNS GETTERS AND SETTERS
    @Override
    public String toString() {
        return "+ Nome: " + this.nome + "\n" +
               "+ Descricao: " + this.descricao + "\n" +
               "+ Preço: " + this.getPreco() + "\n" + this.editora;
    }

    @Override
    public double descontoMaximo() {
        return this.getPreco() * 0.1;
    }
}
