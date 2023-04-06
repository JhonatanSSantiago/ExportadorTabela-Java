package com.jhonssantiago;

import java.util.List;

public class ExportadorListaProdutoHtml extends AbstracExportadorListaProduto {
    @Override
    public String abrirTabela() {
        return "<table> \n";
    }

    @Override
    public String fecharTabela() {
        return "</table> \n";
    }

    @Override
    public String abrirLinha() {
        return "<tr>";
    }

    @Override
    public String fecharLinha() {
        return "</tr> \n";
    }

    @Override
    public String abrirLinhaTitulos() {
        return "<tr>";
    }

    @Override
    public String fecharLinhaTitulos() {
        return "</tr> \n";
    }

    @Override
    public String abrirColuna(String valor) {
        String coluna = "<td> "+ valor;
        return coluna;
    }

    @Override
    public String fecharColuna() {
        return " </td>";
    }

    @Override
    public String abrirColunaTitulos(String valor) {
        String titulo = "<th> "+ valor;
        return titulo;
    }

    @Override
    public String fecharColunaTitulos() {
        return " </th>";
    }

}
