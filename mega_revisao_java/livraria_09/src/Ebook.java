
public class Ebook extends Livro implements Promocional {
    private String marcaDagua;

    public Ebook(String titulo, String isbn, double preco, Autor autor, String marcaDagua) {
        super(titulo, isbn, preco, autor);
        this.marcaDagua = marcaDagua;
    }


    @Override
    public boolean aplicaDesconto(double porcentagem) {
        if (porcentagem < 0.0 || porcentagem > 1.0) { return false; }

        if (porcentagem <= 0.15) {
            double desconto = this.getPreco() * porcentagem;
            this.setPreco(this.getPreco() - desconto);
            return true;
        }
        else { return false; }
    }


    @Override
    public String toString() {
        return super.toString() + "\n" +
               "+ Marca Dágua: " + this.marcaDagua;
    }
}
