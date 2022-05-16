package exemplo.service;

import exemplo.Lote;
import exemplo.Produto;
import exemplo.repository.LoteRepository;
import exemplo.repository.ProdutoRepository;

import java.util.ArrayList;
import java.util.List;

public class ProdutoService {

    private final LoteRepository loteRepository;
    private final ProdutoRepository produtoRepository;

    public ProdutoService() {
        this.loteRepository = new LoteRepository();
        this.produtoRepository = new ProdutoRepository();
    }

    public List<Produto> listarProdutosLote(String nome) {
        List<Lote> lote = loteRepository.listarLote();
        List<Produto> produtosNoLote = getProdutoFromLote(lote);
        return getProdutosByName(produtosNoLote, nome);
    }

    public List<Produto> listarProdutoPeloNome(String nome) {
        List<Produto> produtos = produtoRepository.listarProduto();
        return getProdutosByName(produtos, nome);
    }

    private List<Produto> getProdutosByName(List<Produto> allProdutos, String nome) {
        List<Produto> getProdutoPorNome = new ArrayList<>();
        for (Produto produto : allProdutos) {
            if(produto.getNome().contains(nome)) {
                getProdutoPorNome.add(produto);
            }
        }
        return getProdutoPorNome;
    }

    private List<Produto> getProdutoFromLote(List<Lote> lote) {
        List<Produto> produtos = new ArrayList<>();
        for(Lote l: lote) {
            produtos.add(l.getProduto());
        }
        return produtos;
    }


}
