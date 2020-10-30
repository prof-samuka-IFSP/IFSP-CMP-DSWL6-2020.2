
public class Autor {
    private int id;
    private String nome;

    public Autor(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    // SETTERS
    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // GETTERS
    public int getId() {
        return this.id;
    }

    public String getNome() {
        return nome;
    }


    public boolean equals(Autor autor) {
        return ((this.id == autor.id) && (this.nome.equals(autor.nome)));
    }


    @Override
    public String toString() {
        return "- ID: " + this.id +
               "\n- Nome: " + this.nome;
    }
}















