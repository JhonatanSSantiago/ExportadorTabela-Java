package com.jhonssantiago;

import java.util.List;

public class ExportadorListaProdutoMarkdown extends AbstracExportadorListaProduto{

    @Override
    public String abrirTabela() {
        return "";
    }

    @Override
    public String fecharTabela() {
        return "";
    }

    @Override
    public String abrirLinha() {
        return " ";
    }

    @Override
    public String fecharLinha() {
        return "\n";
    }

    @Override
    public String abrirLinhaTitulos() {
        return " ";
    }

    @Override
    public String fecharLinhaTitulos() {
        return "\n";
    }

    @Override
    public String abrirColuna(String valor) {
        String coluna = valor;
        return coluna;
    }

    @Override
    public String fecharColuna() {
        return " | ";
    }

    @Override
    public String abrirColunaTitulos(String valor) {
        String coluna =  valor;
        return coluna;
    }

    @Override
    public String fecharColunaTitulos() {
        return " | ";
    }


}
