
public class App {
    public static void main(String args[]) {
        Autor autor = new Autor(1, "Dan Brown");
        LivroImpresso livro = new LivroImpresso("O Código da Vinci", "xxxxx",
                                100.0, autor, 10.0);
        Autor autor2 = new Autor(2, "Eduardo Spohr");
        Ebook ebook = new Ebook("A batalha do Apocalipse", "yyyyy", 50.0, autor2, "Sei la");
//
        Minilivro minilivro = new Minilivro("Anjos e Demônios", "23049832094823", 20, autor);

        Editora editora = new Editora("Abril", "123123");
        Revista revista = new Revista("Super Interessante", "...", 10, editora);

        livro.aplicaDesconto(0.2);
        System.out.println("Livro: " + livro + "\n");

        ebook.aplicaDesconto(0.1);
        System.out.println("Ebook: " + ebook + "\n");

        revista.aplicaDesconto(0.1);
        System.out.println("Revista: " + revista + "\n");

//        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
//        System.out.println("Total: " + carrinho.getValorTotal() + "\n");
//
//        carrinho.adiciona(livro);
//        System.out.println("Total: " + carrinho.getValorTotal() + "\n");
//
//        carrinho.adiciona(ebook);
//        System.out.println("Total: " + carrinho.getValorTotal() + "\n");
//
//        carrinho.adiciona(minilivro);
//        System.out.println("Total: " + carrinho.getValorTotal() + "\n");
//
//        carrinho.adiciona(revista);
//        System.out.println("Total: " + carrinho.getValorTotal() + "\n");
    }
}
