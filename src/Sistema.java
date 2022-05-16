import exemplo.Lote;
import exemplo.Produto;
import exemplo.repository.LoteRepository;
import exemplo.repository.ProdutoRepository;
import exemplo.service.ProdutoService;

public class Sistema {

	public static void main(String[] args) {
		ProdutoService produtoService = new ProdutoService();

		Produto leite = new Produto("Leite", "Parmalat");
		Produto pao = new Produto("Pão", "Plus Vita");
		Produto ovo = new Produto("Ovo", "Ovos da granja");
		Produto cafe = new Produto("Café", "Nescafé");

		produtoService.adicionaProduto(leite);
		produtoService.adicionaProduto(pao);
		produtoService.adicionaProduto(ovo);
		produtoService.adicionaProduto(cafe);

		Lote lote = new Lote(leite, 10L);

		System.out.println(ovo);
		System.out.println(leite);
		System.out.println(lote);

		System.out.println(produtoService.listarProdutoPeloNome("Ov"));
	}
}
