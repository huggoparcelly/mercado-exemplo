import exemplo.Lote;
import exemplo.Produto;
import exemplo.ProdutoRepository;

public class Sistema {

	public static void main(String[] args) {

		ProdutoRepository catalogo = new ProdutoRepository();

		Produto leite = new Produto("Leite", "Parmalat");
		Produto pao = new Produto("Pão", "Plus Vita");
		Produto ovo = new Produto("Ovo", "Ovos da granja");
		Produto cafe = new Produto("Café", "Nescafé");

		catalogo.addProduto(leite);
		catalogo.addProduto(pao);
		catalogo.addProduto(ovo);
		catalogo.addProduto(cafe);

		Lote lote = new Lote(leite, 10L);

		System.out.println(ovo);
		System.out.println(leite);
		System.out.println(lote);

		catalogo.listarProdutoPeloNome("Ovo");
	}
}
