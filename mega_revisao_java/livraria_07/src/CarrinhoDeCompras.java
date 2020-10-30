public class CarrinhoDeCompras {
    private double valorTotal = 0.0;

    public double getValorTotal() { return this.valorTotal; }


    public void adiciona(Livro livro) {
        System.out.println("Adicionando um livro");
        this.valorTotal += livro.getPreco();
    }

    public void adicionaComDesconto(Livro livro, double desconto) {
        System.out.println("Adicionando um livro com desconto de " + desconto);
        livro.aplicaDesconto(desconto);
        this.valorTotal += livro.getPreco();
    }
}
