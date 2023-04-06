package com.jhonssantiago;

import java.util.ArrayList;
import java.util.List;

abstract class AbstracExportadorListaProduto implements ExportadorListaProduto {

    protected  List<String> TITULOS_COLUNAS;

    public String exportar(List<Produto> listaProdutos){;
        TITULOS_COLUNAS = new ArrayList<>();
        TITULOS_COLUNAS.add("ID");
        TITULOS_COLUNAS.add("NOME");
        TITULOS_COLUNAS.add("VALOR");
        TITULOS_COLUNAS.add("QUANTIDADE");

        var stringBuilder = new StringBuilder();

        stringBuilder.append(abrirTabela());
        stringBuilder.append(abrirLinhaTitulos());

        //for
        for (String titulo: TITULOS_COLUNAS) {
            stringBuilder.append(abrirColunaTitulos(titulo));
            stringBuilder.append(fecharColunaTitulos());
        }


        stringBuilder.append(fecharLinhaTitulos());


        //for
        for (Produto produto : listaProdutos) {
            stringBuilder.append(abrirLinha());
            stringBuilder.append(abrirColuna(produto.id.toString()));
            stringBuilder.append(fecharColuna());
            stringBuilder.append(abrirColuna(produto.nome));
            stringBuilder.append(fecharColuna());
            stringBuilder.append(abrirColuna(produto.valor.toString()));
            stringBuilder.append(fecharColuna());
            stringBuilder.append(abrirColuna(produto.quantidade.toString()));
            stringBuilder.append(fecharColuna());
            stringBuilder.append(fecharLinha());
        }



        stringBuilder.append(fecharTabela());


        return stringBuilder.toString();
    };

}
