
public class App {
    public static void main(String args[]) {
        Autor autor = new Autor(1, "Dan Brown");
        LivroImpresso livro = new LivroImpresso("O Código da Vinci", "xxxxx",
                                100.0, autor, 10.0);
        Autor autor2 = new Autor(2, "Eduardo Spohr");
        Ebook ebook = new Ebook("A batalha do Apocalipse", "yyyyy", 50.0, autor2, "Sei la");

        Minilivro minilivro = new Minilivro("Anjos e Demônios", "23049832094823", 20, autor);
        System.out.println(minilivro);
        minilivro.aplicaDesconto(0.1);
        System.out.println("Preço após desconto: " + minilivro.getPreco());
    }
}
