
public class App {
    public static void main(String args[]) {
        Autor autor = new Autor(1, "Dan Brown");
        Livro livro = new Livro("O Código da Vinci", "xxxxx",
                                100.0, autor);
        System.out.println(livro);
        System.out.println("");

        double porcentagens[] = {0.1, 0.2, 0.3, 0.5};

        // for possível (e clássico)
//        for (int i = 0; i < porcentagens.length; i++) {
//        }

        // for-each
        for (double porc : porcentagens) {
            System.out.println("- Preco atual: " + livro.getPreco());
            System.out.println("- Porc. de Desconto: " + porc);

            livro.aplicaDesconto(porc);
            System.out.println("- Preco com desconto: " + livro.getPreco() + "\n");
        }

    }
}
