
public class Revista implements Produto, Promocional {
    private String nome;
    private String descricao;
    private double preco;
    private Editora editora;

    public Revista(String nome, String descricao, double preco, Editora editora) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.editora = editora;
    }

    // OMITINDO ALGUNS GETTERS AND SETTERS
    @Override
    public double getPreco() {
        return this.preco;
    }


    @Override
    public String toString() {
        return "+ Nome: " + this.nome + "\n" +
               "+ Descricao: " + this.descricao + "\n" +
               "+ Preço: " + this.preco + "\n" + this.editora;
    }

    @Override
    public boolean aplicaDesconto(double porcentagem) {
        if (porcentagem < 0.0 || porcentagem > 1.0) { return false; }

        if (porcentagem <= 0.10) {
            double desconto = this.getPreco() * porcentagem;
            this.preco -= desconto;
            return true;
        }
        else { return false; }
    }
}
