package exemplo.repository;

import exemplo.Produto;

import java.util.*;

public class ProdutoRepository {

    Map<String, Produto> catalogo;

    public ProdutoRepository() {
        this.catalogo = new HashMap<>();
    }

    public void addProduto(Produto produto) {
        catalogo.put(produto.getId(), produto);
    }

    public void atualizarProduto(Produto produto) {
        catalogo.replace(produto.getId(), produto);
    }

    public void removerUmProduto(Produto produto) {
        catalogo.remove(produto.getId(), produto);
    }

    public Produto getProduto(String id) {
        return catalogo.get(id);
    }

    public List<Produto> listarProduto() {
        return catalogo.values().stream().toList();
    }

}
