
public class App {
    public static void main(String args[]) {
        Autor autor = new Autor(1, "Dan Brown");
        Livro livro = new Livro("O Código da Vinci", "xxxxx",
                                100.0, autor);

        Autor autor2 = new Autor(1, "Dan Brown");
        Livro livro2 = new Livro("O Código da Vinci", "xxxxx",
                                100.0, autor);

        System.out.println("Comparando com ==");
        if (autor == autor2) {
            System.out.println("São iguais");
        }
        else {
            System.out.println("São diferentes");
        }

        System.out.println("\nComparando com equals()");
        if (autor.equals(autor2)) {
            System.out.println("São iguais");
        }
        else {
            System.out.println("São diferentes");
        }
    }
}
