
public class App {
    public static void main(String args[]) {
        Autor autor = new Autor(1, "Dan Brown");
        LivroImpresso livro = new LivroImpresso("O Código da Vinci", "xxxxx",
                                100.0, autor, 10.0);

        Autor autor2 = new Autor(2, "Eduardo Spohr");
        Ebook ebook = new Ebook("A batalha do Apocalipse", "yyyyy", 50.0, autor2, "Sei la");

//        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
//        System.out.println("+ Total: " + carrinho.getValorTotal());
//        carrinho.adiciona(livro);  // Livro livro
//        System.out.println("+ Total: " + carrinho.getValorTotal());
//        carrinho.adiciona(ebook);
//        System.out.println("+ Total: " + carrinho.getValorTotal() + "\n");

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        System.out.println("+ Total: " + carrinho.getValorTotal());
        carrinho.adicionaComDesconto(livro, 0.1);
        System.out.println("+ Total: " + carrinho.getValorTotal());
        carrinho.adicionaComDesconto(ebook, 0.1);
        System.out.println("+ Total: " + carrinho.getValorTotal() + "\n");
    }
}
