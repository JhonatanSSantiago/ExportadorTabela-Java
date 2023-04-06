package com.jhonssantiago;

import java.util.List;

public interface ExportadorListaProduto {

    String abrirTabela();

    String fecharTabela();

    String abrirLinha();

    String fecharLinha();

    String abrirLinhaTitulos();

    String fecharLinhaTitulos();

    String abrirColuna(String valor);

    String fecharColuna();

    String abrirColunaTitulos(String valor);

    String fecharColunaTitulos();

    String exportar(List<Produto> listaProdutos);

    static ExportadorListaProduto newInstance(){
        return new ExportadorListaProdutoMarkdown();
    };

    static ExportadorListaProduto newInstance(String extensaoArquivoExportacao){
        if(extensaoArquivoExportacao.toLowerCase().contains(".html")){
            return new ExportadorListaProdutoHtml();
        }if(extensaoArquivoExportacao.toLowerCase().contains(".md")){
            return new ExportadorListaProdutoHtml();
        }
        throw new UnsupportedOperationException("Arquivo "+extensaoArquivoExportacao+" não suportado");
    };
}
