package exemplo;

import java.util.List;

public class ProdutoService {
    private ProdutoRepository produtoRepository;
    private LoteRepository loteRepository;

    public ProdutoService() {
        List<Lote> lotes = loteRepository.getAll();
        List<Produto> produtos = getProdutosFromLotes(lotes);
        List<Produto> produtosName = getProdutoByName(nome, produtos);
    }

    public List<Produto> getProdutosFromLotes(String lotes) {


    }

    public List<Produto> listarProdutosByName(String nome) {
        List<Produto> produto = produtoRepository.getAll();
        List<Produto> produtoOk = produtoRepository.getProdutosByName(nome, produto);
    }

}
