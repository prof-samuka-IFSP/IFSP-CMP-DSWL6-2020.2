package br.edu.ifsp.cmp.livraria.produtos;

public interface Promocional {
    // true se o desconto for aplicado
    // false caso contrário
    boolean aplicaDesconto(double porcentagem);
}
