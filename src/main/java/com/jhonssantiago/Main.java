package com.jhonssantiago;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Produto> lista = new ArrayList<>();

        Produto p = new Produto(1, "TV", 2300.00, 1);
        Produto p2 = new Produto(2, "Notebook", 4500.00, 2);
        lista.add(p);
        lista.add(p2);

        var tabela = ExportadorListaProduto.newInstance().exportar(lista);
        System.out.println(tabela);

    }
}