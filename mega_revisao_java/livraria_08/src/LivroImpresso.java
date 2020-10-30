
public class LivroImpresso extends Livro {
    private double taxaDeImpresao;

    public LivroImpresso(String titulo, String isbn, double preco, Autor autor, double taxaDeImpresao) {
        super(titulo, isbn, preco, autor);
        this.taxaDeImpresao = taxaDeImpresao;
    }


    public double descontoMaximo() {
        return this.taxaDeImpresao * 2;
    }

    @Override
    public boolean aplicaDesconto(double porcentagem) {
        if (porcentagem < 0.0 || porcentagem > 1.0) { return false; }

        double descontoRequerido = this.getPreco() * porcentagem;

        if (descontoRequerido <= this.descontoMaximo()) {
            this.setPreco(this.getPreco() - descontoRequerido);
            return true;
        }
        else { return false; }
    }



    @Override
    public String toString() {
        return super.toString() + "\n" +
               "+ Taxa de Impressao: " + this.taxaDeImpresao;
    }
}
