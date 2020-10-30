
public class App {
    public static void main(String args[]) {
//        Autor autor = new Autor(1, "Dan Brown");
//        Livro livro = new Livro("O Código da Vinci", "xxxxx",
//                                100.0, autor);

        Autor autor2 = new Autor(2, "Eduardo Spohr");
        Ebook ebook = new Ebook("A batalha do Apocalipse", "yyyyy", 50.0, autor2, "Sei la");
        System.out.println(ebook);
        System.out.println("");

        ebook.aplicaDesconto(0.1);
        System.out.println(ebook.getPreco() + "\n");

        ebook.aplicaDesconto(0.5);
        System.out.println(ebook.getPreco() + "\n");
    }
}
