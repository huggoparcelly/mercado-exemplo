package exemplo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        return (List<Produto>) catalogo.values();
    }
}
