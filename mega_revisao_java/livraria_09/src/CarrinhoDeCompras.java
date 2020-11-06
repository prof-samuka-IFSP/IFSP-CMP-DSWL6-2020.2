public class CarrinhoDeCompras {
    private double valorTotal = 0.0;

    public double getValorTotal() { return this.valorTotal; }


    public void adiciona(Produto produto) {
        System.out.println("Adicionando um livro");
        this.valorTotal += produto.getPreco();
    }
}
