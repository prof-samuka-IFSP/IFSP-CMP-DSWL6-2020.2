package br.edu.ifsp.cmp.livraria.produtos;

public abstract class Produto {
    private double preco;

    public Produto(double preco) {
        this.preco = preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return this.preco;
    }


    // template method
    public boolean aplicaDesconto(double porcentagem) {
        if (porcentagem < 0.0 || porcentagem > 1.0) { return false; }

        double descontoRequerido = this.preco * porcentagem;

        // cada classe filha de Produto poderá ter uma ESTRATÉGIA diferente
        // para computador o desconto máximo ==> Padrão de projeto: Strategy
        double descontoMaximo = this.descontoMaximo();

        if (descontoRequerido <= descontoMaximo) {
            this.preco -= descontoRequerido;
            return true;
        }
        else { return false; }
    }

    public abstract double descontoMaximo();
}
