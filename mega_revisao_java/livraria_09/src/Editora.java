public class Editora {
    private String nome;
    private String cnpj;

    public Editora(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return "Editora{" +
               "nome='" + nome + '\'' +
               ", cnpj='" + cnpj + '\'' +
               '}';
    }
}
