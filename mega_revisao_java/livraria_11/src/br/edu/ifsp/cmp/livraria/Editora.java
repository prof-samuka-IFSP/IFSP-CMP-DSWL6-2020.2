package br.edu.ifsp.cmp.livraria;

public class Editora {
    private String nome;
    private String cnpj;

    public Editora(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return "br.edu.ifsp.cmp.livraria.Editora{" +
               "nome='" + nome + '\'' +
               ", cnpj='" + cnpj + '\'' +
               '}';
    }
}
