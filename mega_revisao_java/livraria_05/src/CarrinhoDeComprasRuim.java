public class CarrinhoDeComprasRuim {
    private double valorTotal = 0.0;

    public double getValorTotal() { return this.valorTotal; }


    public void adiciona(LivroImpresso livro) {
        System.out.println("Adicionando um livro");
        this.valorTotal += livro.getPreco();
    }

    public void adiciona(Ebook ebook) {
        System.out.println("Adicionando um ebook");
        this.valorTotal += ebook.getPreco();
    }
}
