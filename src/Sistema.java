import exemplo.Lote;
import exemplo.Produto;
import exemplo.ProdutoRepository;

public class Sistema {

	public static void main(String[] args) {
		
		Produto produto = new Produto("Leite", "Parmalat");
		Produto p = new Produto("achocolatado", "nescau");
		Lote lote = new Lote(produto, 10L);
		ProdutoRepository catalogo = new ProdutoRepository();
		catalogo.cadastraProduto(produto);
		catalogo.cadastraProduto(p);
		
		System.out.println(produto);
		System.out.println(lote);
	}
}
