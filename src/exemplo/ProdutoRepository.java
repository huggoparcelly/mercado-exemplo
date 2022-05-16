package exemplo;

import java.util.*;

public class ProdutoRepository {

    Map<String, Produto> catalogo = new HashMap<>();

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

    public List<Produto> listarProdutoPeloNome(String nome) {
        List<Produto> produtos = listarProduto();
        List<Produto> getProdutoPorNome = new ArrayList<>();
        for (Produto produto : produtos) {
            if(produto.getNome().contains(nome)) {
                getProdutoPorNome.add(produto);
            }
        }
        return getProdutoPorNome;
    }
}
